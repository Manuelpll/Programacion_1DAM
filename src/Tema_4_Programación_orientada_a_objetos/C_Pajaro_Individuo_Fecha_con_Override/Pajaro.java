package Tema_4_Programación_orientada_a_objetos.C_Pajaro_Individuo_Fecha_con_Override;

public  class Pajaro {
    private int posX, posY;
    private String nombre;

    public Pajaro(int posX, int posY, String nombre) {
        this.posX = posX;
        this.posY = posY;
        this.nombre = nombre;
    }

    //Fin metodo constructor 1º
    public Pajaro() {
        this.posX = 0;
        this.posY = 0;
        this.nombre = "Aguila";
    }//Fin metodo constructor 2º

    public void setPosX(int posX) {
        this.posX = posX;
    }//Fin setposX

    public void setPosY(int posY) {
        this.posY = posY;
    }//Fin setposY

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }//Fin setNombre

   //Fin setters

    public int getPosX() {
        return posX;
    }
//Fin getposX
    public int getPosY() {
        return posY;
    }//Fin getPosY
    public String getNombre() {
        return nombre;
    }//Fin getNombre

    //Fin getters
    double volar(int posX, int posY){
     double desplazamiento=Math.sqrt(Math.pow((posX-this.posX),2)+Math.pow((posY-this.posY),2));
       this.posX=posX;
       this.posY=posY;
     return desplazamiento;
  }
}
