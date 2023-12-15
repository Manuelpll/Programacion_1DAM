package Tema_3_Estructuras_de_control_y_Muchos_usos;
public class Ejercicio05 {
    public static void main(String[] args){
        //Declarar variables
        char c =(char)(Math.random()*26+'a');//Genera reta aleatoria
        System.out.println("La leta es: "+c);
        switch(c){
            case'a':
            case'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Es VOCAL");
                break;
            default:
                System.out.println("Es una CONSONANTE");
        }
    }
}
