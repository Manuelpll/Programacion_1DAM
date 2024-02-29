package Practicas_Obligatorias.Practica_Evaluable_Tema_6_Parra_Llansó_Manuel.actividad_3;

/**
 * Clase de Alumno
 * @author Mparr
 * @version 1.0
 * @date 29/02/2024
 */
public class Alumno_Clase {
     private String nombre;
     private int nota;

    /**
     * Metodo constructor de Alumno_Clase
     * @param nombre Nombre del alumno
     * @param nota Nota del alumno
     */
     public Alumno_Clase(String nombre, int nota){
         this.nombre=nombre;
         this.nota=nota;
     }//Fin del metodo constructor

    /**
     * Metodo get de Nota
     * @return Nota del alumno
     */
    public int getNota() {
        return nota;
    }//Fin  de get nota

    /**
     * Metodo get de nombre
     * @return Nombre del Alumno
     */
    public String getNombre() {
        return nombre;
    }//Fin de get nombre

    /**
     * Metodo toString
     * @return Una frase mostrando el nombre : nota
     */
    @Override
    public String toString(){
         return nombre+":"+nota;
    }//Fin del toString

    /**
     * Metodo para comparar los alumnos por el nombre
     * @param otroAlumno Objeto Alumno
     * @return Array ordenado alfabeticamente
     */
    public int compareTo(Alumno_Clase otroAlumno) {
        return this.nombre.compareTo(otroAlumno.nombre);
    }//Fin de compareTo para nombres

    /**
     * Metodo para comparar los alumnos por nota
     * @param otroAlumno Objeto Alumno
     * @return Objeto Alumno ordenado por nota desendiente
     */
    public int compararPorNotaDescendente(Alumno_Clase otroAlumno) {
        return Integer.compare(otroAlumno.nota, this.nota);
    }//Fin compareTo para notas
}
