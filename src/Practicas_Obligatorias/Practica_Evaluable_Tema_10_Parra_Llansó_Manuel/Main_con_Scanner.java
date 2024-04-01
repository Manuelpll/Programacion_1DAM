package Practicas_Obligatorias.Practica_Evaluable_Tema_10_Parra_Llansó_Manuel;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.*;

/**
 * Este programa trata de un menu de los empleados donde puedes añadir,eliminar , mostrar los que hay y ordenar la lista de diferentes maneras
 * @author Mparr
 * @version 1.0
 */
public class Main_con_Scanner {
     static ArrayList<Empleado> empleados = new ArrayList<Empleado>();
   static int eleccion;
    /**
     * Metodo que genera un menu de las diferentes opciones que tienes para utilizar
     * @throws InputMismatchException Si pones una cosa que no sea un numero entero
     */
    public static void menu() {
        //Zona de declaracion de variables
        boolean salir =false;
        //Zona de inicializacion , añadir más cosas si es necesario
        Scanner scanner = new Scanner(System.in);
        //Zona de salida
        do {
            try {


                System.out.println("""
                        Elige una de las siguientes opciones:
                        1-> Añadir empleado
                        2-> Eliminar empleado
                        3-> Buscar empleado
                        4-> Imprimir empleados ordenados de diferentes maneras
                        5-> Calcular el gasto total de los empleados
                        6-> Salir""");
                eleccion = scanner.nextInt();
                scanner.nextLine();//Si es necesario se pone
                switch (eleccion) {
                    case 1:
                       añadirEmpleado(scanner);
                        break;
                    case 2:
                        eliminarEmpleado(scanner);
                        break;
                    case 3:
                        buscarEmpleado(scanner);
                        break;
                    case 4:
                        menuDeOrdenar(scanner);
                        break;
                    case 5:
                       gastoTotal();
                        break;
                    case 6:
                        System.out.println("Saliendo...");
                        salir = true;
                        break;
                    default:
                        System.out.println("Error: Opcion no valida");
                        break;
                }//Fin switch
            }catch (InputMismatchException e){
                System.out.println("Inserta una de las opciones validas");
                scanner.nextLine();
            }//Fin try-catch
        } while (!salir);
    }//Fin de menu

    /**
     * Este metodo busca a un empleado por su nombre
     * @param scanner -El scanner que se necesita para recibir los imputs
     * @throws InputMismatchException Si se pone otra cosa que no sea una cadena de carácteres
     */
    public static void buscarEmpleado(Scanner scanner) {
        try {
            System.out.println("Cual empleado quieres imprimir?");
            String empleadoQuerido = scanner.nextLine();
            boolean empleadoConseguido = false;
            for (Empleado empleado : empleados) {
                if (empleado.getNombre().equals(empleadoQuerido)) {
                    System.out.println(empleado);
                    empleadoConseguido= true;
                    break;
                }//Fin de if
            }//Fin de for
            if (!empleadoConseguido) {
                System.out.println("No se encontró ese empleado");
            }//Fin if
        }catch (InputMismatchException e){
            System.out.println("ERROR: No se puede poner una cosa que no sea una cadena de carateres");
        }//Fin try-catch
    }//Fin de buscarEmpleado

    /**
     * Este metodo elimina un empleado que se desee
     * @param scanner -El scanner que se necesita para los inputs
     */
    public static void eliminarEmpleado(Scanner scanner) {
        try {
            System.out.println("Introduce el nombre del empleado que deseas eliminar");
            String nombreElim = scanner.nextLine();
            boolean empleadoEncontrado = false;
            for (Empleado empleado : empleados) {
                if (empleado.getNombre().equals(nombreElim)) {
                    empleados.remove(empleado);
                    empleadoEncontrado = true;
                    System.out.println(nombreElim+" ha sido eliminado");
                    break;
                }
            }

            if (!empleadoEncontrado) {
                System.out.println("No se encontró ese empleado");
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: No se puede ingresar algo que no sea una cadena de carácteres");
            scanner.nextLine();
        }
    }

    /**
     * Menu que genera varias opciones para ordenar el arraylist
     * @param scanner -El scanner para introducir la opcion
     */
    public static void menuDeOrdenar(Scanner scanner) {
        try {
            int enumeracion= 1;
            System.out.println("""
                    1-> Por antiguedad
                    2-> Por salario
                    3-> Por Apellido""");
            eleccion = scanner.nextInt();
            scanner.nextLine();
            switch (eleccion) {
                case 1:
                    empleados.sort(new Comparator<Empleado>() {
                        @Override
                        public int compare(Empleado a1, Empleado a2) {
                            return a1.getFechaDeIngreso().compareTo(a2.getFechaDeIngreso());
                        }//Fin de compare
                    });//Fin Iterator
                    System.out.println("Lista ordenada por antiguedad:");
                    for(Empleado empleadosTemp : empleados){
                        System.out.println(enumeracion+"-"+empleadosTemp.getNombre()+" "+empleadosTemp.getApellidos()+"  Fecha de nacimiento: "+empleadosTemp.getFechaDeNacimiento()+"  Fecha de ingreso"+empleadosTemp.getFechaDeIngreso()+"  Puesto de trabajo: "+empleadosTemp.getPuesto()+"  Salario: "+ empleadosTemp.getSalario());
                        enumeracion++;
                    }//Fin for
                    enumeracion =1;
                    System.out.println(" ");
                    break;
                case 2:
                    empleados.sort(new Comparator<Empleado>() {
                        @Override
                        public int compare(Empleado a1, Empleado a2) {
                            return Integer.compare(a1.getSalario(), a2.getSalario());
                        }//Fin de compare
                    });//Fin Iterator
                    System.out.println("Lista ordenada por salario:");
                    for(Empleado empleadosTemp : empleados){
                        System.out.println(enumeracion+"-"+empleadosTemp.getNombre()+" "+empleadosTemp.getApellidos()+"  Fecha de nacimiento: "+empleadosTemp.getFechaDeNacimiento()+"  Fecha de ingreso"+empleadosTemp.getFechaDeIngreso()+"  Puesto de trabajo: "+empleadosTemp.getPuesto()+"  Salario: "+ empleadosTemp.getSalario());
                        enumeracion++;
                    }//Fin for
                    enumeracion =1;
                    System.out.println(" ");
                    break;
                case 3:
                    empleados.sort(new Comparator<Empleado>() {
                        @Override
                        public int compare(Empleado a1, Empleado a2) {
                            return a1.getApellidos().compareTo(a2.getApellidos());
                        }//Fin de compare
                    });//Fin Iterator
                    System.out.println("Lista ordenada por apellidos:");
                    for(Empleado empleadosTemp : empleados){
                        System.out.println(enumeracion+"-"+empleadosTemp.getNombre()+" "+empleadosTemp.getApellidos()+"  Fecha de nacimiento: "+empleadosTemp.getFechaDeNacimiento()+"  Fecha de ingreso: "+empleadosTemp.getFechaDeIngreso()+"  Puesto de trabajo: "+empleadosTemp.getPuesto()+"  Salario: "+ empleadosTemp.getSalario());
                        enumeracion++;
                    }//Fin for
                    enumeracion =1;
                    System.out.println(" ");
                    break;
                default:
                    System.out.println("Error: Opcion no valida");
            }//Fin switch
        }catch (InputMismatchException e2){
            System.out.println("Inserte una de la opciones validas");
        }//Fin del try-catch
    }//Fin de menuDeOrdenar

    /**
     * Este metodo añade un empleado nuevo a el arraylist
     * @param scanner -El scanner que se necesita para insertar los datos
     * @throws InputMismatchException Si se pone un input inadecuado
     * @throws DateTimeException Si se pone una fecha imposible
     */
    public static void añadirEmpleado(Scanner scanner) {
        String nombre ;
        String apellidos ;
        int año = 0;
        int mes = 0;
        int dia = 0;
        int añoI = 0;
        int mesI = 0;
        int diaI = 0;
        String puesto = "";
        int salario = 0;
        LocalDate fechaDeIngreso;
        LocalDate fechaDeNacimiento;
        try {
            System.out.println("Introduce el nombre del empleado");
          nombre = scanner.nextLine();
        }catch (InputMismatchException e){
            System.out.println("Error no puedes poner otra cosa que no sea un nombre ");
            scanner.nextLine();
            return;
        }//Fin try-catch
        try {
            System.out.println("Introduce los apellidos del empleado");
           apellidos=scanner.nextLine();
        }catch (InputMismatchException e){
            System.out.println("Error no puedes poner otra cosa que no sea un nombre ");
            scanner.nextLine();
            return;
        }//Fin try-catch
        try {
            System.out.println("Introduce el año de nacimiento");
            año=scanner.nextInt();
        }catch (InputMismatchException e){
            System.out.println("No puedes poner otra cosa que no sea un  numero entero");
            scanner.nextLine();
            return;
        }//Fin try-catch
        try {
            System.out.println("Introduce el mes de nacimiento");
            mes =scanner.nextInt();
        }catch (InputMismatchException e){
            System.out.println("No puedes poner otra cosa que no sea un  numero entero");
            scanner.nextLine();
            return;
        }//Fin try-catch
        try {
            System.out.println("Introduce el día de nacimiento");
            dia = scanner.nextInt();
        }catch (InputMismatchException e){
            System.out.println("No puede poner otra cosa que no sea un numero entero");
            scanner.nextLine();
            return;
        }//Fin try-catch
        try {
             fechaDeNacimiento = LocalDate.of(año, mes, dia);
        }catch (DateTimeException e){
            System.out.println("No existe esta fecha");
            return;
        }//Fin try-catch
        try {
            System.out.println("Introduce el año de ingreso a la empresa");
            añoI=scanner.nextInt();
        }catch (InputMismatchException e){
            System.out.println("No puedes poner otra cosa que no sea un  numero entero");
            scanner.nextLine();
            return;
        }//Fin try-catch
        try {
            System.out.println("Introduce el mes de ingreso a la empresa");
            mesI =scanner.nextInt();
        }catch (InputMismatchException e){
            System.out.println("No puedes poner otra cosa que no sea un  numero entero");
            scanner.nextLine();
            return;
        }//Fin try-catch
        try {
            System.out.println("Introduce el día de ingreso a la empresa");
            diaI = scanner.nextInt();
        }catch (InputMismatchException e){
            System.out.println("No puede poner otra cosa que no sea un numero entero");
            scanner.nextLine();
            return;
        }//Fin try-catch
        try {
            fechaDeIngreso = LocalDate.of(añoI, mesI, diaI);
        }catch (DateTimeException e){
            System.out.println("No existe esta fecha");
            return;
        }//Fin try-catch
        try {
            System.out.println("Indica tu puesto de trabajo");
            String puestoTrabajo=scanner.nextLine();
            scanner.nextLine();
        }catch (InputMismatchException e){
            System.out.println("Error no puedes poner otra cosa que no sea un nombre ");
            scanner.nextLine();
            return;
        }//Fin try-catch
        try {
            System.out.println("Introduce tu salario");
            salario =scanner.nextInt();
        }catch (InputMismatchException e){
            System.out.println("No puedes poner otra cosa que no sea un numero");
            scanner.nextLine();
            return;
        }//Fin try-catch
        Empleado empleadoNuevo = new Empleado(nombre, apellidos, fechaDeNacimiento, fechaDeIngreso, puesto, salario);
        empleados.add(empleadoNuevo);
    }//Fin de añadirEmpleado

    /**
     * Metodo que calcula el gasto total
     */
    public static void gastoTotal(){
        int total=0;
        for(Empleado empleadosTemp : empleados){
           total+= empleadosTemp.getSalario();
        }//Fin for
        System.out.println("El gasto total es: "+total);
    }//Fin de gastoTotal
    /**
     * Metodo que inserta los primeros empleados
     */
    public static void empleadosBase(){
        Empleado empleado1 = new Empleado("Juan","Torres",LocalDate.parse("1960-01-01"),LocalDate.parse("1980-05-24"),"Jefe",60000);
        Empleado empleado2 = new Empleado("Sara","Gonzalez",LocalDate.parse("1980-05-02"),LocalDate.parse("1999-06-03"),"Secretaria",25000);
        Empleado empleado3 = new Empleado("Elena","Sanchez",LocalDate.parse("2010-11-02"),LocalDate.parse("2010-11-02"),"TecnicoFP",30000);
        Empleado empleado4 = new Empleado("Pepe","Uriel",LocalDate.parse("1991-10-04"),LocalDate.parse("2015-10-01"),"Administrativo",24000);
        Empleado empleado5 = new Empleado("Manuel","Parra",LocalDate.parse("2004-10-31"),LocalDate.parse("2026-04-15"),"TecnicoFP",26000);
        empleados.add(empleado1);
        empleados.add(empleado2);
        empleados.add(empleado3);
        empleados.add(empleado4);
        empleados.add(empleado5);
}//Fin de empleadosBase

    /**
     * Metodo que ejecuta el codigo
     * @param args Los argumentos de la linea de comandos
     */
    public static void main(String[] args) {
        empleadosBase();
        menu();
    }//Fin del main
}//Fin de Main
