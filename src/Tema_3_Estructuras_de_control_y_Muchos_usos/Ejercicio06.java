/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema_3_Estructuras_de_control_y_Muchos_usos;

/**
 *
 * @author alumno
 */
public class Ejercicio06 {
    public static void main (String [] args){
        int numero = 7;
        int contador;
        int resultado=0;
        //Salida de informacion
        System.out.println("TABLA DE MULTIPLICAR DEL "+numero);
        System.out.println("-------------------------");
        //Utilizar la estructura iterativa FOR
        for(contador=0;contador<=10;contador++){
            resultado = contador*numero;
            System.out.println("7x"+contador+"="+resultado);
        }
                
    }
}
