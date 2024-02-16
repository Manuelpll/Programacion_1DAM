package Practicas_Obligatorias.Practica_Evaluable_Tema_5_Parra_Llansó_Manuel;

import javax.swing.*;
import java.awt.*;
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
    Component frame;
    private Period periodo;
    //Creamos el constructor
    public Alumno(){}//Metodo vacio

    public Alumno(LocalDate fechaDeNacimiento, String nombreCompleto, String DNI) {
        this.nombreCompleto = nombreCompleto;
        this.DNI = DNI;
        validarDNI(DNI);
        if (fechaDeNacimiento != null) {
            this.periodo = Period.between(fechaDeNacimiento, LocalDate.now());
            this.fechaDeNacimiento=fechaDeNacimiento;
        } else {
            JOptionPane.showMessageDialog(frame,"Advertencia: fechaDeNacimiento esta vacia, no se puede calcular el período.","ERROR",0);
            this.periodo = Period.ZERO;
        }
    }//Fin del metodo constructor

    @Override
    public String toString(){
        return "\n------------------------------"+"\nNombre Completo: "+nombreCompleto+"\nFecha de Nacimiento: "+this.fechaDeNacimiento+"\nDNI: "+DNI+"\nEdad: "+periodo.getYears()+"\n------------------------------";
    }//Fin del metodo toString

}
