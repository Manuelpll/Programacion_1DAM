package Tema_10_Colecciones_de_Datos.Ejercicio_3_Menu_alumnos_con_Objetos;

import java.util.ArrayList;
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
        System.out.println("Alumosns de 1º de Daw: "+alumnosDaw.size());
        Iterator<Alumnos> itAlumnos = alumnosDaw.iterator();
        System.out.println("numero            "+"nombre                "+"apellido         "+"\n------------------------------------------------");
        while ((itAlumnos.hasNext())){ //Compueba si quedan objetos en el Iterator
          Alumnos alumnoTemp =itAlumnos.next();// Se declara el objeto para ir asignando valores
            System.out.println("    "+alumnoTemp.getNumero()+"            "+alumnoTemp.getNombre()+"             "+alumnoTemp.getApellido());
        }//Fin de while
    }
}
