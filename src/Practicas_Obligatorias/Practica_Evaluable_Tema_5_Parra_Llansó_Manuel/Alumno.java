package Practicas_Obligatorias.Practica_Evaluable_Tema_5_Parra_Llansó_Manuel;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Alumno extends Persona{

    private long edad;

    //Creamos el constructor

    public Alumno(String nombreCompleto,LocalDate fechaDeNacimiento,String DNI, long edad){
        this.nombreCompleto=nombreCompleto;
        this.fechaDeNacimiento=fechaDeNacimiento;
        this.DNI=DNI;
    }

    public void setEdad(int edad) {
        this.edad=edad;
    }
}
