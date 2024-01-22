package Tema_4_Programación_orientada_a_objetos.C_Pajaro_Individuo_Fecha_con_Override;
import java.util.Scanner;

/**
 * Test
 * @author Manuel
 * @version 1.0
 * @date: 18/1/2024
 */
public class test {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int dia, mes, año;
        //Solicitamos los datos por teclado
        System.out.println("Cual es el día");
        dia = teclado.nextInt();
        System.out.println("Cual es el mes");
        mes = teclado.nextInt();
        System.out.println("Cual es el año");
        año = teclado.nextInt();
        //Se crea un objeto de tipo Fecha con el parametro constructor
        Fecha fecha1 = new Fecha(dia, mes, año);
        Fecha fecha2 = new Fecha(dia, mes, año);
        //Comprobamos la fecha
        if (fecha1.fechaCorrecta()) {
            System.out.println("Fecha introducida " + fecha1);
        }//Fin if1
        else {
            System.out.println("Fecha incorrecta");
        }//Fin else
        fecha2 = fecha1;
        System.out.println("Fecha segunda: " + fecha2);
        fecha1.setDia(15);
        System.out.println("Fecha1: " + fecha1);
        System.out.println("Fecha2: " + fecha2);

    }//Fin del main}//Fin del class test
}//Fin test
