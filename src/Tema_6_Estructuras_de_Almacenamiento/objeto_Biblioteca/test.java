package Tema_6_Estructuras_de_Almacenamiento.objeto_Biblioteca;

public class test {
    public static void main(String[] args) {
        Biblioteca[] listaLibros = new Biblioteca[3];
        listaLibros[0]=new Biblioteca("Programacion en C");
        listaLibros[1]= new Biblioteca("Java");
        listaLibros[2]=new Biblioteca("Linux");
        for (Biblioteca i:listaLibros){
            System.out.println(i.getLibro());
        }//Fin for
        Biblioteca[] listaLibros2=new Biblioteca[3];
        listaLibros2[0]=new Biblioteca("Programacion en C","Oscar Colmarejo");
        listaLibros2[1]=new Biblioteca("Java","Juan");
        listaLibros2[2]= new Biblioteca("Linux","Pepe");
        for (Biblioteca i:listaLibros2){
            System.out.println(i);
        }
    }
}
