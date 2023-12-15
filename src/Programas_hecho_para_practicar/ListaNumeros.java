package Programas_hecho_para_practicar;
/*
Es un programa que escribe una lista descendiente personalizada
 */
import java.util.Scanner;
public class ListaNumeros {
    public static int  men2() {
        int ultimo_numero;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Inserta el ultimo numero de la lista");
        ultimo_numero= teclado.nextInt();
        return ultimo_numero;
    }
    public static int  menu1() {
        int primer_numero;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Inserta el primer numero de la lista");
        primer_numero= teclado.nextInt();
        return primer_numero;
    }
    public static int lista(int primer_numero, int ultimo_numero) {
        do {
            System.out.print(primer_numero);
            primer_numero--;
            if (primer_numero >= ultimo_numero) {
                System.out.print(",");
            }//End os if
        } while (primer_numero > ultimo_numero - 1);
        return primer_numero;}//End of do-while
    public static void main(String[] args) {
        int primer_numero = menu1();
        int ultimo_numero = men2();
          if(primer_numero<ultimo_numero){
              System.out.println("Orden no valido");
          }
        lista(primer_numero, ultimo_numero);
    }//End of main
        }//End of class