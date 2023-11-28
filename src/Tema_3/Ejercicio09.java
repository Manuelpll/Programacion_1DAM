package Tema_3;

public class Ejercicio09 {
    public static void main(String[] args){
         //Declaramos variables
        int numero = 7;
        int contador = 0;
        int resultado=0;
        //Salida de informacíon
        System.out.println("Tabla de mltiplicar del "+numero);
        System.out.println("-------------------------");
        //Uso de bucle while
        for (contador=0;contador<=10;contador++){
            if(contador==7)
                continue;//Pasa a la siguirnte iteracion
             resultado=contador*numero;
            System.out.println(numero+"x"+contador+"="+resultado);
        }
    }
}
