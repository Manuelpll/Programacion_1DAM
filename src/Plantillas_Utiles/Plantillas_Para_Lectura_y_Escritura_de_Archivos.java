package Plantillas_Utiles;
import java.io.*;
import java.util.Scanner;

/**
 * Plantilla para hacer la lectura de ficheros e escritura
 */
public class Plantillas_Para_Lectura_y_Escritura_de_Archivos {
    static String ruta = ".\\src\\Plantillas_Utiles\\ejemplo.txt"; //Cambiar la ruta a la hora de usarlo
    static Scanner sc = new Scanner(System.in);
    static File fichero = new File(ruta);
    /**
     * Metodo que te crea el archivo
     */
    public static void crearArchivo() {
        PrintWriter pw = null;
        Scanner sc = new Scanner(System.in);
        try {
        if (!fichero.exists()) {
            System.out.println("El archivo no existe.");
            System.out.println("¿Desea crear un nuevo archivo?"+"\nEscribe s para crear el archivo");
            String respuesta = sc.nextLine();
            if (respuesta.equalsIgnoreCase("s")) {
                insertarNuevaInformacion();
                System.out.println("Archivo creado con éxito.");
            } else {
                System.out.println("Saliendo del programa.");
                return;
            }//Fin if-else
        }//Fin if
        } catch (IOException e) {
        e.printStackTrace();
    }//Fin try-catch
    }//Fin de crearArchivo

    /**
     * Escribe una nueva linea del fichero
     * @throws IOException  Si falla al recibir la ruta
     */
    private static void insertarNuevaInformacion() throws IOException {
        PrintWriter pw;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la siguiente linea del archivo");
        String linea = sc.nextLine();
        pw = new PrintWriter(new FileWriter(fichero, true));
        pw.println(linea);
        pw.close();
    }//Fin de insertarNuevaInformacion

    /**
     * Escribe una nueva linea del fichero automatico
     * @param linea La nueva linea del archivo
     * @throws IOException  Si falla al recibir la ruta
     */
    private static void insertarNuevaInformacionAutomatico(String linea) throws IOException {
        PrintWriter pw;
        pw = new PrintWriter(new FileWriter(fichero, true));
        pw.println(linea);
        pw.close();
    }//Fin de insertarNuevaInformacion
    /**
     * Metodo que imprime la información del fichero
     * @throws IOException Si falla al recibir la ruta
     * @throws FileNotFoundException Si no se encuentra el fichero
     */
    private static void imprimirInformacion() throws IOException {
       try {
           BufferedReader br;
           br = new BufferedReader(new FileReader(fichero));
           String linea;
           System.out.println("Contenido del archivo:");
           while ((linea = br.readLine()) != null) {
               System.out.println(linea);
           }//Fin while
           br.close();
       }catch (FileNotFoundException e) {
           e.printStackTrace();
       }//Fin try-catch
    }//Fin de imprimirInformación

    /**
     * Metodo que te elimina el fichero
     */
    private static void eliminarFichero() {
        try {
            fichero.delete();
        }catch (Exception e) {
            System.out.println("No existe el archivo");
        }//Fin try-catch
    }//Fin de eliminarFichero
    public static void main (String[]args) throws IOException {
                crearArchivo();
    }//Fin de main
}//Fin de Plantilla_Para_Lectura_y_Escritura_de_Archivos
/*
Cambiar o añadir cosas a los metodos dependiento de la exigencia
No utilizar los metodos de insertarNuevaInformacon,
imprimirInformacion , eliminarFichero antes del metodo crear fichero
Otros metodos utiles para el caso de meter informacion a un arrayList de objetos
(Insertar datos de objetos de un fichero a un arraylist y viceversa)
 estan en la Practica Tema 11
 */