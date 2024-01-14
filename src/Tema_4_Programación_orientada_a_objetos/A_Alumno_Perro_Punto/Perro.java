package Tema_4_Programación_orientada_a_objetos.A_Alumno_Perro_Punto;

/**
 * Clase Perro con su main
 */
public class Perro {
    String nombre;
    String raza;
    boolean pulgas;

    // Constructor
    public Perro(String nombre, String raza, boolean pulgas) {
        this.nombre = nombre;
        this.raza = raza;
        this.pulgas = pulgas;
    }

    // Método para mostrar información del perro
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Raza: " + raza);
        System.out.println("¿Tiene pulgas? " + pulgas);
    }

    public static void main(String[] args) {
        // Crear un objeto Perro utilizando el constructor
        Perro perrito1 = new Perro("Baloo", "mastin", false);

        // Mostrar información del perro
        perrito1.mostrarInformacion();
    }
}
