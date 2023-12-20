package Tema_4_Programación_orientada_a_objetos.A;
/**
 * Main de la clase Alumno
 * @author Mparr
 */
public class Main_A2 {
    public static void main(String[] args) {
        Alumno alumno1=new Alumno();
        alumno1.setCiudad("Alcorcon");
        alumno1.seteMail("mparrallanson@gmail.com");
        alumno1.setMovil(671350856);
        alumno1.setNombre("Manuel");
        //Obtener valores del objeto
        String Ciudad,eMail,Nombre;
        long Movil;
        Date fecha;
        Ciudad= alumno1.getCiudad();
        eMail= alumno1.geteMail();
        Nombre= alumno1.getNombre();
        Movil= alumno1.getMovil();
        //Aplicamos metodos propio
        boolean esMayordeedad= alumno1.esMayorEdad();//Investigar en vacaciones pero no ponerlo hasta que el profe lo explique
        System.out.println("Nombre:"+Nombre);
        System.out.println("Ciudad en la que vive:"+Ciudad);
        System.out.println("Email:"+eMail);
        System.out.println("Telefono:"+Movil);
        System.out.println("¿Es mayor de edad?"+esMayordeedad);
    }
}
