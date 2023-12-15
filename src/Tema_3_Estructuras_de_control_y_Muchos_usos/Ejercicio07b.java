package Tema_3_Estructuras_de_control_y_Muchos_usos;

/**
 *Programa quwe muestra todos los carcters del 1 al 128 saltandose el 26
 * @author alumno
 */
public class Ejercicio07b {
     public static void main(String[] args){
     for(char a=(0);a<128 ;a++){ 
         if(a!=26)
         System.out.println("Valor: "+(int)a+"caracter: "+a);
     }   
     }
}
