package Practicas_Obligatorias.Practica_Evaluable_Tema_4_Parra_LLansó_Manuel;

/**
 *Clase Radio_Digital
 * @author alumno
 */
public class Radio_Digital {
    //Declaro los atributos
    private int frecuencia;
    private String nombre;
    //Creo los metodos constructores
    public Radio_Digital(String nombre, int frecuencia) {
        this.nombre = nombre;
        this.frecuencia = frecuencia;

    }//Fin del metodo constructor

    //Creo los getters
    public int getFrecuencia() {
        return frecuencia;
    }

    public String getNombre() {
        return nombre;
    }
    //Creamos los procesos subirFrecuencia , bajarFrecuencia y RadioExistente
    public boolean radioExistente(){
        boolean frecuenciaCorrecta;
        frecuenciaCorrecta=frecuencia<87.5&&frecuencia>108;
        switch ((int)frecuencia){
            case 94:
            case 98:
            case 105:


        }
        return frecuenciaCorrecta;
    }
    public double subirFrecuencia(double frecuencia){
        frecuencia=frecuencia+0.1;
       if (frecuencia<=93.5&&frecuencia>108){
           System.out.println("Onda Cero");
       } else if (frecuencia==98.0) {
           
       }
        return frecuencia;
    }
    public double bajarFrecuencia(double frecuencia){
        return frecuencia;
    }
}//Fin de la clase
