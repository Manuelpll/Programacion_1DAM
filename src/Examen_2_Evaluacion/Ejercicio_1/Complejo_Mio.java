package Examen_2_Evaluacion.Ejercicio_1;
/**
 * Clase Complejo
 * @author Mparr
 * @version  1.0
 */
public class Complejo_Mio {
    public double real;
    public String  imag;

    /**
     * Primer metodo contructor
     * @param real La parte real
     * @param imag La parte imaginaria
     */
    public Complejo_Mio(double real, String imag){
        this.real=real;
        this.imag=imag;
    }

    /**
     * Segundo Constructor
     */
    public Complejo_Mio(){
        this.real=0;
        this.imag="0i";
    }

    /**
     * Metodo get de real
     * @return La parte real
     */
    public double getReal() {
        return real;
    }

    /**
     * Metodo get de imag
     * @return La parte imaginaria
     */
    public String getImag() {
        return imag;
    }

    /**
     * Metodo que muestra la parte real
     */
    public void consultaReal(){
        System.out.println("La parte real es: "+real);
    }

    /**
     * Metodo que muestra la parte imaginaria
     */
    public void consultaImaginaria(){
        System.out.println("La parte imaginaria es: "+imag);
    }

    /**
     * Metodo que cambia la parte real
     * @param real La nueva parte real
     * @return El cambio de la antigua a la nueva
     */
    public double cambiaReal(double real){
        return this.real=real;
    }
    /**
     * Metodo que cambia la parte imaginaria
     * @param imag La nueva parte imaginaria
     * @return El cambio de la antigua a la nueva
     */
    public  String cambiaImaginaria(String imag){
        String simbolo="i";
        if(!imag.contains(simbolo)){
            throw new IllegalArgumentException("No puede ser un numero imaginario");
        }//Fin if
        return this.imag=imag;
    }

    /**
     * Metodo que suma dos numeros complejos
     * @param real1 Real del primer numero
     * @param real2 Real del segundo numero
     * @param imag1 Imaginario del primer numero
     * @param imag2 Imaginario del segundo numero
     * @return La suma de ambos complejos
     */
    public  static String suma(double real1, double real2 ,String imag1,String imag2){
        double resultadoReal;
        String  resultadoImaginario;
        resultadoReal=real1+real2;
        resultadoImaginario= imag1+imag2;
        return "Suma a + b: "+resultadoReal+"+"+resultadoImaginario;
    }

    /**
     * Metodo para imprimir un numero complejo
     * @return El numero complejo
     */
    @Override
    public String toString (){
        return "Numero complejo :"+real+"+"+imag;
    }
}
