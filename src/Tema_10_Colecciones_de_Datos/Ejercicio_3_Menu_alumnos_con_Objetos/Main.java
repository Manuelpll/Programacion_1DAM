package Tema_10_Colecciones_de_Datos.Ejercicio_3_Menu_alumnos_con_Objetos;

import Practicas_Obligatorias.Practica_Evaluable_Tema_6_Parra_Llansó_Manuel.actividad_3.Alumno_Clase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/**
 * Main de la clase Alumnos
 * @author Mparr
 */
public class Main {
    /**
     * Metodo que ejecuta el codigo
     * @param args Los argumentos de la linea de comandos
     */
    public static void main(String[] args) {
        ArrayList<Alumnos> alumnosDaw = new ArrayList<Alumnos>();
        Alumnos alumnos1 = new Alumnos("Juan","Torres",1);
        alumnosDaw.add(alumnos1);
        Alumnos alumnos2 = new Alumnos("Sara","Gonzalez",2);
        alumnosDaw.add(alumnos2);
        Alumnos alumnos3 = new Alumnos("Elena","Esteban",3);
        alumnosDaw.add(alumnos3);
        Alumnos alumnos4 = new Alumnos("Pepe","Blanco",4);
        alumnosDaw.add(alumnos4);
        Alumnos alumnos5 = new Alumnos("Miguel","Perez",5);
        alumnosDaw.add(alumnos5);
        //Imprimer elementos , uso un ITERATOR
        System.out.println("Alumnos de 1º de Daw: "+alumnosDaw.size());
        Iterator<Alumnos> itAlumnos = alumnosDaw.iterator();
        System.out.println("numero            "+"nombre                "+"apellido         "+"\n------------------------------------------------");
        while ((itAlumnos.hasNext())){ //Compueba si quedan objetos en el Iterator
          Alumnos alumnoTemp =itAlumnos.next();// Se declara el objeto para ir asignando valores
            System.out.println("    "+alumnoTemp.getNumero()+"            "+alumnoTemp.getNombre()+"             "+alumnoTemp.getApellido());
        }//Fin de while
        //Lista ordenada por nombres
        System.out.println("--------------------------------------------");
        Collections.sort(alumnosDaw, new Comparator<Alumnos>() {
            @Override
            public int compare(Alumnos a1,Alumnos a2){
                return a1.getNombre().compareTo(a2.getNombre());
            }//Fin de compare
        }//Fin Iterator
        );
        System.out.println("numero            "+"nombre                "+"apellido    "+"\n------------------------------------------------");
        Iterator<Alumnos> itAlumnos2 = alumnosDaw.iterator();
        while ((itAlumnos2.hasNext())){ //Compueba si quedan objetos en el Iterator
            Alumnos alumnoTemp =itAlumnos2.next();// Se declara el objeto para ir asignando valores
            System.out.println("    "+alumnoTemp.getNumero()+"            "+alumnoTemp.getNombre()+"             "+alumnoTemp.getApellido());
        }//Fin de while
        //Lista ordenada por apellidos
        Collections.sort(alumnosDaw, new Comparator<Alumnos>() {
                    @Override
                    public int compare(Alumnos a1,Alumnos a2){
                        return a1.getApellido().compareTo(a2.getApellido());
                    }//Fin de compare
                }//Fin Iterator
        );
        System.out.println("   numero          "+"nombre              "+"apellido    "+"\n------------------------------------------------");
        Iterator<Alumnos> itAlumnos3 = alumnosDaw.iterator();
        while ((itAlumnos3.hasNext())){ //Compueba si quedan objetos en el Iterator
            Alumnos alumnoTemp =itAlumnos3.next();// Se declara el objeto para ir asignando valores
            System.out.println("   "+alumnoTemp.getNumero()+"        "+alumnoTemp.getNombre()+"                      "+alumnoTemp.getApellido());
        }//Fin de while
        for(Alumnos alumnoTemp : alumnosDaw){ //Otra forma de recorrer la lista de objetos sin utilizar el Itinerator
            System.out.print(alumnoTemp.getApellido()+",");
            System.out.print(alumnoTemp.getNombre()+".\n");
        }//Fin for
    }//Fin main
}//Fin del Main
