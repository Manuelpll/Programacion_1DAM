package Examen_1_Evaluacion.Hecho_Por_mi;

import java.util.Scanner;

public class Ejercicio1_Manuel {
    public static int Fibonacci(int num1,int num2,int contador){
      for(int i=0;i<contador;i++){
          System.out.print(num1 + ",");
          System.out.print(num2 + ",");
          num1 = num1 + num2;
          System.out.print(num1 + ",");
          num2 = num1 + num2;
      }
      return num1;
    }

    public static void main(String[] args) {
        //Declaramos las variables
           int num1=9;
           int num2=6;
        int contador=0;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introcuce el numero de veces que quieres que se sume los numeros");
        contador= teclado.nextInt();
              Fibonacci(num1,num2,contador);
}
        }