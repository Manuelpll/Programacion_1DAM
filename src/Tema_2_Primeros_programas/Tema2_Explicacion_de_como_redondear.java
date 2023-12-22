package Tema_2_Primeros_programas;
import java.util.Scanner;

/**
 * Programa que muestra como se redondea
 * @author Mparr
 */
public class Tema2_Explicacion_de_como_redondear {

  public static void main(String[] args){
		double numero = 0;
		Scanner teclado = new Scanner(System.in);
		int x,y,z;
		x=(int) Math.round(numero);//Redondeo normal
		y=(int) Math.ceil(numero);// Redondeo hacia arriba
		z=(int) Math.floor(numero);// Redondeo hacia abajo
		System.out.print("\nIntroduzca un numero(parte decimal con coma): ");
	numero=teclado.nextDouble(); 

	 
		System.out.println("El numero entero es: "+x);
		System.out.println("El numero ceil es: "+y);
		System.out.println("El floor es: "+z);
    }
    
}
