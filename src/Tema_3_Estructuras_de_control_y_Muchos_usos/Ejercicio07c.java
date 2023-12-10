package Tema_3_Estructuras_de_control_y_Muchos_usos;
/*
Programa que hace una lista de los dias de la semana y luego de los numeros del 1 al 12
 */
public class Ejercicio07c {
    public static void main (String[] args){
        //Declaracion e inicialización de variables
        String[] semana={"lunes","martes","miercoles","jueves","viernes","sabado","domingo"};
        int [] numeros ={1,2,3,4,5,6,7,8,9,10,11,12};
        for(String día:semana){
            System.out.println(día);
        }
        for(int mes:numeros){
            System.out.println(mes);
        }
    }
    
}
