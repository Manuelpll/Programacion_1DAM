package Tema_3_Estructuras_de_control_y_Muchos_usos;
import java.util.Scanner;


public class ActividadTriangulo {
    public static void triangulin(char a, int f) {
        for(int i=1;i<=f;i++){ //altura
            for (int esp = f+i; esp == f; esp--) {//espacios en blanco
                System.out.print(" ");
            }
            for (int simbolos = 1; simbolos < i*2; simbolos++) { //símbolos a mostrar
                System.out.print(a); 
            }
            System.out.println();
        }//fin for altura
    }//fin procedimiento
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        char simbolo;
        int filas;
        System.out.print("Introduzca el símbolo con el que quiere formar su triángulo: ");
        simbolo = scanner.next().charAt(0);
        System.out.print("Introduzca el número de filas a realizar: ");
        filas = scanner.nextInt();
        triangulin(simbolo, filas);
    } //fin main
} //fin clase
