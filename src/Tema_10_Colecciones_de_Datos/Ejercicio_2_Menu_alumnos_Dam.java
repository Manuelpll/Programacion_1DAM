package Tema_10_Colecciones_de_Datos;

import java.util.*;

/**
 * Este programa va sobre un menu que ofrece algunas opciones para modificar,ordenar y mostar una lista de los alumnos de 1º de Dam
 * @author Mparr
 * @version 1.0
 * @date 17/03/2024
 */
public class Ejercicio_2_Menu_alumnos_Dam {
    static ArrayList<String> alumnosDam = new ArrayList<>();

    /**
     * Metodo que genera el menu con las diferentes opciones acerca de la lista de los alumnos
     * @throws InputMismatchException Si pones una cosa que no sea un numero entero
     */
    public static void menu() {
        //Zona de declaracion de variables
        int eleccion;
        boolean salir =false;
        String nuevoAlumno;
        String alumno;
        //Zona de inicializacion , añadir más cosas si es necesario
        Scanner scanner = new Scanner(System.in);
        //Zona de salida
        do {
            try {


                System.out.println("""
                        1-> Añadir alumno
                        2-> Quitar alumno
                        3-> Ordenar lista por apellidos
                        4-> Mostrar lista
                        0->Salir""");
                eleccion = scanner.nextInt();
                  scanner.nextLine();

                switch (eleccion) {
                    case 1:
                        try {
                            System.out.println("Escribe el nombre del alumno que quieres añadir");
                            nuevoAlumno=scanner.nextLine();
                        }catch (InputMismatchException e){
                            System.out.println("Error: Debe ser un nombre");
                            return;
                        }//Fin tr-catch
                        agregarEstudiante(nuevoAlumno);
                        break;
                    case 2:
                       try {
                           System.out.println("Escribe el nombre completo del estudiante que deseas quitar");
                           alumno=scanner.nextLine();
                       }catch (InputMismatchException e){
                           System.out.println("Error: Debe ser un nombre");
                           return;
                       }//Fin try-catch
                        quitarEstudiantes(alumno);
                        break;
                    case 3:
                        ordenarPorApellidos();
                        break;
                    case 4:
                        imprimirEstudiantes();
                        break;
                    case 0:
                        System.out.println("Saliendo...");
                        salir = true;
                        break;
                    default:
                        System.out.println("Error");
                        break;
                }//Fin switch
            }catch (InputMismatchException e){
                System.out.println("Inserta una de las opciones validas");
                scanner.nextLine();
            }catch (Exception e){
                System.out.println("Error");
                scanner.nextLine();
            }//Fin try-catch
        } while (!salir);
    }//Fin de menu

    /**
     * Metodo que imprime la lista de estudiantes
     */
    static void imprimirEstudiantes() {
        System.out.println("\n------------------------------");
        System.out.println("Lista de los alumnos de la clase:");
        for (String estudiante : alumnosDam) {
            System.out.println(estudiante);
        }
        System.out.println("------------------------------");
    }
    /**
     * Metodo que ordena la lista por apellidos
     */
    static void ordenarPorApellidos() {
        //Fin de compare
        alumnosDam.sort((s1, s2) -> {
            String[] apellidos1 = s1.split(" ");
            String[] apellidos2 = s2.split(" ");
            return apellidos1[apellidos1.length - 1].compareTo(apellidos2[apellidos2.length - 1]);
        }); //Fin del sort
        System.out.println("Lista ordenada por apellidos.");
    }//Fin de ordenarPorApellidos

    /**
     * Metodo que quita estudiantes
     * @param estudiante El nombre del estudiante que deseas quitar
     */
        static void quitarEstudiantes(String estudiante){
        if (alumnosDam.contains(estudiante)){
            alumnosDam.remove(estudiante);
            System.out.println("Se acaba de eliminar a "+estudiante+" de la lista");
        }else{
            System.out.println("No se ha encontrado ese estudiante");
        }//Fin if-else
            }//Fin quitarEstudiantes
    /**
     * Metodo que agrega estudiantes
     * @param nombreEstudiante El nombre del estudiante que deseas agregar
     */
    static void agregarEstudiante(String nombreEstudiante) {
            alumnosDam.add(nombreEstudiante);
    }//Fin agregarEstudiante
    /**
     * Metodo que agrega los estudiantes que estan inicialmente en la lista
     */
    static void alumnosBase(){
        agregarEstudiante("Sergio Abril Muñoz");
        agregarEstudiante("Chad Arzaga Flores");
        agregarEstudiante("Daniel Benjamín Bascopé Alarcón");
        agregarEstudiante("Bilal Ben Moussa Chargui");
        agregarEstudiante("Yassin Darrazi El Ouahabi");
        agregarEstudiante("Alejandro Eleazar de los Ríos Rivas");
        agregarEstudiante("Imad El Makhloufi Ben Ali");
        agregarEstudiante("Germán Escudero Rodríguez");
        agregarEstudiante("Marina Islandia Fernández Fuertes");
        agregarEstudiante("Francesco Fevoli Chacón");
        agregarEstudiante("Jorge González Fernández");
        agregarEstudiante("Pedro Jiménez Carrasco");
        agregarEstudiante("Eduardo Jiménez Linares");
        agregarEstudiante("Bruno Linares Freire");
        agregarEstudiante("Daniel López López");
        agregarEstudiante("David Martín Pulgar");
        agregarEstudiante("David Merchán Muñoz");
        agregarEstudiante("Álvaro Moreno Lumbreras");
        agregarEstudiante("Laura Moreno Navarro");
        agregarEstudiante("José Antonio Moreno Núñez");
        agregarEstudiante("Manuel Parra Llansó");
        agregarEstudiante("Bryan Paucar Alvarado");
        agregarEstudiante("Pablo Rodríguez Delgado");
        agregarEstudiante("Marcos Antonio Rodríguez Villaverde");
        agregarEstudiante("Marcos Romero Herrero");
        agregarEstudiante("Alejandro Rupérez López");
        agregarEstudiante("Ayoub Tachafine El Filali");
        agregarEstudiante("Marcos Tapia García");
        agregarEstudiante("Lucía Tapia García");
        agregarEstudiante("Borja Ticona Manrique");
    }//Fin alumnosBase
    public static void main(String[] args) {
    alumnosBase();
    menu();
    }//Fin main
}//Fin menu alumnos Dam