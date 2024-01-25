package Practicas_Obligatorias.Practica_Evaluable_Tema_5_Parra_Llansó_Manuel;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Alumno extends Persona{

    private int  edad;

    //Creamos el constructor
    public Alumno(){};

    public Alumno(LocalDate fechaDeNacimiento, String nombreCompleto, String DNI) {
        super();
        this.nombreCompleto = nombreCompleto;
        this.DNI = DNI;
    }

    public int calcularEdad( LocalDate fechaNacimiento) {
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(fechaNacimiento, fechaActual);
        return  periodo.getYears();
    }

    public int getEdad() {
        return edad;
    }
}
