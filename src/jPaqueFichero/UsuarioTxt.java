/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jPaqueFichero;

import jPaqInterfazLogin.GuiLogin;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class UsuarioTxt {

    private String varRuta = "C:/Users/braya/Desktop/U/programacion/proyecto/usuarios.txt";

    public boolean validarUsuarios(String varUsuario, String varContrasena) {
        String varUsu = varUsuario+ ","+ varContrasena;
        boolean varRespuesta = false;
        Fichero ObjFichero = new Fichero();
        try {
            varRespuesta = ObjFichero.ValidarUsuario(varRuta, varUsu);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GuiLogin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GuiLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return varRespuesta;
    }

    public boolean registrarUsuario(String varUsuario, String VarContraseña) {
        boolean varRespuesta = false;
        Fichero objFichero = new Fichero();
        varRespuesta = objFichero.RegistrarrUsuario(varRuta, varUsuario, VarContraseña);
        return varRespuesta;
    }
}
