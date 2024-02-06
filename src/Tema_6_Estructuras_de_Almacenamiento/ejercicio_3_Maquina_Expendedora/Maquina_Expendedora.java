package Tema_6_Estructuras_de_Almacenamiento.ejercicio_3_Maquina_Expendedora;

import java.util.Scanner;

public class Maquina_Expendedora {
    public static void menu() {
        //Zona de declaracion de variables
        int eleccion;
        boolean salir = false;
        Bebidas[] bebidas = new Bebidas[5];
        bebidas[0] = new Bebidas("Cocacola", 1, 5);
        bebidas[1] = new Bebidas("Zumo de naranja", 0.75, 5);
        bebidas[2] = new Bebidas("Zumo de pina", 0.70, 5);
        bebidas[3] = new Bebidas("agua mineral con gas", 0.60, 5);
        bebidas[4] = new Bebidas("agua mineral sin gas", 0.60, 5);
        Sandwichs[] sandwichs = new Sandwichs[2];
        sandwichs[0] = new Sandwichs("Vegetal", 2.10, 5);
        sandwichs[1] = new Sandwichs("De pollo", 2.30, 5);
        Dulces[] dulces = new Dulces[3];
        dulces[0] = new Dulces("cookie de chocolate", 0.35, 5);
        dulces[1] = new Dulces("croissant", 0.80, 5);
        dulces[2] = new Dulces("napolitana", 1.25, 5);
        //Zona de inicializacion
        Scanner scanner = new Scanner(System.in);
        //Zona de salida
        do {
            System.out.println("""
                    Elije una opcion:
                    1- Mostrar los productos y sus precios.
                    2- Mostrar  productos y cantidades que quedan.
                    3- Comprar un producto.
                    4- Reponer un producto.
                    Pulsa 0 para salir
                                """);
            eleccion = scanner.nextInt();

            switch (eleccion) {
                case 1:
                    System.out.println("Los productos son los siguientes: ");
                    for (int i = 0; i < sandwichs.length; i++) {
                        System.out.println(sandwichs[i].getNombre() + ": " + sandwichs[i].getPrecio() + " euros ");
                    }
                    for (int j = 0; j < dulces.length; j++) {
                        System.out.println(dulces[j].getNombre() + ": " + dulces[j].getPrecio() + " euros ");
                    }
                    for (int h = 0; h < bebidas.length; h++) {
                        System.out.println(bebidas[h].getNombre() + ": " + bebidas[h].getPrecio() + " euros " );
                    }
                    break;
                case 2:
                    System.out.println("Estos son los productos que quedan: ");
                    for (int i = 0; i < sandwichs.length; i++) {
                        if (sandwichs[i].getCantidad()<0) {
                            System.out.println(sandwichs[i].getNombre() + ": "+sandwichs[i].getCantidad());
                        }
                    }
                    for (int j = 0; j < dulces.length; j++) {
                        if (dulces[j].getCantidad()<0) {
                            System.out.println(dulces[j].getNombre() + ": " + dulces[j].getCantidad());
                        }
                    }
                    for (int h = 0; h < bebidas.length; h++) {
                        if (bebidas[h].getCantidad() < 0) {
                            System.out.println(bebidas[h].getNombre() + ": " + bebidas[h].getCantidad());
                        }
                    }
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    salir = true;
                    break;
                default:
                    System.out.println("Error");
                    break;
            }//Fin switch
        } while (!salir);
    }//Fin de menu


    public static void main(String[] args) {
        menu();
    }
}
