package Practicas_Obligatorias.Practica_Evaluable_Tema_4_Parra_LLansó_Manuel;

/**
 *Clase Radio_Digital
 * @author Manuel
 * @version 1.0
 * @date 18/1/2024
 */
public class Radio_Digital {
    //Declaro los atributos
    public static int inicio = 0;
    private double frecuencia;
    private String nombre;

    //Creo los metodos constructores
    public Radio_Digital(String nombre, double frecuencia) {
        this.nombre = nombre;
        this.frecuencia = frecuencia;

    }//Fin del metodo constructor

    //Creo los getters
    public double getFrecuencia() {
        return frecuencia;
    }//Fin de getFrecuencia

    public String getNombre() {
        return nombre;
    }//Fin de getNombre
}//Fin del class
