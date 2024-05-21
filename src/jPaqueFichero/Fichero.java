/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jPaqueFichero;
import jPaqInterfazMenuCliente.GuiMenuCliente;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Fichero {
//FUNCIONS PARA CADENAS, PODER DELIMITAR O DIVIDIR LA CADENA.
    public boolean ValidarUsuario(String varArchivo, String varUsuario) throws FileNotFoundException, IOException {
        String varCadena = "";
        boolean varRespuesta = false;
        FileReader objFichero = new FileReader(varArchivo);
        try (BufferedReader objBuffer = new BufferedReader(objFichero)) {
            while ((varCadena = objBuffer.readLine()) != null) {
                if (varUsuario.equals(varCadena)) {
                    varRespuesta = true;
                }
            }
        }
        return varRespuesta;
    }

    public boolean RegistrarrUsuario(String varRuta, String varUsuario, String VarContraseña) {
        boolean varRespuesta = false;
        File objFichero = new File(varRuta);
        if (objFichero.exists()) {
            try (BufferedWriter objBuffer = new BufferedWriter(new FileWriter(varRuta, true))) {
                objBuffer.write(varUsuario + "," + VarContraseña + "\n");
                varRespuesta = true;

            } catch (IOException ex) {
                Logger.getLogger(GuiMenuCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            try {objFichero.createNewFile();
                try (BufferedWriter objBuffer = new BufferedWriter(new FileWriter(varRuta, true))) {
                    objBuffer.write(varUsuario + "," + VarContraseña + "\n");
                    varRespuesta = true;
                } catch (IOException ex) {
                    Logger.getLogger(GuiMenuCliente.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (IOException ex) {
                Logger.getLogger(GuiMenuCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return varRespuesta;
    }
}
