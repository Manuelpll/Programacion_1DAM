package Tema_3_Estructuras_de_control_y_Muchos_usos;
/**
 * Es un programa que te dice cual es el mayor numero de tres numeros insertados por el usuario
 * @autor Manuel
 */

import java.util.Scanner;
public class Actividad02 {
    public static double  compara (double num1, double num2, double num3){
         if(num1>num2&&num1>num3){
            System.out.println("El mayor es "+num1);
            
        }else{
            if(num2>num1&&num2>num3){
                System.out.println("El mayor es "+num2);
            }else{
                if(num3>num1&&num3>num2){
                    System.out.println("El mayor es "+num3);
                }
            }
        } 
       return num3;
    }
    public static void main (String[] args){
        //Zona de inicializacion de datos
        Scanner teclado=new Scanner (System.in);
        //Declaramos variables
        double A;
        double B;
        double C;
        System.out.println("Escribe el primer numero");
        A=teclado.nextDouble();
        System.out.println("Escribe el segundo numero");
        B=teclado.nextDouble();
        System.out.println("Escribe el tercer numero");
        C=teclado.nextDouble();
     compara(A,B,C);
    }
    }