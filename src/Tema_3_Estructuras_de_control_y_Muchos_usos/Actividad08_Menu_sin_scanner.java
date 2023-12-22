package Tema_3_Estructuras_de_control_y_Muchos_usos;
/*
Es un programa que te lee lo que has puesto sin utilizar la libreria Scanner
 */
import java.io.*;
public class Actividad08_Menu_sin_scanner {

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