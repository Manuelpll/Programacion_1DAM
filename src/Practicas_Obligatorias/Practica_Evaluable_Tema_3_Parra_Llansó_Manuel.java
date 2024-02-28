package Practicas_Obligatorias;
/**
 *Es una aplicacion capaz de crearte un arbol de navidad por pantalla eligiendo el caracter y la altura que debe tener
 * @author Manuel Parra Llansó
 * @version Version 1.0
 * @date 26/11/2023
 */
import java.util.Scanner;
public class Practica_Evaluable_Tema_3_Parra_Llansó_Manuel {
//Creamos el proceso del menu
    public static int menuprincipal(int eleccion){
       Scanner teclado= new Scanner (System.in);
       System.out.println("Introduce una de las opciones:");
       System.out.println("1.Crear arbol de navidad");
       System.out.println("0.Salir del programa");
       eleccion=teclado.nextInt();
        return eleccion;
    }//fin del proceso menuprincipal
    //Creamos el proceso que creara nuestro sarbol
 public static void arboldenavidad(int alturaCopa,String relleno){
      //Dibujamos la copa del arbol
        for (int f = 0; f < alturaCopa; f++) {
            for (int c = 0; c < 40+alturaCopa - f; c++) {
                System.out.print(" ");//Dibujamos los espacios en blanco de la copa
            }//Fin del segundo for
            for (int k = 0; k < (2 * f + 1); k++) {
                System.out.print(relleno);//Dibujamos la copa del arbol con el sinbolo elegido
            }//Fin del tercer for
            System.out.println(" ");//Saltamos de linea
        }//Fin  del primer for
         //Calculamos la altura del tronco
        int alturaTronco=alturaCopa/3;
        //Dibujamos el tronco del arbol
        for (int f = 0; f < alturaTronco; f++) {//Bajamos las filas necesarias para que nos quede centrado 
            for (int c = 0; c < 40+alturaCopa-1; c++) { 
                System.out.print(" "); //Dibujamos los espacios en blanco de el tronco
            }//Fin del quinto for
            for (int k = 0; k < (alturaCopa/3)+2; k++) { 
                System.out.print(relleno);//Dibujamos el simbolo de el tronco
            }//Fin del sexto for
            System.out.println("");//Saltamos de linea
        }//Fin del cuarto for
            }//fin del proceso arboldenavidad
    public static void main(String[] args) {
        //Declaramos las variables
        int decision=1;
        int altura;
        String caracter;
        int contador=0;
       //Inicializamos los datos
       Scanner teclado= new Scanner (System.in);
       //Salida de los datos
       while(contador<1){
           //Utilizamos el proceso menu principal
      int eleccion= menuprincipal(decision);
      //Utilizamos un switch para llevar al usuario a la opcion que ha elegido
    switch(eleccion){
        case 1 -> { 
            System.out.println("Introduce el caracter que quieres que se rellene el arbol de navidad");
            caracter=teclado.nextLine();
            System.out.println("Introduce la altura del arbol");
            altura= teclado.nextInt();
            teclado.nextLine();
            arboldenavidad(altura,caracter);
                }
        case 0 -> {
            contador++;
            teclado.close();
                }
        default -> System.out.println ("Opcion erronea");
            
    }//Fin del switch
    }//Fin del while
}//Fin del main
}//Fin del programa
