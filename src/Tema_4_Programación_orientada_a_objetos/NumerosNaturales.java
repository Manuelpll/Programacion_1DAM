package Tema_4_Programación_orientada_a_objetos;

/**
 * Clase NumerosNaturales
 * @author Manuel
 *
 */
public class NumerosNaturales {
    private int inicial,maximo;
    public   NumerosNaturales() {
        this.inicial=inicial;
        this.maximo = maximo;
    }
 //Fin metodo constructor 1º
    public void setInicial(int inicial) {
        this.inicial = inicial;
    }

    public void setMaximo(int maximo) {
        this.maximo = maximo;
    }

    public int getInicial() {
        return inicial;
    }

    public int getMaximo() {
        return maximo;
    }
    //Fin de sets y gets
    public void imprimirRango(){
        System.out.println("Rango");
   for(int i=this.inicial;i<=this.maximo;i++){
            System.out.println(i+" ");
        }
    }
    public void reset(){
        this.maximo=0;
        this.inicial=0;
    }
    public void ImprimirRangoInverso(){
        System.out.println("Rago Inverso:");
        for (int i=this.maximo;i>=this.inicial;i--){
            System.out.println(i+" ");
        }
    }
}
