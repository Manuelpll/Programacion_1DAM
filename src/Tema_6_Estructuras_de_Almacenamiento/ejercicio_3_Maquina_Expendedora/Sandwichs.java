package Tema_6_Estructuras_de_Almacenamiento.ejercicio_3_Maquina_Expendedora;

public class Sandwichs {
    private String nombre;
    private double precio;
    private int cantidad;
    public Sandwichs(String nombre,double precio,int cantidad){
        this.nombre=nombre;
        this.precio=precio;
        this.cantidad=cantidad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    //Fin setters
    public double getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }
    public int getCantidad() {
        return cantidad;
    }
    //Fin getters
}
