package Practicas_Obligatorias.Practica_Evaluable_Tema_6_Parra_Llansó_Manuel.actividad_2;

/**
 * Clase Tempetarura
 * @author  Mparr
 * @version  1.0
 * @date  15/02/2024
 */
public class Temperatura {
    //Declaro las variables
        public   int dia;
        public   int temMin;
        public   int temMax;
        public  double temMedi;
        public Temperatura(int dia,int temMax,int temMin){
            this.dia=dia;
            this.temMin=temMin;
            this.temMax=temMax;
            this.temMedi= (double) (temMax + temMin) /2;
        }//Fin del constructor

    public double getTemMedi() {
        return temMedi;
    }//Fin de getTemMedi
    @Override
    public String toString(){
            return "Dia "+dia+": "+"("+temMax+","+temMin+")"+" y la temperatura media es "+temMedi;
    }
}
