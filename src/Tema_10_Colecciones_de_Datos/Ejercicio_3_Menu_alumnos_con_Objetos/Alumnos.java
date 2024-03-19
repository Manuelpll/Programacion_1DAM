package Tema_10_Colecciones_de_Datos.Ejercicio_3_Menu_alumnos_con_Objetos;

/**
 * Objeto que con el se creara una lista
 * @author Mparr
 */
public class Alumnos {
    private String nombre;
    private String apellido;
    private int numero;
    //Metodos constructores
    public Alumnos(){

    }
    public Alumnos(String nombre,String apellido,int numero){
        this.nombre=nombre;
        this.apellido=apellido;
        this.numero=numero;
    }
//Metodos publicos Set y Get
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getNumero() {
        return numero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;

    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    @Override
    public String toString(){
        StringBuilder sb= new StringBuilder();
        sb.append("\nNumeros :");
        sb.append(numero);
        sb.append("\nNombre: ");
        sb.append(nombre);
        sb.append("\nApellidos : ");
        sb.append(apellido);
        return sb.toString();
    }
}
