package Tema_3_Estructuras_de_control_y_Muchos_usos;

/**
 *
 * @author Mparr
 */
public class Ejercicio08_Tabla_de_multiplicar_con_while {
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
