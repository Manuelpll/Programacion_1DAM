package Tema_4_Programación_orientada_a_objetos.D_Empleado;

/**
 * Clase Empleado
 */
public class Empleado {
    private double sueldo;
    private String nombre;
    public Empleado(String nombre,double salario) {
        this.nombre=nombre;
        this.sueldo=salario;
    }
    //Fin metodo constructor 1º
    public Empleado(){
    }//Fin Metodo vacio

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSueldo(double salario) {
        sueldo= salario;
    }
//Fin setters

    public String getNombre() {
        return nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    //Fin getters

    //Procesos
    public void SubieelSueldo(double porcentaje){
        double subida=sueldo*porcentaje*0.1;
        sueldo=sueldo+subida;
        System.out.println("Ha subido un total de: "+subida);
    }//Fin SubirelSueldo
    public void MostrarDatosdelEmpleado(){
        System.out.println("Se llama "+nombre+" cobra al mes "+sueldo);
    }//Fin MostrarDatosdelEmpleado
}
