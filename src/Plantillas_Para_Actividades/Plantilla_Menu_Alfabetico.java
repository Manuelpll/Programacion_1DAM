package Plantillas_Para_Actividades;

import java.util.Scanner;
/**
 * Plantilla para hacer un menu con letras
 * @author Mparr
 */
public class Plantilla_Menu_Alfabetico {
    public static void menu () {
        //Zona de inicializacion
        Scanner teclado = new Scanner(System.in);
        //Zona de declaracion de variables
        char mayus = 'a';
        //Zona de salida de informacion
        System.out.println("\nOpcion n"+"\nOpcion m"+"\nOpcion L"+"\nOpcion de salida->s o S");//Añado todas las opciones deseadas
        while (mayus != 's') {
            System.out.print("\nElija su opcion: ");
            mayus = teclado.next().charAt(0);
            switch (mayus) {
                case 'n':
                    System.out.println("Una funcion");
                    break;
                case 'm':
                    System.out.println("Otra funcion");
                    break;
                case 'L':
                    System.out.println("Otra funcion");
                    break;
                case 'S':
                    mayus = 's';//Cambia la S por una s para que el bucle while finalice.
                    break;
                default:
                    System.out.println("Introduzca una opcion valida");
                    break;
            }//Fin del swich
        }//Fin del while
    }//Fin del menu

    public static void main(String[] args) {
        menu();
    }
}
