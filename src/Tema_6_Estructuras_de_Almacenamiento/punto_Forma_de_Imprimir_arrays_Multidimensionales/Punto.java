package Tema_6_Estructuras_de_Almacenamiento.punto_Forma_de_Imprimir_arrays_Multidimensionales;

/**
 * Clase punto para luego utilizarlo en un arra irregular
 */
public class Punto {
    int x=0;
    int y=0;
    public Punto(int x,int y){
        this.x=x;
        this.y=y;
    }//Fin metodo contructor

    @Override
    public String toString(){
        return "["+x+","+y+"]";
    }
}
