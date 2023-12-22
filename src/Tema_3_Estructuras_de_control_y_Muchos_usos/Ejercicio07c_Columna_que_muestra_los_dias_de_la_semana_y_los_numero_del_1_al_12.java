package Tema_3_Estructuras_de_control_y_Muchos_usos;
/*
Programa que hace una lista de los dias de la semana y luego de los numeros del 1 al 12
 */
public class Ejercicio07c_Columna_que_muestra_los_dias_de_la_semana_y_los_numero_del_1_al_12 {
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
