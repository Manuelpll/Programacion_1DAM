package Tema_5_Desarrollo_de_Clases.C_Banco;

import java.util.Scanner;
import java.util.SortedMap;

public  class Cuenta {
    private String nombre;

    private String cuenta;

    private double saldo;

    private double tipoDeInteres;
   //Metodo constructor

    public Cuenta(){}//Metodo vacio
   public Cuenta(String nombre, String cuenta, double saldo, double tipoDeInteres) throws Exception{
       /*
       this.nombre=nombre;
       this.cuenta=cuenta;
       this.saldo=saldo;
       this.tipoDeInteres=tipoDeInteres;
        */
       asignarCuenta(cuenta);
       asignarNombre(nombre);
       asignarTipoDeInteres(tipoDeInteres);
       ingreso(saldo);


   }

    public void asignarNombre(String nombre) throws Exception {
       if(nombre.length()==0){
           throw new Exception("Error: cadena vacia");     }
        this.nombre = nombre;
    }

    public void asignarCuenta(String cuenta) throws Exception {
        if (cuenta.length()==0){
            throw new Exception("Error: cuenta invalida");
        }
        this.cuenta = cuenta;
    }

    public void ingreso (double cantidad) throws Exception {
        if (cantidad <=0){
            throw  new Exception("Cantidad negativa o cero");
        }
        this.saldo = saldo;
    }
    public void asignarTipoDeInteres(double tipo)throws Exception {
        if (tipo<0){
            throw new Exception("Error: no puede ser negativo");
        }
        this.tipoDeInteres = tipo;
    }
//Fin setters
    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerCuenta() {
        return cuenta;
    }

    public double estado() {
        return saldo;
    }

    public double obtenerTipoDeInteres() {
        return tipoDeInteres;
    }
    //Fin getters
    public void ingreso(){
        Scanner teclado = new Scanner(System.in);
        double ingreso;
        System.out.println("¿Cuanto quieres ingresar?");
        ingreso= teclado.nextDouble();
        saldo= this.saldo+ingreso;

    }//Fin de ingreso

    public  void saldoCuenta(double cantidad){
       saldo+=cantidad;
    }

    public void reintegro(double cantidad) throws Exception{
       if(cantidad <0){
           throw new Exception("Erro: No dispone del saldo");
       }
        saldo-=cantidad;
    }
    @Override
    public String toString (){return "___________________________"+"\nNombre: "+this.nombre+"\nCuenta: "+this.cuenta+"\nTipo de intereses: "+this.tipoDeInteres+"\nSaldo: "+this.saldo+"\n___________________________";}
}
