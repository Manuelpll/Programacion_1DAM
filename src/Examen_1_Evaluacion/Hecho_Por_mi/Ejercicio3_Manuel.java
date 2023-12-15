package Examen_1_Evaluacion.Hecho_Por_mi;
import java.util.Scanner;
public class Ejercicio3_Manuel {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        int x;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Inserte el numero que sera el a de la ecuacion");
        a= teclado.nextInt();
        System.out.println("Inserte el numero que sera el c de la ecuacion");
        b= teclado.nextInt();
        System.out.println("Inserte el numero que sera el b de la ecuacion");
        c= teclado.nextInt();
        x=(-b +-(b*b)-4*a*c)/(2*a);
        if(x<0){
            System.out.println("No es un numero real");
        }else
        System.out.println(x);
    }
}
