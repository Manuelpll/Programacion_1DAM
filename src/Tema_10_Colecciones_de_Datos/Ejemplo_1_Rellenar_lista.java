package Tema_10_Colecciones_de_Datos;

import java.util.*;

/**
 * Programa que explica como se rellena un map y una coleccion
 * @author Mparr
 */
public class  Ejemplo_1_Rellenar_lista {
    static Collection rellenar (Collection c){
        c.add("perro");
        c.add("gato");
        c.add("perro");
        c.add("Pez");
        System.out.println("La longitud de la lista: "+c.size());
        return  c;
    }//Fin de la coleccion
    static Map rellenar (Map m){
        m.put("1","vaca");
        m.put("2","oveja");
        m.put("3","cerdo");
        System.out.println("La longitud del Map: "+m.size());
        return  m;
    }//Fin del mapa
    public static void main(String[] args) {
        System.out.println("ArrayList"+rellenar(new ArrayList()));//Devuelve todos los elementod por orden de inserción
        System.out.println("HashSet"+rellenar(new HashSet()));//devuelve elmentos no repetidos
        System.out.println("HashMap"+rellenar(new HashMap()));//Pila con elementos no repetidos
    }//Fin main
}//Fin Imprimir
/*
 CONCLUSIONES
 Hashset. Contiene un conjunto de objetos, qe le permite determinar mas facil y rapidamente si un objeto esta en el conjunto o no
 HashMap. Se imprime entre llaves con el signo Igual {clave=valor}
 Listas. Se puede crear elementos duplicados
 */