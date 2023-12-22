package Tema_2_Primeros_programas;

/**
 * Primera funciones
 * @author Mparr
 */
public class Ejemplo01_Primeras_funciones {
    //Codigo de la funcion
    //SE DEBE DE poner STATIC para poder utilizar en el main
    public static int sumar ( int numero1, int numero2){
        int resultado =numero1+numero2;
        return resultado;
    }
    
    
    
    
    public static void main (String[] args){
        //TODO code aplication logic here
        int variable1=sumar(2,3);
        System.out.println("La suma de dos numeros es "+variable1);
        
}
}