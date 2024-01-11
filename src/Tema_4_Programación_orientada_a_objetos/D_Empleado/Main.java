package Tema_4_Programación_orientada_a_objetos.D_Empleado;

/**
 * Main de la clase Empleado
 */

public class Main {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado();
        empleado1.setNombre("Jose Antonio");
        empleado1.setSueldo(2500.50);
        Empleado empleado2 = new Empleado("Lucian", 1800);
        //Aplicamos  metodos propios;
        empleado1.SubieelSueldo(1);
        empleado1.MostrarDatosdelEmpleado();
        empleado2.MostrarDatosdelEmpleado();
        Empleado[]empleadosEmpresa=new Empleado[3];
        empleadosEmpresa[0]= empleado1;
        empleadosEmpresa[1]= empleado2;
        empleadosEmpresa[2]= new Empleado("Pablo",30000.0);
    }
}
