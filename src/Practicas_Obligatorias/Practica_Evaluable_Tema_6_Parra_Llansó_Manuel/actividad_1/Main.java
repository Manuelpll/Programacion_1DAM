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
                    6 -> Muestra un valor dependiendo de lo igual que es la cadena a otra cadena
                    7-> Convertir la cadena a mayusculas
                    8-> Eliminar las vocales de la cadena
                    0->Salir"""));// Comprobar la opcion  6

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
                    break;
                case 4:
                    int numVocales= Integer.parseInt(cadena.numeroVocales(cadena.getCadena()));
                    JOptionPane.showMessageDialog(null,"El numero de vocales de la cadena es: "+numVocales,"Vocales",3);
                    break;
                case 5:
                    String caracterElegido=JOptionPane.showInputDialog(null,"Introduce el caracter que quieres que compruebe (Inserta un solo caracter)");
                    boolean contieneCaracter= cadena.contieneVocal(cadena.getCadena(),caracterElegido);
                    if (contieneCaracter){
                        JOptionPane.showMessageDialog(null,"La cadena si contiene "+caracterElegido);
                    }else {
                        JOptionPane.showMessageDialog(null,"La cadena no contiene "+caracterElegido);
                    }
                    break;
                case 6:
                    String palabra=JOptionPane.showInputDialog(null,"Introduc una o varias palabras par comprobar en la cadena");
                   boolean comparacion= cadena.contieneCadena(cadena.getCadena(),palabra);
                   JOptionPane.showMessageDialog(null,"La cadena insertada  en la comparacion es "+comparacion);
                    //Pendiente de preguntar
                    break;
                case 7:
                    String cadenaMayus=cadena.convertirMayusculas(cadena.getCadena());
                    cadena.setCadena(cadenaMayus);
                    JOptionPane.showMessageDialog(null,"La cadena actual es: "+cadena.getCadena());
                    break;
                case 8:
                    String cadenaSinVocales =cadena.eliminarVocales(cadena.getCadena());
                    cadena.setCadena(cadenaSinVocales);
                    JOptionPane.showMessageDialog(null,"Esta es la cadena actual: "+cadena.getCadena());
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
