package Practicas_Obligatorias.Practica_Evaluable_Tema_5_Parra_Llansó_Manuel;

import javax.swing.*;
import java.awt.*;
import java.time.DateTimeException;
import java.time.LocalDate;

/**
 * Main de las clases Alumno y Profesor que posee un menu para introducir los datos de las clases y guadarlo en un array para después mostrarlos
 * @author Mparr
 * @version 1.0
 * @date 25/01/2024
 */
public class Main {
    // Creo algunas variables para utilizarlas después en el menú
    public static int i = 0;
    public static int a = 0;

    // Creo los arrays alumnos y profesores estáticos para poder utilizarlos en el proceso menú
    static Alumno[] alumnos = new Alumno[15];
    static Profesor[] profesores = new Profesor[15];

    // Creo el proceso menú
    public static void menu() throws Exception {
        // Creo las variables y componentes necesarios
        int contador = 0;
        int eleccion;
        Component frame = null;

        // Empiezo el menú
        do {
            eleccion = Integer.parseInt(JOptionPane.showInputDialog("\nOpcion 1 -> Introducir Profesor"
                    + "\nOpcion 2 -> Introducir Alumno"
                    + "\nOpcion 3 -> Imprimir Profesores"
                    + "\nOpcion 4 -> Imprimir Alumnos"
                    + "\nOpcion 5 -> Salir"));

            switch (eleccion) {
                case 1:
                    String nombreP = JOptionPane.showInputDialog("Introduce tu nombre completo");
                    int añoP = Integer.parseInt(JOptionPane.showInputDialog("Introduce el año en el que naciste"));
                    int mesP = Integer.parseInt(JOptionPane.showInputDialog("Introduce el mes en el que naciste"));
                    int diaP = Integer.parseInt(JOptionPane.showInputDialog("Introduce el dia en el que naciste"));
                    LocalDate fechaDeNacimientoP = LocalDate.of(añoP, mesP, diaP);
                    String cuentaBancariaCorriente = JOptionPane.showInputDialog("Introduce tu numero de cuenta bancaria");
                    double nomina = Double.parseDouble(JOptionPane.showInputDialog("Introduce la nomina"));//Pongo Double.parseDouble para pasra de String a double
                    String DNIP = JOptionPane.showInputDialog("Introduce tu DNI");

                    if (a < 15) {
                        profesores[a] = new Profesor(nombreP, fechaDeNacimientoP, DNIP, cuentaBancariaCorriente, nomina);
                        a++;
                    } else {
                        JOptionPane.showMessageDialog(frame, "Ya no puedes añadir más profesores", "No hay espacio", 2);
                    }
                    break;
                case 2:
                    String nombre = JOptionPane.showInputDialog("Introduce tu nombre completo");
                    int año = Integer.parseInt(JOptionPane.showInputDialog("Introduce el año en el que naciste"));
                    int mes = Integer.parseInt(JOptionPane.showInputDialog("Introduce el mes en el que naciste"));
                    int dia = Integer.parseInt(JOptionPane.showInputDialog("Introduce el dia en el que naciste"));
                    LocalDate fechaDeNacimiento = LocalDate.of(año, mes, dia);
                    String DNI = JOptionPane.showInputDialog("Introduce tu DNI");

                    if (a < 15) {
                        alumnos[i] = new Alumno( fechaDeNacimiento,nombre, DNI);
                        a++;
                    } else {
                        JOptionPane.showMessageDialog(frame, "Ya no puedes añadir más alumnos", "No hay espacio", 2);
                    }
                    break;
                case 3:
                    for (int j = 0; j < a; j++) {
                        JOptionPane.showMessageDialog(frame, profesores[j].toString(), "Informacion de los profesores", 3);
                    }// Fin for
                    break;
                case 4:
                    for (int j = 0; j < i; j++) {
                        JOptionPane.showMessageDialog(frame, alumnos[j].toString(), "Informacion de los alumnos", 3);
                    }// Fin for
                    break;
                case 5:
                    JOptionPane.showMessageDialog(frame, "Saliendo... ", "Fin del programa", 3);
                    contador++;
                    break;
                default:
                    JOptionPane.showMessageDialog(frame, "Opcion invalida", "ERROR", 0);
                    break;
            }//Fin del swich
        } while (contador == 0);
    }// Fin del metodo menu

    public static void main(String[] args) throws Exception {
        // Llamo al metodo menu
        menu();
    }// Fin de main
}// Fin del main de Alumno y Profesor
