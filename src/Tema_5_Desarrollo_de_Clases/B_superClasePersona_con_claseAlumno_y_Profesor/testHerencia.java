package Tema_5_Desarrollo_de_Clases.B_superClasePersona_con_claseAlumno_y_Profesor;

/**
 * Test de la subclase Alumno
 */
public class testHerencia {
    public static void main(String[] args) {
        Alumno Juan= new Alumno("Juan","Torres",25,1111111);
       Juan.imprimirCabecera();
       Juan.imprimirAlumno();
       String resultadoAlumno= Juan.toString();
        System.out.println(resultadoAlumno);
       Profesor Carlos =new Profesor("Carlos","Martín",34, Profesor.Especialidad.Informatica);
       Carlos.imprimirCabecera();
       Carlos.imprimirProfesor();
     String resultadoProfesor  =Carlos.toString();
        System.out.println(resultadoProfesor);
    }
}
