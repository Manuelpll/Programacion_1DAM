/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examen_1_Evaluacion;
import java.util.Scanner;

/**
 *
 * @author Francesco Fevoli Chac�n
 */
public class Ejercicio2_solución {
    public static void ABC (char mayus) {
        char letra;
        boolean enye;
        if (mayus == 'M') {
            for (int i = 65; i < 91; i++) { //El �ndice empieza desde 65, que en la tabla de caracteres del c�digo ASCII es la A.
                letra = (char) i;
                if (i == 90) System.out.print(letra + ".");
                else {
                    System.out.print(letra + " ");
                    enye = (i == 78)? true:false; //Cuando se imprima la N (78), la condici�n se cumplir� y se imprimir� la �.
                    if (enye) {
                        letra = '�';
                        System.out.print(letra + " ");
                    }
                }
            }
        }
        if (mayus == 'm') {
            for (int i = 97; i < 123; i++) { //El �ndice empieza desde 97, que en la tabla de caracteres del c�digo ASCII es la a.
                letra = (char) i;
                if (i == 122) System.out.print(letra + ".");
                else {
                    System.out.print(letra + " ");
                    enye = (i == 110)? true:false; //Cuando se imprima la n (110), la condici�n se cumplir� y se imprimir� la �.
                    if (enye) {
                        letra = '�';
                        System.out.print(Character.toLowerCase(letra) + " ");
                    }
                }
            }
        }
    }
    public static void menu () {
        Scanner teclado = new Scanner(System.in);
        char mayus = 'a';
        System.out.print("Este programa imprime el abecedario espa�ol en may�sculas o en min�sculas.\nm: Imprime el abecedario espa�ol en min�sculas.\nM: Imprime el abecedario espa�ol en may�sculas.\ns o S: Sale del programa.");
        while (mayus != 's') {
            System.out.print("\nElija su opci�n: ");
            mayus = teclado.next().charAt(0);
            switch (mayus) {
                case 'm':
                    ABC(mayus);
                    break;
                case 'M':
                    ABC(mayus);
                    break;
                case 's':
                    System.out.println("Saliendo...");
                    break;
                case 'S':
                    System.out.println("Saliendo...");
                    mayus = 's'; //Cambia la S por una s para que el bucle while finalice.
                    break;
                default:
                    System.out.println("Introduzca una opci�n v�lida.");
                    break;
            }
        }
    }
    public static void main(String[] args) {
        menu();
    }
}
