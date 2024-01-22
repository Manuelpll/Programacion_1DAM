package Tema_4_Programación_orientada_a_objetos.C_Pajaro_Individuo_Fecha_con_Override;
/*
*Main de Pajaro
 */
public class Main { public static void main(String[] args) {
    int PosXaguila,PosXLoro,PosXPaloma;
    int PosYaguila,PosYLoro,PosYpaloma;
    String nombre1,nombre2,nombre3;
    Pajaro Aguila= new Pajaro();
    //Establecemos valores a Aguila
    Aguila.setNombre("Juan");
    Aguila.setPosX(50);
    Aguila.setPosY(50);
    Pajaro Loro = new Pajaro();
    //Establecemos valores a Loro
   Loro.setNombre("Lucy");
   Loro.setPosX(10);
   Loro.setPosY(10);
   Pajaro paloma =new Pajaro();
   //Establecemos valores a paloma
    paloma.setNombre("Helen");
    paloma.setPosY(5);
    paloma.setPosY(1);
   /*
   Obtenemos la informacion de los atributos
    */
    //Valores Aguila
    PosXaguila=Aguila.getPosX();
  PosYaguila=Aguila.getPosY();
    nombre1=Aguila.getNombre();
    //Valores Loro
    PosXLoro=Loro.getPosX();
    PosYLoro=Loro.getPosY();
    nombre2=Loro.getNombre();
    //Valores paloma
    PosXPaloma=paloma.getPosX();
    PosYpaloma=paloma.getPosY();
    nombre3=paloma.getNombre();
    double distancia= Aguila.volar(Loro.getPosX(), Loro.getPosY());
    double distancia2= Aguila.volar(paloma.getPosX(), paloma.getPosY());
    System.out.println("El nombre del Aguila es: "+nombre1);
    System.out.println("La posicion inicial del aguila en x: "+PosXaguila);
    System.out.println("La posicion inicial del aguila en y: "+PosYaguila);
    System.out.println("El desplazamiento del aguila ha sido: "+distancia);
    Loro=null;
    System.gc();
    System.out.println("El desplazamiento del aguila para cazar a la paloma ha sido: "+distancia2);
    paloma=null;
    System.gc();
}
}
