package Practicas_Obligatorias;
/*
*Calculo del IMC segun tu altura y peso utilizando funciones
 */
import java.text.DecimalFormat;
import java.util.Scanner;
public class Practica_Evaluable_Tema_2_Manuel_Parra_Llanso {
    public static void presentacion () {
        System.out.println("""
    ******************************
    ***Programa de calculo de IMC*
    ****Author:Manuel            *
    ***Version 1.0               *
    ******************************""");                            
    }
    public static double calculo(double num1,double num2){
        double total= num1/(num2*num2);
        return total;
    }
 public static void main (String[] args){
//Zona de variables
       String nombre, apellidos,bajopeso,normal,sobrepeso,obesidad;
       double altura;
       double peso;
        
        //Zona de inicializacion de datos
      Scanner teclado = new Scanner(System.in);
      DecimalFormat df = new DecimalFormat("#.00");
       //Zona de procesamiento
     presentacion();
    System.out.println("Introduce tu nombre: ");
    nombre = teclado.nextLine();
    System.out.println("Introduce tus apellidos");
    apellidos = teclado.nextLine();
    System.out.println("Introduce tu altura");
    altura = teclado.nextDouble();
    
    System.out.println("Introduce tu peso");
     peso= teclado.nextDouble();
   
    double IMC= calculo(peso,altura);
    //Zona salida
       System.out.println("Tu IMC es "+df.format(IMC));
       
       bajopeso=(IMC<18.5)?"estas en el rango de bajo peso":"";
       
       normal=(IMC>18.5&&IMC<24.9)?"estas en el rango de peso normal":"";
       
       sobrepeso=(IMC>24.9&&IMC<29.99)?"estas en el rango de sobrepeso":"";
       
       obesidad=(IMC>30)?"estas en el rango de obesidad":"";
       
       System.out.println(nombre+" "+apellidos+" "+bajopeso+normal+sobrepeso+obesidad);
    }
}