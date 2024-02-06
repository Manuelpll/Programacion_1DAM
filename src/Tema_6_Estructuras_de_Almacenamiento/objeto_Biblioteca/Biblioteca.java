package Tema_6_Estructuras_de_Almacenamiento.objeto_Biblioteca;

/**
 * Clase biblioteca
 * @author Mparll
 * @version 1.0
 * @date 06/02/2024
 */
public class Biblioteca {
    private  String libro;
    private  String autor;

    public Biblioteca (String libro){
        this.libro=libro;
    }
public Biblioteca(String libro,String autor){
        this.libro=libro;
          this.autor=autor;
}
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setLibro(String libro) {
        this.libro = libro;
    }
//Fin setters
    public String getLibro() {
        return libro;
    }

    public String getAutor() {
        return autor;
    }
    //Fin getters
    @Override
    public String toString (){
        return "Autor: "+this.autor+"\nLibro: "+this.libro;
    }
}
