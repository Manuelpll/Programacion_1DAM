package Tema_3;
import java.util.Scanner;
public class Actividad03 {
    public static void alfabeto (char num1,char num2){
       if (num1<num2)
           System.out.println("Esta ordenado alfabeticamente");
       else{ System.out.println("No esta ordenado");
       }
    }
    public static void main (String[] args){
         //Zona de inicializacion de datos
        Scanner teclado=new Scanner (System.in);
        //Declaracion de variables
        char A;
        char B;
        //Salida de informacion
        System.out.println("Introduce la primera letra");
        A= teclado.next().charAt(0);
        
        System.out.println("Introduce la primera letra");
        B= teclado.next().charAt(0);
        
        alfabeto(A,B);
        
    }
    
}
