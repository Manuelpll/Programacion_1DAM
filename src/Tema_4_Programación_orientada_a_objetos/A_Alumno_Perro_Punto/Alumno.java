package Tema_4_Programación_orientada_a_objetos.A_Alumno_Perro_Punto;
import java.util.Scanner;
/**
 * Clase Alumno
 * @author Mparr
 *
 */
public class Alumno {
    private String nombre,eMail,ciudad;
    private long movil;
    private boolean mayorEdad;
    public Alumno(){
      this.nombre=nombre;
      this.eMail=eMail;
      this.ciudad=ciudad;
      this.movil=movil;
      this.mayorEdad=mayorEdad;
    }//Fin del metodo constructor

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }


    public void setMovil(long movil) {
        this.movil = movil;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Fin de los setters

    public long getMovil() {
        return movil;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String geteMail() {
        return eMail;
    }

    public String getNombre() {
        return nombre;
    }


    //Fin de los getters
    public boolean esMayorEdad(){
        int edad;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Cuantos años tienes");
        edad= teclado.nextInt();
        if(edad==18){
           mayorEdad=true;
        } else if (edad>18) {
            mayorEdad=true;
        } else if (edad<18) {
            mayorEdad=false;
        }
        return mayorEdad;
    }
}
