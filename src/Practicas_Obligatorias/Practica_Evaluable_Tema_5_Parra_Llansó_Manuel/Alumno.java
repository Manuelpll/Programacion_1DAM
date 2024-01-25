package Practicas_Obligatorias.Practica_Evaluable_Tema_5_Parra_Llansó_Manuel;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
/**
 * Subclase Alumno que tiene como superclase Persona
 * @author Mparr
 * @version 1.0
 * @date 25/01/2024
 */
public class Alumno extends Persona{
//Creamos un atributo para que calcula la edad que tiene la persona
    Period periodo =Period.between(fechaDeNacimiento,LocalDate.now());
    //Creamos el constructor
    public Alumno(){}//Metodo vacio

    public Alumno(LocalDate fechaDeNacimiento, String nombreCompleto, String DNI) {
        this.nombreCompleto = nombreCompleto;
        this.DNI = DNI;
    }//Fin del metodo constructor

    @Override
    public String toString(){
        return "\n------------------------------"+"\nNombre Completo: "+nombreCompleto+"\nFecha de Nacimiento: "+fechaDeNacimiento+"\nDNI: "+DNI+"\nEdad: "+periodo.getYears()+"\n------------------------------";
    }//Fin del metodo toString

}
