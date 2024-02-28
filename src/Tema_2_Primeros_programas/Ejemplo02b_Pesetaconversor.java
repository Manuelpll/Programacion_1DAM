package Tema_2_Primeros_programas;
import java.util.Scanner;

/**
 * Este programa convierte de euros a pesetas
 * @author Mparr
 */
public class Ejemplo02b_Pesetaconversor {
    /**
     * Metodo que convierte los euros depositados en pesetas
     * @param num1 La cantidad de euros
     * @return La cantidad equivalente en pesetas
     */
    public static double conversor ( double num1){
    return 166.386/num1;
    }//Fin de conversor

    /**
     * Metodo principal para ejecutar codigo
     * @param args Los argumentos de la linea de comandos
     */
    public static void main (String[] args){
        //Zona de inicialización
        Scanner teclado = new Scanner(System.in);
         //Zona de declaracion de variables
        double pesetas;
        //Zona de salida
        System.out.print("Introduce la cantidad de euros que quieres pasar a pestas");
        pesetas= teclado.nextDouble();
        
        double euros= conversor(pesetas);
        System.out.printf("\n.3f es igual a %.3f pestas", euros,pesetas);
    }//Fin de main
    
}//Fin de Pesetaconversor
