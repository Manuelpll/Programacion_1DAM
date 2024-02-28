package Tema_2_Primeros_programas;
import java.text.DecimalFormat;
import java.util.Scanner;
/**
 * Este programa es una maquina para rellenar la gasolina
 * @author Mparr
 * @version 1.0
 */
public class Ejemplo03_Maquina_de_Gasolina {
    /**
     * Metodo de calculo de el precio final de la gasolina
     * @param num1 La cantidad de litos de gasolina
     * @param num2 El precio que hay por litro de gasolina
     * @return La cantidad que cuestan esos litros de gasolina
     */
    public static double llenado ( double num1, double num2){
        return num1*num2;
    }//Fin de llenado

    /**
     * Metodo principal para ejecutar el codigo
     * @param args Los argumentos de la linea de comandos
     */
    public static void main (String[] args){
        //Zona de inicialización
        Scanner teclado = new Scanner(System.in);
      DecimalFormat df = new DecimalFormat("#.000");
      //Zona de declaracion de variables
        double gasolina;
        double precio;
        //Zona de salida
        System.out.println("Introduce el precio que quieres para la gasolina");
        precio=teclado.nextDouble();
        System.out.println("Introduce la cantidad de litros de gasolina que quieres ");
        gasolina= teclado.nextDouble();
        
        double total= llenado(gasolina,precio);
        System.out.print("\nSon" +df.format(total)+"euros");
    }//Fin de main
}//Fin de Maquina de gasolina
