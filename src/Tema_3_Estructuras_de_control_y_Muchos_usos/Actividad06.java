package Tema_3_Estructuras_de_control_y_Muchos_usos;
/*
Es un programa que determina si eres adulto o joven y te escriba un mensaje dependiendo del equipo que le digas
 */
import java.util.Scanner;
public class Actividad06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Determinar si una persona es joven o adulta");
        System.out.print("Introduce el nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Introduce los apellidos: ");
        String apellidos = scanner.nextLine();
        System.out.print("Introduce la edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer de entrada

        System.out.print("¿Eres seguidor del Real Madrid o del Atlético de Madrid? (RM/AM/Otro): ");
        String equipo = scanner.nextLine();

        if (edad < 18) {
            System.out.println(nombre + " " + apellidos + " es joven.");
        } else {
            System.out.println(nombre + " " + apellidos + " es adulto.");
        }

        switch (equipo.toLowerCase()) {
            case "rm":
                System.out.println("Está haciendo una mala temporada.");
                break;
            case "am":
                System.out.println("Va primero en la liga 2020-21.");
                break;
            default:
                System.out.println("No está a la altura del Atlético de Madrid.");
                break;
        }

        scanner.close();
    }
}
    

