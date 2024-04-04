package Tema_11_Lectura_y_Escritura_de_información.Ejemplo_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Primera explicacion de la lectura de ficheros
 */
public class Main {
    /**
     * Metodo que ejecuta el codigo
     * @param args Los argumentos de la linea de comandos
     */
    public static void main(String[] args) {
        //Definicion del array list de tipo String
        ArrayList <String> alumnos = new ArrayList<String>();
        //Instanciar el fichero donde se encuentra los datos
        File fichero = new File(".\\src\\Tema_11_Lectura_y_Escritura_de_información\\Ejemplo_1\\alumnos.txt");
        Scanner s = null;

        try {
            System.out.println("Leyendo el contenido del fichero");
            s=new Scanner(fichero);
            //Obtener los datos
            while (s.hasNextLine()){
               String linea= s.nextLine();
               alumnos.add(linea);
            }
        }catch (FileNotFoundException e){
           e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            s.close();
        }//Fin de try-catch-finally
        System.out.println("Alumnos del curso de 1º DAM: "+alumnos.size());
        Iterator<String> itAlumnos= alumnos.iterator();
        while (itAlumnos.hasNext()){
            String alumnoDam= itAlumnos.next();
            System.out.println(alumnoDam);
        }//Fin while
    }//Fin de main
}//Fin del Main
