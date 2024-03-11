package Tema_2_Primeros_programas;

import java.util.Scanner;
/**
 * Calcula lo que cobra en las horas de trabajo y horas extra
 * @author alumno
 */
public class Ejercicio07_Calculo_del_Cobro_Sumando_Horas_Normales_y_Extras {
    /**
     * Metodo que calcula  del salario
     * @param num1  Horas normales
     * @param num2 Horas extras
     * @return Cobro total al trabajador
     */
    public static double cobro ( double num1,double num2){
        double resultado =num1*23.25;
        double resultado2 =num2*15/100+num2*4.7/100;
        double resultadof= resultado +resultado2;
        return resultadof;
}

    /**
     * Metodo para ejecutar el codigo
     * @param args Los argumentos de la linea de comandos
     */
     public static void main (String[] args){
            Scanner teclado = new Scanner(System.in);
   
        double horas;
        double horasx;
        
        System.out.println("Introduce el numero de horas trabajadas durante esta semana ");
        horas= teclado.nextDouble();
        
        System.out.println("Introduce el numero de horas extra trabajadas durante esta semana ");
        horasx= teclado.nextDouble();
        
        double total= cobro(horas,horasx);    
        System.out.printf("\n%.3f $",total);
    }//Fin de main
}//Fin de calculo de cobro
