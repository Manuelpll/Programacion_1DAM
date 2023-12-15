package Tema_3_Estructuras_de_control_y_Muchos_usos;
/*
El programa calculara el factorial de cualquier numero que se le pida
 */
import java.util.Scanner;
public class Actividad15 {
    public static int  factorial (int num1,int cont){

        while (num1 > 0){
            cont= cont* num1;//Cont *= num1 es mas abreviado
            num1--;


        }
        int resultado=cont;
        return resultado;
    }

    public static void main(String[] args) {
        //Declarar las variables
        int numero;
        int  contador=1;
        Scanner teclado= new Scanner(System.in);
        System.out.println("Introduce el numero que desea calcular su factorial");
           numero=teclado.nextInt();
        teclado.close();
           int  resultado=factorial(numero,contador);
           System.out.println("El resultado que queda es: "+resultado);
    }
}
