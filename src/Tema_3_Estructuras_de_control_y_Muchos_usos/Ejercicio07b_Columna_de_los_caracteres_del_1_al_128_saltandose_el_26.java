package Tema_3_Estructuras_de_control_y_Muchos_usos;

/**
 *Programa que muestra todos los carcters del 1 al 128 saltandose el 26
 * @author Mparr
 */
public class Ejercicio07b_Columna_de_los_caracteres_del_1_al_128_saltandose_el_26 {
     public static void main(String[] args){
     for(char a=(0);a<128 ;a++){ 
         if(a!=26)
         System.out.println("Valor: "+(int)a+" caracter: "+a);
     }   
     }
}
