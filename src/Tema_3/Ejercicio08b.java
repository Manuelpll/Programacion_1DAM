package Tema_3;

/**
 *
 * @author alumno
 */
public class Ejercicio08b {
    public static void main(String[] args){
        //Declaramos variables
        int numero = 7;
        int contador = 0;
        int resultado=0;
         //Salida de informacíon
        System.out.println("Tabla de mltiplicar del "+numero);
        System.out.println("-------------------------");
        //Uso del do-while
        do{
            resultado=contador*numero;
            System.out.println(numero+"*"+contador+"="+resultado);
            contador++;
        }
        while(contador<=10);//Condicion del bucle
    }
}
