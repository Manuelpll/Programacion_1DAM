package Tema_3_Estructuras_de_control_y_Muchos_usos;
/*
 * Es un programa que funciona de conversor de pestas a euros y viceversa
 */
import java.util.Scanner;

public class Actividad05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Conversor de Euros a Pesetas y viceversa");
        System.out.println("1. Euros a Pesetas");
        System.out.println("2. Pesetas a Euros");
        System.out.print("Selecciona una opción (1 o 2): ");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                {
                    System.out.print("Introduce la cantidad en Euros: ");
                    double euros = scanner.nextDouble();
                    double pesetas = eurosToPesetas(euros);
                    System.out.println(euros + " Euros equivalen a " + pesetas + " Pesetas.");
                    break;
                }
            case 2:
                {
                    System.out.print("Introduce la cantidad en Pesetas: ");
                    double pesetas = scanner.nextDouble();
                    double euros = pesetasToEuros(pesetas);
                    System.out.println(pesetas + " Pesetas equivalen a " + euros + " Euros.");
                    break;
                }
            default:
                System.out.println("Opción no válida. Debes seleccionar 1 o 2.");
                break;
        }

        scanner.close();
    }

    public static double eurosToPesetas(double euros) {
        return euros * 166.386;
    }

    public static double pesetasToEuros(double pesetas) {
        return pesetas * 0.006;
    }
}