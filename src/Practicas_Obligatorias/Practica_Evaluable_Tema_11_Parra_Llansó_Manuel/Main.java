package Practicas_Obligatorias.Practica_Evaluable_Tema_11_Parra_Llansó_Manuel;


import javax.swing.*;
import java.io.*;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.*;

/**
 * Este programa trata de un menu de los empleados donde puedes añadir,eliminar , mostrar los que hay y ordenar la lista de diferentes maneras
 * @author Mparr
 * @version 1.0
 */
public class Main {
    static String rutaempleados=".\\src\\Practicas_Obligatorias\\Practica_Evaluable_Tema_11_Parra_Llansó_Manuel\\empleados.txt";
    static String rutaempleadosantiguos=".\\src\\Practicas_Obligatorias\\Practica_Evaluable_Tema_11_Parra_Llansó_Manuel\\empleadosAntigos.txt";
    static ArrayList<Empleado> empleados = new ArrayList<Empleado>();
    static int eleccion;

    /**
     * Metodo que genera un menu de las diferentes opciones que tienes para utilizar
     * @throws InputMismatchException Si pones una cosa que no sea un numero entero
     */
    public static void menu() {
        boolean salir = false;
        do {
            try {
                String[] options = {"Añadir empleado", "Eliminar empleado", "Buscar empleado", "Imprimir empleados ordenados", "Calcular gasto total", "Salir"};
                eleccion = JOptionPane.showOptionDialog(null, "Elige una de las siguientes opciones:", "Menú", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]) + 1;
                switch (eleccion) {
                    case 1:
                        añadirEmpleado();
                        break;
                    case 2:
                        eliminarEmpleado();
                        break;
                    case 3:
                        buscarEmpleado();
                        break;
                    case 4:
                        menuDeOrdenar();
                        break;
                    case 5:
                        gastoTotal();
                        break;
                    case 6:
                        JOptionPane.showMessageDialog(null, "Saliendo...");
                        salir = true;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Error: Opción no válida");
                        break;
                }//Fin switch
            } catch (InputMismatchException e) {
                JOptionPane.showMessageDialog(null, "Inserta una de las opciones válidas");
            }//Fin try-catch
        } while (!salir);
    } // Fin de menu

    /**
     * Este metodo busca a un empleado por su nombre
     * @throws InputMismatchException Si se pone otra cosa que no sea una cadena de carácteres
     */
    public static void buscarEmpleado() {
        try {
            String empleadoQuerido = JOptionPane.showInputDialog("¿Qué empleado quieres buscar?");
            boolean empleadoConseguido = false;
            List<Empleado> empleadosEncontrados = new ArrayList<>();

            for (Empleado empleado : empleados) {
                if (empleado.getNombre().equals(empleadoQuerido)) {
                    empleadosEncontrados.add(empleado);
                    empleadoConseguido = true;
                }//Fin if
            }//Fin for

            if (empleadoConseguido) {
                // Si se encontraron empleados con el nombre buscado, imprimir la lista
                for (Empleado empleado : empleadosEncontrados) {
                    JOptionPane.showMessageDialog(null, empleado);
                }
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró ese empleado");
            }//Fin if
        } catch (InputMismatchException e) {
            JOptionPane.showMessageDialog(null, "ERROR: No se puede poner algo que no sea una cadena de caracteres");
        }//Fin try-catch
    } // Fin de buscarEmpleado


    /**
     * Este metodo elimina un empleado que se desee
     * @throws InputMismatchException Si se pone un input incorrecto
     * @throws IOException Si falla el BufferedWritter
     */
    public static void eliminarEmpleado() {
        try {
        BufferedWriter bw = new BufferedWriter(new FileWriter(rutaempleadosantiguos));
            String nombreElim = JOptionPane.showInputDialog("Introduce el nombre del empleado que deseas eliminar");
            boolean empleadoEncontrado = false;
            for (Empleado empleado : empleados) {
                if (empleado.getNombre().equals(nombreElim)) {
                    String linea = empleado.getNombre() + "::" +
                            empleado.getApellidos() + "::" +
                            empleado.getFechaDeNacimiento() + "::" +
                            empleado.getFechaDeIngreso() + "::" +
                            empleado.getPuesto() + "::" +
                            empleado.getSalario()+"::"+
                            LocalDate.now();
                    if (!linea.isEmpty()) {
                        bw.write(linea);
                        bw.newLine();
                    }//Fin if
                    bw.flush();
                    empleados.remove(empleado);
                    empleadoEncontrado = true;
                    JOptionPane.showMessageDialog(null, nombreElim + " ha sido eliminado");
                    break;
                }//Fin if
            }//Fin for
            if (!empleadoEncontrado) {
                JOptionPane.showMessageDialog(null, "No se encontró ese empleado");
            }//Fin if
        } catch (InputMismatchException e) {
            JOptionPane.showMessageDialog(null, "Error: No se puede ingresar algo que no sea una cadena de caracteres");
        }catch (IOException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }//Fin try-catch
    } // Fin de eliminarEmpleado

    /**
     * Menu que genera varias opciones para ordenar el arraylist
     */
    public static void menuDeOrdenar() {
        try {
            int enumeracion = 1;
            String informacionFinal = " ";
            String[] options = {"Por antigüedad", "Por salario", "Por apellido"};
            eleccion = JOptionPane.showOptionDialog(null, "Elige una opción para ordenar la lista:", "Ordenar Lista", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]) + 1;
            switch (eleccion) {
                case 1:
                    empleados.sort(Comparator.comparing(Empleado::getFechaDeIngreso));
                    for (Empleado empleadosTemp : empleados) {
                        informacionFinal += enumeracion + "-" + empleadosTemp.getNombre() + " " + empleadosTemp.getApellidos() + "  Fecha de nacimiento: " + empleadosTemp.getFechaDeNacimiento() + "  Fecha de ingreso: " + empleadosTemp.getFechaDeIngreso() + "  Puesto de trabajo: " + empleadosTemp.getPuesto() + "  Salario: " + empleadosTemp.getSalario()+"€";
                        informacionFinal += "\n";
                        enumeracion++;
                    }//Fin for
                    JOptionPane.showMessageDialog(null, informacionFinal);
                    enumeracion = 1;
                    informacionFinal += " ";
                    System.out.println(" ");
                    break;
                case 2:
                    empleados.sort(Comparator.comparingInt(Empleado::getSalario));
                    for (Empleado empleadosTemp : empleados) {
                        informacionFinal += enumeracion + "-" + empleadosTemp.getNombre() + " " + empleadosTemp.getApellidos() + "  Fecha de nacimiento: " + empleadosTemp.getFechaDeNacimiento() + "  Fecha de ingreso: " + empleadosTemp.getFechaDeIngreso() + "  Puesto de trabajo: " + empleadosTemp.getPuesto() + "  Salario: " + empleadosTemp.getSalario()+"€";
                        informacionFinal += "\n";
                        enumeracion++;
                    }//Fin for
                    JOptionPane.showMessageDialog(null, informacionFinal);
                    enumeracion = 1;
                    informacionFinal += " ";
                    System.out.println(" ");
                    break;
                case 3:
                    empleados.sort(Comparator.comparing(Empleado::getApellidos));
                    for (Empleado empleadosTemp : empleados) {
                        informacionFinal += enumeracion + "-" + empleadosTemp.getNombre() + " " + empleadosTemp.getApellidos() + "  Fecha de nacimiento: " + empleadosTemp.getFechaDeNacimiento() + "  Fecha de ingreso: " + empleadosTemp.getFechaDeIngreso() + "  Puesto de trabajo: " + empleadosTemp.getPuesto() + "  Salario: " + empleadosTemp.getSalario()+"€";
                        informacionFinal += "\n";
                        enumeracion++;
                    }//Fin for
                    JOptionPane.showMessageDialog(null, informacionFinal);
                    enumeracion = 1;
                    informacionFinal += " ";
                    System.out.println(" ");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Error: Opción no válida");
                    break;
            }//Fin switch
        } catch (InputMismatchException e2) {
            JOptionPane.showMessageDialog(null, "Inserta una de las opciones válidas");
        }//Fin try-catch
    } // Fin de menuDeOrdenar

    /**
     * Este metodo añade un empleado nuevo a el arraylist
     * @throws InputMismatchException Si se pone un input inadecuado
     * @throws DateTimeException Si se pone una fecha imposible
     */
    public static void añadirEmpleado() {
        String nombre;
        String apellidos;
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
            nombre = JOptionPane.showInputDialog("Introduce el nombre del empleado");
        } catch (InputMismatchException e) {
            JOptionPane.showMessageDialog(null, "Error: no puedes poner otra cosa que no sea un nombre");
            return;
        }//Fin try-catch
        try {
            apellidos = JOptionPane.showInputDialog("Introduce los apellidos del empleado");
        } catch (InputMismatchException e) {
            JOptionPane.showMessageDialog(null, "Error: no puedes poner otra cosa que no sea un nombre");
            return;
        }//Fin try-catch
        try {
            año = Integer.parseInt(JOptionPane.showInputDialog("Introduce el año de nacimiento"));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "No puedes poner otra cosa que no sea un número entero");
            return;
        }//Fin try-catch
        try {
            mes = Integer.parseInt(JOptionPane.showInputDialog("Introduce el mes de nacimiento"));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "No puedes poner otra cosa que no sea un número entero");
            return;
        }//Fin try-catch
        try {
            dia = Integer.parseInt(JOptionPane.showInputDialog("Introduce el día de nacimiento"));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "No puedes poner otra cosa que no sea un número entero");
            return;
        }//Fin try-catch
        try {
            fechaDeNacimiento = LocalDate.of(año, mes, dia);
        } catch (DateTimeException e) {
            JOptionPane.showMessageDialog(null, "No existe esta fecha");
            return;
        }//Fin try-catch
        try {
            añoI = Integer.parseInt(JOptionPane.showInputDialog("Introduce el año de ingreso a la empresa"));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "No puedes poner otra cosa que no sea un número entero");
            return;
        }//Fin try-catch
        try {
            mesI = Integer.parseInt(JOptionPane.showInputDialog("Introduce el mes de ingreso a la empresa"));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "No puedes poner otra cosa que no sea un número entero");
            return;
        }//Fin try-catch
        try {
            diaI = Integer.parseInt(JOptionPane.showInputDialog("Introduce el día de ingreso a la empresa"));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "No puedes poner otra cosa que no sea un número entero");
            return;
        }//Fin try-catch
        try {
            fechaDeIngreso = LocalDate.of(añoI, mesI, diaI);
        } catch (DateTimeException e) {
            JOptionPane.showMessageDialog(null, "No existe esta fecha");
            return;
        }//Fin try-catch
        try {
            puesto = JOptionPane.showInputDialog("Indica tu puesto de trabajo");
        } catch (InputMismatchException e) {
            JOptionPane.showMessageDialog(null, "Error: no puedes poner otra cosa que no sea un nombre");
            return;
        }//Fin try-catch
        try {
            salario = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu salario"));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "No puedes poner otra cosa que no sea un número");
            return;
        }//Fin try-catch
        Empleado empleadoNuevo = new Empleado(nombre, apellidos, fechaDeNacimiento, fechaDeIngreso, puesto, salario);
        empleados.add(empleadoNuevo);
    } // Fin de añadirEmpleado

    /**
     * Metodo que calcula el gasto total de todos los empleados
     */
    public static void gastoTotal() {
        int total = 0;
        for (Empleado empleadosTemp : empleados) {
            total += empleadosTemp.getSalario();
        }//Fin de for
        JOptionPane.showMessageDialog(null, "El gasto total es: " + total+"€");
    } // Fin de gastoTotal

    /**
     * Metodo que añade los empleados iniciales que estan
     * @throws FileNotFoundException Si no se encuentra el archivo de los empleados
     * @throws  DateTimeException Si  hay una fecha imposible
     * @throws  Exception Si salta otra excepcion
     */
    public static void empleadosBase() {
        File fichero = new File(rutaempleados);
        Scanner sc= null;
        try {
            sc=new Scanner(fichero);
            //Voy obteniendo los datos de cada alumno
            while (sc.hasNextLine()){
                String linea = sc.nextLine();//Obtiene una fila de un alumno
                String[] cortarString = linea.split("::");
                //Objeto clase alumnos con su atributos
                Empleado empleado= new Empleado();
              empleado.setNombre(cortarString[1]);
              empleado.setApellidos(cortarString[0]);
              empleado.setFechaDeNacimiento(LocalDate.parse(cortarString[2]));
              empleado.setFechaDeIngreso(LocalDate.parse(cortarString[3]));
              empleado.setPuesto((cortarString[4]));
              empleado.setSalario(Integer.parseInt(cortarString[5]));
                //Añadir el alumnono a la lista
                empleados.add(empleado);
            }//Fin while
        } catch (FileNotFoundException e) {
          JOptionPane.showMessageDialog(null,e.getMessage());
        }catch (DateTimeException e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage()); ;
        }finally{
                try {

                    if (sc !=null){
                        sc.close();
                    }//Fin if
                }catch (Exception e){
                   JOptionPane.showMessageDialog(null,"Error al cerrar el fichero");
                    JOptionPane.showMessageDialog(null,e.getMessage());
                }//Fin try-catch
        }//Fin try-catch-finally
    } // Fin de empleadosBase

    /**
     * Metodo que ejecuta el codigo
     * @param args Los argumentos de la linea de comandos
     */
    public static void main(String[] args) {
        empleadosBase();
        menu();
    } // Fin de main
}//Fin del Main