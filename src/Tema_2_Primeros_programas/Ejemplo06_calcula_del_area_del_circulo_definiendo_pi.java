package Tema_2_Primeros_programas;
/**
 * Calculo de un area de un circulo definiendo una constante
 * @author Manuel
 */
import java.text.DecimalFormat;
import java.util.Scanner;
public class Ejemplo06_calcula_del_area_del_circulo_definiendo_pi {
    static  final double PI =3.1415926536;
    public static double total ( double num1){
        double resultado = num1*num1*PI;
        return resultado;
    }
    
    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);
      DecimalFormat df = new DecimalFormat("#.00");
        double radio;
      
        System.out.println("Introduce el radio del circulo ");
        radio= teclado.nextDouble();
        
        double total= total(radio);
        System.out.println("Son " +df.format(total)+"metros cuadrados");
    }
}
