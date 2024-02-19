package Practicas_Obligatorias.Practica_Evaluable_Tema_6_Parra_Llansó_Manuel.actividad_1;

public class Cadena {
    private static int tamaño;
    private  String cadena;

    public Cadena(String cadena){
        this.cadena=cadena;
        tamaño=cadena.length();
    }

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    public static int getTamaño() {
        return tamaño;
    }

    public void escribirCadena(String cadena) {
        this.cadena = cadena;
    }
    public int longitud(String cadena){
        tamaño=cadena.length();
        return  tamaño;
    }
    public  String copiar(String cadena){
       String copia=cadena;
       return copia;
    }

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
   }
public  boolean contieneVocal(String cadena,String caracter){
    return cadena.contains(caracter);
}

public boolean contieneCadena(String cadena, String palabra){
        return cadena.contains(palabra);
}

public String convertirMayusculas(String cadena){
        return cadena.toUpperCase();
}
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
public  boolean esVocal(char j){
        j= Character.toLowerCase(j);
        return j == 'a' || j == 'e' || j== 'i' || j == 'o' || j == 'u';

}//Fin de esVocal
}//Fin de la clase cadena