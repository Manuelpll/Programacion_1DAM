package Tema_3_Estructuras_de_control_y_Muchos_usos;
/**
*Autor:Manuel
*Este programa ordenara 25 notas por orden de quien ha sacado mejor nota y quien ha sido
la peor.
 */

public class Actividad13 {
    public static int[] generarNotas() {
        int[] notas = new int[25];
        for (int i = 0; i < notas.length; i++) {
            // Generar notas aleatorias entre 1 y 10
            notas[i] = (int) (Math.random() * 10) + 1;
        }
        return notas;
    }

    // Mostrar en pantalla las notas de los alumnos
    public static void mostrarNotas(int[] notas) {
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Alumno " + (i + 1) + ": " + notas[i]);
        }
    }

    // Obtener la nota más alta
    public static int obtenerNotaMasAlta(int[] notas) {
        int maxNota = notas[0];
        for (int i = 1; i < notas.length; i++) {
            if (notas[i] > maxNota) {
                maxNota = notas[i];
            }
        }
        return maxNota;
    }

    // Obtener la nota más baja
    public static int obtenerNotaMasBaja(int[] notas) {
        int minNota = notas[0];
        for (int i = 1; i < notas.length; i++) {
            if (notas[i] < minNota) {
                minNota = notas[i];
            }
        }
        return minNota;
    }
    public static void main(String[] args) {
        // Crear un array para almacenar las notas de los 25 alumnos
        int[] notas = generarNotas();

        // Mostrar en pantalla las notas
        System.out.println("Notas de los alumnos:");
        mostrarNotas(notas);

        // Calcular y mostrar la nota más alta y la más baja
        int notaMasAlta = obtenerNotaMasAlta(notas);
        int notaMasBaja = obtenerNotaMasBaja(notas);

        System.out.println("\nLa nota más alta es: " + notaMasAlta);
        System.out.println("La nota más baja es: " + notaMasBaja);
    }

    // Generar notas automáticamente para 25 alumnos

}
