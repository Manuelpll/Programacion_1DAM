package Tema_4_Programación_orientada_a_objetos;

public class Main_B {
    public static void main(String[] args) {
        NumerosNaturales numerin= new NumerosNaturales();
        int Maximo,Inicial;
        numerin.setInicial(4);
        numerin.setMaximo(9);
        //Obtener valores del objeto
        Maximo=numerin.getMaximo();
        Inicial=numerin.getInicial();
        //Aplicar metodos propios
        numerin.ImprimirRangoInverso();
        numerin.imprimirRango();
    }
}
