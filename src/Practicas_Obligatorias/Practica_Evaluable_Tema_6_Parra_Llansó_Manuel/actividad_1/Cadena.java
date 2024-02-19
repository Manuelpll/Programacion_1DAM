package Practicas_Obligatorias.Practica_Evaluable_Tema_6_Parra_Llansó_Manuel.actividad_1;

public class Cadena {
    private static int tamaño;
    private  String cadena;

    public Cadena(String cadena){
        this.cadena=cadena;
        tamaño=cadena.length();
    }//Fin del metodo constructor
    public static int getTamaño() {
        return tamaño;
    }//Fin de get Tamaño
    public String getCadena() {
        return cadena;
    }//Fin de get Cadena

    public void escribirCadena(String cadena) {
        this.cadena = cadena;
    }//Fin de escribirCadena

    public int longitud(String cadena){
        tamaño=cadena.length();
        return  tamaño;
    }//Fin de longitud

    public  String copiar(String cadena){
       String copia=cadena;
       return copia;
    }//Fin de copiar


   public String numeroVocales(String cadena){
        String vocales="aeiouAEIOUáéíóúÁÉÍÓÚ";
        int numero=0;
        for (int i=0;i<cadena.length();i++){
            char caracterActual = cadena.charAt(i);
            if (vocales.contains(String.valueOf(caracterActual))){
                numero++;
            }//Fin if
        }// Fin for
     return String.valueOf(numero);
   }// Fin de numerosVocales

public  boolean contieneCaracter(String cadena,String caracter){
    return cadena.contains(caracter);
}//Fin de contieneCaracter

public boolean contieneCadena(String cadena, String palabra){
        return cadena.contains(palabra);
}//Fin de contieneCadena

public String convertirMayusculas(String cadena){
        return cadena.toUpperCase();
}//Fin convertirMayusculas

public  String eliminarVocales(String cadena){
        String cadenaSinVocales=" ";
        for ( int i=0;i<cadena.length();i++){
            char c= cadena.charAt(i);
            if (!esVocal(c)){
                cadenaSinVocales += c;
            }//Fin if
        }//Fin for
        return   cadenaSinVocales;
}//Fin eliminarVocales

private  boolean esVocal(char j){
        j= Character.toLowerCase(j);
        return j == 'a' || j == 'e' || j== 'i' || j == 'o' || j == 'u';
}//Fin de esVocal
}//Fin de la clase cadena