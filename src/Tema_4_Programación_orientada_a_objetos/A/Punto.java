package Tema_4_Programación_orientada_a_objetos.A;

/*
Clase punto
 */
public class Punto {
    private int x,y;
    public Punto(int x,int y){
        this.x=x;
        this.y=y;
    }
    //Fin del metodo constructor 1º
    public Punto(){
    this.x=0;
      this.y=0;
    }//Fin metodo constructor 2º
    public void setX(int x){
           this.x=x;
    }
    //Fin setX
    public void setY(int y){
        this.y=y;
    }
    //Fin setY
    public int getX(){
        return x;
    }
    //Fin getX
    public int getY(){
        return y;
    }
    //Fin getY
    public double modulo (){
        return Math.sqrt(this.x*this.x+this.y*this.y);
    }
    //Fin modulo
    public double fase (){
        double fase=(double)(this.y)/(this.x);
        return Math.atan(fase);
    }
    //Fin fase
}
