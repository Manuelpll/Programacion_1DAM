package Tema_5_Desarrollo_de_Clases.C_Banco;

public class Main {
    public static void main(String[] args) throws Exception {
        Cuenta cuenta01=new Cuenta();
        Cuenta cuenta02 = new Cuenta("Ermenegildo Ruiz","ES56999999932",3000,4.5);
        cuenta01.asignarNombre("Paco Gomez");
        cuenta01.asignarCuenta("ES789549540895");
        cuenta01.asignarTipoDeInteres(3.5);
        cuenta01.ingreso(3000);
            cuenta01.reintegro(300);
        System.out.println("Cuenta01 saldo:"+cuenta01.estado());
        cuenta01.reintegro(2500);
        System.out.println("Cuenta01 saldo:"+cuenta01.estado());
        String  mostrar=cuenta01.toString();
        System.out.println(mostrar);
        String mostrar2= cuenta02.toString();
        System.out.println(mostrar2);


    }
}
