package Tema_4_Programación_orientada_a_objetos.C_Pajaro_Individuo_Fecha_con_Override;

public class Individuo {
        private  int FechaNacimiento;
        private  static int AñoActual;
        private int Edad;
        private int Altura;
        private static int Poblacion;
        private String dni;
        private String nombre;
        public   Individuo(int FechaNacimiento,String dni,String nombre,int Atura, int Edad){
            //super() Primera linea del metodo constructor,que invoque a la clase superior
            this.dni=dni;
            this.nombre=nombre;
            this.FechaNacimiento=FechaNacimiento;
            this.Altura=Atura;
            Poblacion++; //Se asume que partira de valor cero
            AñoActual=2024;
            Edad=AñoActual-FechaNacimiento;
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
            AñoActual=2024;
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

    public void setFechaNacimiento(Fecha fechaNacimiento) {
       Fecha FechaNacimiento;
    }//Fin setFechaNacimiento

    public static void setPoblacion(int Poblacion) {
        Individuo.Poblacion =Poblacion;
    }

    public void setAltura(int Altura) {
        this.Altura = Altura;
    }


    public static void setAñoActual(int AñoActual) {
        Individuo.AñoActual = AñoActual;
    }

    public void setEdad() {
        Edad = AñoActual-FechaNacimiento;
    }
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

    public int getAltura() {
        return Altura;
    }

    public int getEdad() {
        return Edad;
    }
    //Fin getters

    //Procesos del objeto
    public void SaludarAlumno(String nombre,int Edad,int Altura){
        System.out.println("Hola "+nombre);
        System.out.println("Que tiene "+Altura+"cm de altura");
        System.out.println("Tiene "+Edad+" años");
    }
    public int CumplirAños (){;
            return Edad++;
    }
    public void SubirAltura(){
            Altura++;
    }
}
