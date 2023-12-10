package Tema_3;
import java.util.Scanner;

public class Actividad18 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        // Solicitar al usuario que ingrese cuántas veces desea repetir el número
        System.out.print("Ingrese la cantidad de veces que desea repetir el número: ");
        int repeticiones = scanner.nextInt();

        // Imprimir la serie de números repetida
        System.out.println("Serie de números repetida:");
        for (int i = 0; i < repeticiones; i++) {
            System.out.print(numero + " ");
        }

        // Cerrar el scanner
        scanner.close();
    }
}
