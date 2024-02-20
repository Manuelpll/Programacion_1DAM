package Tema_7_Manejo_de_Excepciones;
import java.io.*;
/*
 * Ejercicio resuelto sobre manejo de excepciones.
 * El programa solicita que el usuario introduzca por teclado
 * un número entre 0 y 100, debiendo gestionarse la entrada
 * por medio de excepciones.
 */

public class Ejemplo_1_Programa_Introducir_numero_del_1_al_100 {
    public static void main(String[] args){
        int numero=-1;
        int intentos=0;
        String linea;

        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

        do{
            try{
                System.out.print("Introduzca un número entre 0 y 100 ");
                linea = teclado.readLine();
                numero = Integer.parseInt(linea);

            }catch(IOException e){
                System.out.println("Error al leer del teclado.");

            }catch(NumberFormatException e){
                System.out.println("Debe introducir un número entre 0 y 100.");

            }finally{
                intentos++;
            }
        }while (numero < 0 || numero > 100);

        System.out.println("El número introducido es: " + numero);
        System.out.println("Número de intentos: " + intentos);

    }

}
