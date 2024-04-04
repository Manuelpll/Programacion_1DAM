package Tema_11_Lectura_y_Escritura_de_información.Ejemplo_3_Escritura;

import java.io.*;
import java.util.Scanner;

/**
 * Explicacion de la escritura de información
 */
public class Ejemplo_3 {
    /**
     * Metodo que ejecuta el codigo
     * @param args Los argumentos de la linea de comandos
     */
    public static void main(String[] args) throws IOException {
        Scanner sc =new Scanner(System.in);
        File fichero1 = new File(".\\src\\Tema_11_Lectura_y_Escritura_de_información\\Ejemplo_3_Escritura\\prueba1.txt");
        //Compruebo que el directorio existe
        if (!fichero1.exists()){
            System.out.println("El archivo no exite!!!");
            System.out.println("¿Quiere crear un nuevo fichero de texto?"+"\nPulse Y para crear el archivo");
            String  respuesta= sc.nextLine();
            if(respuesta.equalsIgnoreCase("Y")) {
                System.out.println("Nombre del nuevo fichero: ");
                String nombreFichero = sc.nextLine();
                //Crear un nuevo fichero con un nombre introducido por el usuario
                File ficheroUser = new File(".\\src\\Tema_11_Lectura_y_Escritura_de_información\\Ejemplo_3_Escritura\\" + nombreFichero);
                try {
                    ficheroUser.createNewFile();
                    ficheroUser.getAbsoluteFile();
                } catch (Exception e) {
                    e.printStackTrace();
                }//Fin try-catch
                System.out.println("El archivo se ha creado correctamente");
            }else{
                System.out.println("El programa se cerrara");
            }//Fin else

        }else{
            try {
                BufferedReader br = new BufferedReader(new FileReader(".\\src\\Tema_11_Lectura_y_Escritura_de_información\\Ejemplo_3_Escritura\\prueba2.txt"));
                BufferedWriter bw = new BufferedWriter(new FileWriter(".\\src\\Tema_11_Lectura_y_Escritura_de_información\\Ejemplo_3_Escritura\\prueba2.txt"));
                //Escribimos en el fichero
                bw.write("Linea 1");
                System.out.println("Escriba su linea 1");
                String escritura= sc.nextLine();
                bw.write(escritura);
                bw.flush();
                bw.newLine();
                bw.write("Linea 2");
                System.out.println("Escriba su linea 2");
               escritura= sc.nextLine();
                bw.write(escritura);
                bw.flush();
            }catch (Exception e){
                e.printStackTrace();
            }//Fin try-catch
        }//Fin if-else
    }//Fin main
}//Fin del main
