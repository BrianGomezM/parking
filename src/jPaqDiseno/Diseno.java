/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jPaqDiseno;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class Diseno extends JPanel {
        public Image varImage;
        //METODO PARA INSERTAR UN FONDO EN EL JFRAME
        @Override
        public void paint(Graphics varGraphics) {
            varImage = new ImageIcon(getClass().getResource("/jPaqImagenes/fondo.jpg")).getImage();
            varGraphics.drawImage(varImage, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);//-->metodos
            super.paint(varGraphics);//->metodos
        }
}
