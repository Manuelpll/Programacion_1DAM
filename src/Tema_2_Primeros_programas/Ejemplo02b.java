package Tema_2_Primeros_programas;
/*
*Conversor de euros a pesetas
 */
import java.util.Scanner;
public class Ejemplo02b {
public static double conversor ( double num1){
        double resultado =166.386/num1;
        return resultado;
    }
    
    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);
   
        double pesetas;
        
        System.out.print("Introduce la cantidad de euros que quieres pasar a pestas");
        pesetas= teclado.nextDouble();
        
        double euros= conversor(pesetas);
        System.out.printf("\n.3f es igual a %.3f pestas", euros,pesetas);
    }
    
}
