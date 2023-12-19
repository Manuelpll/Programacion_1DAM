package Tema_4_Programación_orientada_a_objetos.A;

public class Main_A {
    public static void main(String[] args) {
        Punto punto1=new Punto();
        Punto punto2=new Punto();
        Punto punto3=new Punto();
        Punto punto4 =new Punto(3,4);
        punto1=punto4;
        punto2.setX(1);
        punto2.setY(3);
        //Obtener valores del objeto
        int valorX,valorY;
        valorX=punto4.getX();
        valorY=punto4.getY();
        //Aplicar metodos propios
        double moduloP4=punto4.modulo();
        System.out.println("Punto 4: valor de x:"+valorX+"valor de y:"+valorY);
        System.out.println("Modulo:"+moduloP4);
        System.out.println("Fase:"+punto4.fase());
    }
}