package Practicas_Obligatorias.Practica_Evaluable_Tema_5_Parra_Llansó_Manuel;

import java.time.LocalDate;

public class Profesor  extends Persona{
    private String cuentaBancariaCorriente;
    private double nomina;

    public Profesor(){}//Fin metodo vacio

    public Profesor( String nombreCompleto, LocalDate fechaDeNacimiento, String DNI, String cuentaBancariaCorriente, double nomina){
        this.nombreCompleto=nombreCompleto;
        this.fechaDeNacimiento=fechaDeNacimiento;
        this.DNI=DNI;
        this.cuentaBancariaCorriente=cuentaBancariaCorriente;
        this.nomina=nomina;
    }//Fin de metodo constructor

    //Inicio de los metodos set


    public void setCuentaBancariaCorriente(String cuentaBancariaCorriente) throws Exception {
        if (cuentaBancariaCorriente.isEmpty()){
            throw new Exception("Error: cuenta invalida");
        }
        this.cuentaBancariaCorriente = cuentaBancariaCorriente;
    }

    public void setNomina(double nomina) {
        this.nomina = nomina;
    }

    //Inicio de los metodos get


    public String getCuentaBancariaCorriente() {
        return cuentaBancariaCorriente;
    }

    public double getNomina() {
        return nomina;
    }
}
