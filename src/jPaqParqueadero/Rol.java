/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jPaqParqueadero;


public class Rol {
    int idRol;
    String varNombreRol;

       public Rol(){
        this.idRol=0;
        this.varNombreRol = "";
    }
    
    public Rol(int idRol, String varNombreRol) {
        this.idRol=idRol;
        this.varNombreRol = varNombreRol;
    }

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    public String getVarNombreRol() {
        return varNombreRol;
    }

    public void setVarNombreRol(String varNombreRol) {
        this.varNombreRol = varNombreRol;
    }
    
}
