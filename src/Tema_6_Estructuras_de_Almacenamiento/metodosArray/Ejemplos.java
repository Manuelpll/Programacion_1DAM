package Tema_6_Estructuras_de_Almacenamiento.metodosArray;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Metodos para copiar un array
 */
public class Ejemplos {
    public static void main(String[] args) {
        int [] primes={1,2,3,4,6,9,11};
        int [] copia= new int[primes.length];
        /*
        Copiamos el array primes a el array copia y luego le cambiamos el valor de la posicion 3
         */
        System.arraycopy(primes,0,copia,0,primes.length);
        copia[2]=16;
        System.out.println("Array origen"+ Arrays.toString(primes));
        System.out.println("Array copiado"+Arrays.toString(copia));
        /*
        Con la libreria java.util.Arrays  utilizamos otra manera de copiar un array
         */
        int[] copia2;
        copia2=Arrays.copyOf(primes,primes.length);
        System.out.println("Segunda forma de copiar"+Arrays.toString(copia2));
        /*
        Con una funcion de la librería java.util.arrays copiamos unas detrminadas posiciones del array primes
        (Hay otro modo de copiar un array con el metodo .clone() que es el metodo más facil)
         */
        int[]copiaRango;
        copiaRango=Arrays.copyOfRange(primes,1,4);
        System.out.println("Unos numeros copiados del array"+Arrays.toString(copiaRango));
        /*
        Copiamos un array bidimensional
         */
        int[][] origen=new int[][]{{1,3,5,7,9},{2,4,6},{1,2,3}};
        int[][] copiaBi=new int[origen.length][];
        for (int i=0;i< origen.length;i++){
            copiaBi[i]=Arrays.copyOf(origen[i],origen.length);//Otra manera serìa copiaBi[i]=origen[i].clone() es el más sencillo
        }//Fin for
        copiaBi[1][1]=20;
        System.out.println("Copia del array bidimensional"+ Arrays.deepToString(copiaBi));
        /*
        Ordeno el array de forma ascendente y descendente que se utiliza la libreria java.util.Collection
         */
        Arrays.sort(copia);
        System.out.println("Array ordenad ascendiente"+Arrays.toString(copia));
        List<int[]> list = Arrays.asList(copia);
        Collections.sort(list, Collections.reverseOrder());
    }
}//Fin de la clase
