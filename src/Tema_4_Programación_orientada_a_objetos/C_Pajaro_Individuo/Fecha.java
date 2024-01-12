package Tema_4_Programación_orientada_a_objetos.C_Pajaro_Individuo;

/**
 * Subclase de Individuo
 */
public class Fecha {
    private int dia;
    private int mes;
    private int año;

    public Fecha() {

    }//Fin 1ºconstructor

    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public void setDia(int d) {
        dia = d;
    }

    public void setMes(int m) {
       mes = m;
    }

    public void setAño(int a) {
       año = a;
    }
//Fin setters
    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAño() {
        return año;
    }
    //Fin getters

    //Metodos
    public boolean fechaCorrecta(){
        boolean verificacion=false;
        return verificacion;
    }
    public static boolean Bisiesto(int año) {
        return (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);
    }
    public void diaSiguiente(){

    }
}

