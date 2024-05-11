package Plantillas_Utiles;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Plantilla para hacer un menu numerico con tratamiento de excepciones y mejor documentacion
 * @author Mparr
 * @version 3.0
 * @date 17/03/2024
 */
public class Plantilla_Menu_Numerico_V3 {
    /**
     * Metodo que genera un menu de <b>Insertar  de lo que es</b>
     * @throws InputMismatchException Si pones una cosa que no sea un numero entero
     */
    public static void menu() {
        //Zona de declaracion de variables
        int eleccion;
        boolean salir =false;
        //Zona de inicializacion , añadir más cosas si es necesario
        Scanner scanner = new Scanner(System.in);
        //Zona de salida
        do {
            try {


                System.out.println("""
                        1-> Opcion 1
                        2-> Opcion 2
                        3-> Opcion 3
                        4-> Opcion 4
                        0-> Salir""");
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
                        System.out.println("Otra funcion");
                        break;
                    case 0:
                        System.out.println("Saliendo...");
                        salir = true;
                        break;
                    default:
                        System.out.println("Error");
                        break;
                }//Fin switch
            }catch (InputMismatchException e){
                System.out.println("Inserta una de las opciones validas");
                scanner.nextLine();
            }catch (Exception e){
                System.out.println("Error");
                scanner.nextLine();
            }//Fin try-catch
        } while (!salir);
    }//Fin de menu

    /**
     * Metodo que ejecuta el codigo
     * @param args Los argumentos de la linea de comandos
     */
    public static void main(String[] args) {
        menu();
    }
}//Fin de plantilla de menu numerico
