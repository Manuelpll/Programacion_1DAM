package Plantillas_Para_Actividades;
import java.util.Scanner;
/**
 * Plantilla para hacer un menu numerico
 * @author Mparr
 */
public class Plantillla_Menu_Numerico {
        public static void menu() {
            //Zona de declaracion de variables
            int contador = 0;
            int eleccion;
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
                        contador++;
                        break;
                    default:
                        System.out.println("Error");
                        break;
                }
            } while (contador == 0);
            scanner.close();
        }

        public static void main(String[] args) {
            menu();
        }
    }
