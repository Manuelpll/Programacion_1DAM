package Tema_2;
/**
 * Pasar de grados centigrados a Farenheit
 * @author Manuel
 */
import java.util.Scanner;
public class Ejemplo05 {
    public static double paso ( double num1){
        double resultado =((num1*9)/5)+32;
        return resultado;
    }
    
    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);
        double centigrados;
        
        System.out.println("Introduce los grados centigrados que deseas pasar a Farenheit ");
        centigrados= teclado.nextDouble();
        
        double farenheit= paso(centigrados);
        System.out.printf("\nSon %.0f grados Farenheit",farenheit);
    }
}
