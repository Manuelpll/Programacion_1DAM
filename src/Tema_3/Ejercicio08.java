/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema_3;

/**
 *
 * @author alumno
 */
public class Ejercicio08 {
    public static void main(String[] args){
        //Declaramos variables
        int numero = 7;
        int contador = 0;
        int resultado=0;
        //Salida de informacíon
        System.out.println("Tabla de mltiplicar del "+numero);
        System.out.println("-------------------------");
        //Uso de bucle while
        while(contador<=10){
            resultado=contador*numero;
            System.out.println(numero+"x"+contador+"="+resultado);
            contador ++;
        }
    }
}
