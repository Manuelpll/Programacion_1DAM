package Tema_10_Colecciones_de_Datos;

import java.util.Map;

public class Ejemplo_3_Mapas {
    public static void main(String[] args) {
        Map<Integer,String> mapaDAM1 = Map.of(1,"Teclado",2,"Monitor",3,"CPU");
        mapaDAM1.forEach((clave,valor)->System.out.println(clave+":"+valor));
    }
}
