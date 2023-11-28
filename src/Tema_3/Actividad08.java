package Tema_3;
import java.io.*;
public class Actividad08 {

	public static void main(String[] args) throws IOException {
		// Declaramos las variables
             int nota=0;
             char calificacion;
             boolean notValida;
             //Zona de salida
             System.out.print("Introduce la calificacion(I,B,N,S)");
             calificacion= Character.toUpperCase((char)System.in.read());
             //calificacion=Character toUpperCase (calificacion)
             switch(calificacion) {
             case 'I':
            	 nota=4;
            	 break;
             case 'F':
            	 nota=5;
            	 break;
             case 'B':
            	 nota=6;
            	 break;
             case 'N':
            	 nota=7;
            	 break;
             case 'S':
            	 nota=10;
            	 break;
             }
	}
}