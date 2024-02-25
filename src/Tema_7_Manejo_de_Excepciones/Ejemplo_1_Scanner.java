package Tema_7_Manejo_de_Excepciones;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * Tratando más excepciones
 * @author Mparll
 */
public class Ejemplo_1_Scanner {
    public static void main(String[] args) {
        int numero =-1;
        int intento=0;
        Scanner teclado = new Scanner(System.in);
        do{
            try {
                System.out.println("Introduce un numero entre 0 y 100");
                    numero=teclado.nextInt();

            }catch (NumberFormatException e) {
                System.out.println("Debe introducir un numero entre 0 y 100");
            }catch (InputMismatchException e){
                System.out.println("Debe introducir un numero");
                teclado.next();
            }finally {
                {
                    intento++;
                }
            }//Fin del try-catch-finally
        }while ((numero<0 || numero>100));
    }//Fin del main
}//Fin de Ejemplo_1_Scanner
