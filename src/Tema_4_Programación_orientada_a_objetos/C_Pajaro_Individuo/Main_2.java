package Tema_4_Programación_orientada_a_objetos.C_Pajaro_Individuo;


public class Main_2 {public static void main(String[] args) {
    //Declaro las variables
    int Poblacion;
    int EdadBryan;
     /*
        Creamos los objetos necesarios
         */
    Individuo Bryan= new Individuo();
    Individuo David= new Individuo();
    Individuo German= new Individuo();
    Individuo Francesco= new Individuo();
//Insertamos la informacion de cada objeto
    Individuo.setAñoActual(2024);
    Bryan.setDni("E672893");
    Bryan.setFechaNacimiento(2002);
    Bryan.setNombre("Bryan");
    Bryan.setAltura(100);
     Bryan.setEdad();
    //Fin de Bryyan
    David.setDni("P684294");
    David.setFechaNacimiento(2004);
    David.setNombre("David");
    David.setAltura(110);
    //Fin de David
    German.setDni("T362937");
    German.setFechaNacimiento(2004);
    German.setNombre("German");
    German.setAltura(173);
    //Fin de German
    Francesco.setDni("K394910");
    Francesco.setFechaNacimiento(2004);
    Francesco.setNombre("Francesco");
    Francesco.setAltura(176);
    //Salida de informacion
    Bryan.SubirAltura();
    Bryan.CumplirAños();
    Bryan.SaludarAlumno("Bryan",Bryan.getEdad(),Bryan.getAltura());
}
}

