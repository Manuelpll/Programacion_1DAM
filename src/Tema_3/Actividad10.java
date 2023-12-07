package Tema_3;
/*
Es un programa que te genera de formas diferentes una serie que va sumando 1 hasta antes de cien y luego te preguntan numeros para llevar acabo una serie personalizada
 */
import java.util.Scanner;
public class Actividad10 {
	
public static void mostrarSumaSerie(int numeroSerie, int limiteFinal) {
	System.out.println("Serie del numero "+numeroSerie+" hasta "+limiteFinal);
	int suma=0;
	for(int i= numeroSerie; i<= limiteFinal; i+=numeroSerie) {
		System.out.print(i+"");
		suma+=i;
	}
}
	public static void main(String[] args) {
		//Incializacion de datos
		 Scanner teclado= new Scanner (System.in);
		 int serie;
		 int limite;
		// salida de datos
		System.out.println("Forma 1: While");
		for(int numero=0;numero<=100;numero=numero+3) {
			System.out.print(numero);
			if(numero<=96) {
				System.out.print(",");
			}//Fin del if
		}//Fin del for
		System.out.println("\nForma 2: While");
		int numero2=3;
    while (numero2<=100){
    	System.out.print(","+numero2);
    	numero2+=3;
    	
    }
    int numero3=3;
    System.out.println("\nForma 3:Do-While");
    do {
    	System.out.print(numero3+"");
    	numero3+=3;
    } while (numero3>96);
	
	
     System.out.println("Escribe el numero de la serie");
	serie= teclado.nextInt();
	System.out.println("Escribe el numero limite de la serie");
	limite= teclado.nextInt();
	mostrarSumaSerie(serie,limite);
}
}
