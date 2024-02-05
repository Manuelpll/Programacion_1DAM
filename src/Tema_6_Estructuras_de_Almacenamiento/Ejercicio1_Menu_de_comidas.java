package Tema_6_Estructuras_de_Almacenamiento;

import java.util.Scanner;

/**
 * Menu con varias opciones que trbaja con lo comido en una semana
 * @author Mparr
 * @version 1.0
 * @date 04/02/2024
 */

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
                {"Desayuno: Tostadas integrales con aguacate y para acompañar un batido de frutas con espinacas, plátano, fresas y leche de almendras", "\nComida" + "\nPrimer plato:Ensalada de garbanzos con tomate, pepino y cilantro" + "\nSegundo plato: Pechuga de pollo a la plancha con arroz integral","\n"},
                {"Desayuno: Tortilla de claras de huevo con espinacas y champiñones acompañado con un zumo de naranja fresco.", "\nComida: "+"\nPrimer plato: Sopa de lentejas con verduras"+ "\nSegundo plato:Pescado a la parrilla con batatas asadas.", "\nCena:Ensalada de quinoa con aguacate, maíz y tomate"},
                {"Desayuno: Yogur griego con granola y frutas del bosque junto con  un té verde."+"\nComida: "+"\nPrimer plato: Ensalada de col."+ "\nSegundo plato: Tacos de pavo con tortillas de maíz. lechuga y salsa de aguacate.","\n"},
                {"Desayuno: Pan integral con aguacate y huevo pochado acompañado de un batido de proteínas con plátano.", " \nComida" + "\nPrimer plato:Ensalada de quinoa con garbanzos, tomate cherry y aguacate." + "\nSegundo plato:Pescado al horno con espárragos.", "Cena:Tofu salteado con verduras y arroz integral."},
                {"Desayuno: Tostadas de centeno con queso cottage y rodajas de tomate acompañado de un zumo de manzana fresco.","\nComida"+"Primer plato:Ensalada de col rizada." + "\nSegundo plato:Wrap de pollo con espinacas, tomate y salsa de yogur.","\n"},
                {"Desayuno: Batido de bayas con espinacas y proteína en polvo junto con avena con rodajas de plátano.", "\nComida: "+"\nPrimer plato:Ensalada de atún con garbanzos, pepino y tomate"+"\nSegundo:Arroz integral.", "\nCena:Lasaña de berenjenas con carne magra y queso ricotta."}
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
                            System.out.print("\nAqui tienes el menu del "+diasSemana[i]+":"+"\n"+comidas[i][0]+"\n"+comidas[i][1]+"\n"+comidas[i][2]);
                            break;
                        }
                    }
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Que comida quieres que se muestre:"+"\n1.Desayuno"+"\n2.Comida"+"\n3.Cena");
                    int mostrar=scanner.nextInt();
                    if(mostrar==1){
                        mostrar= 0;
                        for(int i=0;i<comidas.length;i++){
                            System.out.println(comidas[i][mostrar]);
                        }//Fin for
                    } else if (mostrar==2) {
                        mostrar=mostrar-1;
                        for(int i=0;i<comidas.length;i++){
                            System.out.println(comidas[i][mostrar]);
                        }//Fin for
                    } else if (mostrar==3) {
                        mostrar=mostrar-1;
                        for(int i=0;i<comidas.length;i++){
                            System.out.println(comidas[i][mostrar]);
                        }//Fin for
                    }else {
                        System.out.println("Numero invalido");
                    }//Fin if-else
                    break;
                case 3:
                    diasNoCena(comidas);
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
            }//Fin switch
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
    public static void diasNoCena(String[][]comida){
            int contador = 0;
            for (int i = 0; i < comida.length; i++) {
                if (comida[i] != null && comida[i].length > 2 && "\n".equals(comida[i][2])) {
                    contador++;
                }//Fin if
            } // Fin for
            if(contador<0){
                contador++;
            }//Fin segundo if
            System.out.println("No comiste " + contador + " días sin cenar");
        } // Fin de diasNoCena
    public static void main (String[]args){
        menu();
        }
}