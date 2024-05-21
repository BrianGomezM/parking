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

public class ConsultasSQLClienteVehiculo {

    private final ConexionBD objConexionBD = new ConexionBD();
    private Connection objConectar = null;
    private PreparedStatement objAbrirConexon;
    private ResultSet objResultaBD;
    private final Excepcion objExcepcion = new Excepcion();
    //variable
    private String varConsulta = "";
    private int varPosicionVector = 0;

    public int tamañoVectorListaTipoVehiculo() {
        try {
            objConectar = objConexionBD.conexionBD();
            if (objConectar != null) { //validar la conexion de BD 
                varConsulta = "SELECT COUNT(*) FROM tipovehiculos WHERE tipovehiculos.id_estado = 1;";
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
            objExcepcion.excepcionGuardado(1, "FALLO INESPERADO (LISTAR TIPO VEHICULO)");
        }
        return varPosicionVector;
    }

    public String[] listarTipoVehiculo(int varTamañoArreglo) {
        String respuestaListarVehiculo[] = new String[varTamañoArreglo];
        try {
            objConectar = objConexionBD.conexionBD();
            if (objConectar != null) { //validar la conexion de BD 
                varConsulta = "SELECT tipovehiculos.tipovehiculo FROM tipovehiculos WHERE tipovehiculos.id_estado = 1;";
                objAbrirConexon = objConectar.prepareStatement(varConsulta);
                objResultaBD = objAbrirConexon.executeQuery();
                int varContador = 0;
                while (objResultaBD.next()) {
                    respuestaListarVehiculo[varContador] = objResultaBD.getString("tipovehiculo");
                    varContador++;
                }
                objConexionBD.desconectarBD();
                return respuestaListarVehiculo;
            }
        } catch (SQLException e) {
            objExcepcion.excepcionGuardado(1, "FALLO INESPERADO (LISTAR TIPO VEHICULO)");
        }
        return respuestaListarVehiculo;
    }

    public String[] buscarVehiculo(String varPlaca) {
        String[] varRespuestaVehiculo = null;
        try {
            objConectar = objConexionBD.conexionBD();
            if (objConectar != null) { //validar la conexion de BD 
                varConsulta = "SELECT * FROM vehiculos WHERE vehiculos.placa = ? AND vehiculos.id_estado = 1;";
                objAbrirConexon = objConectar.prepareStatement(varConsulta);
                objAbrirConexon.setString(1, varPlaca);
                objResultaBD = objAbrirConexon.executeQuery();
                if (objResultaBD.next()) {
                    varRespuestaVehiculo = new String[4];
                    varRespuestaVehiculo[0] = objResultaBD.getString("id_vehiculo");
                    varRespuestaVehiculo[1] = objResultaBD.getString("placa");
                    varRespuestaVehiculo[2] = objResultaBD.getString("modelo");
                    varRespuestaVehiculo[3] = objResultaBD.getString("id_tipovehiculo");
                }
                objConexionBD.desconectarBD();
                return varRespuestaVehiculo;
            }
        } catch (SQLException e) {
            objExcepcion.excepcionGuardado(1, "FALLO INESPERADO (BUSQUEDA DE VEHICULO)");
        }
        return varRespuestaVehiculo;
    }

    private boolean verificarVehiculo(String varPlaca) {
        boolean varRespuesta = false;
        try {
            objConectar = objConexionBD.conexionBD();
            if (objConectar != null) { //validar la conexion de BD 
                varConsulta = "SELECT * FROM vehiculos WHERE vehiculos.placa = ? AND vehiculos.id_estado = 1;";
                objAbrirConexon = objConectar.prepareStatement(varConsulta);
                objAbrirConexon.setString(1, varPlaca);
                objResultaBD = objAbrirConexon.executeQuery();
                if (objResultaBD.next()) {
                    return true;
                }
                objConexionBD.desconectarBD();
                return varRespuesta;
            }
        } catch (SQLException e) {
            objExcepcion.excepcionGuardado(1, "FALLO INESPERADO (BUSQUEDA DE VEHICULO)");
        }
        return varRespuesta;
    }

    public boolean registrarVehiculo(String varPlaca, String varModelo, int varTipoVehiculo, int varIdUsuario, int varIdEstado) {
        if (verificarVehiculo(varPlaca)) {
            return false;
        } else {
            try {
                objConectar = objConexionBD.conexionBD();
                if (objConectar != null) { //validar la conexion de BD 
                    varConsulta = "INSERT INTO vehiculos (vehiculos.placa, vehiculos.modelo, vehiculos.id_tipoVehiculo, vehiculos.id_usuario, vehiculos.id_estado) VALUES (?,?,?,?,?)";
                    objAbrirConexon = objConectar.prepareStatement(varConsulta);
                    objAbrirConexon.setString(1, varPlaca);
                    objAbrirConexon.setString(2, varModelo);
                    objAbrirConexon.setInt(3, varTipoVehiculo);
                    objAbrirConexon.setInt(4, varIdUsuario);
                    objAbrirConexon.setInt(5, varIdEstado);
                    objAbrirConexon.execute();
                    objConexionBD.desconectarBD();
                    return true;
                }
            } catch (SQLException e) {
                objExcepcion.excepcionGuardado(1, "FALLO EL REGISTRO (REGISTRO DE VEHICULO (" + varPlaca + ")");
                
            }
        }
        return false;
    }

    public boolean editarVehiculo(int varId_vehiculo, String varPlaca, String varModelo, int varTipoVehiculo, int varIdUsuario) {
        try {
            objConectar = objConexionBD.conexionBD();
            if (objConectar != null) { //validar la conexion de BD 
                varConsulta = "UPDATE vehiculos SET  vehiculos.placa= ? , vehiculos.modelo = ? , vehiculos.id_tipoVehiculo = ?, vehiculos.id_usuario = ? WHERE vehiculos.id_vehiculo = ? ";
                objAbrirConexon = objConectar.prepareStatement(varConsulta);
                objAbrirConexon.setString(1, varPlaca);
                objAbrirConexon.setString(2, varModelo);
                objAbrirConexon.setInt(3, varTipoVehiculo);
                objAbrirConexon.setInt(4, varIdUsuario);
                objAbrirConexon.setInt(5, varId_vehiculo);
                objAbrirConexon.execute();
                objConexionBD.desconectarBD();
                return true;
            }
        } catch (SQLException e) {
            objExcepcion.excepcionGuardado(1, "FALLO AL EDITAR EL REGISTRO (EDITAR EL VEHICULO)");
        }
        return false;
    }

    public boolean eliminarVehiculo(int varIdEstado, int varIdVehiculo, String varPlaca) {
          try {
            objConectar = objConexionBD.conexionBD();
            if (objConectar != null) { //validar la conexion de BD 
                varConsulta = "UPDATE vehiculos SET  id_estado = ? WHERE vehiculos.id_vehiculo = ? AND vehiculos.placa = ? ";
                objAbrirConexon = objConectar.prepareStatement(varConsulta);
                objAbrirConexon.setInt(1, varIdEstado);
                objAbrirConexon.setInt(2, varIdVehiculo);
                objAbrirConexon.setString(3, varPlaca);
                objAbrirConexon.execute();
                objConexionBD.desconectarBD();
                return true;
            }
        } catch (SQLException e) {
            objExcepcion.excepcionGuardado(1, "FALLO AL ELIMINAR EL REGISTRO (ELIMINAR EL VEHICULO)");
        }
        return false;
        /*
        if (verificarVehiculo(varPlaca)) {
            try {
                objConectar = objConexionBD.conexionBD();
                if (objConectar != null) { //validar la conexion de BD 
                    varConsulta = "DELETE FROM vehiculos WHERE vehiculos.placa = ? ;";
                    objAbrirConexon = objConectar.prepareStatement(varConsulta);
                    objAbrirConexon.setString(1, varPlaca);
                    objAbrirConexon.execute();
                    objConexionBD.desconectarBD();
                    return true;
                }
            } catch (SQLException e) {
                objExcepcion.excepcionGuardado(1, "FALLO AL ELIMINAR EL REGISTRO VEHICULO (ELIMINAR EL VEHICULO)");
            }
        } else {
            return false;
        }
        return false;*/
    }

    public int tamanoVectorListaTipoVehiculo(String varPlaca) {
        try {
            if (varPlaca.equals("")) {
                varConsulta = "SELECT COUNT(*) FROM vehiculos, tipovehiculos, usuarios WHERE vehiculos.id_tipovehiculo = tipovehiculos.id_tipovehiculo AND vehiculos.id_usuario = usuarios.id_usuario AND vehiculos.id_estado = 1;";
            } else {
                varConsulta = "SELECT COUNT(*) FROM vehiculos, tipovehiculos, usuarios WHERE vehiculos.placa LIKE '%" + varPlaca + "%' AND  vehiculos.id_tipovehiculo = tipovehiculos.id_tipovehiculo AND vehiculos.id_usuario = usuarios.id_usuario AND vehiculos.id_estado = 1;";
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

    public String[][] reporteVehiculos(String varPlaca) {
        int varFilas = tamanoVectorListaTipoVehiculo(varPlaca);
        int varColumnas = 4;
        String[][] varVehiculos = new String[varFilas][varColumnas];
        try {
            if (varPlaca.equals("")) {
                varConsulta = "SELECT vehiculos.placa, vehiculos.modelo, tipovehiculos.tipovehiculo, usuarios.nombreapellido FROM vehiculos, tipovehiculos, usuarios WHERE vehiculos.id_tipovehiculo = tipovehiculos.id_tipovehiculo AND vehiculos.id_usuario = usuarios.id_usuario AND vehiculos.id_estado = 1;";
            } else {
                varConsulta = "SELECT vehiculos.placa, vehiculos.modelo, tipovehiculos.tipovehiculo, usuarios.nombreapellido FROM vehiculos, tipovehiculos, usuarios WHERE vehiculos.placa LIKE '%" + varPlaca + "%' AND  vehiculos.id_tipovehiculo = tipovehiculos.id_tipovehiculo AND vehiculos.id_usuario = usuarios.id_usuario AND vehiculos.id_estado = 1;";            
            }
            objConectar = objConexionBD.conexionBD();
            if (objConectar != null) { //validar la conexion de BD 
                objAbrirConexon = objConectar.prepareStatement(varConsulta);
                objResultaBD = objAbrirConexon.executeQuery();
                int varContador = 0;
                while (objResultaBD.next()) {
                    varVehiculos[varContador][0] = objResultaBD.getString("placa");
                    varVehiculos[varContador][1] = objResultaBD.getString("modelo");
                    varVehiculos[varContador][2] = objResultaBD.getString("tipovehiculo");
                    varVehiculos[varContador][3] = objResultaBD.getString("nombreapellido");
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
}
