package Tema_5_Desarrollo_de_Clases.B_superClasePersona_con_claseAlumno_y_Profesor;

public class Profesor extends Persona{
    //Atributos propìos
    enum Especialidad{Informatica,administrativo,finanzas}
    private Especialidad especialidad;
    //Metodos constructores
    public Profesor(String nombre,String apellidos,int edad,Especialidad especialidad ){
            this.nombre=nombre;
            this.apellidos=apellidos;
            this.edad=edad;
            this.especialidad=especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }//Fin setEspecialidad

    public Especialidad getEspecialidad() {
        return especialidad;
    }//Fin getEspecilidad

    public void imprimirCabecera(){
        System.out.println("\n--------------" +"\nProfesor: "+nombre+" "+apellidos+"\nEdad: "+edad+" \nEspecilidad: "+especialidad+"\n-------------");
    }//Fin imprimirCabecera
    public void imprimirProfesor(){
        System.out.println(" "+super.getNombre()+" "+super.getApellidos()+" "+super.getEdad()+" "+this.especialidad);
    }//Fin de imprimirProfesor

    @Override
    public String toString(){
        return "Informacion del Profesor:\n"+"Nombre y Apellidos: "+super.getNombre()+" "+super.getApellidos()+"\nEdad: "+super.getEdad()+"\nEspecialidad: "+this.especialidad;
    }
}
