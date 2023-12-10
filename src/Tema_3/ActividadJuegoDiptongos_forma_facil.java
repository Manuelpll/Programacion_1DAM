package Tema_3;
import java.util.Scanner;

//Programa que determine a partir de cadena cuántos diptongos tiene. Vocales cerradas o vocales abiertas y cerradas. Cerradas: i, u.
public class ActividadJuegoDiptongos_forma_facil {
    public static void main(String[] args) {
        String sTexto;
        String [] busqueda = new String[] {"ai", "au", "ei", "eu", "ii", "ia", "ie", "io", "iu", "oi", "ou", "ui", "uu", "ua", "ue", "uo"};
        String prueba;  
        int contador = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca una frase: ");
        sTexto = teclado.nextLine();
        sTexto = sTexto.toLowerCase();
        for (int i = 0; i<busqueda.length; i++) {
            prueba = busqueda[i];
            if (sTexto.indexOf(prueba) > -1) {
            contador++;
            } //fin del if
        }
        System.out.println("En la frase hay "+contador+" diptongos.");
    }
}