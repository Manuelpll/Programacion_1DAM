package Tema_11_Lectura_y_Escritura_de_información.Ejemplo_1;

/**
 * Clase Alumno de la primera explicacion
 * @author  Mparr
 */
public class Alumno {
    private String nombre;

    public Alumno(){}//Fin metodo vacio
    public Alumno(String nombre){
        this.nombre=nombre;

    }//Fin segundo constructor

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }//Fin setNombre

    public String getNombre() {
        return nombre;
    }//Fin getNombre
}//Fin Alumno
