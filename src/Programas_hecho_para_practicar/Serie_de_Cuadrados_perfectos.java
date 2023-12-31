package Programas_hecho_para_practicar;
/**
 * Programa que reliza una serie de los cuadrados perfectos del numero que elije el usuarío al numero que quiera
 *
 */
import java.util.Scanner;
public class Serie_de_Cuadrados_perfectos {
    /*
    Creamos un proceso que genere una serie de numeros donde mostrara el cuadrado perfecto de cada numero
     */
    public  static void serie(){
        //Zona de declarcion de variables
        int numeroinicial;
        int numerofinal;
        int resultado;
        //Zona de inicialización del escaner
        Scanner teclado=new Scanner(System.in);
        //Zona de salida
        System.out.println("¿Por que numero quieres que empiece la serie?");
        numeroinicial= teclado.nextInt();
        System.out.println("¿Hasta que numero va ha continuar la serie?");
        numerofinal= teclado.nextInt();
        for(int i=numeroinicial;i<numerofinal+1;i++){
            resultado=numeroinicial*numeroinicial;
            System.out.print(resultado);
            numeroinicial++;
            if(numeroinicial<numerofinal+1){
                System.out.print(",");
            }//Fin del if

        }//Fin del for

    }//Fin del proceso serie
        /*
        Creamos el main y llamamos al proceso anteriormente creado
         */
    public static void main(String[] args) {
        serie();
    }

}//Fin de la clase
