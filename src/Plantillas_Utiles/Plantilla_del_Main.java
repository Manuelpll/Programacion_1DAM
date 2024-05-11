package Plantillas_Utiles;
/**
 * Plantilla para el main de uno o varios objetos en POO
 * @author Mparr
 */
public class Plantilla_del_Main {
    public static void main(String[] args) {
        Objeto objeto1= new Objeto();
        /*
        Creamos los objetos necesarios
         */
        objeto1.setAtributo1(4);
        objeto1.setAtributo2(5);
        objeto1.setAtributo3("Indica el texto");
        objeto1.setAtributo4("Otro texto a indicar");
        /*
        Asignamos los valores que me digan
         */
        //Obtener valores del objeto
        int atributo1,atributo2;
        String atributo3,atributo4;
        atributo1=objeto1.getAtributo1();
        atributo2=objeto1.getAtributo2();
        atributo3=objeto1.getAtributo3();
        atributo4=objeto1.getAtributo4();
        //Aplicamos  metodos propios
        System.out.println("Primer atributo: "+atributo1);
        System.out.println("Segundo atributo: "+atributo2);
        System.out.println("Tercer atributo: "+atributo3);
        System.out.println("Cuarto atributo: "+atributo4);

    }
}
