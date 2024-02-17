package Programas_hecho_para_practicar.Practicas_Evaluables_Hechas_con_otra_cosa;

import Practicas_Obligatorias.Practica_Evaluable_Tema_6_Parra_Llansó_Manuel.actividad_3.Alumno_Clase;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Actividad_3_tema_6_con_Scanner {
    static int i = 0;
    static Alumno_Clase[] alumnos = new Alumno_Clase[31];
    static Scanner scanner = new Scanner(System.in);

    public static void añadirAlumnos(){
        System.out.println("Inserta el nombre del alumno");
        String nombre = scanner.nextLine();
        System.out.println("Inserta la nota del alumno");
        int nota = scanner.nextInt();
        scanner.nextLine(); // consume the newline
        if (i < 31) {
            alumnos[i] = new Alumno_Clase(nombre, nota);
            i++;
        } else {
            System.out.println("La clase está llena");
        }
    }

    public static void menu() {
        int eleccion;
        boolean salir = false;
        for (int j = 0; j < alumnos.length; j++) {
            alumnos[j] = new Alumno_Clase("Vacio", 0);
        }
        alumnos[0] = new Alumno_Clase("Juan", 6);
        alumnos[1] = new Alumno_Clase("Pepe", 3);
        alumnos[2] = new Alumno_Clase("Sara", 8);
        alumnos[3] = new Alumno_Clase("Elena", 4);
        alumnos[4] = new Alumno_Clase("Alejandro", 9);
        i = 5;

        do {
            String opciones = """
                    ----------------------------
                    Elige una de las opciones:
                    1->Muestra lista de alumnos por orden alfabético
                    2->Muestra lista de alumnos por mayor nota
                    3->Añadir un nuevo alumno
                    0->Salir
                    ----------------------------""";
            System.out.println(opciones);
            eleccion = scanner.nextInt();
            scanner.nextLine(); // consume the newline
            switch (eleccion) {
                case 1:
                    Arrays.sort(alumnos, 0, i, Comparator.comparing(Alumno_Clase::getNombre));
                    mostrarAlumnos();
                    break;
                case 2:
                    Arrays.sort(alumnos, 0, i, (a, b) -> a.compararPorNotaDescendente(b));
                    mostrarAlumnos();
                    break;
                case 3:
                    añadirAlumnos();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    salir = true;
                    break;
                default:
                    System.out.println("Error");
                    break;
            }
        } while (!salir);
    }

    public static void mostrarAlumnos() {
        for (Alumno_Clase alumno : alumnos) {
            if (alumno != null) {
                System.out.println(alumno.getNombre() + " : " + alumno.getNota());
            }
        }
    }

    public static void main(String[] args) {
        menu();
    }
}
