/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jPaqExcepcion;

import jPaqConsultasSQL.ConsultasSQLClienteVehiculo;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Excepcion {

    public String excepcion(String varMensaje, int varDato) {
        String varResultado = "";
        Icon objIcono = new ImageIcon(getClass().getResource("/jPaqImagenes/advertencia.png"));
        switch (varDato) {
            case 0:
                varResultado = (String) JOptionPane.showInputDialog(null, varMensaje, "INCONVENIENTE", JOptionPane.QUESTION_MESSAGE, objIcono, null, null);
                try {
                    if (varResultado.equals("")) {
                        varResultado = "PLACA";
                    }
                } catch (Exception e) {
                    varResultado = "PLACA";
                }
                break;
            case 1:
                Object[] varModelo = {"MODELO", "2023", "2022", "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001",
                    "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981",
                    "1980", "1979", "1978", "1977", "1976"};
                Object varSelecionadoModelo = JOptionPane.showInputDialog(null, varMensaje, "INCONVENIENTE", JOptionPane.QUESTION_MESSAGE, objIcono, varModelo, 1);
                try {
                    varResultado = varSelecionadoModelo.toString();
                } catch (Exception ex) {
                    System.out.println("SELECCIONE UN MODELO");
                }
                break;
            case 2:
                ConsultasSQLClienteVehiculo objCliente = new ConsultasSQLClienteVehiculo();
                Object[] varTipoVehiculo = objCliente.listarTipoVehiculo(objCliente.tamañoVectorListaTipoVehiculo());
                Object varSelecionadoTVehiculo = JOptionPane.showInputDialog(null, varMensaje, "INCONVENIENTE", JOptionPane.QUESTION_MESSAGE, objIcono, varTipoVehiculo, 1);
                try {
                    varResultado = varSelecionadoTVehiculo.toString();
                } catch (Exception ex) {
                    System.out.println("SELECCIONE EL TIPO DE VEHICULO");
                }
                break;
            case 3:
                Object[] options = {"SI", "NO"};
                int varRespuesta = JOptionPane.showOptionDialog(null, varMensaje, "INCONVENIENTE", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, objIcono, options, options[0]);
                varResultado = String.valueOf(varRespuesta);
                break;
            default:
                System.out.println("Error excepcion");
                break;
        }
        return varResultado;
    }

    public void excepcionGuardado(int varDato, String varMensaje) {

        switch (varDato) {
            case 0:
                Icon objIcono = new ImageIcon(getClass().getResource("/jPaqImagenes/comprobado.png"));
                JOptionPane.showMessageDialog(null, varMensaje, "VERIFICACION", JOptionPane.INFORMATION_MESSAGE, objIcono);
                break;
            case 1:
                Icon objIcono1 = new ImageIcon(getClass().getResource("/jPaqImagenes/advertencia.png"));
                JOptionPane.showMessageDialog(null, varMensaje, "VERIFICACION", JOptionPane.INFORMATION_MESSAGE, objIcono1);
                break;
            default:
                System.err.println("Error");
                break;
        }

    }
}
