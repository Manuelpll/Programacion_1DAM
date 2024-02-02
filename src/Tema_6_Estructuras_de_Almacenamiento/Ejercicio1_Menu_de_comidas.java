package Tema_6_Estructuras_de_Almacenamiento;

import javax.swing.*;
import java.util.Scanner;

/*Ejercicio 1º
ALMACENAR los desyunos,comidas,cenas que realizas en la semana
Array bidimensional para las comidas
Array para los dias de la semana
Pido un menu con los siguientes opciones:
1- Saber lo que he desayunado,comido y cenado un dia a la semana
2- Buscar que dias se ha realizado una comida concreta
3- Que días no he realizado cena
4- Resumen comida la semana
metodos concretos;
-imprimir dias que ha comido una comida concreta
-Funcion que sume los días que no ha cenado y los muestre por pantalla dichos dias
Nota:no hace falta introducir los datos por teclado
 */
public class Ejercicio1_Menu_de_comidas {

    public static void menu() {
        //Zona de declaracion de variables
        int contador = 0;
        int eleccion;
        String[][] comidas = {
                {"Desayuno: Avena cocida con rodajas de plátano y nueces", "\nComida" + "\nEnsalada de pollo a la parrilla con espinacas, tomate, aguacate y aderezo de limón con quinoa cocida", "Salmón al horno con espárragos y patatas asadas"},
                {"Desayuno: Tostadas integrales con aguacate y para acompañar un batido de frutas con espinacas, plátano, fresas y leche de almendras", "Comida" + "\nPrimer plato:Ensalada de garbanzos con tomate, pepino y cilantro" + "\nSegundo plato: Pechuga de pollo a la plancha con arroz integral"},
                {"Desayuno: Tortilla de claras de huevo con espinacas y champiñones acompañado con un zumo de naranja fresco.", "Primer plato: Sopa de lentejas con verduras. Segundo plato:Pescado a la parrilla con batatas asadas.", "Cena:Ensalada de quinoa con aguacate, maíz y tomate"},
                {"Desayuno: Yogur griego con granola y frutas del bosque junto con  un té verde.", "Primer plato: Ensalada de col. Segundo plato: Tacos de pavo con tortillas de maíz. lechuga y salsa de aguacate."},
                {"Desayuno: Pan integral con aguacate y huevo pochado acompañado de un batido de proteínas con plátano.", " Comida" + "\nPrimer plato:Ensalada de quinoa con garbanzos, tomate cherry y aguacate." + "\nSegundo plato:Pescado al horno con espárragos.", "Cena:Tofu salteado con verduras y arroz integral."},
                {"Desayuno: Tostadas de centeno con queso cottage y rodajas de tomate acompañado de un zumo de manzana fresco.", "Primer plato:Ensalada de col rizada." + "\nSegundo plato:Wrap de pollo con espinacas, tomate y salsa de yogur."},
                {"Desayuno: Batido de bayas con espinacas y proteína en polvo junto con avena con rodajas de plátano.", "Primer plato:Ensalada de atún con garbanzos, pepino y tomate. Segundo:Arroz integral.", "Cena:Lasaña de berenjenas con carne magra y queso ricotta."}
        };
        String[] diasSemana = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
        //Zona de inicializacion , añadir más cosas si es necesario
        Scanner scanner = new Scanner(System.in);
        //Zona de salida
        do {
            System.out.println("""
                    Elija una opcion
                    1 -> Saber lo que he desayunado,comido y cenado un dia de la semana\s
                    2 -> Buscar que dias se ha realizado una comida concreta
                    3  -> Que días no he realizado cena
                    4 -> Resumen comida la semana
                    5 -> Salir""");
            eleccion = scanner.nextInt();

            switch (eleccion) {
                case 1:
                    System.out.println("Funciones pedidas");
                    break;
                case 2:
                    System.out.println("Otra funcion");
                    break;
                case 3:
                    break;
                case 4:
                    imprimirSemana(comidas,diasSemana);
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    contador++;
                    break;
                default:
                    System.out.println("Error");
                    break;
            }
        } while (contador == 0);
        scanner.close();
    }//Fin de menu

    /*public static void imprimirSemana(String[][] comida, String[] diasSemana) {
        for (int e = 0; e < diasSemana.length; e++) {
            System.out.println("Dia de la semana: "+diasSemana[e]);
            for (int j = 0; j < comida.length; j++) {
                for (int i = 0; i < comida[0].length; i++) {
                    System.out.print(comida[j][i] + ",");
                }//Fin tercer for
                System.out.println(" ");
            }//Fin segundo for
        }//Fin primer for
    }//Fin metodo imprimirSemana
     */
    public static void imprimirSemana(String[][] comida, String[] diasSemana) {
        for (int e = 0; e < diasSemana.length; e++) {
            System.out.println("Dia de la semana: " + diasSemana[e]+"\n________________________");
            for (int j = 0; j < comida.length; j++) {
                if (comida[j] != null) { // Verificar si la subarray existe
                    for (int i = 0; i < comida[j].length; i++) {
                        System.out.print(comida[j][i] + ",");
                    }
                    System.out.println(" ");
                }
            }
        }
    }

    public static void main (String[]args){
        menu();
        }
}