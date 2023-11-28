package Tema_3;
import java.util.Scanner;

public class Actividad11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int menores18 = 0;
        int entre18y65 = 0;
        int mayores65 = 0;

        System.out.println("Ingrese 10 números enteros para clasificar.");

        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese el número #" + i + ": ");
            int numero = scanner.nextInt();

            if (numero < 18) {
                menores18++;
            } else if (numero >= 18 && numero <= 65) {
                entre18y65++;
            } else {
                mayores65++;
            }
        }

        System.out.println("Cantidad de números menores que 18: " + menores18);
        System.out.println("Cantidad de números entre 18 y 65: " + entre18y65);
        System.out.println("Cantidad de números mayores que 65: " + mayores65);

        scanner.close();
    }
}


