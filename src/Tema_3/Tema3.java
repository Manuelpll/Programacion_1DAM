package Tema_3;

/**
 * Revisar si ha aprovado o no
 * Manuel
 */
import java.util.Scanner;
public class Tema3 {
    public static void main(String[] args) {
        //Declarar variables
        int nota;
        String resultado;
        //Zona de iniciacion de datos
        Scanner teclado=new Scanner (System.in);
        System.out.print ("Escribe la nota");
        nota = teclado.nextInt ();
        //Zona de procesamiento
        if(nota>=5){
            resultado="APROBADO";
                   
        }
        else {
            resultado="SUSPENSO";
        }
        //ZONA DE SALIDA
        System.out.println("El resutado es "+resultado);
    }
    
}
