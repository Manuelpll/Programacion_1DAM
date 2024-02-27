package Practicas_Obligatorias;
import Practicas_Obligatorias.Practica_Evaluable_Tema_6_Parra_Llansó_Manuel.actividad_2.Temperatura;

import javax.swing.*;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * Este programa trata de un menu donde eliges el mes que quieres y te dice las temperaturas maximas,minimas y medias de cada día
 * ahora corrige las excepciones que daría si no utili
 * @author Mparr
 * @version 1.5
 * @date 27/02/2024
 */
public class Practica_Evaluable_Tema_7_Parra_Llansó_Manuel {
        public static void elegirTemperatura(String enero, String febrero, Temperatura[][] temperaturasEne, Temperatura[][] temperaturasFeb) {
            Scanner scanner2 = new Scanner(System.in);
            System.out.println("¿Que mes quieres ver?");
            String mes = scanner2.nextLine();
            if (mes.equalsIgnoreCase(enero)) {
                for (Temperatura[] temperaturaDia : temperaturasEne) {
                    System.out.println(Arrays.deepToString(temperaturaDia));
                }//Fin for
                System.out.println();
            } else if (mes.equalsIgnoreCase(febrero)) {
                for (Temperatura[] temperaturaDia : temperaturasFeb) {
                    System.out.println(Arrays.deepToString(temperaturaDia));
                }//Fin for
                System.out.println();
            } else {
                System.out.println("Temperaturas " + "del " + mes + " no esta registrada aun");
            }//Fin if
        }//Fin de elegirTemperatura

        public static void menu() {
                //Zona de declaracion de variables
                int eleccion;
                boolean salir = false;
                String enero = "enero";
                String febrero = "febrero";
                //Temperaturas de Enero
                Temperatura[][] temperaturasEne = new Temperatura[31][];
                for (int i = 0; i < temperaturasEne.length; i++) {
                    temperaturasEne[i] = new Temperatura[1];
                }//Fin for
                temperaturasEne[0][0] = new Temperatura(1, 10, 2);
                temperaturasEne[1][0] = new Temperatura(2, 9, 2);
                temperaturasEne[2][0] = new Temperatura(3, 12, 8);
                temperaturasEne[3][0] = new Temperatura(4, 10, 8);
                temperaturasEne[4][0] = new Temperatura(5, 9, 4);
                temperaturasEne[5][0] = new Temperatura(6, 8, 3);
                temperaturasEne[6][0] = new Temperatura(7, 9, -1);
                temperaturasEne[7][0] = new Temperatura(8, 7, -3);
                temperaturasEne[8][0] = new Temperatura(9, 7, 4);
                temperaturasEne[9][0] = new Temperatura(10, 7, 4);
                temperaturasEne[10][0] = new Temperatura(11, 8, 1);
                temperaturasEne[11][0] = new Temperatura(12, 7, 0);
                temperaturasEne[12][0] = new Temperatura(13, 9, 2);
                temperaturasEne[13][0] = new Temperatura(14, 10, 5);
                temperaturasEne[14][0] = new Temperatura(15, 13, 10);
                temperaturasEne[15][0] = new Temperatura(16, 14, 11);
                temperaturasEne[16][0] = new Temperatura(17, 12, 10);
                temperaturasEne[17][0] = new Temperatura(18, 13, 10);
                temperaturasEne[18][0] = new Temperatura(19, 10, 4);
                temperaturasEne[19][0] = new Temperatura(20, 10, 1);
                temperaturasEne[20][0] = new Temperatura(21, 11, 3);
                temperaturasEne[21][0] = new Temperatura(22, 11, 1);
                temperaturasEne[22][0] = new Temperatura(23, 16, 3);
                temperaturasEne[23][0] = new Temperatura(24, 18, 6);
                temperaturasEne[24][0] = new Temperatura(25, 18, 5);
                temperaturasEne[25][0] = new Temperatura(26, 20, 6);
                temperaturasEne[26][0] = new Temperatura(27, 18, 8);
                temperaturasEne[27][0] = new Temperatura(28, 17, 5);
                temperaturasEne[28][0] = new Temperatura(29, 14, 6);
                temperaturasEne[29][0] = new Temperatura(30, 13, 4);
                temperaturasEne[30][0] = new Temperatura(31, 11, 4);
// Temperaturas de Febrero
                Temperatura[][] temperaturasFeb = new Temperatura[21][];
                for (int i = 0; i < temperaturasFeb.length; i++) {
                    temperaturasFeb[i] = new Temperatura[1];
                }//Fin for
                temperaturasFeb[0][0] = new Temperatura(1, 18, 4);
                temperaturasFeb[1][0] = new Temperatura(2, 15, 4);
                temperaturasFeb[2][0] = new Temperatura(3, 15, 5);
                temperaturasFeb[3][0] = new Temperatura(4, 18, 3);
                temperaturasFeb[4][0] = new Temperatura(5, 15, 2);
                temperaturasFeb[5][0] = new Temperatura(6, 14, 5);
                temperaturasFeb[6][0] = new Temperatura(7, 11, 5);
                temperaturasFeb[7][0] = new Temperatura(8, 12, 8);
                temperaturasFeb[8][0] = new Temperatura(9, 11, 8);
                temperaturasFeb[9][0] = new Temperatura(10, 10, 4);
                temperaturasFeb[10][0] = new Temperatura(11, 8, 2);
                temperaturasFeb[11][0] = new Temperatura(12, 14, 5);
                temperaturasFeb[12][0] = new Temperatura(13, 15, 9);
                temperaturasFeb[13][0] = new Temperatura(14, 17, 8);
                temperaturasFeb[14][0] = new Temperatura(15, 9, 1);
                temperaturasFeb[15][0] = new Temperatura(16, 4, 0);
                temperaturasFeb[16][0] = new Temperatura(17, 8, 2);
                temperaturasFeb[18][0] = new Temperatura(18, 10, 2);
                temperaturasFeb[19][0] = new Temperatura(19, 9, 1);
                temperaturasFeb[20][0] = new Temperatura(20, 7, 0);
                //Zona de inicializacion
                Scanner scanner = new Scanner(System.in);
                //Zona de salida
                do {
                    System.out.println("""
                            **************************
                            Elige una opcion del menu:
                            1 -> Elegir mes
                            0->Salir
                            ***************************""");
                    try {
                        eleccion = scanner.nextInt();
                        scanner.nextLine();
                        switch (eleccion) {
                            case 1:
                                elegirTemperatura(enero, febrero, temperaturasEne, temperaturasFeb);
                                break;
                            case 0:
                                System.out.println("Saliendo...");
                                salir = true;
                                break;
                            default:
                                System.out.println("Solo puede ser la opcion 0 o 1");
                        }// Fin switch
                    } catch (InputMismatchException e) {
                        System.out.println("ERROR: No se puede introducir otra cosa que no sea un numero entero");
                        scanner.nextLine();
                    }//Fim del try-catch
                } while (!salir);//Fin de while
        }//Fin de menu
        public static void main(String[] args) {
            menu();
        }//Fin del main
}//Fin Practica_Evaluable_Tema_7