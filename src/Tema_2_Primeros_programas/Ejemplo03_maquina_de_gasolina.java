package Tema_2_Primeros_programas;
/**
 * Rellenador de un solo tipo de gasolina
 * @author Manuel
 */
import java.text.DecimalFormat;
import java.util.Scanner;
public class Ejemplo03_maquina_de_gasolina {
    public static double llenado ( double num1, double num2){
        double resultado =num1*num2;
        return resultado;
    }
    
    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);
      DecimalFormat df = new DecimalFormat("#.000");
        double gasolina;
        double precio;
        
        System.out.println("Introduce el precio que quieres para la gasolina");
        precio=teclado.nextDouble();
        System.out.println("Introduce la cantidad de litros de gasolina que quieres ");
        gasolina= teclado.nextDouble();
        
        double total= llenado(gasolina,precio);
        System.out.print("\nSon" +df.format(total)+"euros");
    }
}
