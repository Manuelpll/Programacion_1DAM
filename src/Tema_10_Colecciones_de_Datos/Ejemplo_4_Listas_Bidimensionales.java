package Tema_10_Colecciones_de_Datos;

import java.util.ArrayList;

/**
 * Explicacion de las listas bidimensionales
 */
public class Ejemplo_4_Listas_Bidimensionales {
    /**
     * Metodo que ejecuta el codigo
     * @param args Los argumentos de la linea de comandos
     */
    public static void main(String[] args) {
        //Me creo un arry en 2 Dimensiones
        ArrayList<ArrayList <Integer>> lista1 = new ArrayList<>();
        System.out.println("Lista 2D:"+lista1);
        //Inicializacion
        int numberOflist = 3;
        for (int i=0;i<numberOflist;i++){
            lista1.add(new ArrayList<>());
        }//Fin for
        System.out.println("Lista 2D (inicializada): "+lista1);
          //Insercion de valores
        lista1.get(0).add(5);
        lista1.get(1).add(2);
        lista1.get(2).add(4);
        lista1.get(2).add(8);
        lista1.get(2).add(0,1);
        /*Lo coloca en la posicion que sea ignorando totalmente
         si hay un numero en
          esa posicion y desplazando a los demas una posicion*/
        System.out.println("Lista 2D (inicializada): "+lista1);

        //Para imprimir sin corchetes
        System.out.print("Lista sin parentesis:");
        for (ArrayList<Integer>list:lista1){
            for (Integer i1:list) {
                System.out.printf("%s",i1);
            }
        }
    }//Fin main
}//Fin Listas Bidimensionales
