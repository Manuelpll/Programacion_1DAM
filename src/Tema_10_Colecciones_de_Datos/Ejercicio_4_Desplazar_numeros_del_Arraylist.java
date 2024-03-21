package Tema_10_Colecciones_de_Datos;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Este programa permite desplazar el objeto del array
 */
public class Ejercicio_4_Desplazar_numeros_del_Arraylist {
    public static <T> void desplazar(ArrayList<T> lista, int cantidad) {
        if (cantidad > 0) {
            for (int i = 0; i < cantidad; i++) {
                T ultimoElemento = lista.remove(lista.size() - 1);
                lista.add(0, ultimoElemento);
            }//Fin de for
        } else if (cantidad < 0) {
            for (int i = 0; i < Math.abs(cantidad); i++) {
                T primerElemento = lista.remove(0);
                lista.add(primerElemento);
            }//Fin de for
        }//Fin if-else
    }//Fin de desplazar
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();

        Collections.addAll(lista, 13, 22, 4, 56, 12);

        System.out.println("Lista original: " + lista);

        desplazar(lista, 1);

        System.out.println("Lista desplazada hacia la derecha: " + lista);

        desplazar(lista, -1);

        System.out.println("Lista desplazada hacia la izquierda: " + lista);
    }//Fin de main
}//Fin de Desplazar numeros del arraylist