package Tema_5_Desarrollo_de_Clases.B_superClasePersona_con_claseAlumno_y_Profesor;

/**
 * Superclase Persona
 */
public  abstract class Persona {
    //Atributos superclase
    protected   String nombre;

  protected String apellidos;
  protected int edad;

   public Persona(String nombre,String apellidos,int edad){
       this.nombre=nombre;
       this.apellidos=apellidos;
       this.edad=edad;
   }
   public Persona(){}//Fin del metodo vacio

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }//Fin setNombre

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }//Fin setApellido

    public void setEdad(int edad) {
        this.edad = edad;
    }//Fin setEdad

    //Fin setters

    public String getNombre() {
        return nombre;
    }//Fin getNombre

    public String getApellidos() {
        return apellidos;
    }//Fin getApellidos

    public int getEdad() {
        return edad;
    }//Fin getEdad

    //Fin gettes
}
