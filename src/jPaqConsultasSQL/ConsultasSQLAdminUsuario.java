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

public class ConsultasSQLAdminUsuario {

    private Connection objConectar = null;
    private final ConexionBD objConexionBD = new ConexionBD();
    private PreparedStatement objAbrirConexon;
    private ResultSet objResultaBD;
    String varConsulta = "";
    private final Excepcion objExcepcion = new Excepcion();

    public int tamañoSQL(String varDocumento, int varQSL) {
        int varResultado = 0;
        try {
            switch (varQSL) {
                case 0:
                    varConsulta = "SELECT COUNT(*) FROM usuarios WHERE usuarios.id_estado=1 AND usuarios.documento =" + varDocumento + ";";
                    break;
                case 1:
                    varConsulta = "SELECT COUNT(*) FROM usuarios WHERE usuarios.id_estado=1 AND usuarios.documento LIKE '%" + varDocumento + "%' ;";
                    break;
                case 2:
                    varConsulta = "SELECT COUNT(*) FROM usuarios WHERE usuarios.id_estado=1;";
                    break;
                default:
                    System.err.println("Error consultar usuarios");
                    break;
            };
            objConectar = objConexionBD.conexionBD();
            if (objConectar != null) { //validar la conexion de BD 
                objAbrirConexon = objConectar.prepareStatement(varConsulta);
                objResultaBD = objAbrirConexon.executeQuery();
                if (objResultaBD.next()) {
                    varResultado = objResultaBD.getInt(1);
                    System.err.println(varResultado);
                    objConexionBD.desconectarBD();
                    return varResultado;
                }
                return varResultado;
            }
        } catch (SQLException e) {
            objExcepcion.excepcionGuardado(1, "FALLO INESPERADO TAMAÑO SQL");
        }
        return varResultado;
    }
    
       public String[][] consultarUsuarios(String varDocumento, int varTamañoSQL, int varQSL) {
        String[][] varResultado = null;
        if (varTamañoSQL > 0) {
            varResultado = new String[varTamañoSQL][5];
            try {
                if (varQSL==2) {
                    varConsulta = "SELECT * FROM usuarios, roles WHERE usuarios.id_estado=1 AND usuarios.id_rol = roles.id_rol;";
                } else {
                    varConsulta = "SELECT * FROM usuarios, roles WHERE usuarios.id_estado=1 AND usuarios.documento LIKE '%" + varDocumento + "%' AND usuarios.id_rol = roles.id_rol ;";
                }
                objConectar = objConexionBD.conexionBD();
                if (objConectar != null) { //validar la conexion de BD 
                    objAbrirConexon = objConectar.prepareStatement(varConsulta);
                    objResultaBD = objAbrirConexon.executeQuery();
                    int varContador = 0;
                    while (objResultaBD.next()) {
                        varResultado[varContador][0] = objResultaBD.getString("usuariologin");
                        varResultado[varContador][1] = objResultaBD.getString("nombreapellido");
                        varResultado[varContador][2] = objResultaBD.getString("correo");
                        varResultado[varContador][3] = objResultaBD.getString("documento");
                        varResultado[varContador][4] = objResultaBD.getString("nombrerol");
                        varContador++;
                    }
                    objConexionBD.desconectarBD();
                    return varResultado;
                }else{
                }
            } catch (SQLException e) {
                objExcepcion.excepcionGuardado(1, "FALLO INESPERADO (LISTAR TIPO DE VEHICULO)");
            }
        }
        return varResultado;
    }
    
    

    public String[] consultaUsuario(String varDocumento) {
        String[] varUsuario = new String[7];
        try {
            varConsulta = "SELECT * FROM usuarios WHERE usuarios.id_estado=1 AND usuarios.documento =" + varDocumento + ";";
            objConectar = objConexionBD.conexionBD();
            if (objConectar != null) { //validar la conexion de BD 
                objAbrirConexon = objConectar.prepareStatement(varConsulta);
                objResultaBD = objAbrirConexon.executeQuery();
                if (objResultaBD.next()) {
                    varUsuario[0] = objResultaBD.getString("id_usuario");
                    varUsuario[1] = objResultaBD.getString("usuariologin");
                    varUsuario[2] = objResultaBD.getString("clave");
                    varUsuario[3] = objResultaBD.getString("nombreapellido");
                    varUsuario[4] = objResultaBD.getString("correo");
                    varUsuario[5] = objResultaBD.getString("documento");
                    varUsuario[6] = objResultaBD.getString("id_rol");
                    objConexionBD.desconectarBD();
                } else {
                    varUsuario = null;
                    return varUsuario;
                }
            }
        } catch (SQLException e) {
            objExcepcion.excepcionGuardado(1, "FALLO INESPERADO (BUSCAR USUARIO)");
        }
        return varUsuario;
    }

    public boolean registrarUsuario(String varUsuariologin, String varClava, String varNombreapellido, String varCorreo, String varDocumento, int varId_rol) {
        try {
            objConectar = objConexionBD.conexionBD();
            if (objConectar != null) { //validar la conexion de BD 
                varConsulta = "INSERT INTO usuarios(usuariologin, clave, nombreapellido, correo, documento, id_rol, id_estado) VALUES (?,?,?,?,?,?,?);";
                objAbrirConexon = objConectar.prepareStatement(varConsulta);
                objAbrirConexon.setString(1, varUsuariologin);
                objAbrirConexon.setString(2, varClava);
                objAbrirConexon.setString(3, varNombreapellido);
                objAbrirConexon.setString(4, varCorreo);
                objAbrirConexon.setString(5, varDocumento);
                objAbrirConexon.setInt(6, varId_rol);
                objAbrirConexon.setInt(7, 1);
                objAbrirConexon.execute();
                objConexionBD.desconectarBD();
                return true;
            }
        } catch (SQLException e) {
            objExcepcion.excepcionGuardado(1, "FALLO AL REGISTRAR USUARIO");
        }
        return false;
    }

    
    public boolean editarUsuario(int varId_usuario, String varUsuariologin, String varClava, String varNombreapellido, String varCorreo, String varDocumento, int varId_rol) {
        try {
            objConectar = objConexionBD.conexionBD();
            if (objConectar != null) { //validar la conexion de BD 
                varConsulta = "UPDATE usuarios SET usuariologin=?, clave=?, nombreapellido =?, correo=?, documento=?, id_rol=?  WHERE usuarios.id_usuario =? AND usuarios.id_estado = 1;";
                objAbrirConexon = objConectar.prepareStatement(varConsulta);
                objAbrirConexon.setString(1, varUsuariologin);
                objAbrirConexon.setString(2, varClava);
                objAbrirConexon.setString(3, varNombreapellido);
                objAbrirConexon.setString(4, varCorreo);
                objAbrirConexon.setString(5, varDocumento);
                objAbrirConexon.setInt(6, varId_rol);
                objAbrirConexon.setInt(7, varId_usuario);
                objAbrirConexon.execute();
                objConexionBD.desconectarBD();
                return true;
            }
        } catch (SQLException e) {
            objExcepcion.excepcionGuardado(1, "FALLO AL ACTUALIZAR EL USUARIO");
        }
        return false;
    }
    
      public boolean eliminarUsuario(int varId_usuario) {
        try {
            objConectar = objConexionBD.conexionBD();
            if (objConectar != null) { //validar la conexion de BD 
                varConsulta = "UPDATE usuarios SET id_estado=?  WHERE usuarios.id_usuario =? AND usuarios.id_estado = 1;";
                objAbrirConexon = objConectar.prepareStatement(varConsulta);
                objAbrirConexon.setInt(1, 2);
                objAbrirConexon.setInt(2, varId_usuario);
                objAbrirConexon.execute();
                objConexionBD.desconectarBD();
                return true;
            }
        } catch (SQLException e) {
            objExcepcion.excepcionGuardado(1, "FALLO AL ELIMINAR EL USUARIO");
        }
        return false;
    }
}
