/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jPaqConsultasSQL;

import jPaqConexionBD.ConexionBD;
import jPaqExcepcion.Excepcion;
import jPaqParqueadero.GlobalUser;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;


public class ConsultasSQLClienteFactura {

    private GlobalUser objUser;
    private final ConexionBD objConexionBD = new ConexionBD();
    private Connection objConectar = null;
    private PreparedStatement objAbrirConexon;
    private ResultSet objResultaBD;
    private final Excepcion objExcepcion = new Excepcion();
    private String varConsulta = "";
    DecimalFormat objFormatea = new DecimalFormat("###,###.##");
    private int varPosicionVector = 0;
    
    public int buscarVehiculo(String varPlaca) {
        int varRespuesta = 0;
        try {
            objConectar = objConexionBD.conexionBD();
            if (objConectar != null) { //validar la conexion de BD 
                varConsulta = "SELECT * FROM vehiculos WHERE vehiculos.placa = ? AND vehiculos.id_estado = 1;";
                objAbrirConexon = objConectar.prepareStatement(varConsulta);
                objAbrirConexon.setString(1, varPlaca);
                objResultaBD = objAbrirConexon.executeQuery();
                if (objResultaBD.next()) {
                    varRespuesta = Integer.valueOf(objResultaBD.getString("id_vehiculo"));
                } else {
                    varRespuesta = 0;
                }
                objConexionBD.desconectarBD();
                return varRespuesta;
            }
        } catch (SQLException e) {
            objExcepcion.excepcionGuardado(1, "FALLO INESPERADO (BUSQUEDA DE VEHICULO)");
        }
        return varRespuesta;
    }

    private String codigoFactura() {
        SecureRandom random = new SecureRandom();
        String text = new BigInteger(40, random).toString(32);
        return text;
    }

    public boolean buscarFactura(String varPlaca) {
        boolean varRespuesta = false;
        try {
            objConectar = objConexionBD.conexionBD();
            if (objConectar != null) { //validar la conexion de BD 
                varConsulta = "SELECT * FROM facturas, vehiculos WHERE vehiculos.placa = ? AND facturas.id_estado = 1 AND facturas.horaSalida= ? AND facturas.id_vehiculo = vehiculos.id_vehiculo";
                objAbrirConexon = objConectar.prepareStatement(varConsulta);
                objAbrirConexon.setString(1, varPlaca);
                objAbrirConexon.setString(2, "00:00:00.000000");
                objResultaBD = objAbrirConexon.executeQuery();
                if (objResultaBD.next()) {
                    objUser = new GlobalUser(objResultaBD.getString("codigoFactura"), objResultaBD.getString("placa"), objResultaBD.getString("horaIngreso"), objResultaBD.getString("fecha"));
                    varRespuesta = true;
                } else {
                    varRespuesta = false;
                }
                objConexionBD.desconectarBD();
                return varRespuesta;
            }
        } catch (SQLException e) {
            objExcepcion.excepcionGuardado(1, "FALLO INESPERADO (BUSQUEDA DE FACTURA)");
        }
        return varRespuesta;
    }

    public boolean registrarFactura(String varPlaca, String varHoraIngreso, String varHoraSalida, int varTiempo, int varCosto, String varFecha, int varIdEstado, int varIdVehiculo) {
        boolean varRespuesta = true;
        String varCodigoFactura = codigoFactura();
        try {
            objConectar = objConexionBD.conexionBD();
            if (objConectar != null) { //validar la conexion de BD 
                varConsulta = "INSERT INTO facturas(codigoFactura, horaIngreso, horaSalida, tiempo, costo, fecha, id_estado, id_vehiculo) VALUES (?,?,?,?,?,?,?,?)";
                objAbrirConexon = objConectar.prepareStatement(varConsulta);
                objAbrirConexon.setString(1, varCodigoFactura);
                objAbrirConexon.setString(2, varHoraIngreso);
                objAbrirConexon.setString(3, varHoraSalida);
                objAbrirConexon.setInt(4, varTiempo);
                objAbrirConexon.setInt(5, varCosto);
                objAbrirConexon.setString(6, varFecha);
                objAbrirConexon.setInt(7, varIdEstado);
                objAbrirConexon.setInt(8, varIdVehiculo);
                objAbrirConexon.execute();
                objConexionBD.desconectarBD();
                GlobalUser.setCodigoFactura(varCodigoFactura);
                objUser = new GlobalUser(varCodigoFactura, varPlaca, varHoraIngreso, varFecha);
                return true;
            }
        } catch (SQLException e) {
            objExcepcion.excepcionGuardado(1, "FALLO AL REGISTRAR FACTURA");
        }
        return varRespuesta;
    }

    public boolean registrarSalidaVehiculo(String varPlaca, String varHoraFinal) {
        int varTotalMinutos = 0;
        int varTotalApagar;
        int varCosto = 0;
        String varHoraInicial = "";
        try {
            objConectar = objConexionBD.conexionBD();
            if (objConectar != null) { //validar la conexion de BD 
                varConsulta = "SELECT facturas.horaIngreso, tarifas.costo, tipovehiculos.tipovehiculo FROM facturas, vehiculos, tarifas, tipovehiculos WHERE facturas.id_estado = 1 AND facturas.codigoFactura =? AND vehiculos.placa=? AND facturas.id_vehiculo = vehiculos.id_vehiculo AND  vehiculos.id_tipovehiculo = tipovehiculos.id_tipovehiculo AND tarifas.id_tipovehiculo = tipovehiculos.id_tipovehiculo;";
                objAbrirConexon = objConectar.prepareStatement(varConsulta);
                objAbrirConexon.setString(1, GlobalUser.getCodigoFactura());
                objAbrirConexon.setString(2, varPlaca);
                objResultaBD = objAbrirConexon.executeQuery();
                if (objResultaBD.next()) {
                    varHoraInicial = objResultaBD.getString("horaIngreso");
                    varCosto = objResultaBD.getInt("costo");
                    varTotalMinutos = validarTotalMinutos(varHoraInicial, varHoraFinal);
                    varTotalApagar = (varTotalMinutos * varCosto);
                    return cerrarFactura(varHoraFinal, varTotalMinutos, varTotalApagar, GlobalUser.getCodigoFactura());
                } else {
                    objExcepcion.excepcionGuardado(1, "FALLO INESPERADO (BUSQUEDA DE FACTURA)");
                }
                objConexionBD.desconectarBD();
                return false;
            }
        } catch (SQLException e) {
            objExcepcion.excepcionGuardado(1, "FALLO INESPERADO (BUSQUEDA DE FACTURA)");
            return false;
        }
        return false;
    }

    private int validarTotalMinutos(String varHoraInicial, String varHoraFinal) {
        int varHoraTotal = 0;
        int varHotaInicialMinutos = (((Integer.parseInt(varHoraInicial.substring(0, 2))) * 60) + (Integer.parseInt(varHoraInicial.substring(3, 5))));
        int varHotaFinallMinutos = (((Integer.parseInt(varHoraFinal.substring(0, 2))) * 60) + (Integer.parseInt(varHoraFinal.substring(3, 5))));
        varHoraTotal = varHotaFinallMinutos - varHotaInicialMinutos;
        return varHoraTotal;
    }
    //

    private boolean cerrarFactura(String varHoraSalida, int varTiempo, int varPagar, String varCodigoFactura) {
        String varTotalApagar = objFormatea.format(varPagar);
        try {
            objConectar = objConexionBD.conexionBD();
            if (objConectar != null) { //validar la conexion de BD 
                varConsulta = "UPDATE facturas SET facturas.horaSalida=?, facturas.tiempo=?, facturas.costo=?, facturas.id_estado = 2 WHERE facturas.codigoFactura=?;";
                objAbrirConexon = objConectar.prepareStatement(varConsulta);
                objAbrirConexon.setString(1, varHoraSalida);
                objAbrirConexon.setInt(2, varTiempo);
                objAbrirConexon.setString(3, varTotalApagar);
                objAbrirConexon.setString(4, varCodigoFactura);
                objAbrirConexon.execute();
                objConexionBD.desconectarBD();
                objUser = new GlobalUser(varHoraSalida, String.valueOf(varTiempo) + " MINUTOS", varTotalApagar + " PESOS");
                return true;
            }
        } catch (SQLException e) {
            objExcepcion.excepcionGuardado(1, "FALLO AL CERRAR LA FACTURA");
            return false;
        }
        return false;

    }
    
    public String[][] reporteES(String varPlaca) {
        int varFilas = tamanoVectorListaTipoVehiculo(varPlaca);
        String varHoraFianl = "'00:00:00.000000'";
        int varColumnas = 7;
        String[][] varVehiculos = new String[varFilas][varColumnas];
        try {
            if (varPlaca.equals("")) {
                varConsulta = "SELECT facturas.codigoFactura, vehiculos.placa, tipovehiculos.tipovehiculo, tarifas.costo, facturas.horaIngreso, facturas.horaSalida, facturas.fecha  FROM facturas, vehiculos, tipovehiculos, tarifas  WHERE facturas.horaSalida ="+varHoraFianl+"   AND facturas.id_estado = 1 AND facturas.id_vehiculo = vehiculos.id_vehiculo AND vehiculos.id_tipovehiculo = tipovehiculos.id_tipovehiculo AND tarifas.id_tipovehiculo = tipovehiculos.id_tipovehiculo;";
            } else {
                varConsulta = "SELECT facturas.codigoFactura, vehiculos.placa, tipovehiculos.tipovehiculo, tarifas.costo, facturas.horaIngreso, facturas.horaSalida, facturas.fecha  FROM facturas, vehiculos, tipovehiculos , tarifas  WHERE vehiculos.placa LIKE '%" + varPlaca + "%' AND facturas.horaSalida ="+varHoraFianl+"  AND facturas.id_estado = 1 AND facturas.id_vehiculo = vehiculos.id_vehiculo AND vehiculos.id_tipovehiculo = tipovehiculos.id_tipovehiculo AND tarifas.id_tipovehiculo = tipovehiculos.id_tipovehiculo;";            
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
        String varHoraFianl = "'00:00:00.000000'";
        try {
            if (varPlaca.equals("")) {
                varConsulta = "SELECT COUNT(*) FROM facturas, vehiculos, tipovehiculos, tarifas  WHERE facturas.horaSalida ="+varHoraFianl+"   AND facturas.id_estado = 1 AND facturas.id_vehiculo = vehiculos.id_vehiculo AND vehiculos.id_tipovehiculo = tipovehiculos.id_tipovehiculo AND tarifas.id_tipovehiculo = tipovehiculos.id_tipovehiculo;";
            } else {
                varConsulta = "SELECT COUNT(*) FROM facturas, vehiculos, tipovehiculos , tarifas  WHERE vehiculos.placa LIKE '%" + varPlaca + "%' AND facturas.horaSalida ="+varHoraFianl+"  AND facturas.id_estado = 1 AND facturas.id_vehiculo = vehiculos.id_vehiculo AND vehiculos.id_tipovehiculo = tipovehiculos.id_tipovehiculo AND tarifas.id_tipovehiculo = tipovehiculos.id_tipovehiculo;";            
            }
            
            objConectar = objConexionBD.conexionBD();
            if (objConectar != null) { //validar la conexion de BD 
                objAbrirConexon = objConectar.prepareStatement(varConsulta);
                objResultaBD = objAbrirConexon.executeQuery();
                if (objResultaBD.next()) {
                    varPosicionVector = objResultaBD.getInt(1);
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
