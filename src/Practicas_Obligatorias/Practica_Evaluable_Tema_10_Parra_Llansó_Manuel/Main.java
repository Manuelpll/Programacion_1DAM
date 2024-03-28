package Practicas_Obligatorias.Practica_Evaluable_Tema_10_Parra_Llansó_Manuel;


import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

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
        //Zona de declaracion de variables
        boolean salir =false;
        //Zona de inicializacion , añadir más cosas si es necesario
        Scanner scanner = new Scanner(System.in);
        //Zona de salida
        do {
            try {


                System.out.println("""
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
                        System.out.println("Funciones pedidas");
                        break;
                    case 2:
                        System.out.println("Otra funcion");
                        break;
                    case 3:
                        System.out.println("Otra funcion");
                        break;
                    case 4:
                        menuDeOrdenar(scanner);
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
     * Menu que genera varias opciones para ordenar el arraylist
     * @param scanner El scanner para introducir la opcion
     */
    public static void menuDeOrdenar(Scanner scanner) {
        try {
            System.out.println("""
                    1-> Por antiguedad
                    2-> Por salario
                    3-> Por Apellido""");
            eleccion = scanner.nextInt();
            scanner.nextLine();//Si es necesario se pone
            switch (eleccion) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Error: Opcion no valida");
            }//Fin switch
        }catch (InputMismatchException e2){
            System.out.println("Inserte una de la opciones validas");
        }//Fin del try-catch
    }//Fin de menuDeOrdenar

    public static void main(String[] args) {
        menu();
    }//Fin del main
}//Fin de Main
