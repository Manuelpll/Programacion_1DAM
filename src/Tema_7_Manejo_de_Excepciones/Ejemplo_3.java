package Tema_7_Manejo_de_Excepciones;

/**
 * Ejemplo de manejo de la excepcion ArrayIndexOutofBounsExcepcion
 */
public class Ejemplo_3 {
    public static void main(String[] args) {
        int i;
        boolean fueradelimite=true;
        String texto[] = {"uno", "dos", "tres", "cuatro", "cinco"};
        while (fueradelimite){
            try {
                i=(int)Math.round((Math.random()*9));
                System.out.println("Valor de I: "+i);
                System.out.println(texto[i]);
                fueradelimite=false;
            }catch (ArrayIndexOutOfBoundsException e){
                e.printStackTrace();
                System.out.println("Error: No se encuentra en el array"+e.getMessage());
            }//Fin try-catch
        }//Fin while
    }//Fin del main
}//Fin del Ejemplo_3