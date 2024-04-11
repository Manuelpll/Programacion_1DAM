package Tema_11_Lectura_y_Escritura_de_información.Ejemplo_4_escribir;

import java.io.*;
import java.util.Scanner;

public class lecturaEscritura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String rutaArchivo = "prueba.txt";
        File fichero = new File(rutaArchivo);

        try {
            if (!fichero.exists()) {
                System.out.println("El archivo no existe.");
                System.out.println("¿Desea crear un nuevo archivo? (Sí: s / No: n)");
                String respuesta = sc.nextLine();
                if (respuesta.equalsIgnoreCase("s")) {
                    // Crear un nuevo archivo con 9 líneas
                    PrintWriter pw = new PrintWriter(fichero);
                    for (int i = 1; i <= 9; i++) {
                        pw.println("linea " + i);
                    }
                    pw.close();
                    System.out.println("Archivo creado con éxito.");
                } else {
                    System.out.println("Saliendo del programa.");
                    return;
                }
            }

            // Pedir al usuario que escriba la línea 10
            System.out.println("Escribe la línea 10:");
            String linea10 = sc.nextLine();

            // Añadir la línea 10 al final del archivo
            PrintWriter pw = new PrintWriter(new FileWriter(fichero, true));
            pw.println(linea10);
            pw.close();

            // Mostrar el contenido completo del archivo
            BufferedReader br = new BufferedReader(new FileReader(fichero));
            String linea;
            System.out.println("Contenido del archivo:");
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
