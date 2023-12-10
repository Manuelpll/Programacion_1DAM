package Tema_3_Estructuras_de_control_y_Muchos_usos;
/**
 * crear un procedimiento donde el usuario introduzca el numero de elementos,y se guarden en un array(utilizando proceso)
 */

import java.util.Scanner;
public class Actividad22 {
    public static void serie(int num){
        int serie [];
        serie=new int[num];
        serie[0]=1;
        for(int i=1;i<=num-1;i++){
            if(i%2 ==0){
                serie[i-1]=serie[i-2]+4;
            }
            else if(i%2 !=0 && i!=1){
                serie[i-1]=serie[i-3]+2;
            }
        }//fin for
        for (int j:serie){
            System.out.print(j+" ");

        }//Fin foreach
    }
    public static void main(String[] args) {
        Scanner teclado =new Scanner(System.in);
        System.out.println("Cuantos valores va a introducir");
        int num= teclado.nextInt();
        serie(num);
    }
}
