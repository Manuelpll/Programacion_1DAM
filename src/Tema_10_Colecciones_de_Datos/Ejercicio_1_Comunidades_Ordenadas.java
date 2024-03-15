package Tema_10_Colecciones_de_Datos;

import java.util.Map;
import java.util.TreeMap;

/**
 * Programa que hace una lista de las comunidades autonomas ordenadas
 * @author Mparr
 */
public class Ejercicio_1_Comunidades_Ordenadas {
    public static void main(String[] args) {
        Map<String, String> comunidades = new TreeMap<>();//TreeMap es para ordenar
        comunidades.put("Andalucía", "Sevilla");
        comunidades.put("Aragón", "Zaragoza");
        comunidades.put("Asturias", "Oviedo");
        comunidades.put("Islas Baleares", "Palma de Mallorca");
        comunidades.put("Canarias", "Las Palmas de Gran Canaria /Santa Cruz de Tenerife");
        comunidades.put("Cantabria", "Santander");
        comunidades.put("Castilla-La Mancha", "Toledo");
        comunidades.put("Castilla y León", "Valladolid");
        comunidades.put("Cataluña", "Barcelona");
        comunidades.put("Comunidad Valenciana", "Valencia");
        comunidades.put("Extremadura", "Mérida");
        comunidades.put("Galicia", "Santiago de Compostela");
        comunidades.put("La Rioja", "Logroño");
        comunidades.put("Madrid", "Madrid");
        comunidades.put("Murcia", "Murcia");
        comunidades.put("Navarra", "Pamplona");
        comunidades.put("País Vasco", "Vitoria-Gasteiz");
        for (Map.Entry<String, String> entry : comunidades.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
