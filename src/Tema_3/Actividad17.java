package Tema_3;
import java.util.Scanner;
import java.math.BigDecimal;

public class Actividad17 {


    public class Actividad16 {

        private static boolean esPrimo(BigDecimal numero2) {

            if (numero2.compareTo(new BigDecimal("1")) <= 0) {

            }//Fin if
            return false;
        }//Fin funcion
        public static void main(String[] args) {
            // El código del método main permanece igual
        }
    }


    public static int factorial(int num1, int cont) {
        while (num1 > 0) {
            cont *= num1;
            num1--;
        }
        return cont;
    }

    public static boolean Bisiesto(int año) {
        return (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);
    }

    public static void menuPrincipal() {
        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            // Mostrar el menú
            System.out.println("Menú:");
            System.out.println("1. Año bisiesto");
            System.out.println("2. Factorial");
            System.out.println("3. Decir si es primo");
            System.out.println("4. Salir");

            // Solicitar al usuario que ingrese una opción
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            // Limpiar el búfer después de leer el número
            scanner.nextLine();

            // Realizar acciones según la opción seleccionada
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese un año: ");
                    int año = scanner.nextInt();
                    // Verificar si el año es bisiesto utilizando la función Bisiesto
                    if (Bisiesto(año)) {
                        System.out.println(año + " es un año bisiesto.");
                    } else {
                        System.out.println(año + " no es un año bisiesto.");
                    }
                    break;
                case 2:
                    int numero;
                    int contador = 1;
                    System.out.println("Introduce el número para calcular su factorial:");
                    numero = scanner.nextInt();
                    int resultado = factorial(numero, contador);
                    System.out.println("El resultado es: " + resultado);
                    break;
                case 3:
                    System.out.print("Ingrese un número para verificar si es primo: ");
                    BigDecimal numero2 = new BigDecimal(scanner.nextLine());

                    if ( esPrimo(numero2)) {
                        System.out.println(numero2 + " es un número primo.");
                    } else {
                        System.out.println(numero2 + " no es un número primo.");
                    }
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, selecciona una opción válida.");
            }
        } while (opcion != 4);

        // Cerrar el Scanner
        scanner.close();
    }

    private static boolean esPrimo(BigDecimal numero2) {
        if (numero2.compareTo(new BigDecimal("1")) <= 0) {

        }//Fin if
        return false; }

    public static void main(String[] args) {
        menuPrincipal();
    }
}
