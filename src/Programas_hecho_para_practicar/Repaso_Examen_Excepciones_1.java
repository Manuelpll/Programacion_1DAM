package Programas_hecho_para_practicar;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * Programa para practicar las excepciones en java capturando todad las posibles en una division
 * @author Mparr
 * @version 1.0
 * @date 29/02/2024
 */
public class Repaso_Examen_Excepciones_1 {
    /**
     * Metodo que hace una division capturando todas las excepciones posibles
     * @param dividendo El primer numero que se pide
     * @param divisor El segundo numero que se pide
     * @throws IllegalArgumentException Se lanzara esta excepcion si el divisor es 0
     * @throws NumberFormatException Se lanzara esta excepcion si la division no es exacta o que haya un numero negativo
     * @return El resultado de la division si es posible hacerse
     */
    public static int divide (int dividendo, int divisor) {
        if (divisor==0) {
            throw new IllegalArgumentException("División incorrecta");
        } else if (divisor<0|dividendo<0) {
            throw  new NumberFormatException("La división no corresponde con números enteros");
        } else if (dividendo %2 !=0||divisor%2==0) {
            throw  new NumberFormatException("La division no es exacta");
        }  else  {

            return (dividendo / divisor);
        }
    }//Fin metodo divide

    /**
     * Metodo para ejecutar el codigo
     * @param args Los argumentos de la linea de comandos
     * @throws InputMismatchException Si no son numeros enteros las variables
     * @throws ArithmeticException Si intentas dividir 0 entre 0
     * @throws NullPointerException Si una o ambas variables estan vacias
     */
    public static void main(String[] args) {
        //Zona inicializacion
        Scanner scanner=new Scanner(System.in);
        //Zona de declaracion de variables
    int numero1;
    int numero2;
    //Zona de salida
        try {
            //Inicializacion primera variable
            try {
                System.out.println("Introduce el primer numero");
                numero1 = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("No puedes poner un caracter ni un numero decimal");
                return;
            }//Fin try-catch de numero1
           //Inicializacion de la segunda variable
            try {
                System.out.println("Introduce el segundo numero");
                numero2 = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("No puedes poner un caracter ni un numero decimal");
                return;
            }//Fin try-catch de numero2
            //Realización de la division
            int resultado = divide(numero1, numero2);
            System.out.println(resultado);
        }catch (IllegalArgumentException e){
            System.out.println("Error "+e.getMessage());
        }catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir 0 entre 0");
        }catch (NullPointerException e){
            System.out.println("Error: No se puede ejecutar el programa si una de las variables o las dos estan vacias");
        }//Fin try-catch
  }//Fin main
}//Fin de Repaso Excepciones