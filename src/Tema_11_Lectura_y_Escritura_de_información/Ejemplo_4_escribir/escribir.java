package Tema_11_Lectura_y_Escritura_de_información.Ejemplo_4_escribir;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Este programa crea un nuevo archivo que contienen linea 1,2,..,linea 9
 */
public class escribir {
    public static void main(String[] args) throws IOException {
        FileWriter fichero = null;
        PrintWriter pw = null;
        try {
            fichero=new FileWriter(".\\src\\Tema_11_Lectura_y_Escritura_de_información\\Ejemplo_4_escribir\\prueba.txt");
            pw=new PrintWriter(fichero);

            for (int i = 0; i < 10; i++) {
                pw.println("linea"+i);
            }//Fin for
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
        if(null!=fichero)
            fichero.close();
        } //Fin try-catch
    }//Fin main
}//Fin de escribir
