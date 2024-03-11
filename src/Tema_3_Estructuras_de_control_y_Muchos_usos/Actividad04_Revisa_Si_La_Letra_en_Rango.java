
package Tema_3_Estructuras_de_control_y_Muchos_usos;
/*
 *Es un programa que nos dice si una letra esta dentro del rango indicado o no
 */
import java.util.Scanner;

public class Actividad04_Revisa_Si_La_Letra_en_Rango {

	/**
	 * Metodo que conprueba el rango de la letra seleccionada
	 * @return Si se encuentra en el rango
	 */
	public static String rangoIM() {
		
		//Declaramos las variables y el Scanner
		String dentroRango;
		char letra;
		Scanner teclado = new Scanner(System.in);
			System.out.print("Introduzca la letra a evaluar: ");
			letra = teclado.next().charAt(0);

		//Comprobamos si esta en ese rango con un IF-ELSE
		if((letra>104&&letra<110) || (letra>72&&letra<78)) {
			dentroRango = "Esta dentro del rango.";
		}
		else {
			dentroRango = "No esta dentro del rango.";
		}//Fin if-else
			return dentroRango;
	}//Fin de rangoIM

	/**
	 * Metodo que ejecuta el codigo
	 * @param args Los argumentos de la linea de comandos
	 */
	public static void main(String[] args) {
		String rango = rangoIM();
		System.out.print(rango);
	}//Fin de main
}//Fin de revisa si la letra esta en rango
    

