package Tema_3_Estructuras_de_control_y_Muchos_usos;
import java.util.Scanner;

/**
 * Crear una serie donde las posiciones pares devuelva un menos uno y las impares un uno, donde el usuario introduce el numero de veces que quiere que salga.
 */
public class Actividad21_Serie_de_1_y_menos_1 {
    //Creamos un proceso para que  devuelva un menos umo y las imapares un uno
    public static void impares(int num) {
        for ( int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                System.out.print("-1");
            } else {
                System.out.print("1");
            }//Fin else
            if ( i< num) {
                System.out.print(", ");
            }//Fin if
        }//Fin for

    }//Fin proceo impares
    public static void main(String[] args) {
     //Declaramos variables
        int eleccion;
        //Incializamos datos
        Scanner teclado= new Scanner(System.in);
        //Salida de datos
        System.out.println("Introduce el numero de veces ");
        eleccion=teclado.nextInt();
        impares(eleccion);
    }
}
