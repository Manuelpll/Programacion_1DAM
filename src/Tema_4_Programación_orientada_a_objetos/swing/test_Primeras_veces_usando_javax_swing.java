package Tema_4_Programación_orientada_a_objetos.swing;
import javax.swing.*;

/**
 * Primeras veces con javax swing
 * @author Manuel
 */
public class test_Primeras_veces_usando_javax_swing {
    public static void main(String[] args) {
        //Declaramos las variables y metemos datos
        String usuario = JOptionPane.showInputDialog("Introduza su nombre");
        String edad = JOptionPane.showInputDialog("Introduzca su edad");
        //Salida de informacion
        System.out.println("Su nombre es:"+usuario);
        int edad1= Integer.parseInt(edad);
        System.out.println("Edad: "+edad);

    }
}
