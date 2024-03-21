package Tema_10_Colecciones_de_Datos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Explicacion de como poner fechas y copiar datos
 * @author Mparr
 */

public class Ejemplo_5_Copiar_datos_en_Arraylist {
    public static void main(String[] args) {
        ArrayList<LocalDate>examenesDam = new ArrayList<LocalDate>();
        LocalDate programacion= LocalDate.parse("2024-05-20");
        examenesDam.add(programacion);
        examenesDam.add(LocalDate.parse("2024-05-21"));
        examenesDam.add(LocalDate.parse("2024-05-19"));
        System.out.println("Examenes DAM:");
        System.out.println(examenesDam);

        //Copiar un array
        ArrayList<LocalDate>examenesDaw = new ArrayList<LocalDate>(examenesDam);
        examenesDaw.add(LocalDate.parse("2024-05-18"));
        //Ordenar Fechas

        Collections.sort(examenesDaw);
        System.out.println("Examenes DAW:");
        System.out.println(examenesDaw);

        Comparator<LocalDate> comparator=Collections.reverseOrder();
        examenesDaw.sort(comparator);
        System.out.println("Examenes DAW descendente:");
        System.out.println(examenesDaw);
    }//Fin de main
}//Fin de copiar datos en ArrayList
