package Tema_3_Estructuras_de_control_y_Muchos_usos;

/**
 * Revisar si has aprovado o no
 * Manuel
 */
import java.util.Scanner;
public class Tema3_Revisar_si_esta_aprovado_o_no {
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
