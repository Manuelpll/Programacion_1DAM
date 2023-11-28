
package Tema_3;


import java.util.Scanner;

public class Actividad04 {
	
	//Declaramos el subproceso
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
		}
	return dentroRango;
	}
	
	//Declaramos el proceso principal
	public static void main(String[] args) {
		
		String rango = rangoIM();
		System.out.print(rango);
	}
}
    

