/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examen_1_Evaluacion.Hecho_Por_mi;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author alumno
 */
public class Ejercicio3_solucion {
    public static void ecuacion (int a, int b, int c) {
        double sol1, sol2;
        int denom, suma;
        double raiz;
        if (((b*b)-4*a*c) < 0 || a == 0) { //En caso de ser la ra�z cuadrada negativa (n�mero complejo) o el denominador 0, el programa devolver� que la ecuaci�n no tiene soluciones reales.
            System.out.println("No tiene soluciones reales.");
        }
        else { //La f�rmula de la ecuaci�n de segundo grado es: (-b +- (b^2 - 4*a*c)^-1)/2*a
            denom = 2 * a; //El denominador de la f�rmula, el 2*a.
            suma = b * -1; //El primer elemento, -b.
            raiz = Math.sqrt((b*b)-4*a*c); //Los elementos dentro de la ra�z cuadrada: (b^2 - 4*a*c)^-1.
            sol1 = (double) (suma + raiz)/denom; //La primera soluci�n es sumando el -b con la ra�z cuadrada.
            System.out.printf("La soluci�n 1 es: %.2f", sol1); //Se muestran �nicamente dos decimales.
            sol2 = (double) (suma - raiz)/denom; //La segunda soluci�n es rest�ndole la ra�z cuadrada a -b.
            System.out.printf("\nLa soluci�n 2 es: %.2f",sol2);
        }
    }
    public static void main(String[] args) {
        int a, b, c;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca los par�metros a, b y c de la ecuaci�n de segundo grado, separ�ndolos pulsando la tecla Entrar.");
        a = teclado.nextInt();
        teclado.nextLine();
        b = teclado.nextInt();
        teclado.nextLine();
        c = teclado.nextInt();
        ecuacion(a, b, c);
    }
}

