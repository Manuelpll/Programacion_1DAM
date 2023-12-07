package Tema_3;
/*
Es una aplicacion que te dice si el año es bisiesto o no
 */
import java.util.Scanner;
public class Actividad14 {

        public static void main(String[] args) {
            // Crear un objeto Scanner para leer la entrada del usuario
            Scanner scanner = new Scanner(System.in);
            // Solicitar al usuario que ingrese un año
            System.out.print("Ingrese un año: ");
            int año = scanner.nextInt();
            // Verificar si el año es bisiesto utilizando la función esBisiesto
            if (Bisiesto(año)) {
                System.out.println(año + " es un año bisiesto.");
            } else {
                System.out.println(año + " no es un año bisiesto.");
            }
            // Cerrar el Scanner
            scanner.close();
        }
        // Función para verificar si un año es bisiesto
        public static boolean Bisiesto(int año) {
            return (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);
        }
    }