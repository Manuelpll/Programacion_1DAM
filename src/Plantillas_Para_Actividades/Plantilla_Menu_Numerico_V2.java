package Plantillas_Para_Actividades;

import java.util.Scanner;
/**
 * Plantilla para hacer un menu numerico mejorada
 * @author Mparr
 * @version 2.0
 */
public class Plantilla_Menu_Numerico_V2 {
        public static void menu() {
            //Zona de declaracion de variables
            int eleccion;
            boolean salir =false;
            //Zona de inicializacion , añadir más cosas si es necesario
            Scanner scanner = new Scanner(System.in);
            //Zona de salida
            do {
                System.out.println("\nOpcion1" + "\nOpcion2" + "\n0->Salir");
                eleccion = scanner.nextInt();

                switch (eleccion) {
                    case 1:
                        System.out.println("Funciones pedidas");
                        break;
                    case 2:
                        System.out.println("Otra funcion");
                        break;
                    case 0:
                        System.out.println("Saliendo...");
                       salir=true;
                        break;
                    default:
                        System.out.println("Error");
                        break;
                }//Fin switch
            } while (!salir);
        }//Fin de menu

        public static void main(String[] args) {
            menu();
        }//Fin main
    }//Fin de Plantilla_Menu_Numerico_V2
