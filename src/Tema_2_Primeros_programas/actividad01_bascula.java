package Tema_2_Primeros_programas;
import java.util.Scanner;

/**
 * Programa que hace la funcion de una bascula
 * @author Mparr
 * @version 1.0
 */
public class actividad01_bascula {
    /**
     * Metodo principal para ejecutar el programa
     * @param args Los argumentos de la linea de comando
     */
   public static void main (String[] args){
    Scanner teclado = new Scanner(System.in);
    double peso; //En kilos
    String codigo;
    double dinero;
    double precio;
    double vuelta = 0;
    
   System.out.print("Introduce el nombre del producto ");
    codigo=teclado.nextLine();
    
    System .out.print("Indique el peso en kilos ");
    peso=teclado.nextDouble();
    
    precio= peso*1.5;
  System.out.println("El precio de el alimento es "+(precio));
  
  System.out.print("Introduzca el dinero ");
  
  dinero=teclado.nextDouble();
  
  vuelta= dinero-precio;
  System.out.println("La vuelta es "+(vuelta));
   }
}
