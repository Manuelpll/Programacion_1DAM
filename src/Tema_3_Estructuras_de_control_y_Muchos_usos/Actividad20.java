package Tema_3_Estructuras_de_control_y_Muchos_usos;

import java.util.Scanner;

/**
 *  El usuario introduce el número de elementos finales de la serie. Ejemplo con cinco elementos:
 *  Introduce el número de elementos: 5
 *  a;b,b;c,c,c;d,d,d,d;e,e,e,e,e
 */

public class Actividad20 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in); //System.in, "ISO-8859-1" para coger tildes y tal. A partir de ahora hay que usarlo
        System.out.print("Introduzca el numero final: ");
        int limite= teclado.nextInt();
        char letra;

        for (int i=0;i<=limite;i++) {
            letra=(char) (96+i); //why?
            for (int j=0;j<i;j++) {
                System.out.print(letra);
            }
            System.out.print(";");
        }



    }//Fin main
}//Fin clase
