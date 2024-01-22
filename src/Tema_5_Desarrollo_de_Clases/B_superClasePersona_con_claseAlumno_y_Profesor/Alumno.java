package Tema_5_Desarrollo_de_Clases.B_superClasePersona_con_claseAlumno_y_Profesor;

/**
 * Subclase Alumno
 */
public class Alumno extends Persona {
    //Atributos propios
    private int NIA;

    //Creo Metodos constructores
    public Alumno(String nombre,String apellido, int edad,int NIA){
        this.nombre=nombre;
        this.apellidos=apellido;
        this.edad=edad;
        this.NIA=NIA;
    }

    public void setNIA(int NIA) {
        this.NIA = NIA;
    }//Fin setNiA

    public int getNIA() {
        return NIA;
    }//Fin getNIA
    public void imprimirCabecera(){
        System.out.println("\n-------------" +"\nAlumno "+nombre+" "+apellidos+"\nEdad: "+edad+"\nNIA: "+NIA+"\n-------------");
    }//Fin imprimirCabecera
    public void imprimirAlumno(){
        System.out.println(" "+Alumno.super.getNombre()+" "+Alumno.super.getApellidos()+" "+Alumno.super.getEdad()+" "+Alumno.this.NIA);
    }//Fin imprimirAlumno
    @Override
    public String toString(){
        return "Informacion del Alumno:\n"+"Nombre y Apellidos: "+super.getNombre()+" "+super.getApellidos()+"\nEdad: "+super.getEdad()+"\nNIA: "+this.NIA;
    }
}//Fin subclase Alumno
