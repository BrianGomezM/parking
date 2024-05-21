/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jPaqParqueadero;


public class UsuarioBD {
        //Atributos de mi usuario
        int varID;
        String varUsuarioLogin;
        String varClave;
        String varNombreApellido;
        String varCorreo;
        String varDocumento;
        Rol varIdRol;

        //Metodo constructor
        public UsuarioBD(){
            this.varID=0;
            this.varUsuarioLogin="";
            this.varClave="";
            this.varNombreApellido="";
            this.varCorreo="";
            this.varDocumento="";
            Rol varIdRol;
        }

        public UsuarioBD(int varID, String varUsuarioLogin, String varClave, String varNombreApellido, String varCorreo, String varDocumento, Rol varIdRol) {
            this.varID = varID;
            this.varUsuarioLogin = varUsuarioLogin;
            this.varClave = varClave;
            this.varNombreApellido = varNombreApellido;
            this.varCorreo = varCorreo;
            this.varDocumento = varDocumento;
            this.varIdRol = varIdRol;
        }

        public int getVarID() {
            return varID;
        }

        public void setVarID(int varID) {
            this.varID = varID;
        }

        public String getVarUsuarioLogin() {
            return varUsuarioLogin;
        }

        public void setVarUsuarioLogin(String varUsuarioLogin) {
            this.varUsuarioLogin = varUsuarioLogin;
        }

        public String getVarClave() {
            return varClave;
        }

        public void setVarClave(String varClave) {
            this.varClave = varClave;
        }

        public String getVarNombreApellido() {
            return varNombreApellido;
        }

        public void setVarNombreApellido(String varNombreApellido) {
            this.varNombreApellido = varNombreApellido;
        }

        public String getVarCorreo() {
            return varCorreo;
        }

        public void setVarCorreo(String varCorreo) {
            this.varCorreo = varCorreo;
        }

        public String getVarDocumento() {
            return varDocumento;
        }

        public void setVarDocumento(String varDocumento) {
            this.varDocumento = varDocumento;
        }

        public Rol getVarIdRol() {
            return varIdRol;
        }

        public void setVarIdRol(Rol varIdRol) {
            this.varIdRol = varIdRol;
        } 
    }

 
