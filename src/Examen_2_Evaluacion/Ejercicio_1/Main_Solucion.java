package Examen_2_Evaluacion.Ejercicio_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main_Solucion {

    /**
     * Permite al usuario introducir dos números Complejo_Solucions para posteriormente verlos y sumarlos.
     */
    public static void menu () {
        Complejo_Solucion a = new Complejo_Solucion(); //Se inicializan ambos Complejo_Solucion a 0.
        Complejo_Solucion b = new Complejo_Solucion();
        System.out.println("Introduzca dos números Complejo_Solucions.");
        System.out.println("Número Complejo_Solucion a:");
        introducirComplejo_Solucion(a); //Se introducen ambos Complejo_Solucions.
        System.out.println("Número Complejo_Solucion b:");
        introducirComplejo_Solucion(b);
        System.out.println("Ahora se procederá a hacer la suma de: ");
        System.out.println("Número Complejo_Solucion a: "+a.toString());
        System.out.println("Número Complejo_Solucion b: "+b.toString());
        Complejo_Solucion suma = a.sumar(b); //Se inicializa un nuevo Complejo_Solucion con la suma de los dos anteriores.
        System.out.println("Suma de ambos números Complejo_Solucions: "+ suma.toString());
    }

    /**
     * Método para introducir ambos números Complejo_Solucions, con tratamiento de excepciones.
     * @param Complejo_Solucion El numero complejo
     * @throws InputMismatchException Si no se pone un numero
     */
    private static void introducirComplejo_Solucion(Complejo_Solucion Complejo_Solucion) {
        Scanner sc = new Scanner(System.in);
        boolean repetir;
        do {
            repetir = false;
            try {
                System.out.println("Parte real: ");
                Complejo_Solucion.cambiaReal(sc.nextDouble());
            } catch (InputMismatchException e) { //Da una excepción si lo que se introdujo por teclado no es un número.
                repetir = true;
                System.err.println("ERROR: Sólo puede introducir números. Inténtelo de nuevo.");
                sc.nextLine();
            }
        } while (repetir);

        do {
            repetir = false;
            try {
                System.out.println("Parte imaginaria: ");
                Complejo_Solucion.cambiaImag(sc.nextDouble());
                sc.nextLine();
            } catch (InputMismatchException e) {
                repetir = true;
                System.err.println("ERROR: Sólo puede introducir números. Inténtelo de nuevo.");
                sc.nextLine();
            }
        } while (repetir);
    }

    /**
     * Método para ejecutar el codigo
     * @param args los argumentos de la linea de comandos
     */
    public static void main(String[] args) {
        menu();
    }
}