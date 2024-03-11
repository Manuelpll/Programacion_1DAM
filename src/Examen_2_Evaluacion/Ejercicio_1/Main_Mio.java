package Examen_2_Evaluacion.Ejercicio_1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Programa que pueba las funciones de la clase complejo
 * @author Mparr
 * @version 1.0
 */
public class Main_Mio {
    /**
     * Metodo que pone el menu
     */
    public static void menu() {
        //Zona de inicializacion , añadir más cosas si es necesario
        Scanner scanner = new Scanner(System.in);
        //Zona de declaracion de variables
        System.out.println("Introduce la parte real del primer numero complejo");
        double real1= scanner.nextDouble();
        System.out.println("Introduce la parte imaginaria del primer numero complejo");
        String imag1=scanner.nextLine();
        scanner.nextLine();
        Complejo_Mio numero1=new Complejo_Mio(real1,imag1);
        System.out.println("Introduce la parte real del primer numero complejo");
        double real2= scanner.nextDouble();
        System.out.println("Introduce la parte imaginaria del primer numero complejo");
        String imag2=scanner.nextLine();
        scanner.nextLine();
        Complejo_Mio numero2= new Complejo_Mio(real2,imag2);
        int eleccion;
        boolean salir =false;
        //Zona de salida
        do {
            try {
                System.out.println("""
                        1-> Cosulta real
                        2-> Consulta imaginaria
                        3-> Cambiar el real
                        4-> Cambiar la parte imaginaria
                        5-> Imprimir El numero complejo
                        6-> Sumar los dos numeros complejos
                        0->Salir""");
                eleccion = scanner.nextInt();

                switch (eleccion) {
                    case 1:
                        System.out.println("¿Que numero quieres ver?");
                        int numR = scanner.nextInt();
                        if (numR == 1) {
                            numero1.consultaReal();
                        } else if (numR == 2) {
                            numero2.consultaReal();
                        } else {
                            System.out.println("No existe ese numero");
                        }//Fin if-else
                        break;
                    case 2:
                        System.out.println("¿Que numero quieres ver?");
                        int numI = scanner.nextInt();
                        if (numI == 1) {
                            numero1.consultaImaginaria();
                        } else if (numI == 2) {
                            numero2.consultaImaginaria();
                        } else {
                            System.out.println("No existe ese numero");
                        }//Fin if-else
                        break;
                    case 3:
                        System.out.println("De que numero quieres cambiar la parte real:");
                        int numRc = scanner.nextInt();
                        if (numRc == 1) {
                            System.out.println("Cual quieres que sea el nuevo real ?");
                            real1 = scanner.nextDouble();
                            numero1.cambiaReal(real1);
                        } else if (numRc == 2) {
                            System.out.println("Cual quieres que sea el nuevo real ?");
                            real2 = scanner.nextDouble();
                            numero2.cambiaReal(real2);
                        } else {
                            System.out.println("No existe ese numero");
                        }//Fin if-else
                    case 4:
                        System.out.println("De que numero quieres cambiar la parte real:");
                        int numIc = scanner.nextInt();
                        if (numIc == 1) {
                            System.out.println("Cual quieres que sea el nuevo imaginario ?");
                            imag1 = scanner.nextLine();
                            numero1.cambiaImaginaria(imag1);
                        } else if (numIc == 2) {
                            System.out.println("Cual quieres que sea el nuevo imaginario ?");
                            imag2 = scanner.nextLine();
                            numero2.cambiaImaginaria(imag2);
                        } else {
                            System.out.println("No existe ese numero");
                        }//Fin if-else
                        break;
                    case 5:
                        System.out.println("De que numero quieres ver el numero complejo");
                        int numC = scanner.nextInt();
                        if (numC == 1) {
                            numero1.toString();
                        } else if (numC == 2) {
                            numero2.toString();
                        } else {
                            System.out.println("No existe ese numero");
                        }//Fin if-else
                    case 6:
                        Complejo_Mio.suma(numero1.getReal(), numero2.getReal(), numero1.getImag(), numero2.getImag());
                    case 0:
                        System.out.println("Saliendo...");
                        salir = true;
                        break;
                    default:
                        System.out.println("Error");
                        break;
                }//Fin switch
            }catch (InputMismatchException e){
                System.out.println("Solo puede poner numeros enteros");
            }
        } while (!salir);
    }//Fin de menu

    /**
     * Metodo que ejecuta el codigo
     * @param args Los argumentos de la linea de comandos
     */
    public static void main(String[] args) {
         menu();
    }//Fin del main
}//Fin de Main