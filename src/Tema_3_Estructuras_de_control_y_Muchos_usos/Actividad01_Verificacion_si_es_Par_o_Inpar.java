package Tema_3_Estructuras_de_control_y_Muchos_usos;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *  Programa que comprueba si el numero es par o inpar
 * @author Mparr
 */

public class Actividad01_Verificacion_si_es_Par_o_Inpar {
    /**
     * Metodo que verifica si es par o inpar
     * @param num1 el numero que quieres verificar
     */
    public static void par(double num1){
                if(num1%2==0){
       System.out.println("Es Par");
            }else{
        System.out.println("Es Impar");}//Fin del if-else
    }//Fin de par
    /**
     * Metodo que ejecuta el codigo
     * @param args Los argumentos de la linea de comandos
     * @throws InputMismatchException Si no se introduce un numero
     */
    public static void main(String[] args){
         //Declarar variables
        double n;
        //Zona de iniciacion de datos
        Scanner teclado=new Scanner (System.in);
        try {
            System.out.println ("Escribe un numero");
            n = teclado.nextDouble ();
            par(n);
        }catch (InputMismatchException e){
            System.out.println("Error:  no puedes insertar una letra");
        }//Fin del try-catch
    }//Fin de main
    }//Fin de verificar si es par o inpar

