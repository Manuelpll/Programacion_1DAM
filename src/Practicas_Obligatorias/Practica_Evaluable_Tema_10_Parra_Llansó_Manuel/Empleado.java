package Practicas_Obligatorias.Practica_Evaluable_Tema_10_Parra_Llansó_Manuel;

import java.time.LocalDate;

/**
 * Clase Empleado
 * @author Mparr
 */
public class Empleado {
 private String nombre;
 private String apellidos;
 private LocalDate fechaDeNacimiento;
 private LocalDate fechaDeIngreso;
 private String puesto;
 private int salario;

    /**
     * Metodo constructor vacio
     */
 public Empleado(){};//Metodo constructor vacio

    /**
     * Metodo constructor que coge las variables facilitadas
     * @param nombre El nombre del empleado
     * @param apellidos Los apellidos del empleado
     * @param fechaDeNacimiento La fecha de nacimiento del empleado
     * @param fechaDeIngreso La fecha de ingreso del empleado
     * @param puesto El puesto actual del empleado
     * @param salario El salario que cobra el empleado
     */
 public Empleado(String nombre,String apellidos,LocalDate fechaDeNacimiento,LocalDate fechaDeIngreso, String puesto ,int salario){
     this.nombre=nombre;
     this.apellidos=apellidos;
     this.fechaDeNacimiento=fechaDeNacimiento;
     this.fechaDeIngreso=fechaDeIngreso;
     this.puesto=puesto;
     this.salario=salario;
 }//Fin del metodo constructor

    /**
     * Metodo set para añadir  los apellidos
     * @param apellidos Los apellidos que tiene el empleado
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }// Fin de setApellidos

    /**
     * Metodo set para añadir  el nombre
     * @param nombre El nombre que tiene el empleado
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }//Fin de setNombre

    /**
     * Metodo set para añadir la fecha de ingreso
     * @param fechaDeIngreso La fecha en la que empezo ha trabajar en la empresa
     */
    public void setFechaDeIngreso(LocalDate fechaDeIngreso) {
        this.fechaDeIngreso = fechaDeIngreso;
    }//Fin de setFechaDeIngreso

    /**
     * Metodo set para añadir le fecha de nacimiento
     * @param fechaDeNacimiento La fecha en la que nacio el empleado
     */
    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }//Fin de setFechaDeNacimiento

    /**
     * Metodo set para añadir el puesto
     * @param puesto El puesto que ocupa el trabajador
     */
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }//Fin de setPuesto

    /**
     * Metodo set para añadir el salario
     * @param salario El salario que tiene el empleado
     */
    public void setSalario(int salario) {
        this.salario = salario;
    }//Fin de setSalario

    /**
     * Metodo get para utilizar el nombre
     * @return nombre del empleado
     */
    public String getNombre() {
        return nombre;
    }//Fin de getNombre
    /**
     * Metodo get para utilizar el salario
     * @return salario del empleado
     */
    public int getSalario() {
        return salario;
    }//Fin de getSalario
    /**
     * Metodo get para utilizar la fecha de ingreso
     * @return fecha de ingreso del empleado
     */
    public LocalDate getFechaDeIngreso() {
        return fechaDeIngreso;
    }//Fin de getFechaDeIngreso
    /**
     * Metodo get para utilizar el puesto
     * @return puesto del empleado
     */
    public String getPuesto() {
        return puesto;
    }//Fin de getPuesto
    /**
     * Metodo get para utilizar la fecha de nacimiento
     * @return  fecha de nacimiento del empleado
     */
    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }//Fin de getFechaDeNacimiento
    /**
     * Metodo get para utilizar  los apellidos
     * @return apellidos del empleado
     */
    public String getApellidos() {
        return apellidos;
    }//Fin de getApellidos

    /**
     * Metodo toString de la clase
     * @return Toda la informacion del empleado
     */
    @Override
    public String toString(){
        StringBuilder sb= new StringBuilder();
        sb.append("Nombre: ");
        sb.append(nombre);
        sb.append("Apellidos: ");
        sb.append(apellidos);
        sb.append("Fecha de Nacimiento:");
        sb.append(fechaDeNacimiento);
        sb.append("Fecha de Ingreso: ");
        sb.append(fechaDeIngreso);
        sb.append("Puesto: ");
        sb.append(puesto);
        sb.append("Salario: ");
        sb.append(salario);
        return sb.toString();
    }
}
