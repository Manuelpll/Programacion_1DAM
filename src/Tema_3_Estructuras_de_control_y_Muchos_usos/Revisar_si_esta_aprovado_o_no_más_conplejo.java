package Tema_3_Estructuras_de_control_y_Muchos_usos;

import java.util.Scanner;

public class Revisar_si_esta_aprovado_o_no_más_conplejo {

	public static void main(String[] args) {
		//zona de variables
		String resultado = null;
				
				
		//zona de iniacializacion de datos
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce la nota");
		int nota = teclado.nextInt();
				
				
		//zona de procesamiento
		switch(nota) {
		case 0,1,2,3,4:
			resultado="suspenso";
			break;
		case 5:
			resultado="suficiente";
			break;
		case 6:
			resultado="bien";
			break;
		case 7,8:
			resultado="notable";
			break;
		case 9, 10:
			resultado="sobresaliente";
			break;
		default:
			resultado="Error";
		
		}
		
		
		//zona de salida
		
				System.out.println("El resultado es : "+resultado);
		
		
		

	}

}
