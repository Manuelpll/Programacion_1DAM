package Tema_4_Programación_orientada_a_objetos.C_Pajaro_Individuo;

public class Individuo {
        private  int FechaNacimiento;
        private static int Poblacion;
        private String dni;
        private String nombre;
        public   Individuo(int FechaNacimiento,String dni,String nombre) {
            super();//Primera linea del metodo constructor,que invoque a la clase superior
            this.dni=dni;
            this.nombre=nombre;
            this.FechaNacimiento=FechaNacimiento;
            Poblacion++; //Se asume que partira de valor cero
        /*
        Añado todos los this necesarios
         */
        }
        //Fin metodo constructor 1º
        public Individuo(){
            this.FechaNacimiento=0;
            this.Poblacion=0;
            this.dni="Inserte texto";
            this.nombre="Inserte otro texto";
            Poblacion++;
        /*
        Este metodo constructor asigna directamente valores
         */
        }//Fin metodo constructor 2º

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }//Fin setNombre

    public void setDni(String dni) {
        this.dni = dni;
    }//Fin setDni

    public void setFechaNacimiento(int fechaNacimiento) {
        FechaNacimiento = fechaNacimiento;
    }//Fin setFechaNacimiento
    //Fin setters

    public String getNombre() {
        return nombre;
    }//Fin getNombre

    public int getFechaNacimiento() {
        return FechaNacimiento;
    }//Fin getFechaNacimiento

    public  int getPoblacion(int Poblacion) {
             return Poblacion;
    }//Fin getPoblacion

    public String getDni() {
        return dni;
    }//Fin getDni
    //Fin getters
}
