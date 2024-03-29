package Practicas_Obligatorias.Practica_Evaluable_Tema_5_Parra_Llansó_Manuel;
import java.time.LocalDate;
/**
 * Superclase Persona
 * @author Mparr
 * @version 1.0
 * @date 25/01/2024
 */
public abstract class Persona {
    //Atributos de la superclase
    protected String nombreCompleto;
    protected LocalDate fechaDeNacimiento;
    protected String DNI;

    //Creo los metodos constructores
    public Persona(){}//Metodo vacio

    public Persona(String nombreCompleto,LocalDate fechaDeNacimiento,String DNI){
        this.nombreCompleto=nombreCompleto;
        this.fechaDeNacimiento=fechaDeNacimiento;
        this.DNI=DNI;
        validarDNI(DNI);
    }//Fin del metodo constructor

    //Inicio de los metodos set
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public void setFechaDeNacimiento(LocalDate nuevaFecha) {
        this.fechaDeNacimiento = nuevaFecha;
    }

    public void setDNI(String nif) {
        this.DNI = DNI;
        validarDNI(DNI);
    }

    //Inicio de los metodos get

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public String getDNI() {
        return DNI;
    }

    //Procesos concretos

    public  boolean validarDNI(String DNI) {
        if (DNI == null || DNI.length() < 8||DNI.length() > 9) {
            return false;
        }

        String digitos = DNI.substring(0, 8);
        char letra = DNI.charAt(8);

        if (!digitos.matches("\\d+")) {
            return false;
        }

        char letraEsperada = calcularLetra(digitos);

        return letra == letraEsperada;
    }//Fin del metodo validarDNI

    private  char calcularLetra(String digitos) {
        char[] letrasDNI = "TRWAGMYFPDXBNJZSQVHLCKE".toCharArray();
        int numeroDNI = Integer.parseInt(digitos);
        int indiceLetra = numeroDNI % 23;
        return letrasDNI[indiceLetra];
    }//Fin del metodo calcularLetra


}//Fin de la superclase
