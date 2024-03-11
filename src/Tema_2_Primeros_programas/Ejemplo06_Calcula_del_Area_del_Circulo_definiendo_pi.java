package Tema_2_Primeros_programas;
import java.text.DecimalFormat;
import java.util.Scanner;
/**
 * Calculo de un area de un circulo definiendo una constante
 * @author Manuel
 */
public class Ejemplo06_Calcula_del_Area_del_Circulo_definiendo_pi {
    static  final double PI =3.1415926536;

    /**
     * Metodo que calcula el area
     * @param num1 radio del circulo
     * @return area del circulo
     */
    public static double total ( double num1){
        double resultado = num1*num1*PI;
        return resultado;
    }//Fin de total

    /**
     * Metodo para ejecutar el codigo
     * @param args Los argumentos de la linea de comandos
     */
    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);
      DecimalFormat df = new DecimalFormat("#.00");
        double radio;
      
        System.out.println("Introduce el radio del circulo ");
        radio= teclado.nextDouble();
        
        double total= total(radio);
        System.out.println("Son " +df.format(total)+"metros cuadrados");
    }//Fin de main
}//Fin de calculo del area del circulo
