package Tema_3;
/**
 * Es un programa que te pide las notas de tres alumnos ,te dice los alumnos aprovados y suspensos;despues te dice la nota más alta
 */
import java.util.Scanner;
public class Activiad07 {

	public static int redondearNota(double nota) {
        if (nota >= 4 && nota < 5) {
            return 4;
        } else {
            return (int) Math.round(nota);
        }
    }

    public static int calcularMedia(int[] notas) {
        int suma = 0;
        for (int nota : notas) {
            suma += nota;
        }
        return Math.round((float) suma / notas.length);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear array con nombres de alumnos y notas
	String[] alumnos = {"Alumno1", "Alumno2", "Alumno3"};
    int[] notas = new int[alumnos.length];

    // Pedir las notas por teclado
    for (int i = 0; i < alumnos.length; i++) {
        System.out.print("Ingrese la nota de " + alumnos[i] + " (entre 0 y 10): ");
        double nota = scanner.nextDouble();
        notas[i] = redondearNota(nota);
    }

    // Mostrar las notas redondeadas
    System.out.println("\nNotas redondeadas:");
    for (int i = 0; i < alumnos.length; i++) {
        System.out.println(alumnos[i] + ": " + notas[i]);
    }

    // Calcular y mostrar la media de la clase
    int mediaClase = calcularMedia(notas);
    System.out.println("\nMedia de la clase: " + mediaClase);

    // Contar el número de alumnos aprobados y suspensos
    int aprobados = 0;
    for (int nota : notas) {
        if (nota >= 5) {
            aprobados++;
        }
    }
    int suspensos = alumnos.length - aprobados;
    System.out.println("Numero de aprobados: " + aprobados);
    System.out.println("Numero de suspensos: " + suspensos);

    // Encontrar el alumno con la mayor nota
    int indiceMaxNota = 0;
    for (int i = 1; i < notas.length; i++) {
        if (notas[i] > notas[indiceMaxNota]) {
            indiceMaxNota = i;
        }
    }
    System.out.println("\nEl alumno con la mayor nota es: " + alumnos[indiceMaxNota]);
    scanner.close();
    }
}

