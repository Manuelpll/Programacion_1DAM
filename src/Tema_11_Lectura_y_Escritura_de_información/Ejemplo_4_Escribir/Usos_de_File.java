package Tema_11_Lectura_y_Escritura_de_información.Ejemplo_4_Escribir;

import java.io.File;

/**
 * Explicacion de los usos de file
 */
public class Usos_de_File {
    public static void main(String[] args) {
        String rutaArchivo = ".\\src\\Tema_11_Lectura_y_Escritura_de_información\\Ejemplo_4_Escribir\\prueba.txt";
        File fichero = new File(rutaArchivo);
            if (!fichero.exists()) {
                System.out.println("Nombre del fichero: "+fichero.getName());
                System.out.println("Ruta:"+fichero.getPath());
                System.out.println("Ruta Absoluta: "+fichero.getAbsolutePath());
                System.out.println("Se puede leer: "+fichero.canWrite());// .canRead seria para si se puede leer y .canExecute si se puede ejecutar
                System.out.println("Tamaño: "+fichero.length());
            }
            fichero.delete();//Para borrar el fichero
        System.out.println("No existe el fichero");
    }
}
