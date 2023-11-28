package Tema_3;
import java.util.Scanner;

/**
 * Esta es una aplicación en Java que permite al usuario introducir números enteros
 * y calcula la suma total. El usuario puede salir pulsando las letras "s" o "S".
 */
public class Actividad12 {
    public static double par(double num1) {
        {
            if (num1 % 2 == 0) {
                System.out.println("Es Par");
            } else {
                System.out.println("Es Impar");
            }
            return num1;
        }
    }
        public static void main ( String [] args) {
            // Crear un objeto Scanner para la entrada de usuario
            Scanner scanner = new Scanner(System.in);

            // Inicializar la suma total
            int suma = 0;

            // Mostrar mensaje inicial
            System.out.println("Ingrese números enteros para sumar. Para salir, presione 's' o 'S'.");

            // Bucle do-while para permitir al usuario ingresar números
            do {
                // Solicitar al usuario que ingrese un número
                System.out.print("Ingrese un número (o 's' para salir): ");

                // Leer la entrada del usuario
                String input = scanner.nextLine();
                // Verificar si el usuario desea salir
                if (input.equalsIgnoreCase("s")) {
                    break; // Salir del bucle si el usuario ingresa 's' o 'S'
                }

                try {
                    // Convertir la entrada a un número entero
                    int numero = Integer.parseInt(input);

                    // Sumar el número a la suma total
                    suma += numero;
                } catch (NumberFormatException e) {
                    // Capturar excepción si la entrada no es un número válido
                    System.out.println("Por favor, ingrese un número entero válido.");
                }

            } while (true); // El bucle continuará hasta que se ingrese 's' o 'S'
                   par(suma);// Halla si la suma de los numeros es par o es impar
            // Mostrar la suma total
            System.out.println("La suma total es: " + suma);

            // Mostrar mensaje de despedida
            System.out.println("¡Hasta luego!");

            // Cerrar el objeto Scanner para liberar recursos
            scanner.close();
        }
    }

