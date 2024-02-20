package Tema_7_Manejo_de_Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio_4B {
    public static void main(String[] args) {
        int intentos=0;
        int numero1;
        int numero2 = 0;
        double resultado=0;
        boolean operacion = false;
        Scanner scanner = new Scanner(System.in);
        while (!operacion) {
            try {
                System.out.println("Introduzca  el dividendo");
                numero1 = scanner.nextInt();
                System.out.println("Introduzca el divisor");
                numero2 = scanner.nextInt();
                resultado = (double) numero2 / numero1;
                operacion = true;
            } catch (InputMismatchException e) {;
                System.out.println("Debes introducir un numero entero");
                operacion = false;
                scanner.next();
            } catch (ArithmeticException e) {
                System.out.println("No se puede dividir entre 0");
                operacion = false;
            } finally {
                intentos++;
            }
        }
        operacion=false;
        while (!operacion){
            try {
                System.out.println("Introduce el divisor");
                numero1= scanner.nextInt();
                if (numero1==0){
                    throw  new ArithmeticException();
                }else{
                    resultado=(double) numero1/ (double)  numero2;
                    operacion=true;
                }
            }catch (InputMismatchException e) {
                System.out.println("Debe de ser entero");
                operacion=false;
            }catch (ArithmeticException e){
                System.out.println("No se puede dividir entre 0");
                operacion=false;
            }finally {
                {
                    intentos++;
                }
            }
        }

        System.out.println("Este es el resultado " + resultado+"\nEl numero de intentos es"+intentos);
        scanner.close();
    }
}
