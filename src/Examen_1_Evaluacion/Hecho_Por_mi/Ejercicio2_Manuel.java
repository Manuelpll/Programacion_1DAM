package Examen_1_Evaluacion.Hecho_Por_mi;
/**
 * Programa que imprime el abecedario en minusculas y en mayusculas
 * @autor Manuel
 */

import java.util.Scanner;

public class Ejercicio2_Manuel {
    //Creamos el proceso del menu
    public static int menu(int decision) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Pulse 1 si quiere ver el abecedario en minusculas");
        System.out.println("Pulse 2 si quiere ver el abecedario en mayusculas");
        System.out.println("Pulse 0 para salir");
        decision= teclado.nextInt();
        return decision;
    }

    //Creamos el proceo que nos enseñara el abecedario
    public static void abecedario(char letra, int decision) {
        int contador=0;
        while(contador==0) {
            switch (decision) {
                case 1 :
                    letra = 97;
                    System.out.println("El abecedario sería así:");
                    for (int i = 97; i <= 122; i++) {
                        System.out.print(letra);
                        if (letra < 122) {
                            System.out.print(" ");
                        }//Fin if
                        letra++;
                    } //Fin for
                //Fin case 1
                case 2 :
                    letra = 65;
                    System.out.println("El abecedario sería así:");
                    for (int i = 65; i <= 90; i++) {
                        System.out.print(letra);
                        if (letra < 90) {
                            System.out.print(" ");
                        }
                        letra++;
                    }//Fin for
                //Fin case 2

                case 0:
                    contador++;
                break;
                //Fin case 0
                default:
                    System.out.println("Pulsa una opcion valida");
            }//Fin switch
        }//Fin while
    }

    public static void main(String[] args) {
        //Declaramos las variables
        char letra=0;
        int decision=0;
        //Salida de la informacion
       int eleccion= menu(decision);
        abecedario(letra,eleccion);
    }
}