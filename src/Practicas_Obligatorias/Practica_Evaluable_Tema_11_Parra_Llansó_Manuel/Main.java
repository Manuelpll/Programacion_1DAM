package Practicas_Obligatorias.Practica_Evaluable_Tema_11_Parra_Llansó_Manuel;

import javax.swing.*;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.*;

/**
 * Este programa trata de un menu de los empleados donde puedes añadir,eliminar , mostrar los que hay y ordenar la lista de diferentes maneras
 * @author Mparr
 * @version 1.0
 */
public class Main {
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
     */
    public static void eliminarEmpleado() {
        try {
            String nombreElim = JOptionPane.showInputDialog("Introduce el nombre del empleado que deseas eliminar");
            boolean empleadoEncontrado = false;
            for (Empleado empleado : empleados) {
                if (empleado.getNombre().equals(nombreElim)) {
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
     * Metodo que inserta los primeros empleados
     */
    public static void empleadosBase() {
        Empleado empleado1 = new Empleado("Juan", "Torres", LocalDate.parse("1960-01-01"), LocalDate.parse("1980-05-24"), "Jefe", 60000);
        Empleado empleado2 = new Empleado("Sara", "Gonzalez", LocalDate.parse("1980-05-02"), LocalDate.parse("1999-06-03"), "Secretaria", 25000);
        Empleado empleado3 = new Empleado("Elena", "Sanchez", LocalDate.parse("2010-11-02"), LocalDate.parse("2010-11-02"), "TecnicoFP", 30000);
        Empleado empleado4 = new Empleado("Pepe", "Uriel", LocalDate.parse("1991-10-04"), LocalDate.parse("2015-10-01"), "Administrativo", 24000);
        Empleado empleado5 = new Empleado("Manuel", "Parra", LocalDate.parse("2004-10-31"), LocalDate.parse("2026-04-15"), "TecnicoFP", 26000);
        empleados.add(empleado1);
        empleados.add(empleado2);
        empleados.add(empleado3);
        empleados.add(empleado4);
        empleados.add(empleado5);
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