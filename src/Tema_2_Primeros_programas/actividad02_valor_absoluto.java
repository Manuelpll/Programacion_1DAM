package Tema_2_Primeros_programas;
import java.util.Scanner;
/**
 *Este programa halla el valor absoluto de un numero
 * @author Mparr
 */
public class actividad02_valor_absoluto {
    /**
     * Metodo principal para ejecutar el codigo
     * @param args Los argumentos de linea de comandos
     */
    public static void main(String[] args){
         Scanner teclado = new Scanner(System.in);
        int numero,absoluto;
        System.out.print("Introduce un numero: \n");
        numero=teclado.nextInt();
        absoluto= (numero<0)? -numero:numero;
        System.out.print("\nEl valor de"+numero+"es:"+absoluto+ "\n");
    }
}
