package Tema_7_Manejo_de_Excepciones;

public class Ejemplo_2B {
    static final int CONSTANTE=5;

    public static int divide (int dividendo, int divisor) {
        if (divisor==0) {
            throw new IllegalArgumentException("División incorrecta");
        }
        else {
            return (dividendo/divisor);
        }
    }//Fin metodo divide
    public static void main(String[] args) {
        try{
            int c,d;
            c=0;
            d=divide(CONSTANTE,c);
            System.out.println("Valor división: "+d);
        }catch(IllegalArgumentException e3)  {
            e3.printStackTrace();
            System.out.println("Error: "+e3.getMessage());
        }

    }
}
