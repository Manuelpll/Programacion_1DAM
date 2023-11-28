package Tema_3;
/**
 * Revisar si ha aprovado o no
 * Manuel
 */
import java.util.Scanner;
public class Ejercicio02 {
    public static void main(String[] args) {
        //Declarar variables
        int nota;
        String resultado = null;
        //Zona de iniciacion de datos
        Scanner teclado=new Scanner (System.in);
        System.out.print ("Escribe la nota");
        nota = teclado.nextInt ();
        //Zona de procesamiento
        if(nota==5){
           resultado= "Suficiente";
                   
        }
        else if (nota<=4) {
            resultado="Insuficiente";
        }
        else if (nota==6){
            resultado="Bien";
        }
        else if (nota==7){
            resultado="Notable bajo";
        }
        else if (nota==8){
            resultado="Notable alto";
        }
        else if (nota==9){
            resultado="Sobresaliente bajo";
        }
        else if (nota==10){
            resultado="Sobresaliente alto";
        }
        //ZONA DE SALIDA
        System.out.println("El resutado es "+resultado);
    }
    
}

