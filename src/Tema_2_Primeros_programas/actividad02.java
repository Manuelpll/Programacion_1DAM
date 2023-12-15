package Tema_2_Primeros_programas;

/**
 *Valor Absoluto
 * @author Manuel
 */
import java.util.Scanner;
public class actividad02 {
    public static void main(String[] args){
         Scanner teclado = new Scanner(System.in);
        int numero,absoluto;
        System.out.print("Introduce un numero: \n");
        numero=teclado.nextInt();
        absoluto= (numero<0)? -numero:numero;
        System.out.print("\nEl valor de"+numero+"es:"+absoluto+ "\n");
    }
}
