package Tema_11_Lectura_y_Escritura_de_información.Ejemplo_4_Escribir;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Programa que crea un archivo , escribe datos almacenados previamente en un arraylist y lo ordena
 * Antes de utilizar este archivo hay que usar lecturaEscritura
 */
public class lectura_escritura_ordenar_Arraylist {;
    /**
     * Metodo que ejecuta el codigo
     * @param args Los argumentos de la linea de comandos
     */
        public static void main(String[] args) {
            String ruta = ".\\src\\Tema_11_Lectura_y_Escritura_de_información\\Ejemplo_4_Escribir\\prueba.txt";
            ArrayList<String> list = new ArrayList<>();

            File fichero = new File(ruta);
            try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {
                String linea;
                while ((linea = br.readLine()) != null) list.add(linea);
            } catch (IOException e) {
                e.printStackTrace();
            }//Fin try-catch

            Scanner sc = new Scanner(System.in);
            System.out.print("Introduzca el dato a guardar: ");
            String dato = sc.nextLine();
            anyadirDato(list, dato);

            ordenarLista(list);
            escribirArchivo(list, ruta);
            imprimirLista(list);
        }//Fin de main

    /**
     * Metodo que añade un dato al arraylist
     * @param lista - Arraylist a la que quieres añadir el dato
     * @param dato- cadena de carcteres que quieres añadir
     */
        public static void anyadirDato (ArrayList<String> lista, String dato) {
            lista.add(dato);
        }

    /**
     * Metodo que imprime una lista
     * @param lista - Arraylist que quieres imprimir
     */
        public static void imprimirLista (ArrayList lista) {
            System.out.println("Contenidos del archivo: ");
            Iterator<String> imprimir = lista.iterator();
            while (imprimir.hasNext()) {
                System.out.println(imprimir.next());
            }//Fin while
        }//Fin de imprimirLista

    /**
     * Metodo que te ordena el Arraylist
     * @param lista - Arraylist que quieres ordenar
     */
        public static void ordenarLista(ArrayList lista) {
            lista.sort(Collections.reverseOrder());
        }//Fin de ordenarLista

    /**
     * Metodo que escribe texto en un archivo
     * @param lista -Arraylist de los datos que quieres escribir
     * @param ruta -Ruta de donde esta el fichero
     */
        public static void escribirArchivo (ArrayList lista, String ruta) {
            FileWriter fileWriter = null;
            PrintWriter printWriter = null;
            try {
                fileWriter = new FileWriter (ruta);
                printWriter = new PrintWriter(fileWriter);
                Iterator<String> imprimir = lista.iterator();
                while (imprimir.hasNext()) {
                    printWriter.println(imprimir.next());
                }//Fin while
                printWriter.flush();
            } catch (IOException e) {
                e.getMessage();
            } finally {
                try {
                    if (fileWriter != null) fileWriter.close();
                } catch (IOException e) {
                    e.getMessage();
                }//Fin try-catch
            }//Fin try-catch-finally
        }//Fin de escribir archivo
    }//Fin de lectura_escritura_ordenar_Arraylist
