package Tema_10_Colecciones_de_Datos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Explicacion de Iterator
 * @author Mparr
 */
public class Ejemplo_2_Iterator {
    // Iterator en una Lista
    // Se aplica Polimorfismo

    /**
     * Metodo que ejecuta el codigo
     * @param args Los argumentos de la linea de comandos
     */
    public static void main(String[] args) {
        Iterable<String> lista01DAM = List.of("Alejandro","David","Lucia","Marina");
        lista01DAM.forEach(System.out::println);
        //Crear el objeto a partir de la clase concreta(ArryList)
        //A la izquierda el tipo de lista ArrayList
        ArrayList<Integer> lista02 =new ArrayList<>();

        //Ve tipos de listas .getClass()
        System.out.println("Tipo de lista:"+lista01DAM.getClass());
        System.out.println("Tipo de lista 2:"+lista02.getClass());

        // Definir el tamaño inicial de una lista
        ArrayList<String> lista03 =new ArrayList<>(2);
        lista03.add("Sara");
        lista03.add("Juan");
        System.out.println(lista03);
        lista03.add("Elena");
        System.out.println(lista03+",");
        // Modificar elementos de la lista
        lista03.set(0,"Sara Gonzalez");
        lista03.set(1,"Juan Torres ");
        lista03.set(2,"Elena Sanchez ");
        lista03.add("David");
        lista03.set(3,"David Meca");
        System.out.println("Lista 3 modificada:"+lista03);
        System.out.println("Elemento 2 de la lista: "+lista03.get(1));
        System.out.println("Longitud de la lista actual: "+lista03.size()); // Muestra el tamaño de la lista
        //Eliminar elemento de la lista
        lista03.remove(1);
        System.out.println("Lista con un elemento menos: "+lista03);
        lista03.remove("David Meca");
        System.out.println("Lista con un elemento menos : "+lista03);//Lo hemos eliminado con una palabra especifica
        //lista03.clear(); // Tambien se puede hacer lista03.removeAll(lista03); pero es más lenro
        System.out.println("Lista vaciada:"+lista03);
        System.out.println("Longitud de la lista actual: "+lista03.size());
        
        //metodo cotains
        boolean contiene=false;
        contiene=lista03.contains("Sara Gonzalez");
        System.out.println("Valor boleano: "+contiene);
        //Metodo sort
        Collections.sort(lista03); // se importa la libreria collectionS
        System.out.println("Elementos ordenados: "+lista03);
        
        ArrayList <Integer>lista04= new ArrayList<Integer>();
        lista04.add(5);
        lista04.add(7);
        lista04.add(3);
        Collections.sort(lista04,Integer::compareTo); //Harías lo mismo que con la libreria collections
        System.out.println("Elementos ordenados ascendente lista 4: "+lista04);
        Comparator<Integer> comparadorAS = Integer::compareTo;
        Comparator<Integer> comparadorIN = Collections.reverseOrder();
        Collections.sort(lista04,comparadorIN);
        System.out.println("Elementos ordenados descendente lista 4: "+lista04);
        ArrayList<Integer> lista4b = new ArrayList<>(List.of(5,7,3,-1,-5));
        lista4b.sort(comparadorAS);
        System.out.println(" Lista Ascendente"+lista4b);
        lista4b.sort(comparadorIN);
        System.out.println("Lista Descendente"+lista4b);

        //Copiar valores de una lista
        List <String>lista05= Collections.nCopies(5,"Hola");
        System.out.println(lista05);

    }//Fin main
}//Fin Iterator
