/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jPaqConexionBD;

import jPaqExcepcion.Excepcion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {

    //Establecemos las variables de acceso a la BD
    private final String varDB = "parqueadero";
    private final String varDireccionBD = "jdbc:mysql://localhost:3306/" + varDB;
    private final String varUsuarioBD = "root";
    private final String varClaveBD = "";
    private static Connection objConectar = null;
   
    public Connection conexionBD() {
        // Conectamos con la BD
        try {
            Class.forName("org.gjt.mm.mysql.Driver");// Hacemos referencia al DRIVER instalado en la Libreria
            objConectar = (Connection)DriverManager.getConnection(this.varDireccionBD, this.varUsuarioBD, this.varClaveBD);
            if (objConectar != null) {
                System.err.println("Conexion Establecida");
            }
        } catch (ClassNotFoundException | SQLException e) {
            Excepcion objExcepcion = new Excepcion();
            objExcepcion.excepcionGuardado(1, "Eror en la conexion BD");
        }
        return objConectar;
    }
    //con este metodo nos desconectamos de la BD
    public void desconectarBD(){
        objConectar = null;
        if (objConectar==null){
            System.out.println("Conexion terminada..");
        }
    }
}
