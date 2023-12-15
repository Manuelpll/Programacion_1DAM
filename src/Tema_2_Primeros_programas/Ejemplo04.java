package Tema_2_Primeros_programas;
/**
 *Calculo de el area del rectangulo
 * @author Manuel
 */
import java.util.Scanner;
public class Ejemplo04 {
     public static double area ( double num1, double num2){
        double resultado =num1*num2;
        return resultado;
    }
    
    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);
        double altura;
        double base;
        
        System.out.println("Introduce la base");
        base=teclado.nextDouble();
        System.out.println("Introduce la altur del rectangulo ");
        altura= teclado.nextDouble();
        
        double total= area(altura,base);
        System.out.printf("\nSon %.2f metros cuadrados",total);
    }
}
