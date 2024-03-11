package Tema_3_Estructuras_de_control_y_Muchos_usos;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * Es un programa que te dice cual es el mayor numero de tres numeros insertados por el usuario
 * @author Mparr
 */
public class Actividad02_Comparacion_de_el_numero_mayor_de_3_numeros {
    /**
     * Metodo que compara tres numeros y dice cual es el mayor, intermedio y bajo
     * @param num1 Primer numero
     * @param num2 Segundo numero
     * @param num3 Tercer numero
     */
    public static void  compara (double num1, double num2, double num3){
         if(num1>num2&&num1>num3){
            System.out.println("El mayor es "+num1);
            
        }else{
            if(num2>num1&&num2>num3){
                System.out.println("El mayor es "+num2);
            }else{
                if(num3>num1&&num3>num2){
                    System.out.println("El mayor es "+num3);
                }//Fin de if
            }//Fin del segundo if-else
        }//Fin del segundo if-else
    }//Fin de comparar

    /**
     * Metodo que ejecuta el codigo
     * @param args Los argumentos de la linea de comandos
     * @throws InputMismatchException Si no se pone un numero
     */
    public static void main (String[] args){
        //Zona de inicializacion de datos
        Scanner teclado=new Scanner (System.in);
        //Declaramos variables
        double A;
        double B;
        double C;
        try {
            System.out.println("Escribe el primer numero");
            A=teclado.nextDouble();
        }catch (InputMismatchException e){
            System.out.println("Error: No puedes poner otra cosa que no sea un numero");
            return;
        }//Fin del primer try-catch
        try {
            System.out.println("Escribe el segundo numero");
            B=teclado.nextDouble();
        }catch (InputMismatchException e){
            System.out.println("Error: No puedes poner otra cosa que no sea un numero");
            return;
        }//Fin del segundo try-catch
        try {
            System.out.println("Escribe el tercer numero");
            C=teclado.nextDouble();
        }catch (InputMismatchException e){
            System.out.println("Error: No puedes poner otra cosa que no sea un numero");
            return;
        }//Fin del tercero try-catch
     compara(A,B,C);
    }//Fin de main
    }//Fin de comparacion de  mayor de 3 numeros