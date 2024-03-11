package Tema_3_Estructuras_de_control_y_Muchos_usos;

import java.util.InputMismatchException;
import java.util.Scanner;
/*
 * Es un programa que te dice si las dos letras insertadas consecutivamente si estan ordenadas alfabeticamente o no
 * @autor Manuel
 */
public class Actividad03_Verificar_el_orden_dos_letras {
    /**
     * Metodo para comprobar si esta ordenado alfabeticamente
     * @param letra1 primera letra
     * @param letra2 segunda letra
     */
    public static void alfabeto (char letra1,char letra2){
       if (letra1<letra2)
           System.out.println("Esta ordenado alfabeticamente");
       else{ System.out.println("No esta ordenado");
       }//Fin de if-else
    }//Fin de alfabeto

    /**
     * Metodo para ejecutar el codigo
     * @param args Los argumentos de la linea de comandos
     * @throws InputMismatchException Si se pone aldo que no sea un caracter
     */
    public static void main (String[] args){
         //Zona de inicializacion de datos
        Scanner teclado=new Scanner (System.in);
        //Declaracion de variables
        char A;
        char B;
        //Salida de informacion

        try {
            System.out.println("Introduce la primera letra");
            A= teclado.next().charAt(0);
        }catch (InputMismatchException e){
            System.out.println("Error: No se puede poner algo que no sea una letra");
            return;
        }//Fin del primer try-catch

        try {
            System.out.println("Introduce la segunda letra");
            B= teclado.next().charAt(0);
        }catch (InputMismatchException e){
            System.out.println("Error: No se puede poner algo que no sea una letra");
            return;
        }//Fin del segundo try-catch
        alfabeto(A,B);
    }//Fin de main
}//Fin de Verificar el orden de dos letras
