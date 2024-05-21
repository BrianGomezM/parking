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
import java.text.DecimalFormat;


public class ConsultasSQLAdminMonto {
    private Connection objConectar = null;
    private final ConexionBD objConexionBD = new ConexionBD();
    private PreparedStatement objAbrirConexon;
    private ResultSet objResultaBD;
    String varConsulta = "";
    private final Excepcion objExcepcion = new Excepcion();
      DecimalFormat objFormatea = new DecimalFormat("###,###.##");
    
        public int tamañoSQL(String varMonto, String varTipoVehiculo, int varConsultaRealizar, int tipoConsulta) {
        int resultado = 0;
        try {
            if (tipoConsulta == 0) {
                switch (varConsultaRealizar) {
                    case 0:
                        varConsulta = "SELECT COUNT(*) FROM tarifas, tipovehiculos WHERE tarifas.id_estado = 1 AND tarifas.id_tipovehiculo = tipovehiculos.id_tipovehiculo;";
                        break;
                    case 1:
                        varConsulta = "SELECT COUNT(*) FROM tarifas, tipovehiculos WHERE tipovehiculos.tipovehiculo LIKE '%" + varTipoVehiculo + "%' AND tarifas.id_estado = 1 AND tarifas.id_tipovehiculo = tipovehiculos.id_tipovehiculo;";
                        break;
                    case 2:
                        varConsulta = "SELECT COUNT(*) FROM tarifas, tipovehiculos WHERE tarifas.costo LIKE '%" + varMonto + "%' AND tarifas.id_estado = 1 AND tarifas.id_tipovehiculo = tipovehiculos.id_tipovehiculo;";
                        break;
                    default:
                        System.err.println("Error elegir consulta");
                        break;
                }
            } else {
                varConsulta = "SELECT COUNT(*) FROM tarifas, tipovehiculos WHERE tipovehiculos.tipovehiculo = '" + varTipoVehiculo + "' AND tarifas.id_estado = 1 AND tarifas.id_tipovehiculo = tipovehiculos.id_tipovehiculo;";
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
        
        public String[][] consultarTipoMonto(String varMonto, String varTipoVehiculo, int varTamañoSQL, int varConsultaRealizar) {
        String[][] varResultado = null;
        if (varTamañoSQL > 0) {
            varResultado = new String[varTamañoSQL][2];
            try {
                switch (varConsultaRealizar) {
                    case 0:
                        varConsulta = "SELECT * FROM tarifas, tipovehiculos WHERE tarifas.id_estado = 1 AND tarifas.id_tipovehiculo = tipovehiculos.id_tipovehiculo;";
                        break;
                    case 1:
                        varConsulta = "SELECT *  FROM tarifas, tipovehiculos WHERE tipovehiculos.tipovehiculo LIKE '%" + varTipoVehiculo + "%' AND tarifas.id_estado =1 AND tarifas.id_tipovehiculo = tipovehiculos.id_tipovehiculo;";
                        break;
                    case 2:
                        varConsulta = "SELECT *  FROM tarifas, tipovehiculos WHERE tarifas.costo LIKE '%" + varMonto + "%' AND tarifas.id_estado = 1 AND tarifas.id_tipovehiculo = tipovehiculos.id_tipovehiculo;";
                        break;
                    default:
                         System.err.println("Error elegir consulta");
                        break;
                }
                objConectar = objConexionBD.conexionBD();
                if (objConectar != null) { //validar la conexion de BD 
                    objAbrirConexon = objConectar.prepareStatement(varConsulta);
                    objResultaBD = objAbrirConexon.executeQuery();
                    int varContador = 0;
                    while (objResultaBD.next()) {
                        varResultado[varContador][0] = objResultaBD.getString("tipovehiculo");
                        varResultado[varContador][1] = objFormatea.format (objResultaBD.getInt("costo"));
                        varContador++;
                    }
                    objConexionBD.desconectarBD();
                    return varResultado;
                }
            } catch (SQLException e) {
                objExcepcion.excepcionGuardado(1, "FALLO INESPERADO (LISTAR MONTO)");
            }
        }
        return varResultado;
    } 
        
        
     public boolean registrarTarifa(String varTarifa, int varTipoVehiculo) {
        try {
            objConectar = objConexionBD.conexionBD();
            if (objConectar != null) { //validar la conexion de BD 
                varConsulta = "INSERT INTO tarifas(costo, id_tipovehiculo, id_estado) VALUES (?,?,?);";
                objAbrirConexon = objConectar.prepareStatement(varConsulta);
                objAbrirConexon.setString(1, varTarifa);
                objAbrirConexon.setInt(2, varTipoVehiculo);
                objAbrirConexon.setInt(3, 1);
                objAbrirConexon.execute();
                objConexionBD.desconectarBD();
                return true;
            }
        } catch (SQLException e) {
            objExcepcion.excepcionGuardado(1, "FALLO AL REGISTRAR LA TARIFA");
        }
        return false;
    }
     
     public boolean editarTarifa(String varTarifa, int varTipoVehiculo ){
        try {
            objConectar = objConexionBD.conexionBD();
            if (objConectar != null) { //validar la conexion de BD 
                varConsulta = "UPDATE tarifas SET tarifas.costo=? WHERE tarifas.id_tipovehiculo =? AND tarifas.id_estado = 1;";
                objAbrirConexon = objConectar.prepareStatement(varConsulta);
                objAbrirConexon.setString(1, varTarifa);
                objAbrirConexon.setInt(2, varTipoVehiculo);
                objAbrirConexon.execute();
                objConexionBD.desconectarBD();
                return true;
            }
        } catch (SQLException e) {
            objExcepcion.excepcionGuardado(1, "FALLO AL ACTUALIZAR LA TARIFA");
            return false;
        }
        return false;
    }
     
          public boolean eliminarTarifa(int varTipoVehiculo ){
        try {
            objConectar = objConexionBD.conexionBD();
            if (objConectar != null) { //validar la conexion de BD 
                varConsulta = "UPDATE tarifas SET tarifas.id_estado=2 WHERE tarifas.id_tipovehiculo =? AND tarifas.id_estado = 1;";
                objAbrirConexon = objConectar.prepareStatement(varConsulta);
                objAbrirConexon.setInt(1, varTipoVehiculo);
                objAbrirConexon.execute();
                objConexionBD.desconectarBD();
                return true;
            }
        } catch (SQLException e) {
            objExcepcion.excepcionGuardado(1, "FALLO AL ACTUALIZAR LA TARIFA");
            return false;
        }
        return false;
    }
        
}
