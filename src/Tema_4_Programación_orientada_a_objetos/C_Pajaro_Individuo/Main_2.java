package Tema_4_Programación_orientada_a_objetos.C_Pajaro_Individuo;

/**
 * Main de Individuo
 */

public class Main_2 {public static void main(String[] args) {
    //Declaro las variables
    int Poblacion;
    int EdadBryan;
     /*
        Creamos los objetos necesarios
         */
    Individuo Bryan= new Individuo();
    Fecha B =new Fecha(21,3,2002);
    Individuo David= new Individuo();
    Fecha D = new Fecha(22,8,2004);
    Individuo German= new Individuo();
    Fecha G = new Fecha(4,7,2004);
    Individuo Francesco= new Individuo();
    Fecha F = new Fecha(18,9,2004);
    Individuo Pedro= new Individuo();
    Fecha P = new Fecha(16,12,2004);
//Insertamos la informacion de cada objeto
    Individuo.setAñoActual(2024);
    Bryan.setDni("E672893");
    Bryan.setFechaNacimiento(B);
    Bryan.setNombre("Bryan");
    Bryan.setAltura(100);
     Bryan.setEdad();
    //Fin de Bryyan
    David.setDni("P684294");
    David.setFechaNacimiento(D);
    David.setNombre("David");
    David.setAltura(110);
    //Fin de David
    German.setDni("T362937");
    German.setFechaNacimiento(G);
    German.setNombre("German");
    German.setAltura(173);
    //Fin de German
    Francesco.setDni("K394910");
    Francesco.setFechaNacimiento(F);
    Francesco.setNombre("Francesco");
    Francesco.setAltura(176);
    //Fin Francesco
    Pedro.setDni("36780173U");
    Pedro.setFechaNacimiento(P);
    Pedro.setAltura(177);
    Pedro.setNombre("Pedro");
    //Salida de informacion
    Bryan.SubirAltura();
    Bryan.SaludarAlumno("Bryan",Bryan.getEdad(),Bryan.getAltura());
}
}

