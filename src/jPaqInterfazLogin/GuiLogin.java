package jPaqInterfazLogin;

import jPaqInterfazMenuCliente.GuiMenuCliente;
import jPaqConsultasSQL.ConsultaSQLLogin;
import jPaqDiseno.Diseno;
import jPaqExcepcion.Excepcion;
import jPaqInterfazMenuAdmin.GuiMenuAdmin;
import jPaqParqueadero.GlobalUser;
import java.awt.Image;
import java.awt.Toolkit;


public class GuiLogin extends javax.swing.JFrame {

    Excepcion objException = new Excepcion();

    private void validarCajas() {//METODO PARA VALIDAR LOS CAMPOS VACIOS
        jTUsuario.setText(jTUsuario.getText().toUpperCase());
        jPassword.setText(jPassword.getText().toUpperCase());
        String varPassword = new String(jPassword.getPassword());
        if (jTUsuario.getText().equals("")) {
            jTUsuario.setText("USUARIO");
        }
        if (varPassword.equals("")) {
            jPassword.setText("PASSWORD");
        }
    }

    private boolean validarCajasText() {
        boolean varIngreso = true;
        String varPassword = new String(jPassword.getPassword());
        if ((jTUsuario.getText().equals("")) || (jTUsuario.getText().equals("USUARIO"))) {
            String varResultado = objException.excepcion("PORFAVOR INGRESE EL USUARIO",0);
            jTUsuario.setText(varResultado);
            varIngreso = false;
        } else if ((varPassword.equals("")) || (varPassword.equals("PASSWORD"))) {
            String varResultado = objException.excepcion("PORFAVOR INGRESE LA CONTRASEÑA",0);
            jPassword.setText(varResultado);
            varIngreso = false;
        }
        return varIngreso;
    }

    public GuiLogin() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPFondo = new Diseno();
        jPFondo2 = new Diseno();
        jLLogo = new javax.swing.JLabel();
        jTUsuario = new javax.swing.JTextField();
        jBIngresar = new javax.swing.JButton();
        jLIconoIngresar = new javax.swing.JLabel();
        jLIconoUser = new javax.swing.JLabel();
        jLIconoPassword = new javax.swing.JLabel();
        jPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");
        setIconImage(getIconImage());
        setResizable(false);

        jPFondo2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "VALET-PARKING", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Segoe UI Black", 1, 18))); // NOI18N

        jLLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jPaqImagenes/logo.png"))); // NOI18N
        jLLogo.setToolTipText("");

        jTUsuario.setBackground(new java.awt.Color(246, 246, 246));
        jTUsuario.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jTUsuario.setForeground(new java.awt.Color(102, 102, 102));
        jTUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTUsuario.setText("USUARIO");
        jTUsuario.setAutoscrolls(false);
        jTUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTUsuarioMouseClicked(evt);
            }
        });
        jTUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTUsuarioActionPerformed(evt);
            }
        });

        jBIngresar.setBackground(new java.awt.Color(204, 255, 204));
        jBIngresar.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jBIngresar.setForeground(new java.awt.Color(102, 102, 102));
        jBIngresar.setText("INGRESAR");
        jBIngresar.setToolTipText("");
        jBIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBIngresarActionPerformed(evt);
            }
        });

        jLIconoIngresar.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLIconoIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jPaqImagenes/ingresar.png"))); // NOI18N

        jLIconoUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jPaqImagenes/nick.png"))); // NOI18N

        jLIconoPassword.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLIconoPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jPaqImagenes/contrasena.png"))); // NOI18N

        jPassword.setBackground(new java.awt.Color(246, 246, 246));
        jPassword.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPassword.setText("PASSWORD");
        jPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPasswordMouseClicked(evt);
            }
        });
        jPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPFondo2Layout = new javax.swing.GroupLayout(jPFondo2);
        jPFondo2.setLayout(jPFondo2Layout);
        jPFondo2Layout.setHorizontalGroup(
            jPFondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPFondo2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPFondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPFondo2Layout.createSequentialGroup()
                        .addComponent(jLIconoPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPassword))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPFondo2Layout.createSequentialGroup()
                        .addComponent(jLIconoUser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTUsuario))
                    .addGroup(jPFondo2Layout.createSequentialGroup()
                        .addComponent(jLIconoIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBIngresar, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)))
                .addGap(37, 37, 37))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPFondo2Layout.createSequentialGroup()
                .addGap(0, 128, Short.MAX_VALUE)
                .addComponent(jLLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111))
        );
        jPFondo2Layout.setVerticalGroup(
            jPFondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPFondo2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLLogo)
                .addGap(26, 26, 26)
                .addGroup(jPFondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLIconoUser, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPFondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPFondo2Layout.createSequentialGroup()
                        .addComponent(jPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                        .addGap(30, 30, 30))
                    .addGroup(jPFondo2Layout.createSequentialGroup()
                        .addComponent(jLIconoPassword)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPFondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBIngresar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLIconoIngresar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPFondoLayout = new javax.swing.GroupLayout(jPFondo);
        jPFondo.setLayout(jPFondoLayout);
        jPFondoLayout.setHorizontalGroup(
            jPFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPFondoLayout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jPFondo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );
        jPFondoLayout.setVerticalGroup(
            jPFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPFondoLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jPFondo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(102, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTUsuarioMouseClicked
        validarCajas();
        jTUsuario.setText("");
    }//GEN-LAST:event_jTUsuarioMouseClicked

    private void jPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordMouseClicked
        validarCajas();
        jPassword.setText("");
    }//GEN-LAST:event_jPasswordMouseClicked

    private void jBIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBIngresarActionPerformed
        if (validarCajasText()) {
            ConsultaSQLLogin objConsultaSQL = new ConsultaSQLLogin();
            if (objConsultaSQL.consultasSQL(0, this.jTUsuario.getText(), this.jPassword.getText())) {
                switch (GlobalUser.getVarIdRol()){
                    case 2:
                        GuiMenuCliente objMenuCliente = new GuiMenuCliente();
                        objMenuCliente.setVisible(true);
                        this.dispose();
                        break;
                    case 1:
                        GuiMenuAdmin objMenuAdmin = new GuiMenuAdmin();
                        objMenuAdmin.setVisible(true);
                        this.dispose();
                        break;
                    default:
                        objException.excepcionGuardado(1, "ERROR, ROL NO ENCONTRADO");
                        break;
                }
            } else {
                objException.excepcionGuardado(1, "USUARIO NO EXISTE");
            }

            /*TRABAJAR CON ARCHIVOS PLANOS
            UsuarioTxt objUsuarios = new UsuarioTxt();
            if (objUsuarios.validarUsuarios(this.jTUsuario.getText(), this.jPassword.getText())) {
                GuiMenu objMenu = new GuiMenu();
                objMenu.setVisible(true);
                this.dispose();
            } else {
                objException.excepcionGuardado(1, "USUARIO NO EXISTE");
            }*/
        }

    }//GEN-LAST:event_jBIngresarActionPerformed

    private void jTUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTUsuarioActionPerformed

    private void jPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GuiLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBIngresar;
    private javax.swing.JLabel jLIconoIngresar;
    private javax.swing.JLabel jLIconoPassword;
    private javax.swing.JLabel jLIconoUser;
    private javax.swing.JLabel jLLogo;
    private javax.swing.JPanel jPFondo;
    private javax.swing.JPanel jPFondo2;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JTextField jTUsuario;
    // End of variables declaration//GEN-END:variables
     @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("jPaqImagenes/coche.png"));
        return retValue;
    }
}
