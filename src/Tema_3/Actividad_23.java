package Tema_3;
import java.util.Scanner;
@SuppressWarnings("resource")

public class Actividad_23 { //ACTIVIDADES PROPUESTAS 3 - 01 (hace una pirámide invertida)
    public static void triangulin (char a, int f){
        for(int esp=0, simbolos=(f*2)-1 ;simbolos>0; esp++, simbolos-=2){
            //Espacios en blanco
            for(int i=0;i<esp;i++){
                System.out.print(" ");
            }
            //Asteriscos
            for(int j=simbolos;j>0;j--){
                System.out.print(a);
            }
            System.out.println();
        }
    }
        public static void triangulin2 (char a, int f){ //ESTE ES EL BUENO XD
            for(int esp=1, simbolos=f;simbolos>0; esp++, simbolos-=1){
                //Espacios en blanco
                for(int i=f;i>=esp;i--){
                    System.out.print(" ");
                }
                //Asteriscos
                for(int j=esp;j>0;j--){
                    System.out.print(a);
                }
                System.out.println();
            }
        }//fin procedimiento
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        char simbolo;
        int filas;
        System.out.print("Introduzca el símbolo con el que quiere formar su triángulo: ");
        simbolo = scanner.next().charAt(0);
        System.out.print("Introduzca el número de filas a realizar: ");
        filas = scanner.nextInt();
        triangulin2(simbolo, filas);
    } //fin main
} //fin clase