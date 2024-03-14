package Tema_10_Colecciones_de_Datos;

import java.util.ArrayList;
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
        lista03.clear(); // Tambien se puede hacer lista03.removeAll(lista03);
        System.out.println("Lista vaciada:"+lista03);
        System.out.println("Longitud de la lista actual: "+lista03.size());
    }//Fin main
}//Fin Iterator
