package Tema_2;
/**
 * Euroconversor de pesetas a euros
 * @author Manuel
 */
import java.util.Scanner;
public class Ejemplo02 {
public static double conversor ( double num1){
        double resultado =num1*166.386;
        return resultado;
    }
    
    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);
   
        double euros;
        
        System.out.print("Introduce la cantidad de euros que quieres pasar a pestas");
        euros= teclado.nextDouble();
        
        double pesetas= conversor(euros);
        System.out.printf("\n.3f es igual a %.3f pestas", euros,pesetas);
    }
}
