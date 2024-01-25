package Practicas_Obligatorias.Practica_Evaluable_Tema_5_Parra_Llansó_Manuel;
import java.time.LocalDate;
/**
 * Subclase Profesor que tiene como superclase Persona
 * @author Mparr
 * @version 1.0
 * @date 25/01/2024
 */
public class Profesor  extends Persona{
    //Creamos los atributos
    private String cuentaBancariaCorriente;
    private double nomina;

    public Profesor(){}//Fin metodo vacio

    public Profesor( String nombreCompleto, LocalDate fechaDeNacimiento, String DNI, String cuentaBancariaCorriente, double nomina) throws Exception{
        this.nombreCompleto=nombreCompleto;
        this.fechaDeNacimiento=fechaDeNacimiento;
        this.DNI=DNI;
        this.cuentaBancariaCorriente=cuentaBancariaCorriente;
        if (cuentaBancariaCorriente.isEmpty()){
            throw new Exception("Error: cuenta invalida");
        }//Fin if
        this.cuentaBancariaCorriente = cuentaBancariaCorriente;
        this.nomina=nomina;
    }//Fin de metodo constructor

    //Inicio de los metodos set
    public void setCuentaBancariaCorriente(String cuentaBancariaCorriente)throws Exception {
        this.cuentaBancariaCorriente = cuentaBancariaCorriente;
        if (cuentaBancariaCorriente.isEmpty()){
            throw new Exception("Error: cuenta invalida");
        }//Fin if
    }//Fin setCuentaBancariaCorriente

    public void setNomina(double nomina) {
        this.nomina = nomina;
    }//Fin setNomina

    //Inicio de los metodos get


    public String getCuentaBancariaCorriente() {
        return cuentaBancariaCorriente;
    }//Fin getCuentaBancario

    public double getNomina() {
        return nomina;
    }//Fin getNomina

    //Metodos propios

    @Override
    public String toString(){
        return "\n------------------------------"+"\nNombre completo: "+nombreCompleto+"\nFecha de Nacimiento"+fechaDeNacimiento+"\nDNI: "+DNI+"\nCuenta corriente: "+cuentaBancariaCorriente+"\nNomina: "+nomina+"\n------------------------------";
    }//Fin de metodo toString
}//Fin subclase Profesor
