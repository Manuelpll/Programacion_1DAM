package Tema_3;

import java.util.Scanner;
public class ActividadJuegoDiptongos_Forma_compleja {
    public static Scanner teclado = new Scanner(System.in);

    public static String peticionFrase(){
        System.out.print("Introduzca su frase y le diremso los diptongos y hiatos que hay en ella: ");
        String frase = teclado.nextLine();
        System.out.println("");
        return frase;
    }

    public static String[] separacionPalabras(String frase){
        String[] palabras = frase.split(" ");
        return palabras;
    }

    public static boolean hayDiptongo(String palabra){
        boolean hayDiptongo = false;
        for(int i = 0; i<palabra.length(); i++){
            if(i<palabra.length()-1){
                //Comprobamos si hay dos vocales cerradas seguidas
                if(Character.toLowerCase(palabra.charAt(i)) == 'i' && Character.toLowerCase(palabra.charAt(i+1)) == 'u'){
                    hayDiptongo = true;
                }
                else if(Character.toLowerCase(palabra.charAt(i)) == 'u' && Character.toLowerCase(palabra.charAt(i+1)) == 'i'){
                    hayDiptongo = true;
                }
                //Comprobamos si hay una vocal abierta seguida o precedida de una vocal cerrada (sin ser la cerrada tónica)
                else if(Character.toLowerCase(palabra.charAt(i)) == 'a' && (Character.toLowerCase(palabra.charAt(i+1)) == 'u'||Character.toLowerCase(palabra.charAt(i+1)) == 'i')){
                    hayDiptongo = true;
                }
                else if(Character.toLowerCase(palabra.charAt(i)) == 'e' && (Character.toLowerCase(palabra.charAt(i+1)) == 'u'||Character.toLowerCase(palabra.charAt(i+1)) == 'i')){
                    hayDiptongo = true;
                }
                else if(Character.toLowerCase(palabra.charAt(i)) == 'o' && (Character.toLowerCase(palabra.charAt(i+1)) == 'u'||Character.toLowerCase(palabra.charAt(i+1)) == 'i')){
                    hayDiptongo = true;
                }
                else if(Character.toLowerCase(palabra.charAt(i+1)) == 'a' && (Character.toLowerCase(palabra.charAt(i)) == 'u'||Character.toLowerCase(palabra.charAt(i)) == 'i')){
                    hayDiptongo = true;
                }
                else if(Character.toLowerCase(palabra.charAt(i+1)) == 'e' && (Character.toLowerCase(palabra.charAt(i)) == 'u'||Character.toLowerCase(palabra.charAt(i)) == 'i')){
                    hayDiptongo = true;
                }
                else if(Character.toLowerCase(palabra.charAt(i+1)) == 'o' && (Character.toLowerCase(palabra.charAt(i)) == 'u'||Character.toLowerCase(palabra.charAt(i)) == 'i')){
                    hayDiptongo = true;
                }
            }
        }
        return hayDiptongo;
    }

    public static boolean hayHiato(String palabra){
        boolean hayHiato = false;
        for(int i = 0; i<palabra.length(); i++){
            if(i<palabra.length()-1){
                //Comprobamos si hay dos vocales iguales seguidas
                if((Character.toLowerCase(palabra.charAt(i)) == 'a')&&(Character.toLowerCase(palabra.charAt(i+1)) == 'a')){
                    hayHiato = true;
                }
                else if((Character.toLowerCase(palabra.charAt(i)) == 'e')&&(Character.toLowerCase(palabra.charAt(i+1)) == 'e')){
                    hayHiato = true;
                }
                else if((Character.toLowerCase(palabra.charAt(i)) == 'i')&&(Character.toLowerCase(palabra.charAt(i+1)) == 'i')){
                    hayHiato = true;
                }
                else if((Character.toLowerCase(palabra.charAt(i)) == 'o')&&(Character.toLowerCase(palabra.charAt(i+1)) == 'o')){
                    hayHiato = true;
                }
                else if((Character.toLowerCase(palabra.charAt(i)) == 'u')&&(Character.toLowerCase(palabra.charAt(i+1)) == 'u')){
                    hayHiato = true;
                }
                //Comprobamos si hay dos vocales abiertas seguidas
                else if((Character.toLowerCase(palabra.charAt(i)) == 'a')&&((Character.toLowerCase(palabra.charAt(i+1)) == 'e')||(Character.toLowerCase(palabra.charAt(i+1)) == 'o'))){
                    hayHiato = true;
                }
                else if((Character.toLowerCase(palabra.charAt(i)) == 'e')&&((Character.toLowerCase(palabra.charAt(i+1)) == 'a')||(Character.toLowerCase(palabra.charAt(i+1)) == 'o'))){
                    hayHiato = true;
                }
                else if((Character.toLowerCase(palabra.charAt(i)) == 'o')&&((Character.toLowerCase(palabra.charAt(i+1)) == 'a')||(Character.toLowerCase(palabra.charAt(i+1)) == 'e'))){
                    hayHiato = true;
                }
                //Comprobamos si hay bocal cerrada tónica seguida o precedida de vocal abierta átona
                else if((Character.toLowerCase(palabra.charAt(i)) == 'í')&&((Character.toLowerCase(palabra.charAt(i+1)) == 'a')||(Character.toLowerCase(palabra.charAt(i+1)) == 'e')||(Character.toLowerCase(palabra.charAt(i+1)) == 'o'))){
                    hayHiato = true;
                }
                else if((Character.toLowerCase(palabra.charAt(i)) == 'ú')&&((Character.toLowerCase(palabra.charAt(i+1)) == 'a')||(Character.toLowerCase(palabra.charAt(i+1)) == 'e')||(Character.toLowerCase(palabra.charAt(i+1)) == 'o'))){
                    hayHiato = true;
                }
                else if((Character.toLowerCase(palabra.charAt(i+1)) == 'í')&&((Character.toLowerCase(palabra.charAt(i+1)) == 'a')||(Character.toLowerCase(palabra.charAt(i+1)) == 'e')||(Character.toLowerCase(palabra.charAt(i+1)) == 'o'))){
                    hayHiato = true;
                }
                else if((Character.toLowerCase(palabra.charAt(i+1)) == 'ú')&&((Character.toLowerCase(palabra.charAt(i+1)) == 'a')||(Character.toLowerCase(palabra.charAt(i+1)) == 'e')||(Character.toLowerCase(palabra.charAt(i+1)) == 'o'))){
                    hayHiato = true;
                }
            }
        }
        return hayHiato;
    }

    public static void impresion(String[] palabras){
        int cantidadDiptongos = 0;
        int cantidadHiatos = 0;
        
        for(int i = 0; i<palabras.length; i++){
            if(hayDiptongo(palabras[i]) && hayHiato(palabras[i])){
                cantidadDiptongos ++;
                cantidadHiatos ++;
                System.out.println(palabras[i] + " tiene diptongo y hiato");
            } 
            else if(hayDiptongo(palabras[i])){
                cantidadDiptongos ++;
                System.out.println(palabras[i] + " tiene diptongo");
            }
            else if(hayHiato(palabras[i])){
                cantidadHiatos ++;
                System.out.println(palabras[i] + " tiene hiato");
            }
            else{
                System.out.println(palabras[i] + " no tiene diptongo ni hiato");
            }
        }
        System.out.println("\nHay " + cantidadDiptongos + " diptongos");
        System.out.println("Hay " + cantidadHiatos + " hiatos\n");
    }

    public static void main(String[] args){
        impresion(separacionPalabras(peticionFrase()));
    }
}
