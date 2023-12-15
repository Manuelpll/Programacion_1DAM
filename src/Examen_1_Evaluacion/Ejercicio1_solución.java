/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examen_1_Evaluacion;
import java.util.Scanner;

/**
 * Ejercicio 1: Serie Fibonacci.
 * @author Francesco Fevoli Chac�n
 * Dos �ltimos n�meros de DNI: 5, 0.
 */
public class Ejercicio1_solución {
    public static void serieFibonacci (int num) {
        final int a = 5;
        final int b = 0;
        int suma = 0;
        if (num == 1) {
            System.out.print(a);
        }
        else if (num == 2) {
            System.out.print(a+ ", "+b);
        }
        else if (num > 2) {
            System.out.print(a+ ", "+b+", ");
            suma = b + a;
            int sumaprev = b; //Se almacena el numero previo a la suma.
            int ant = sumaprev; //ant: numero anterior a la suma previa.
            num -=2; //Al haberse ya impreso los dos primeros numeros, que ya estan definidos, se restan al numero de elementos que el usuario desea ver.
            while (num !=0) {
                suma += ant;
                ant = sumaprev; //Al haberse hecho una suma nueva, se vuelve a almacenar en otra variable para ir subiendo de posiciones y tener guardados los dos n�meros anteriores para hacer una nueva suma.
                sumaprev = suma;
                if (num == 1) { 
                    System.out.print(suma);
                    num--;
                }
                else { 
                    System.out.print(suma + ", ");
                    num--;
                }
            }
        }
        else {
            System.out.println("ERROR: Introduzca un numero valido (mayor que 0)");
        }
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int num = 0;
        System.out.print("Introduzca el n�mero de elementos de la serie que quiera ver: ");
        num = teclado.nextInt();
        serieFibonacci(num);
    }
}
