package Tema_4_Programación_orientada_a_objetos.E_Radio;
/**
 * Main de Radio
 */

import Tema_4_Programación_orientada_a_objetos.D_Empleado.Empleado;

import java.util.Scanner;

public class Main {public static void main(String[] args) {
    //Declaro Varables
    int contador = 0;
    int contadorRadio=0;
    int eleccion;
    int eleccionRadio;
    double frecuencia = 0;
    //Zona de Inicialización
    Scanner scanner = new Scanner(System.in);
    //Creo objetos
    Radio AM = new Radio();
    Radio FM = new Radio();
    //Inserto el menu
    do{
    System.out.println("\n1.Radio FM" + "\n2.Radio AM"+"\n3.Salir");
    eleccionRadio = scanner.nextInt();
    switch (eleccionRadio) {
        case 1:
            do {
                System.out.println("\n1.Introducir frecuencia" + "\n2.Subir la Frecuencia" + "\n3.Bajar la Frecuencia" + "\n4.Mostrar la Frecuencia" + "\n5->Salir");
                eleccion = scanner.nextInt();

                switch (eleccion) {
                    case 1:
                        System.out.println("Introduce la frecuencia");
                        frecuencia = scanner.nextDouble();
                        FM.setFrecuencia(frecuencia);
                        break;
                    case 2:
                        if (frecuencia + 0.5 <= AM.getFrecuenciaMax()) {
                            FM.SubirFrecuencia(frecuencia);
                            System.out.println("Se ha subido la frecuencia 0.5");
                        } else {
                            System.out.println("No se puede subir mas");

                        }
                        break;
                    case 3:
                        if (frecuencia - 0.5 >= AM.getFrecuenciMin()) {
                            FM.BajarFrecuencia(frecuencia);
                            System.out.println("Se ha bajado la frecuencia 0.5");
                        } else {
                            System.out.println("No se puede bajar mas");
                        }
                        break;
                    case 4:
                        FM.MostraFrecuencia();
                        break;
                    case 5:
                        System.out.println("Saliendo...");
                        contador++;
                        break;
                    default:
                        System.out.println("Error");
                        break;
                }//Fin del switch FM
            } while (contador == 0);//Fin do-While
            break;
        case 2:
            do {
                System.out.println("\n1.Introducir la Frecuencia" + "\n2.Bajar la Frecuencia" + "\n3.Subir la Frecuencia" + "\n4.Mostrar la Frecuencia" + "\n5.Salir");
                eleccion = scanner.nextInt();

                switch (eleccion) {
                    case 1:
                        System.out.println("Introduce la frecuencia");
                        frecuencia = scanner.nextDouble();
                        AM.setFrecuencia(frecuencia);
                        break;
                    case 2:
                        if (frecuencia + 0.5 <= AM.getFrecuenciaMax()) {
                            AM.SubirFrecuencia(frecuencia);
                            System.out.println("Se ha subido la frecuencia 0.5");
                        } else {
                            System.out.println("No se puede subir mas");
                        }
                        break;
                    case 3:
                        if (frecuencia - 0.5 >= AM.getFrecuenciMin()) {
                            AM.BajarFrecuencia(frecuencia);
                            System.out.println("Se ha bajado la frecuencia 0.5");
                        } else {
                            System.out.println("No se puede bajar mas");
                        }
                        break;
                    case 4:
                        AM.MostraFrecuencia();
                        break;
                    case 5:
                        contador++;
                        break;
                    default:
                        System.out.println("Error");
                        break;
                }//Fin del switch AM
            } while (contador == 0);//Fin do-While2
            break;
        case 3:
            contadorRadio++;
            break;
        default:
            System.out.println("Radio no encontrada");
            break;
    } //Fin swich eleccionRadio
} while (contadorRadio==0);
    scanner.close();
}//Fin del Main
}//Fin del Main de Radio
