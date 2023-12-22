package Tema_3_Estructuras_de_control_y_Muchos_usos;
/**
 * Este programa dibuja una piramide invertida
 */

import java.util.Scanner;


public class Actividad_23_Piramide_invertida { //ACTIVIDADES PROPUESTAS 3 - 01 (hace una pirámide invertida)
    public static void triangulin (char a, int f){
        for(int esp=0, simbolos=(f*2)-1 ;simbolos>0; esp++, simbolos-=2){
            //Espacios en blanco
            for(int i=0;i<esp;i++){
                System.out.print(" ");
            }
            //Asteriscos
            for(int j=simbolos;j>0;j--){
                System.out.print(a);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        char simbolo;
        int filas;
        System.out.print("Introduzca el símbolo con el que quiere formar su triángulo: ");
        simbolo = scanner.next().charAt(0);
        System.out.print("Introduzca el número de filas a realizar: ");
        filas = scanner.nextInt();
        triangulin(simbolo, filas);
    } //fin main
} //fin clase