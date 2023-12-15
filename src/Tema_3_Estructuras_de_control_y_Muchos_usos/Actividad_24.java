package Tema_3_Estructuras_de_control_y_Muchos_usos;
import java.util.Scanner;

public class Actividad_24 {
    public static void serie1 (int n) {
        int i, j;
        for(i=1;i<=n;i++) {
            for(j=1;j<=i;j++) {
            if(j<i) System.out.print(i+",");
            else System.out.print(i);
            }//fin for
	        System.out.print(";");
        }//fin for
    }//fin procedimiento
    public static void serie2 (int n) {
        char i, j;
        for(i='a';i<n+'a';i++) {
            for(j='a';j<=i;j++) {
            if(j<i) System.out.print(i+",");
            else System.out.print(i);
            }//fin for
	        System.out.print(";");
        }//fin for
    }//fin procedimiento
    public static void serie2B (int n) {
        char i, j;
        for(i = 'A'; i < n + 'A' ; i++) {
            for(j='A';j<=i;j++) {
            if(j<i) System.out.print(i+", ");
            else System.out.print(i);
            }//fin for
	        System.out.print(";");
        }//fin for
        System.out.println();
    }//fin procedimiento
    public static void serie3 (int n) {
        int i;
        for(i = 1; i <= n; i++) {
            if(i % 2 == 0) System.out.print("1, ");
            else if (i % 2 == 0 && i + 1 == n) System.out.print("1\n");
            else if (i % 2 != 0 && i < n) System.out.print("-1, ");
            else System.out.print("-1\n");
        }//fin for
    }//fin procedimiento
    public static void serie4 (int n) {
        /* int serie = 1, serieant = 0;
        String cadena = "";
        for(int i = 1; i <= n; i+=2) {
            serieant = serie;
            serie +=4;
            cadena = Integer.toString(serieant);
            cadena = cadena.concat(" "+Integer.toString(serie));
            serieant = serie;
            serie -=2;
            cadena = Integer.toString(serieant);
            cadena = cadena.concat(" "+Integer.toString(serie));
            }
            System.out.println(cadena); */
    } // fin procedimiento
    public static void serie4b (int n) {
        String cadena = "1 5 3 7 5 9 7 11 9 13";
        String[] partes = cadena.split(" ");
        for (int i = 0; i<=n;i++) {
            if(i==n) System.out.print(partes[i]+"\n");
            else System.out.print(partes[i]+" ");
        }
    }//fin procedimiento
    public static void menu (int opcion, char opcion2, int n) {
        //while (opcion!=0) {
            switch (opcion){
                case 0: 
                System.out.println("Saliendo...");
                break;
                case 1:
                    serie1(n);
                    break;
                case 2:
                    switch (opcion2) {
                        case 'M':
                            serie2B(n);
                            break;
                        case 'm':
                            serie2(n);
                            break;
                        default:
                            System.out.println("ERROR: Elija una opción válida.");
                            break;
                    }
                    break;
                case 3:
                    serie3(n);
                    break;
                case 4:
                    switch (Character.toUpperCase(opcion2)) {
                        case 'A':
                            serie4(n);
                            break;
                        case 'B':
                            serie4b(n);
                            break;
                        default:
                            System.out.println("Elija una opción válida.");
                            break;
                    } //fin switch serie4
            }//fin switch menu
        //}//fin while
    }//fin procedimiento
    public static void main(String[] args) {
        int n, opcion;
        char opcion2 = 'a';
        System.out.print("Introduce el numero de elementos: ");
        Scanner in = new Scanner(System.in);
		n = in.nextInt();
        System.out.print("1. Serie 1.\n2. Serie 2 y 2B.\n3. Serie 3.\nOpción 4: Serie 4 y 4B.\n0. Salir\nElija su opción: ");
        opcion = in.nextInt();
        if (opcion == 2) {
            System.out.print("\nEscriba 'M' si desea la serie en mayúsculas, 'm' si la desea en minúsculas: ");
            opcion2 = in.next().charAt(0);
        } else if (opcion == 4) {
            System.out.print("\nEscriba 'A' si desea la primera serie, 'B' si desea la segunda: ");
            opcion2 = in.next().charAt(0);
        }
        menu(opcion, opcion2, n);
    }//fin main
}//fin clase
