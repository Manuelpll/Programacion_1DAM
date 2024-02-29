package Practicas_Obligatorias;

import Practicas_Obligatorias.Practica_Evaluable_Tema_6_Parra_Llansó_Manuel.actividad_3.Alumno_Clase;

import javax.swing.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.InputMismatchException;

/**
 * Un menu que tiene una serie de opciones entre ellas añadir un nuevo alumno al array de objetos de la clase de Alumno_Clase
 * @author Mparr
 * @version 1.0
 * @date  29/02/2024
 */
public class Practica_Evaluable_Tema_7_Parra_Llansó_Manuel {
    static int i = 5;
    static Alumno_Clase[] alumnos = new Alumno_Clase[5];

    /**
     * Proceso para añadir un nuevo espacio al array actual
     * @param alumnos Array antiguo y donde se va a poner el nuevo
     * @param nombre Nombre del nuevo alumno
     * @param nota Nota del nuevo alumno
     * @return Array con el nuevo alumno
     */
    private static Alumno_Clase[] anyadir(Alumno_Clase[] alumnos, String nombre, int nota) {
        Alumno_Clase[] nuevo = new Alumno_Clase[alumnos.length+1];
        System.arraycopy(alumnos, 0, nuevo, 0, alumnos.length);
        nuevo [nuevo.length-1] = new Alumno_Clase(nombre, nota);
        return nuevo;
    }//Fin de anyadir

    /**
     * Metodo para pedir al usuario le nombre del nuevo alumno
     * @throws NumberFormatException Si introducen un valor en nota que sea una cadena
     * @throws InputMismatchException Si introducen en nombre un valor numerico
     */
    public  static void añadirAlumnos(){
        try {
            String nombre = JOptionPane.showInputDialog("Inserta el nombre del alumno");
            int nota=0;
            try {
                nota = Integer.parseInt(JOptionPane.showInputDialog("Inserta la nota del alumno"));
            }catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null,"No se puede poner otra cosa que no sea un numero");
                return;
            }//Fin try-catch
            if (i < 30) {
                alumnos = anyadir(alumnos, nombre, nota);
                i++;
            } else {
                JOptionPane.showMessageDialog(null, "La clase está llena", "Error", JOptionPane.ERROR_MESSAGE);
            }//Fin else
        }catch (InputMismatchException e){
            JOptionPane.showMessageDialog(null,"No se puede poner otra cosa que no sea un numero","ERROR",0);
        }
    }//Fin de añadirAlumno

    /**
     * Metodo del menu de opciones
     * @throws InputMismatchException Si el usuario introduce un valor que no sea un numero entero
     */
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
            try {
                String opciones = """
                            ----------------------------
                            Elige una de las opciones:
                            1->Muestra lista de alumnos por orden alfabético
                            2->Muestra lista de alumnos por mayor nota
                            3->Añadir un nuevo alumno
                            0->Salir
                            ----------------------------""";
                eleccion = Integer.parseInt(JOptionPane.showInputDialog(opciones));
                switch (eleccion) {
                    case 1:
                        Arrays.sort(alumnos, 0, i, Comparator.comparing(Alumno_Clase::getNombre));//El comparador va ordenando los nombres alfabeticamente
                        mostrarAlumnos();
                        break;
                    case 2:
                        Arrays.sort(alumnos, Alumno_Clase::compararPorNotaDescendente);
                        mostrarAlumnos();
                        break;
                    case 3:
                        añadirAlumnos();
                        break;
                    case 0:
                        JOptionPane.showMessageDialog(null, "Saliendo...");
                        salir = true;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Error");
                        break;

                }//Fin switch
            }catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null,"No se puede poner otra cosa que no sea un numero","ERROR",0);
            }
        } while (!salir);
    }//Fin de menu

    /**
     * Metodo que muestra los alumnos que hay
     */
    public static void mostrarAlumnos() {
        //Declaro una variable que va ha funcionar para concatenar todas las lineas que muestre el array
        String resultado = "";
        for (Alumno_Clase alumno : alumnos) {
            if (alumno != null) {
                resultado += alumno.getNombre() + " : " + alumno.getNota() + "\n";
            }//Fin del if
        }//Fin del for
        JOptionPane.showMessageDialog(null, resultado);
    }// Fin de mostrarAlumnos

    /**
     * Metodo que ejecuta el codigo
     * @param args Los argumentos de la linea de comandos
     */
    public static void main(String[] args) {
        //Llamo al metodo menu
        menu();
    }//Fin del main
}//Fin del clase Main
