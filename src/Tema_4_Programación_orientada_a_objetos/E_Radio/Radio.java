package Tema_4_Programación_orientada_a_objetos.E_Radio;

/**
 * Clase Radio
 */
public class Radio {
    //Declaro variables
    private final int frecuenciMin=80;
    private final int frecuenciaMax=108;
    private double frecuencia;
    /*
    Creo el metodo constructor
     */
    public   Radio() {
         final int frecuenciaMinima=80;
         final int frecuenciaMax=108;
        this.frecuencia=frecuencia;
    }//Fin del metodo constructor

    public void setFrecuencia(double frecuencia) {
        this.frecuencia = frecuencia;
    }//Fin setFrecuencia
    //Fin setters


    public double getFrecuencia() {
        return frecuencia;
    }

    public double getFrecuenciaMax() {
        return frecuenciaMax;
    }

    public double getFrecuenciMin() {
        return frecuenciMin;
    }
    //Fin getters

    //Procesos
    public double SubirFrecuencia(double frecuencia){
        frecuencia+=0.5;
        return frecuencia;
    }
    public double BajarFrecuencia(double frecuencia){
        frecuencia-=0.5;
        return frecuencia;
    }
    public void MostraFrecuencia(){
        System.out.println("La frecuencia actual es: "+frecuencia+" Hz");
    }
}
