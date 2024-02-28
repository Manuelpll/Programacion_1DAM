package Tema_2_Primeros_programas;

/**
 * Primera funciones
 * @author Mparr
 */
public class Ejemplo01_Primeras_funciones {
    //Codigo de la funcion
    //SE DEBE DE poner STATIC para poder utilizar en el main

    /**
     * Metodo  que realiza la suma entre el 2 y el 3
     * @param numero1 El numero 2
     * @param numero2 El numero 3
     * @return El resultado de la suma
     */
    public static int sumar ( int numero1, int numero2){
        return numero1+numero2;
    }
    /**
     * Metodo principal para ejecutar el codigo
     * @param args Los argumentos de la linea de comandos
     */
    public static void main (String[] args){
        //TODO code aplication logic here
        int variable1=sumar(2,3);
        System.out.println("La suma de dos numeros es "+variable1);
        }//Fin del  main
   }//Fin de Primeras funciones