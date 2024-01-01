package Plantillas_Para_Actividades;

/**
 * Plantilla para crear objetos en POO
 * @author Mparr
 */
public class Objeto {
    private  int atributo1,atributo2;//Añado todo los atributos que me pidan
    private String atributo3,atributo4;
    public   Objeto(int atributo1,int atributo2) {
        this.atributo1=atributo1;
        this.atributo2 = atributo2;
        this.atributo3=atributo3;
        this.atributo4=atributo4;
        /*
        Añado todos los this necesarios
         */
    }
    //Fin metodo constructor 1º
    public Objeto(){
        this.atributo1=0;
        this.atributo2=0;
        this.atributo3="Inserte texto";
        this.atributo4="Inserte otro texto";
        /*
        Este meto constructor asigna directamente valores
         */
    }//Fin metodo constructor 2º

    public void setAtributo1(int atributo1) {
        this.atributo1 = atributo1;
    }//Fin del primer set

    public void setAtributo2(int atributo2) {
        this.atributo2 = atributo2;
    }//Fin del segundo set

    public void setAtributo3(String atributo3) {
        this.atributo3 = atributo3;
    }//Fin del tercer set

    public void setAtributo4(String atributo4) {
        this.atributo4 = atributo4;
    }//Fin del cuarto set

    //Fin de los setters
    public int getAtributo1() {
        return atributo1;
    }//Fin del primer get

    public int getAtributo2() {
        return atributo2;
    }//Fin del segundo get

    public String getAtributo3() {
        return atributo3;
    }//Fin del tercer get

    public String getAtributo4() {
        return atributo4;
    }//Fin del cuarto get
    //Fin de los getters
    //Despues de esto son los procesos
}
