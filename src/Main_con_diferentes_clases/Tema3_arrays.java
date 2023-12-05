package Main_con_diferentes_clases;

public class Tema3_arrays {
    public static void main(String[] args) {
        int[] array ={10,1,5,40,12,34,44,12,11,9};
        int longitud=array.length;
        //Procedimientos
        Funciones.bubblesortdes(array);
        Funciones.imprimirArrayUni(array,longitud);
    }
}