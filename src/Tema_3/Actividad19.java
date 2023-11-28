package Tema_3;
/**
 * Programa que pide al usuario el numero de elementos finales de la serie.
 */
import java.util.Scanner;
public class Actividad19 {
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