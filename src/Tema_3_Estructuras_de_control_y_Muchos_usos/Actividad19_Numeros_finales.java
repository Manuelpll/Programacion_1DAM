package Tema_3_Estructuras_de_control_y_Muchos_usos;
/**
 * Programa que pide al usuario el numero de elementos finales de la serie.
 * @autor Mparll
 */
import java.util.Scanner;
public class Actividad19_Numeros_finales {
    public static void numeros(int num){
        for( int i=0;i<=num;i++){
            for(int j=0;j<i;j++){
                System.out.print(i);
            }//Fin segundo for
        }//Fin primer for
    }//Fin del proceso numeros
    public static void main(String[] args) {
        //Declaramos las variables
        int num;
        //Inicializamos los datos
        Scanner teclado=new Scanner(System.in);
        //Salida de los datos
        System.out.println("Introduce el numero que quieres que se finalice la seríe");
        num=teclado.nextInt();
        numeros(num);
    }
}