package Practicas_Obligatorias.Practica_Evaluable_Tema_6_Parra_Llansó_Manuel.actividad_3;


import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    //Declaro las variables que se usaran en metodos
   static int i = 5;
     static Alumno_Clase[] alumnos = new Alumno_Clase[31];
    //Zona de inicializacion externa
     static Scanner scanner = new Scanner(System.in);
    public  static void añadirAlumnos(){
        try {
            System.out.println("Inserta el nombre del alumno");
            String nombre =scanner.nextLine();
            scanner.nextLine();
            System.out.println("Inserta la nota del alumno");
             int nota= scanner.nextInt();
            if (i< 15) {
                 alumnos[i]= new Alumno_Clase(nombre,nota);
                i++;
            } else {
                System.out.println("La clase esta llena");
            }//Fin else
        } catch (NumberFormatException e) {
            System.out.println("Numero no valido");
        }//Fin try-catch
    }
    public static void menu() {
        //Zona de declaracion de variables
        int eleccion;
        boolean salir =false;
        for (int j = 0; j < alumnos.length; j++) {
             alumnos[j]=new Alumno_Clase(" ",0);
        }
        alumnos[0]=new Alumno_Clase("Juan",6);
        alumnos[1]=new Alumno_Clase("Pepe",3);
        alumnos[2]=new Alumno_Clase("Sara",8);
        alumnos[3]=new Alumno_Clase("Elena",4);
        alumnos[4]=new Alumno_Clase("Alejandro",9);
        //Zona de salida
        do {
            System.out.println("""
                    **********************
                    Elige una de las opciones:
                    1->Muestra lista de alumnos por orden alfabetico
                    2->Muestra lista de alumnos por mayor nota
                    3->Añadir un nuevo alumno
                    0->Salir
                    *******************""");
            eleccion = scanner.nextInt();
            switch (eleccion) {
                case 1:
                    Arrays.sort(alumnos, 0, i, Comparator.comparing(Alumno_Clase::getNombre));
                    mostrarAlumnos();
                    break;
                case 2:
                    Arrays.sort(alumnos, (a, b) -> a.compararPorNotaDescendente(b));
                    mostrarAlumnos();
                    break;
                case 3:
                    añadirAlumnos();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    salir=true;
                    break;
                default:
                    System.out.println("Error");
                    break;
            }//Fin switch
        } while (!salir);
    }//Fin de menu
    public static void mostrarAlumnos() {
        for (Alumno_Clase alumno : alumnos) {
            if (alumno != null) {
                System.out.println(alumno.getNombre() + " : " + alumno.getNota());
            }//If
        }//Fin for
    }//Fin mostrarAlumnos
    public static void main(String[] args) {
            menu();
    }//Fin del main
}//Fin del clase Main
