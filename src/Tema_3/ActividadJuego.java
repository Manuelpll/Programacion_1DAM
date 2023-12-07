package Tema_3;
/*
Programa que te dice cuantos diptongos e hiatos tiene la frase
 */
import java.util.Scanner;

public class ActividadJuego {
    private static int contarDiptongos(String frase) {
        int count = 0;
        String[] palabras = frase.split(" ");

        for (String palabra : palabras) {
            count += contarDiptongosEnPalabra(palabra);
        }

        return count;
    }

    private static int contarHiatos(String frase) {
        int count = 0;
        String[] palabras = frase.split(" ");

        for (String palabra : palabras) {
            count += contarHiatosEnPalabra(palabra);
        }

        return count;
    }

    private static int contarDiptongosEnPalabra(String palabra) {
        int count = 0;
        for (int i = 0; i < palabra.length() - 1; i++) {
            char letraActual = palabra.charAt(i);
            char siguienteLetra = palabra.charAt(i + 1);

            if (esDiptongo(letraActual, siguienteLetra)) {
                count++;
            }
        }
        return count;
    }

    private static int contarHiatosEnPalabra(String palabra) {
        int count = 0;
        for (int i = 0; i < palabra.length() - 1; i++) {
            char letraActual = palabra.charAt(i);
            char siguienteLetra = palabra.charAt(i + 1);

            if (esHiato(letraActual, siguienteLetra)) {
                count++;
            }
        }
        return count;
    }

    private static void mostrarResultado(int diptongos, int hiatos) {
        System.out.println("Número de diptongos: " + diptongos);
        System.out.println("Número de hiatos: " + hiatos);
    }

    private static boolean esDiptongo(char a, char b) {
        // Definir las reglas de diptongos (puedes ajustarlas según tus necesidades)
        return (esVocal(a) && esVocal(b) && a != 'u' && a != 'i') ||
                (a == 'u' && b == 'i') ||
                (a == 'i' && b == 'u');
    }

    private static boolean esHiato(char a, char b) {
        // Definir las reglas de hiatos (puedes ajustarlas según tus necesidades)
        return (esVocalFuerte(a) && esVocalAbierta(b)) ||
                (esVocalAbierta(a) && esVocalFuerte(b));
    }

    private static boolean esVocal(char c) {
        return "aeiou".contains(String.valueOf(c).toLowerCase());
    }

    private static boolean esVocalFuerte(char c) {
        return "aeo".contains(String.valueOf(c).toLowerCase());
    }

    private static boolean esVocalAbierta(char c) {
        return "áéíóú".contains(String.valueOf(c).toLowerCase());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una frase:");
        String frase = scanner.nextLine();

        int diptongos = contarDiptongos(frase);
        int hiatos = contarHiatos(frase);

        mostrarResultado(diptongos, hiatos);

        scanner.close();
    }
}


