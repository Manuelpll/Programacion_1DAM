package Tema_5_Desarrollo_de_Clases.C_Banco;

import javax.swing.JOptionPane;
import java.awt.Component;

public class ejemploMensajes {
    public static void main(String[] args) {
        Component frame= null;
        JOptionPane.showMessageDialog(frame,"Examen de Programación el 4 de marzo");
        JOptionPane.showMessageDialog(frame,"Examen de Programación el 4 de marzo","Illo, es un nicaragüense",2);
        JOptionPane.showMessageDialog(frame,"Examen de Programación el 4 de marzo","Texto de pobre chileno",3);
    }
}
