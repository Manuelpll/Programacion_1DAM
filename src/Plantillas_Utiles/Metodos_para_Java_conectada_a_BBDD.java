package Plantillas_Utiles;
import java.sql.*;
/**
 * Ese archivo de java trata de metodos que se utilizan para conectar,
 * hacer consultas o modificar una base de datos
 * @author Mparr
 * @date 13/05/2024
 */
public class Metodos_para_Java_conectada_a_BBDD {
    private static final String url = "jdbc:mysql://192.168.80.153:3306/prueba";//Ejemplo de url cambiar si no es el ordenador del instituto
    private static final String user = "manuel";//Ejemplo de user cambiar si no es el ordenador del instituto
    private static final String password = "Opassword78%";//Ejemplo de password cambiar si no es el ordenador del instituto

    /**
     * Metodo que te permite conectarte a la base de datos
     * @return La conexion a la base de datos para que se pueda utilizar
     */
    private static Connection conectar() {
        try {
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            System.out.println("Error en la conexión: " + e.getMessage());
            return null;
        }//Fin try-catch
    }//Fin de conectar

    /**
     * Metodo para crear un Statement que nos permita hacer consultas
     * @param con La conexion  a la base de datos
     * @return El Statement listo para ser utilizado
     */
    private static Statement crearStatement(Connection con) {
        try {
            return con.createStatement();
        } catch (SQLException e) {
            System.out.println("Error al crear el statement: " + e.getMessage());
            return null;
        }//Fin de crearStatement
    }//Fin de crearStatement

    /**
     * Metodo que cierra la conexion a la base  de datos y el Statement
     * @param con Conexion que quieres cerrar
     * @param instruccion Statement que quieres cerrar
     */
    private static void cerrar(Connection con, Statement instruccion) {
        try {
            instruccion.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Error al cerrar la conexión: " + e.getMessage());
        }//Fin try-catch
    }//Fin de cerrar

    /**
     * Metodo que inserta informacion a una tabla
     * @param instruccion Statement que realiza la insercion
     * @param insercion Insercion
     */
    private static void insertaNuevaInformacion(Statement instruccion, String insercion) {
        try {
            int filasAfectadas = instruccion.executeUpdate(insercion);
            System.out.println("Se ha insertado corectamente " + filasAfectadas+" fila");
        } catch (SQLException e) {
            System.out.println("Error al hacer la consulta: " + e.getMessage());
        }//Fin try-catch
    }//Fin de insertarNuevaInformacion

    /**
     * Metodo que elimina un registro de una tabla
     * @param instruccion Statement que realiza la eliminacion
     * @param consulta Sentencia de delete
     */
    private static void eliminarInformacion(Statement instruccion, String consulta) {
        try {
            int filasAfectadas = instruccion.executeUpdate(consulta);
            System.out.println("Se ha eliminado corectamente " + filasAfectadas+" fila");
        } catch (SQLException e) {
            System.out.println("Error al hacer la consulta: " + e.getMessage());
        }//Fin try-catch
    }//Fin EliminarEmpleado

    /**
     * Metodo que realiza una consulta a la base de datos
     * @param instruccion Statement que ejecuta la consulta
     * @param consulta Consulta que se va hacer
     */
    private static void hacerConsulta(Statement instruccion,String consulta) {
        try {
            ResultSet resultado = instruccion.executeQuery(consulta);
            while (resultado.next()) {
            }/*Dentro del bucle la informacion que quieres extraer con .getnombre de dato y
             mostrar con  println o añadirlo todo en una variable o StringBuilder*/
            resultado.close();
        } catch (SQLException e) {
            System.out.println("Error al hacer la consulta: " + e.getMessage());
        }//Fin try-catch
    }//Fin de hacerConsulta

}//Fin de Metodos_para_Java_conectada_a_BBDD
