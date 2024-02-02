package Tema_6_Estructuras_de_Almacenamiento;

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
                {"Desayuno: Avena cocida con rodajas de plátano y nueces", "\nComida:" + "Ensalada de pollo a la parrilla con espinacas, tomate, aguacate y aderezo de limón con quinoa cocida", "\nCena: "+"Salmón al horno con espárragos y patatas asadas"},
                {"Desayuno: Tostadas integrales con aguacate y para acompañar un batido de frutas con espinacas, plátano, fresas y leche de almendras", "\nComida" + "\nPrimer plato:Ensalada de garbanzos con tomate, pepino y cilantro" + "\nSegundo plato: Pechuga de pollo a la plancha con arroz integral","\nNo cena"},
                {"Desayuno: Tortilla de claras de huevo con espinacas y champiñones acompañado con un zumo de naranja fresco.", "\nComida"+"\nPrimer plato: Sopa de lentejas con verduras. Segundo plato:Pescado a la parrilla con batatas asadas.", "\nCena:Ensalada de quinoa con aguacate, maíz y tomate"},
                {"Desayuno: Yogur griego con granola y frutas del bosque junto con  un té verde.", "\nPrimer plato: Ensalada de col."+ "\nSegundo plato: Tacos de pavo con tortillas de maíz. lechuga y salsa de aguacate.","\n"},
                {"Desayuno: Pan integral con aguacate y huevo pochado acompañado de un batido de proteínas con plátano.", " \nComida" + "\nPrimer plato:Ensalada de quinoa con garbanzos, tomate cherry y aguacate." + "\nSegundo plato:Pescado al horno con espárragos.", "Cena:Tofu salteado con verduras y arroz integral."},
                {"Desayuno: Tostadas de centeno con queso cottage y rodajas de tomate acompañado de un zumo de manzana fresco.", "Primer plato:Ensalada de col rizada." + "\nSegundo plato:Wrap de pollo con espinacas, tomate y salsa de yogur.","\n"},
                {"Desayuno: Batido de bayas con espinacas y proteína en polvo junto con avena con rodajas de plátano.", "\nPrimer plato:Ensalada de atún con garbanzos, pepino y tomate"+"\nSegundo:Arroz integral.", "\nCena:Lasaña de berenjenas con carne magra y queso ricotta."}
        };
        String[] diasSemana = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
        //Zona de salida
        do {
            //Zona de inicializacion , añadir más cosas si es necesario
            Scanner scanner = new Scanner(System.in);
            System.out.println("""
                    Elija una opcion
                    1 -> Saber lo que he desayunado,comido y cenado un dia de la semana
                    2 -> Buscar que dias se ha realizado una comida concreta
                    3  -> Que días no he realizado cena
                    4 -> Resumen comida la semana
                    5 -> Salir""");
            eleccion = scanner.nextInt();

            scanner.nextLine();
            switch (eleccion) {
                case 1:
                        System.out.println("Introduce el día de la semana ");
                        String diaDelaSemana= scanner.nextLine();
                    for (int i = 0; i < diasSemana.length; i++) {
                        if(diaDelaSemana.equalsIgnoreCase(diasSemana[i])){
                            System.out.println("\nAqui tienes el menu del "+diasSemana[i]+":"+"\n"+comidas[i][0]+"\n"+comidas[i][1]+"\n"+comidas[i][2]);
                            break;
                        }else {
                            System.out.println("Dia invalido");
                        }
                    }
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Introduce el día de la semana ");
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
    }//Fin de menu

    public static void imprimirSemana(String[][] comida, String[] diasSemana) {

        for (int i = 0; i < diasSemana.length; i++) {
            System.out.println("Dia de la semana: "+diasSemana[i]);
            for (int j = 0; j < comida[0].length; j++) {
                System.out.print(comida[i][j] + ",");
            }//Fin segundo for
                System.out.println(" ");
            }//Fin primer for
    }//Fin metodo imprimirSemana
    public static void diasNoCena(String[][]comida,String[]diasSemana){
        int contador=0;
        for (int i=0;i<comida.length;i++){
            if (comida[i][2].equals("No cena"))
            contador++;
        }
        System.out.println("No comiste"+contador);
    }

    public static void main (String[]args){
        menu();
        }
}