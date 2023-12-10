package Tema_2_Primeros_programas;
/*
+Lista con arrays del orden de planetas de nuestro sistema solar
 */
import java.util.Scanner;

public class Ejercicio08 {
    public static void main (String[] args){
            Scanner teclado = new Scanner(System.in);
          String[]array1;
        array1= new String[8];
       array1[0]= "Mercurio";
       array1[1]= "Venus";
       array1[2]= "Tierra";
       array1[3]= "Marte";
       array1[4]= "Jupiter";
       array1[5]= "Mercurio";
       array1[6]= "Urano";
       array1[7]= "Neptuno";
        System.out.println("Introduce nombre del planeta");
        array1= new String[]{teclado.nextLine()};
        
       
        
        System.out.printf("\n%.3f $ ");
    }
}
