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

public class ConsultasSQLClienteReporte {
     DecimalFormat objFormatea = new DecimalFormat("###,###.##");
     private Connection objConectar = null;
     private String varConsulta = "";
     private ResultSet objResultaBD;
     private final Excepcion objExcepcion = new Excepcion();
     private final ConexionBD objConexionBD = new ConexionBD();
     private PreparedStatement objAbrirConexon;
     private int varPosicionVector = 0;
     
    public String[][] reporteES(String varPlaca) {
        int varFilas = tamanoVectorListaTipoVehiculo(varPlaca);
        int varColumnas = 7;
        String[][] varVehiculos = new String[varFilas][varColumnas];
        try {
            if (varPlaca.equals("")) {
                varConsulta = "SELECT facturas.codigoFactura, vehiculos.placa, tipovehiculos.tipovehiculo, tarifas.costo, facturas.horaIngreso, facturas.horaSalida, facturas.fecha  FROM facturas, vehiculos, tipovehiculos, tarifas  WHERE facturas.id_estado = 1 AND facturas.id_vehiculo = vehiculos.id_vehiculo AND vehiculos.id_tipovehiculo = tipovehiculos.id_tipovehiculo AND tarifas.id_tipovehiculo = tipovehiculos.id_tipovehiculo;";
            } else {
                varConsulta = "SELECT facturas.codigoFactura, vehiculos.placa, tipovehiculos.tipovehiculo, tarifas.costo, facturas.horaIngreso, facturas.horaSalida, facturas.fecha  FROM facturas, vehiculos, tipovehiculos , tarifas  WHERE vehiculos.placa LIKE '%" + varPlaca + "%'   AND facturas.id_estado = 1 AND facturas.id_vehiculo = vehiculos.id_vehiculo AND vehiculos.id_tipovehiculo = tipovehiculos.id_tipovehiculo AND tarifas.id_tipovehiculo = tipovehiculos.id_tipovehiculo;";            
            }
            objConectar = objConexionBD.conexionBD();
            if (objConectar != null) { //validar la conexion de BD 
                objAbrirConexon = objConectar.prepareStatement(varConsulta);
                objResultaBD = objAbrirConexon.executeQuery();
                int varContador = 0;
                while (objResultaBD.next()) {
                    varVehiculos[varContador][0] = objResultaBD.getString("codigoFactura");
                    varVehiculos[varContador][1] = objResultaBD.getString("placa");
                    varVehiculos[varContador][2] = objResultaBD.getString("tipovehiculo");
                    varVehiculos[varContador][3] = objFormatea.format(objResultaBD.getInt("costo"));
                    varVehiculos[varContador][4] = objResultaBD.getString("horaIngreso");
                    varVehiculos[varContador][5] = objResultaBD.getString("horaSalida");
                    varVehiculos[varContador][6] = objResultaBD.getString("fecha");
                    varContador++;
                }
                objConexionBD.desconectarBD();
                return varVehiculos;
            }
        } catch (SQLException e) {
            objExcepcion.excepcionGuardado(1, "FALLO INESPERADO (LISTAR VEHICULOS)");
        }
        return varVehiculos;
    }
    
    
    public int tamanoVectorListaTipoVehiculo(String varPlaca) {
        try {
            if (varPlaca.equals("")) {
                varConsulta = "SELECT COUNT(*) FROM facturas, vehiculos, tipovehiculos, tarifas  WHERE  facturas.id_estado = 1 AND facturas.id_vehiculo = vehiculos.id_vehiculo AND vehiculos.id_tipovehiculo = tipovehiculos.id_tipovehiculo AND tarifas.id_tipovehiculo = tipovehiculos.id_tipovehiculo;";
            } else {
                varConsulta = "SELECT COUNT(*) FROM facturas, vehiculos, tipovehiculos , tarifas  WHERE vehiculos.placa LIKE '%" + varPlaca + "%'   AND facturas.id_estado = 1 AND facturas.id_vehiculo = vehiculos.id_vehiculo AND vehiculos.id_tipovehiculo = tipovehiculos.id_tipovehiculo AND tarifas.id_tipovehiculo = tipovehiculos.id_tipovehiculo;";            
            }
            objConectar = objConexionBD.conexionBD();
            if (objConectar != null) { //validar la conexion de BD 
                objAbrirConexon = objConectar.prepareStatement(varConsulta);
                objResultaBD = objAbrirConexon.executeQuery();
                if (objResultaBD.next()) {
                    varPosicionVector = objResultaBD.getInt(1);
                     System.err.println(varPosicionVector);
                    objConexionBD.desconectarBD();
                    return varPosicionVector;
                }
                return varPosicionVector;
            }
        } catch (SQLException e) {
            objExcepcion.excepcionGuardado(1, "FALLO INESPERADO (TOTAL{  VEHICULOS");
        }
        return varPosicionVector;
    }
}
