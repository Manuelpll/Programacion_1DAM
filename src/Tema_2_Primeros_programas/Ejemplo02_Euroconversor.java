package Tema_2_Primeros_programas;
import java.util.Scanner;
/**
 * Este programa se trata de un euroconversor de pesetas a euros.
 * @author Mparr
 * @version  1.0
 */
public class Ejemplo02_Euroconversor {
    /**
     * Metodo que convierte la cantidad de pesetas metida por euros
     * @param num1 La cantidad de pesetas
     * @return La cantidad de euros a lo que equivale
     */
    public static double conversor ( double num1){
    return num1*166.386;
    }//Fin de conversor

    /**
     * Metodo principal para ejecutar el codigo
     * @param args Los argumentos de la linea de comandos
     */
    public static void main (String[] args){
        //Zona de inicialización
        Scanner teclado = new Scanner(System.in);
        //Zona de declaracion de variables
        double euros;
        //Zona de salida
        System.out.print("Introduce la cantidad de euros que quieres pasar a pestas");
        euros= teclado.nextDouble();
        
        double pesetas= conversor(euros);
        System.out.printf("\n.3f es igual a %.3f pestas", euros,pesetas);
    }// Fin de main
}//Fin de Euroconversor