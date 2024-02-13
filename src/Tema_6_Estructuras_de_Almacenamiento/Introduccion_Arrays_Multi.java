package Tema_6_Estructuras_de_Almacenamiento;
/**
 * Es una introduccion a los ejercicios del Tema 6 parte 4
 * @author Mparr
 * @date 13/02/2024
 */
public class Introduccion_Arrays_Multi {
    public static void main(String[] args) {
        /*
        Creamos un array tridimensional llamado cubo
         */
        int[][][] cubo = {{{1, -9, 3}, {2, 7, 4}}, {{-45, 5, 6, 75}, {66, 12, 5}}, {{29, 30}, {45, 90, 3}}};
           /*
           Creo un metodo que imprime el array tridimensional
            */
        for (int[][] i:cubo){
            for (int[] a:i){
                for (int finalArray:a){
                    System.out.println(finalArray);
                }//Fin 1º for
                System.out.println(" ");
            }//Fin 2º for
        }//Fin 3º for
        System.out.println("Elemento 0-0-0: "+cubo[0][0][0]);
    }//Fin main
}//Fin clase