package jPaqConsultasSQL;

import jPaqConexionBD.ConexionBD;
import jPaqExcepcion.Excepcion;
import jPaqParqueadero.GlobalUser;
import jPaqParqueadero.Rol;
import jPaqParqueadero.UsuarioBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConsultaSQLLogin {

    //instancias 
    private final Excepcion objExcepcion = new Excepcion();
    private final ConexionBD objConexionBD = new ConexionBD();
    private GlobalUser objUser;
    private UsuarioBD objUsuarioBD;
    private Rol objRol;
    private Connection objConectar = null;
    private PreparedStatement objAbrirConexon;
    private ResultSet objResultaBD;

    //variable
    private String varConsulta = "";

    private boolean loginBD(String varUsuario, String varClave) {
        try {
            objConectar = objConexionBD.conexionBD();
            if (objConectar != null) { //validar la conexion de BD 
                varConsulta = "SELECT * FROM usuarios, roles WHERE usuarios.usuariologin= ? and usuarios.clave= ? AND  usuarios.id_rol = roles.id_rol;";
                objAbrirConexon = objConectar.prepareStatement(varConsulta);
                objAbrirConexon.setString(1, varUsuario);
                objAbrirConexon.setString(2, varClave);
                objResultaBD = objAbrirConexon.executeQuery();
                if (objResultaBD.next()) {
                    objUsuarioBD = new UsuarioBD(objResultaBD.getInt("id_usuario"),
                            objResultaBD.getString("usuariologin"),
                            objResultaBD.getString("clave"),
                            objResultaBD.getString("nombreapellido"),
                            objResultaBD.getString("correo"),
                            objResultaBD.getString("documento"), (objRol = new Rol(objResultaBD.getInt("id_rol"),
                            objResultaBD.getString("nombrerol"))));
                    objUser = new GlobalUser(objUsuarioBD.getVarIdRol().getIdRol(),objUsuarioBD.getVarID(),objUsuarioBD.getVarNombreApellido(), objUsuarioBD.getVarIdRol().getVarNombreRol(), objUsuarioBD.getVarDocumento());
                    objConexionBD.desconectarBD();
                    return true;
                }
                return false;
            }
        } catch (SQLException e) {
            objExcepcion.excepcionGuardado(1, "FALLO INESPERADO (LOGIN)");
        }
        return false;
    }

    public boolean consultasSQL(int varSQL, String varUsuario, String varClave) {
        switch (varSQL) {
            case 0:
                return loginBD(varUsuario, varClave);
            default:
                System.err.println("Error inesperado (MetodoSQL)");
                return false;
        }
    }

    public UsuarioBD getObjUsuarioBD() {
        return objUsuarioBD;
    }

    public GlobalUser getObjUser() {
        return objUser;
    }

}
