package Tema_3_Estructuras_de_control_y_Muchos_usos;
/**
 * Ordenar el array mediante las librerias de java
 *
 */

import java.util.Arrays;//Ordena de forma ascendente
import  java.util.Collections;//Ordena de forma descencente
public class Tema3_Array_palabras {
    public static void main(String[] args) {
        int[] array ={10,1,5,40,12,34,44,12,11,9};
        String[] palabra={"Juan","Pepe","Sara","Elena","Felipe"};
        System.out.println("Array de nombres"+ Arrays.toString(palabra));
        Arrays.sort(palabra);
        System.out.println("Array de nombres"+ Arrays.toString(palabra));
        Arrays.sort(palabra,Collections.reverseOrder());
        System.out.println("Array de nombres"+ Arrays.toString(palabra));
    }
}
