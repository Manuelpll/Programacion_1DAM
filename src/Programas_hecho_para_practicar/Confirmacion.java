package Programas_hecho_para_practicar;

import javax.swing.*;
public class Confirmacion {
    public static void main(String[] args) {

        int respuesta = JOptionPane.showConfirmDialog(null, "¿Estas seguro?", "Decision importante", JOptionPane.YES_NO_OPTION);

        if (respuesta == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null,"Cagaste","F",3);
        }else{
            System.out.println("Elegiste bien");    JOptionPane.showMessageDialog(null,"Elegiste bien","GG",3);
        }
    }
}
