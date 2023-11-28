package Tema_2;
//Primer ejemplo de arrays
public class Arrays {
    public static void main(String[] args){
        int[]array1;
        array1= new int[6];
        int[]array2= new int[6];
        array1[0]=6;
        array1[1]=8;
        array1[2]=4;
        array1[3]=5;
        array1[4]=3;
        array1[5]=9;
        System.out.println("Posición cero del array 1 es: "+array1[0]);
        array2[0]= array1[0];
        System.out.println("Posicion cereo del arry 2 es:"+array2[0]);
}
}