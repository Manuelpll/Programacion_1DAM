package Tema_4_Programación_orientada_a_objetos.C_Pajaro_Individuo;

public class Individuo {
        private  int FechaNacimiento,Poblacion;//Añado todo los atributos que me pidan
        private String dni,nombre;
        public   Individuo(int atributo1,int atributo2) {
            this.dni=dni;
            this.nombre=nombre;
            this.FechaNacimiento=FechaNacimiento;
            this.Poblacion = Poblacion;
            Poblacion++;
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

    public void setPoblacion(int poblacion) {
        Poblacion = poblacion;
    }//Fin setPoblacion
    //Fin setters

    public String getNombre() {
        return nombre;
    }//Fin getNombre

    public int getFechaNacimiento() {
        return FechaNacimiento;
    }//Fin getFechaNacimiento

    public  int getPoblacion() {
             return Poblacion;
    }//Fin getPoblacion

    public String getDni() {
        return dni;
    }//Fin getDni
    //Fin getters
}
