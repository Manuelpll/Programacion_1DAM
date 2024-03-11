package Tema_2_Primeros_programas;
import java.util.Scanner;
/**
 * Pasar de grados centigrados a Farenheit
 * @author Manuel
 */
public class Ejemplo05_Conversor_de_grados_a_Farenheit {
    /**
     * Metodo que pasa de grados  celsius a farenheit
     * @param num1 Cantidad de grados celsius
     * @return Cantidad de grados farenheit
     */
    public static double paso ( double num1){
        double resultado =((num1*9)/5)+32;
        return resultado;
    } //Fin de paso

    /**
     * Metopo para ejecutar el codigo
     * @param args Los argumentos de la linea de comandos
     */
    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);
        double centigrados;
        
        System.out.println("Introduce los grados centigrados que deseas pasar a Farenheit ");
        centigrados= teclado.nextDouble();
        
        double farenheit= paso(centigrados);
        System.out.printf("\nSon %.0f grados Farenheit",farenheit);
    }//Fin de main
}//Fin de conversor de grados a farenheit
