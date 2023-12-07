package Tema_3;
/*
Es un programa que te dice si el numero es par o impar
 */
import java.util.Scanner;
public class Actividad01 {
    public static  double par(double num1){
                if(num1%2==0){
System.out.println("Es Par");
}else{
System.out.println("Es Impar");
}
        return num1;
    }
    public static void main(String[] args){
         //Declarar variables
        double n;
        //Zona de iniciacion de datos
        Scanner teclado=new Scanner (System.in);
        System.out.println ("Escribe un numero");
        n = teclado.nextDouble ();
        par(n);
    }
    }

