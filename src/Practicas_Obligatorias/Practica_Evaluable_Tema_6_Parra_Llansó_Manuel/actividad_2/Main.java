package Practicas_Obligatorias.Practica_Evaluable_Tema_6_Parra_Llansó_Manuel.actividad_2;

import Programas_hecho_para_practicar.Otras_Posibles_Opciones_a_actividades_de_Clase.ejercicio_3_Maquina_Expendedora.Producto;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void menu() {
        //Zona de declaracion de variables
        int eleccion;
        boolean salir =false;
        Temperatura[][] temperaturas= new Temperatura[30][];
        temperaturas[0][0]= new Temperatura(1,10,2);
        temperaturas[1][0]= new Temperatura(1,10,2);
        temperaturas[2][0]= new Temperatura(1,10,2);
        temperaturas[3][0]= new Temperatura(1,10,2);
        temperaturas[4][0]= new Temperatura(1,10,2);
        temperaturas[5][0]= new Temperatura(1,10,2);
        temperaturas[6][0]= new Temperatura(1,10,2);
        temperaturas[7][0]= new Temperatura(1,10,2);
        temperaturas[8][0]= new Temperatura(1,10,2);
        temperaturas[9][0]= new Temperatura(1,10,2);
        temperaturas[10][0]= new Temperatura(1,10,2);
        temperaturas[11][0]= new Temperatura(1,10,2);
        temperaturas[12][0]= new Temperatura(1,10,2);
        temperaturas[13][0]= new Temperatura(1,10,2);
        temperaturas[14][0]= new Temperatura(1,10,2);
        temperaturas[15][0]= new Temperatura(1,10,2);
        temperaturas[16][0]= new Temperatura(1,10,2);
        temperaturas[17][0]= new Temperatura(1,10,2);
        temperaturas[18][0]= new Temperatura(1,10,2);
        temperaturas[19][0]= new Temperatura(1,10,2);
        temperaturas[20][0]= new Temperatura(1,10,2);
        temperaturas[21][0]= new Temperatura(1,10,2);
        temperaturas[22][0]= new Temperatura(1,10,2);
        temperaturas[23][0]= new Temperatura(1,10,2);
        temperaturas[24][0]= new Temperatura(1,10,2);
        temperaturas[25][0]= new Temperatura(1,10,2);
        temperaturas[26][0]= new Temperatura(1,10,2);
        temperaturas[27][0]= new Temperatura(1,10,2);
        temperaturas[28][0]= new Temperatura(1,10,2);
        temperaturas[29][0]= new Temperatura(1,10,2);
        temperaturas[30][0]= new Temperatura(1,10,2);

        //Zona de inicializacion , añadir más cosas si es necesario
        Scanner scanner = new Scanner(System.in);
        //Zona de salida
        do {
            System.out.println("""
                    **************************
                    Elige una opcion del menu:
                    1 -> Elegir temperatura
                    0->Salir
                    ***************************""");
            eleccion = scanner.nextInt();

            switch (eleccion) {
                case 1:
                    System.out.println("Funciones pedidas");
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    salir=true;
                    break;
                default:
                    System.out.println("Error");
                    break;
            }//Fin switch
        } while (!salir);
    }//Fin de menu
    public static void main(String[] args) {

    }
}
