package Practicas_Obligatorias.Practica_Evaluable_Tema_6_Parra_Llansó_Manuel.actividad_1;


import javax.swing.*;

public class Main {
    public static  void manipulacionDeCadenasDeCaracteres(){
        Cadena cadena =new  Cadena(" ");
        boolean salir= false;
        JOptionPane.showMessageDialog(null,"Esta es una aplicacion para manipular una cadena de caracteres","Inicio",3);
        do {
            JOptionPane.showMessageDialog(null,"La cadena actual es: "+cadena.getCadena());
             int eleccion = Integer.parseInt(JOptionPane.showInputDialog("""
                    Elige una opcion:
                    1 -> Escribir cadena
                    2 -> Mostrar longitud de la cadena
                    3 -> Copiar cadena
                    4 -> Muestra cuantas vocales tiene la cadena
                    5 -> Muestra si tiene el caracter indicado
                    6 -> Muestra si hay una palabra/palabras/silaba en la cadena
                    7-> Convertir la cadena a mayusculas
                    8-> Eliminar las vocales de la cadena
                    0->Salir"""));

            switch (eleccion) {
                case 1:
                    String cadenaEscrita=JOptionPane.showInputDialog(null,"Introduce la cadena");
                    cadena=new Cadena(cadenaEscrita);
                    break;
                case 2:
                    int longitudDeLaCadena=cadena.longitud(cadena.getCadena());
                    JOptionPane.showMessageDialog(null,"La longitud de la cadena es: "+Cadena.getTamaño());
                    break;
                case 3:
                    String  cadenaCopiada=cadena.copiar(cadena.getCadena());
                    JOptionPane.showMessageDialog(null,"Esta es la cadena es la copia de la cadena"+cadenaCopiada);
                    break;
                case 4:
                    int numVocales= Integer.parseInt(cadena.numeroVocales(cadena.getCadena()));
                    JOptionPane.showMessageDialog(null,"El numero de vocales de la cadena es: "+numVocales,"Vocales",3);
                    break;
                case 5:
                    String caracterElegido=JOptionPane.showInputDialog(null,"Introduce el caracter que quieres que compruebe (Inserta un solo caracter)");
                    boolean contieneCaracter= cadena.contieneCaracter(cadena.getCadena(),caracterElegido);
                    if (contieneCaracter){
                        JOptionPane.showMessageDialog(null,"La cadena si contiene "+caracterElegido);
                    }else {
                        JOptionPane.showMessageDialog(null,"La cadena no contiene "+caracterElegido);
                    }//Fin del if-else
                    break;
                case 6:
                    String palabra=JOptionPane.showInputDialog(null,"Introduc una o varias palabras par comprobar en la cadena");
                   boolean comparacion= cadena.contieneCadena(cadena.getCadena(),palabra);
                   if (comparacion){
                   JOptionPane.showMessageDialog(null,"La palabra/palabras/silaba  insertadas  si estan");
                         } else {
                       JOptionPane.showMessageDialog(null,"La palabra/palabras/silaba  insertadas no estan en la cadena");
                   }//Fin del if
                    break;
                case 7:
                    String cadenaMayus=cadena.convertirMayusculas(cadena.getCadena());
                    cadena.escribirCadena(cadenaMayus);
                    break;
                case 8:
                    String cadenaSinVocales =cadena.eliminarVocales(cadena.getCadena());
                    cadena.escribirCadena(cadenaSinVocales);
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null,"Saliendo...","Finalizando",3);
                    salir=true;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, " invalida", "ERROR", 0);
                    break;
            }//Fin del swich
        } while (!salir);
    }//Fin de manipulacionDeCademasDeCaracteres
    public static void main(String[] args) {
        manipulacionDeCadenasDeCaracteres();
    }//Fin del main
}//Fin de Main
