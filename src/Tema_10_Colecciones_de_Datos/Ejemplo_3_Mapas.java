package Tema_10_Colecciones_de_Datos;

import java.util.Map;

/**
 * Explicacion de alguna accion con mapas
 */
public class Ejemplo_3_Mapas {
    /**
     * Metodo que ejecuta el codigo
     * @param args Los argumentos de la linea de comandos
     */
    public static void main(String[] args) {
        Map<Integer,String> mapaDAM1 = Map.of(1,"Teclado",2,"Monitor",3,"CPU");
        mapaDAM1.forEach((clave,valor)->System.out.println(clave+":"+valor));
    }//Fin de main
}//Fin de Mapas