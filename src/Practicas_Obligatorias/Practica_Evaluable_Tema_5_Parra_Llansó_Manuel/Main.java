package Practicas_Obligatorias.Practica_Evaluable_Tema_5_Parra_Llansó_Manuel;

import Practicas_Obligatorias.Practica_Evaluable_Tema_4_Parra_LLansó_Manuel.Radio_Digital;

import java.time.LocalDate;
import java.time.Month;
import java.time.chrono.ChronoLocalDate;
import java.util.Scanner;

public class Main  {
    public  static Alumno[] Alumno = new Alumno[15] ;//Creo el array para almacenar los objetos de la clase alumno en un proceso

    public static Profesor[] Profesor = new Profesor[15];// Creo el array para almacenar los objetos de la clase profesor
    public static void menu() {
        //Zona de declaracion de variables
        int contador = 0;
        int eleccion;
        int numeroDeAlumno=0;
        int numeroDeProfesor=0;
        //Zona de inicializacion , añadir más cosas si es necesario
        Scanner scanner = new Scanner(System.in);
        //Zona de salida
        do {
            System.out.println("\nOpcion 1 -> Introducir Profesor" + "\nOpcion 2 -> Introducir Alumno" + "\nOpcion 3 ->Imprimir Profesores"+"\nOpcion 4 ->Imprimir Alumnos"+"\nOpcion 5 ->Salir");
            eleccion = scanner.nextInt();

            switch (eleccion) {
                case 1:
                    System.out.println("Introduce tu nombre completo");
                    String nombre=scanner.nextLine();
                    System.out.println("Introduce tu DNI");
                    String DNI= scanner.nextLine();
                    System.out.println("Introduce el año en el que naciste");
                    int año=scanner.nextInt();
                    System.out.println("Introduce el mes en el que naciste");
                    int mes= scanner.nextInt();
                    System.out.println("Introduce el dia en el que naciste");
                    int dia=scanner.nextInt();
                    LocalDate fechaDeNacimiento=LocalDate.of(año,mes,dia);
                    scanner.nextLine();
                    if(numeroDeAlumno<=16) {
                        Alumno[numeroDeAlumno] = new Alumno(fechaDeNacimiento, nombre, DNI);
                        numeroDeAlumno++;
                    }else
                        System.out.println("Ya no puedes crear más alumnnos");
                    break;
                case 2:
                    System.out.println("Introduce tu nombre completo");
                    String nombreP=scanner.nextLine();
                    System.out.println("Introduce tu DNI");
                    String DNIP= scanner.nextLine();
                    System.out.println("Introduce el año en el que naciste");
                    int añoP=scanner.nextInt();
                    System.out.println("Introduce el mes en el que naciste");
                    int mesP= scanner.nextInt();
                    System.out.println("Introduce el dia en el que naciste");
                    int diaP=scanner.nextInt();
                    LocalDate fechaDeNacimientoP=LocalDate.of(añoP,mesP,diaP);
                    System.out.println("Introduce el numero de tu cuenta bancaria");
                    String cuentaBancariaCorriente= scanner.nextLine();
                    System.out.println("Introduce tu nomina");
                    double nomina = scanner.nextDouble();
                    scanner.nextLine();
                    if(numeroDeProfesor<=16) {
                        Profesor[numeroDeProfesor] = new Profesor(nombreP, fechaDeNacimientoP, DNIP,cuentaBancariaCorriente,nomina);
                        numeroDeProfesor++;
                    }else
                        System.out.println("Ya no puedes crear más alumnnos");
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    contador++;
                    break;
                default:
                    System.out.println("Error");
                    break;
            }
        } while (contador == 0);
        scanner.close();
    }//Fin del menu
    public static void main(String[] args) throws Exception {

    }
}
