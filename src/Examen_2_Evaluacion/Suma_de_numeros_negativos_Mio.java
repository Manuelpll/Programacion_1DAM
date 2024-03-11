package Examen_2_Evaluacion;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Este programa tiene un menu con varias funciones entorno a los numeros pares
 * @author  Mparr
 * @version  1.0
 */
public class Suma_de_numeros_negativos_Mio {
    static int[][] numerosPares = new int[5][2];

    /**
     * Metodo de un menu
     */
    public static void menu() {
        //Zona de declaracion de variables
        int eleccion;
        boolean salir = false;
        for (int i = 0; i < numerosPares.length; i++) {
            numerosPares[i] = new int[1];
        }//Fin for
        //Zona de inicializacion
        Scanner scanner = new Scanner(System.in);
        //Zona de salida
        do {
            try {
                System.out.println("""
                        1-> Introducir Valores Array
                        2-> Calcular la media
                        3->Calcular la suma
                        4->Mostrar el Array ordenado de menor a mayor
                        0->Salir""");
                eleccion = scanner.nextInt();

                switch (eleccion) {
                    case 1:
                        for (int j = 0; j < numerosPares.length - 1; j++) {
                            for (int i = 0; i < numerosPares.length; i++) {
                                System.out.println("Introduce el  numero: ");
                                int numero = scanner.nextInt();
                                if (numero % 2 == 0) {
                                    numerosPares[i][j] = numero;
                                } else {
                                    System.out.println("No es valido porque no es par");
                                    numerosPares[i][j] = numero - 1;
                                    System.out.println("Se ha puesto el numero anterior al que pusiste porque es par");
                                }//Fin del if-else
                            } //Fin segundo for
                        } //Fin primer for
                        break;
                    case 2:
                        int media = 0;
                        for (int j = 0; j < numerosPares.length; j++) {
                            for (int i = 0; i < numerosPares.length; i++) {
                                media += media + numerosPares[i][j];
                            } //Fin segundo for
                        } //Fin primer for
                        media = media / 10;
                        System.out.println("La media es: " + media);
                        break;
                    case 3:
                        int resultado = 0;
                        System.out.println("""
                                Que quieres ver:
                                1 Suma de negativos
                                2 Suma de positivos
                                3 Suma de todos""");
                        int opcion = scanner.nextInt();
                        if (opcion == 1) {
                            for (int i = 0; i < numerosPares.length; i++) {
                                resultado = resultado + numerosPares[i][0];
                            }//Fin for
                            System.out.println("La suma de todos los numeros es: " + resultado);
                        } else if (opcion == 2) {
                            for (int i = 0; i < numerosPares.length; i++) {
                                resultado = resultado + numerosPares[i][1];
                            }//Fin d for
                            System.out.println("La suma de todos los numeros es: " + resultado);
                        } else if (opcion == 3) {
                            for (int j = 0; j < numerosPares.length; j++) {
                                for (int i = 0; i < numerosPares.length; i++) {
                                    resultado = resultado + numerosPares[j][i];
                                }//fin primer for
                            }//Fin segundo for
                            System.out.println("La suma de todos los numeros es: " + resultado);
                        } else {
                            System.out.println("No existe esta opcion");
                        }//Fin if-else
                        break;
                    case 4:
                        Arrays.sort(numerosPares);
                        System.out.println("Este es el array ordenado de mayor a menor" + Arrays.deepToString(numerosPares));
                        break;
                    case 0:
                        System.out.println("Saliendo...");
                        salir = true;
                        break;
                    default:
                        System.out.println("Error");
                        break;
                }//Fin switch
            }catch (InputMismatchException e){
                System.out.println("Solo puede ser un numero entero");
            }
        } while (!salir);
    }//Fin de menu

    /**
     * Metodo que ejecuta el codigo
     * @param args Los argumentos de la linea de comandos
     */
    public static void main(String[] args) {
        menu();
    }//Fin de main
}//Fin de Suma_de_numeros_negativos