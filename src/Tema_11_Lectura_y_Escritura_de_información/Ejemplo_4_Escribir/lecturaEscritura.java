package Tema_11_Lectura_y_Escritura_de_información.Ejemplo_4_Escribir;

import java.io.*;
import java.util.Scanner;

/**
 * Es un programa que te crea un archivo , te escribe 9 lineas y luego la siguiente linea te pide que escribas información
 * @author Mparr
 * @date 11/04/2024
 */
public class lecturaEscritura {
    /**
     * Metodo que ejecuta el codigo
     * @param args Los argumentos de la linea de comandos
     */
    public static void main(String[] args) {
        BufferedReader br =null;
        PrintWriter pw = null;
        Scanner sc = new Scanner(System.in);
        String rutaArchivo = ".\\src\\Tema_11_Lectura_y_Escritura_de_información\\Ejemplo_4_Escribir\\prueba.txt";
        File fichero = new File(rutaArchivo);

        try {
            if (!fichero.exists()) {
                System.out.println("El archivo no existe.");
                System.out.println("¿Desea crear un nuevo archivo? (Sí: s / No: n)");
                String respuesta = sc.nextLine();
                if (respuesta.equalsIgnoreCase("s")) {
                    // Crear un nuevo archivo con 9 líneas
                    pw = new PrintWriter(fichero);
                    for (int i = 1; i <= 9; i++) {
                        pw.println("linea " + i);
                    }//Fin for
                    pw.close();
                    System.out.println("Archivo creado con éxito.");
                } else {
                    System.out.println("Saliendo del programa.");
                    return;
                }//Fin if-else
            }//Fin if

            System.out.println("Escribe siguiente linea:");
            String nuevalinea = sc.nextLine();

            pw = new PrintWriter(new FileWriter(fichero, true));
            pw.println(nuevalinea);
            pw.close();

            br = new BufferedReader(new FileReader(fichero));
            String linea;
            System.out.println("Contenido del archivo:");
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }//Fin while
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }//Fin try-catch
    }//Fin del main
}//Fin lecturaEscritura
