package Tema_7_Manejo_de_Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejemplo_4 {


    public static void main(String[] args) {
        int intentos=0;
        int numero1;
        int numero2;
        double resultado=0;
        boolean operacion = false;
        Scanner scanner = new Scanner(System.in);
        do {
            try {
                System.out.println("Introduzca  el dividendo");
                numero1 = scanner.nextInt();
                System.out.println("Introduzca el divisor");
                numero2 = scanner.nextInt();
                resultado = (double) numero2 / numero1;
                operacion=true;
            }catch (InputMismatchException e) {
                e.printStackTrace();
                System.out.println("Debes introducir un numero entero");
                operacion=false;
                scanner.next();
            }catch (ArithmeticException e) {
                e.printStackTrace();
                System.out.println("No se puede dividir entre 0");
                operacion=false;
            }finally {
                intentos++;
            }//Fin del try-catch-finally
        } while (!operacion); //Fin do-while
        System.out.println("Este es el resultado " + resultado+"\nEl numero de intentos es"+intentos);
        scanner.close();
    }//Fin del main
}//Fin de Ejemplo_4
