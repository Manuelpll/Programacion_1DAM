/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema_2;

/**
 * Primera funciones
 * @author alumno
 */
public class Ejemplo01 {
    //Codigo de la funcion
    //SE CEBE DE poner STATIC para poder utilizar en el main
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