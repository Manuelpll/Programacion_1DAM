package Practicas_Obligatorias.Practica_Evaluable_Tema_6_Parra_Llansó_Manuel.actividad_2;

/**
 * Clase Tempetarura
 * @author  Mparr
 * @version  1.0
 */
public class Temperatura {
    //Declaro las variables
        public   int dia;
        public   double temMin;
        public    double temMax;
        public  double temMedi;
        public Temperatura(int dia,double temMax,double temMin){
            this.dia=dia;
            this.temMin=temMin;
            this.temMax=temMax;
            this.temMedi=(temMax+temMin)/2;
        }//Fin del constructor
    @Override
    public String toString(){
            return "Dia"+dia+": "+"("+temMax+","+temMin+")"+"y la temperatura media es"+temMedi;
    }
}
