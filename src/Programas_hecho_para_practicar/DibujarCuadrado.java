package Programas_hecho_para_practicar;

import java.util.Scanner;
/**
*Programa que dibuja un cuadrado
 * */
public class DibujarCuadrado {
    public static void dibujarCuadrado(char caracter, int tamaño) {
        System.out.println("Dibujando cuadrado:");
        for (int i = 0; i < tamaño; i++) {

            for (int j = 0; j < tamaño; j++) {
                System.out.print(caracter);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char caracter;
        int tamaño;

        System.out.println("Ingrese el carácter que desea utilizar para el cuadrado");
        caracter = scanner.next().charAt(0);

        System.out.println("Ingrese el tamaño del cuadrado:");
        tamaño = scanner.nextInt();
        dibujarCuadrado(caracter, tamaño);
    }
}

