package Programas_hecho_para_practicar;

import javax.swing.*;
import java.util.Scanner;

public class Menu_con_JoptionPane {
    public static void menu() {
    //Zona de declaracion de variables
    int contador = 0;
    String[] opciones={"Opcion 0-> Una funcion","Opcion 1-> Una funcion","Opcion 2 -> Salir",};//Zona de inicializacion , añadir más cosas si es necesario
    //Zona de salida
    do {
        int eleccion= JOptionPane.showOptionDialog(null,"Elige una opcion","Selecciona",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,opciones,opciones[2]);

        switch (eleccion) {
            case 0:
                JOptionPane.showMessageDialog(null,"Funciones pedidas","Opcion 2",3);
                break;
            case 1:
                JOptionPane.showMessageDialog(null,"Funciones pedidas","Opcion 3",3);
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"Saliendo...","Finalizando programa",3);
                contador++;
                break;
            default:
                JOptionPane.showMessageDialog(null,"Opcion no valida","ERROR",0);
                break;
        }//Fin switch
    } while (contador == 0);
}//Fin de menu

    public static void main(String[] args) {
       Menu_con_JoptionPane.menu();
    }
}

