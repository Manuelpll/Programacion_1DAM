package Practicas_Obligatorias.Practica_Evaluable_Tema_4_Parra_LLansó_Manuel;
/**
 * Main de Radio_Digital
 */

import java.util.Scanner;

public class Main {
 public static void menu() {
  //Zona de declaracion de variables
  int contador = 0;
  int eleccion;
  //Zona de inicializacion
  Scanner scanner = new Scanner(System.in);
  //Zona de salida
  do {
   System.out.println("\nOpciones: "+"\n1.Subir frecuencia" + "\n2.Bajar frecuencia" + "\n3.Mostrar todas las emisoras"+"\n0->Salir");
   eleccion = scanner.nextInt();

   switch (eleccion) {
    case 1:
    Radio_Digital.inicio=(Radio_Digital.inicio+1+ radioDigitals.length)% radioDigitals.length;
     System.out.println("La emisora actual es "+radioDigitals[Radio_Digital.inicio].getNombre()+" Su frecuencia es "+radioDigitals[Radio_Digital.inicio].getFrecuencia());
     break;
    case 2:
     Radio_Digital.inicio=(Radio_Digital.inicio-1+ radioDigitals.length)% radioDigitals.length;
     System.out.println("La emisora actual es "+radioDigitals[Radio_Digital.inicio].getNombre()+" Su frecuencia es "+radioDigitals[Radio_Digital.inicio].getFrecuencia());
     break;
    case 3:
     System.out.println("Las emisoras son las siguientes: ");
     System.out.println(radioDigitals[0].getNombre());
     System.out.println(radioDigitals[1].getNombre());
     System.out.println(radioDigitals[2].getNombre());
     System.out.println(radioDigitals[3].getNombre());
     System.out.println(radioDigitals[4].getNombre());
     System.out.println(radioDigitals[5].getNombre());
     break;
    case 0:
     System.out.println("Saliendo ...");
     contador++;
     break;
    default:
     System.out.println("Error");
     break;
   }//Fin del switch
  } while (contador == 0);
 }//Fin del proceso menu
 public  static Radio_Digital[] radioDigitals = new Radio_Digital[6];//Creo el array en un proceso
    public static void main(String[] args) {
       //Creo los objetos
       radioDigitals[0] = new Radio_Digital("Los 40 principales",93.9);
        radioDigitals[1]= new Radio_Digital("Onda Cero",98.0);
        radioDigitals[2]= new Radio_Digital("Rock FM",101.7);
        radioDigitals[3]=new Radio_Digital("Radio Cristiana",104.9);
        radioDigitals[4]=new Radio_Digital("Cadena Cope",106.9);
        radioDigitals[5]= new Radio_Digital("Radio Vallekas",107.5);
     //Salida de informacion
     System.out.println("La emisora actual es "+radioDigitals[Radio_Digital.inicio].getNombre()+" Su frecuencia es "+radioDigitals[Radio_Digital.inicio].getFrecuencia());
     menu();

    }//Fin del main
}//Fin del main de Radio_Digital
