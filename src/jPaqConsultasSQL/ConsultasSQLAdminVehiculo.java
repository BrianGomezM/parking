/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jPaqConsultasSQL;

import jPaqConexionBD.ConexionBD;
import jPaqExcepcion.Excepcion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class ConsultasSQLAdminVehiculo {

    private Connection objConectar = null;
    private final ConexionBD objConexionBD = new ConexionBD();
    private PreparedStatement objAbrirConexon;
    private ResultSet objResultaBD;
    String varConsulta = "";
    private final Excepcion objExcepcion = new Excepcion();

    public int tamañoSQL(String varFiltro, int tipoConsulta) {
        int resultado = 0;
        try {
            if (tipoConsulta == 0) {
                if (varFiltro.equals("")) {
                    varConsulta = "SELECT COUNT(*) FROM tipovehiculos WHERE tipovehiculos.id_estado =1;";
                } else {
                    varConsulta = "SELECT COUNT(*) FROM tipovehiculos WHERE tipovehiculos.tipovehiculo LIKE '%" + varFiltro + "%' AND tipovehiculos.id_estado =1;";
                }
            } else {
                varConsulta = "SELECT COUNT(*) FROM tipovehiculos WHERE tipovehiculos.tipovehiculo = '" + varFiltro + "' AND tipovehiculos.id_estado =1";
            }

            objConectar = objConexionBD.conexionBD();
            if (objConectar != null) { //validar la conexion de BD 
                objAbrirConexon = objConectar.prepareStatement(varConsulta);
                objResultaBD = objAbrirConexon.executeQuery();
                if (objResultaBD.next()) {
                    resultado = objResultaBD.getInt(1);
                    objConexionBD.desconectarBD();
                    return resultado;
                }
                return resultado;
            }
        } catch (SQLException e) {
            objExcepcion.excepcionGuardado(1, "FALLO INESPERADO TAMAÑO SQL");
        }
        return resultado;
    }

    public String[][] consultarTipoVehiculos(String varTipoVehiculo, int varTamañoSQL) {
        String[][] varResultado = null;
        if (varTamañoSQL > 0) {
            varResultado = new String[varTamañoSQL][1];
            try {
                if (varTipoVehiculo.equals("")) {
                    varConsulta = "SELECT * FROM tipovehiculos WHERE tipovehiculos.id_estado =1";
                } else {
                    varConsulta = "SELECT * FROM tipovehiculos WHERE tipovehiculos.tipovehiculo LIKE '%" + varTipoVehiculo + "%' AND tipovehiculos.id_estado =1;";
                }
                objConectar = objConexionBD.conexionBD();
                if (objConectar != null) { //validar la conexion de BD 
                    objAbrirConexon = objConectar.prepareStatement(varConsulta);
                    objResultaBD = objAbrirConexon.executeQuery();
                    int varContador = 0;
                    while (objResultaBD.next()) {
                        varResultado[varContador][0] = objResultaBD.getString("tipovehiculo");
                        varContador++;
                    }
                    objConexionBD.desconectarBD();
                    return varResultado;
                }
            } catch (SQLException e) {
                objExcepcion.excepcionGuardado(1, "FALLO INESPERADO (LISTAR TIPO DE VEHICULO)");
            }
        }
        return varResultado;
    }

    public boolean registrarTipoVehiculo(String varTipoVehiculo) {
        try {
            objConectar = objConexionBD.conexionBD();
            if (objConectar != null) { //validar la conexion de BD 
                varConsulta = "INSERT INTO tipovehiculos(tipovehiculo, id_estado) VALUES (? , 1);";
                objAbrirConexon = objConectar.prepareStatement(varConsulta);
                objAbrirConexon.setString(1, varTipoVehiculo);
                objAbrirConexon.execute();
                objConexionBD.desconectarBD();
                return true;
            }
        } catch (SQLException e) {
            objExcepcion.excepcionGuardado(1, "FALLO AL REGISTRAR TIPO VEHICULO");
        }
        return false;
    }

    public boolean editarTipoVehiculo(String varTipoVehiculo, String varNuevoTipoVehiculo) {
        try {
            objConectar = objConexionBD.conexionBD();
            if (objConectar != null) { //validar la conexion de BD 
                varConsulta = "UPDATE tipovehiculos SET tipovehiculos.tipovehiculo = ? WHERE tipovehiculos.tipovehiculo = ? AND tipovehiculos.id_estado = 1;";
                objAbrirConexon = objConectar.prepareStatement(varConsulta);
                objAbrirConexon.setString(1, varNuevoTipoVehiculo);
                objAbrirConexon.setString(2, varTipoVehiculo);
                objAbrirConexon.execute();
                objConexionBD.desconectarBD();
                return true;
            }
        } catch (SQLException e) {
            objExcepcion.excepcionGuardado(1, "FALLO AL EDITAR EL TIPO VEHICULO");
            return false;
        }
        return false;
    }

    public boolean eliminarTipoVehiculo(String varTipoVehiculo) {
        try {
            objConectar = objConexionBD.conexionBD();
            if (objConectar != null) { //validar la conexion de BD 
                varConsulta = "UPDATE tipovehiculos SET tipovehiculos.id_estado =? WHERE tipovehiculos.tipovehiculo = ? AND tipovehiculos.id_estado = 1;";
                objAbrirConexon = objConectar.prepareStatement(varConsulta);
                objAbrirConexon.setInt(1, 2);
                objAbrirConexon.setString(2, varTipoVehiculo);
                objAbrirConexon.execute();
                objConexionBD.desconectarBD();
                return true;
            }
        } catch (SQLException e) {
            objExcepcion.excepcionGuardado(1, "FALLO AL EDITAR EL TIPO VEHICULO");
            return false;
        }
        return false;
    }
}
