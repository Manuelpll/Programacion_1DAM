package Tema_2_Primeros_programas;
/**
 *Bascula
 * @author Manuel
 */
import java.util.Scanner;
public class actividad01 {
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
