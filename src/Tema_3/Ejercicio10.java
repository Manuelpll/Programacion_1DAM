package Tema_3;

public class Ejercicio10 {
    public static void main(String[] args) {
        String texto = "Hola mundo";
        System.out.println("La longitud es:" + texto.length());
        //Cadenas de carctares comienzan a contar desde el cero hasta longitud-1
        System.out.println(texto.charAt(1));
        //Obtener una palabra de la cadena
        char buffer[] = new char[5];
        texto.getChars(5, 9, buffer, 0);
        System.out.println("El buffet copiado es:" + buffer);
        //Comparaciones
        String nombre1 = "Juan";
        String nombre2 = "juan";
        if (nombre1.equals(nombre2)) {
            System.out.println("Son iguales");

        } else ;
        System.out.println("Son diferntes");
        //Comparaciones CompareTo
        //DEvuelve 0 si ambas cadenas son iguales
        //Devuelve valor negativo Si es el String es menor
        //Devuelve un valor positivo si el String es mayor
        if (nombre1.compareTo(nombre2) == 0) ;
        {
            System.out.println("Son iguales");

        }
        if (nombre1.compareTo(nombre2) > 0) {
            System.out.println("Nombre1 es sería menor que Nombre2");
        } else {
            System.out.println("Nombre1 sería menor que Nombre2");
            //Conversor de variables a string
            System.out.println(String.valueOf(Math.PI));

            //Buscar contenido
            String Stexto = "palabra1 palabra2 palabra3";
            String busqueda = "palabra2";//LO que se quiere buscar
            int contador = 0;
            while (Stexto.indexOf(busqueda)>-1) ;
            {
                Stexto = Stexto.substring(Stexto.indexOf(busqueda) + busqueda.length(), Stexto.indexOf(busqueda));
                contador++;
            }//Fin While
            System.out.println("El contador es:"+contador);
        }//Fin else
    }
}
