package Tema_3;
import java.math.BigDecimal;
import java.util.Scanner;

public class Actividad16 {


    private static boolean esPrimo(BigDecimal numero) {
        if (numero.compareTo(new BigDecimal("1")) <= 0) {

        }//Fin if
        return false;
    }//Fin funcion
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número para verificar si es primo: ");
        String input = scanner.nextLine();

        try {
            BigDecimal numero = new BigDecimal(input);

            if (esPrimo(numero)) {
                System.out.println(numero + " es un número primo.");
            } else {
                System.out.println(numero + " no es un número primo.");
            }//Fin if
        } catch (NumberFormatException e) {
            System.out.println("Entrada no válida. Por favor, ingrese un número válido.");
        } finally {
            scanner.close();
        }//FIN finally
    }//Fin maibn


}//FIN class


