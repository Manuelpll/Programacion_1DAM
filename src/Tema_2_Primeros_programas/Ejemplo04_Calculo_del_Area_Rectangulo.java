package Tema_2_Primeros_programas;
import java.util.Scanner;
/**
 *Este programa permite calcular el area se un rectangulo
 * @author Manuel
 */
public class Ejemplo04_Calculo_del_Area_Rectangulo {
    /**
     * Metodo de calculo del area del rectangulo
     * @param num1 Altura del rectangulo
     * @param num2 Base del rectangulo
     * @return El area del rectangulo
     */
     public static double area ( double num1, double num2){
         return num1*num2;
    }//Fin de area

    /**
     * Metodo principal para ejecutar el codigo
     * @param args Los argumentos de la línea de comandos
     */
    public static void main (String[] args){
        //Zona de inicilización
        Scanner teclado = new Scanner(System.in);
        //Zona de declaracion de variables
        double altura;
        double base;
        //Zona de salida
        System.out.println("Introduce la base");
        base=teclado.nextDouble();
        System.out.println("Introduce la altur del rectangulo ");
        altura= teclado.nextDouble();
        
        double total= area(altura,base);
        System.out.printf("\nSon %.2f metros cuadrados",total);
    }//Fin de main
}//Fin de Calculo del area de rectangulo
