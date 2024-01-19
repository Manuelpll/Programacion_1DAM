package Tema_5_Desarrollo_de_Clases;
import javax.swing.*;
public class Main {
    public static void main(String[] args) throws Exception {
        DNI Juan= new DNI();
        String nif = JOptionPane.showInputDialog("Introduza tu NIF");
        Juan.establecer(nif);
        System.out.println("El NIF es: "+Juan.obtenerNIF());
        DNI Sara= new DNI();
        int dni= Integer.parseInt(JOptionPane.showInputDialog("Introduce el DNI"));
        Sara.establecer(dni);
        String NIF = Sara.obtenerNIF();
        System.out.println("El DNI obtenido es:"+NIF);
    }
}
