package Tema_2_Primeros_programas;
import java.util.Scanner;
/**
*Calcula lo que cobra en las horas de trabajo y horas extra con arrays
* @author Mparr
 */
public class Ejercicio07b_Calculo_del_Cobro_con_Arrays {
    /**
     * Metodo que calcula  del salario
     * @param num1  Horas normales
     * @param num2 Horas extras
     * @return Cobro total al trabajador
     */
    public static double cobro ( double num1,double num2){
        double resultado =num1*23.25;
        double resultado2 =num2*0.15+num2*0.047;
        double resultadof= (resultado +resultado2)*4;
        return resultadof;
}//Fin de cobro
    /**
     * Metodo para ejecutar el codigo
     * @param args Los argumentos de la linea de comandos
     */
     public static void main (String[] args){
            Scanner teclado = new Scanner(System.in);
          double[]array1;
        array1= new double[2];
       
        
        System.out.println("Introduce el numero de horas trabajadas durante esta semana");
        array1[0]= teclado.nextDouble();
        
        System.out.println("Introduce el numero de horas extra trabajadas durante esta semana");
        array1[1]= teclado.nextDouble();
        
        double total= cobro(array1[0],array1[1]);
        System.out.printf("\n%.3f $ ",total);
    }//Fin de main
}//Fin de calculo de cobro con arrays
