package jPaqInterfazMenuAdmin;

import jPaqConsultasSQL.ConsultasSQLAdminVehiculo;
import jPaqDiseno.Diseno;
import jPaqExcepcion.Excepcion;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.table.DefaultTableModel;

public class GuiRegistarVehiculo extends javax.swing.JFrame {

    ConsultasSQLAdminVehiculo objAdminVehiculo = new ConsultasSQLAdminVehiculo();
    private final Excepcion objException = new Excepcion();

    public boolean validarCampoVacio() {
        jTTipoVehiculo.setText(jTTipoVehiculo.getText().toUpperCase());
        if ((jTTipoVehiculo.getText().equals("TIPO VEHICULO")) || (jTTipoVehiculo.getText().equals(""))) {
            String varResultado = objException.excepcion("PORFAVOR INGRESE EL TIPO DE VEHICULO", 0);
            jTTipoVehiculo.setText(varResultado);
            return false;
        }
        return true;
    }

    public GuiRegistarVehiculo() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTCrudVehiculo = new javax.swing.JTabbedPane();
        jPRegkistrarTVehiculo = new Diseno();
        jTTipoVehiculo = new javax.swing.JTextField();
        jBTBuscarTVehiculo = new javax.swing.JButton();
        jBTLimpiarRV = new javax.swing.JButton();
        jBTEditarVehiculo = new javax.swing.JButton();
        jBTEliminarVehiculo = new javax.swing.JButton();
        jSPListarTVehiculo = new javax.swing.JScrollPane();
        jTBListarTipoVehiculo = new javax.swing.JTable();
        jBTRegistrarVehiculo = new javax.swing.JButton();
        jPSalirTVehiculo = new javax.swing.JPanel();
        jBTSalirVehiculo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);

        jTCrudVehiculo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "REGISTRAR-TIPO-VEHICULO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 1, 18))); // NOI18N

        jTTipoVehiculo.setBackground(new java.awt.Color(246, 246, 246));
        jTTipoVehiculo.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jTTipoVehiculo.setForeground(new java.awt.Color(102, 102, 102));
        jTTipoVehiculo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTTipoVehiculo.setText("TIPO VEHICULO");
        jTTipoVehiculo.setAutoscrolls(false);
        jTTipoVehiculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTTipoVehiculoMouseClicked(evt);
            }
        });
        jTTipoVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTTipoVehiculoActionPerformed(evt);
            }
        });

        jBTBuscarTVehiculo.setBackground(new java.awt.Color(246, 246, 246));
        jBTBuscarTVehiculo.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jBTBuscarTVehiculo.setForeground(new java.awt.Color(102, 102, 102));
        jBTBuscarTVehiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jPaqImagenes/car.png"))); // NOI18N
        jBTBuscarTVehiculo.setToolTipText("");
        jBTBuscarTVehiculo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBTBuscarTVehiculo.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jBTBuscarTVehiculo.setIconTextGap(40);
        jBTBuscarTVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTBuscarTVehiculoActionPerformed(evt);
            }
        });

        jBTLimpiarRV.setBackground(new java.awt.Color(246, 246, 246));
        jBTLimpiarRV.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jBTLimpiarRV.setForeground(new java.awt.Color(102, 102, 102));
        jBTLimpiarRV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jPaqImagenes/clean.png"))); // NOI18N
        jBTLimpiarRV.setText("LIMPIAR");
        jBTLimpiarRV.setToolTipText("");
        jBTLimpiarRV.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBTLimpiarRV.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jBTLimpiarRV.setIconTextGap(40);
        jBTLimpiarRV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTLimpiarRVActionPerformed(evt);
            }
        });

        jBTEditarVehiculo.setBackground(new java.awt.Color(246, 246, 246));
        jBTEditarVehiculo.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jBTEditarVehiculo.setForeground(new java.awt.Color(102, 102, 102));
        jBTEditarVehiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jPaqImagenes/carU.png"))); // NOI18N
        jBTEditarVehiculo.setText("EDITAR VEHICULO");
        jBTEditarVehiculo.setToolTipText("");
        jBTEditarVehiculo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBTEditarVehiculo.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jBTEditarVehiculo.setIconTextGap(40);
        jBTEditarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTEditarVehiculoActionPerformed(evt);
            }
        });

        jBTEliminarVehiculo.setBackground(new java.awt.Color(246, 246, 246));
        jBTEliminarVehiculo.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jBTEliminarVehiculo.setForeground(new java.awt.Color(102, 102, 102));
        jBTEliminarVehiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jPaqImagenes/carD.png"))); // NOI18N
        jBTEliminarVehiculo.setText("ELIMINAR TARIFA");
        jBTEliminarVehiculo.setToolTipText("");
        jBTEliminarVehiculo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBTEliminarVehiculo.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jBTEliminarVehiculo.setIconTextGap(40);
        jBTEliminarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTEliminarVehiculoActionPerformed(evt);
            }
        });

        jTBListarTipoVehiculo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jSPListarTVehiculo.setViewportView(jTBListarTipoVehiculo);

        jBTRegistrarVehiculo.setBackground(new java.awt.Color(246, 246, 246));
        jBTRegistrarVehiculo.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jBTRegistrarVehiculo.setForeground(new java.awt.Color(102, 102, 102));
        jBTRegistrarVehiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jPaqImagenes/carI.png"))); // NOI18N
        jBTRegistrarVehiculo.setText("REGISTRAR VEHICULO");
        jBTRegistrarVehiculo.setToolTipText("");
        jBTRegistrarVehiculo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBTRegistrarVehiculo.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jBTRegistrarVehiculo.setIconTextGap(40);
        jBTRegistrarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTRegistrarVehiculoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPRegkistrarTVehiculoLayout = new javax.swing.GroupLayout(jPRegkistrarTVehiculo);
        jPRegkistrarTVehiculo.setLayout(jPRegkistrarTVehiculoLayout);
        jPRegkistrarTVehiculoLayout.setHorizontalGroup(
            jPRegkistrarTVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPRegkistrarTVehiculoLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPRegkistrarTVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSPListarTVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 717, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPRegkistrarTVehiculoLayout.createSequentialGroup()
                        .addGroup(jPRegkistrarTVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jBTRegistrarVehiculo, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
                            .addComponent(jBTLimpiarRV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(21, 21, 21)
                        .addGroup(jPRegkistrarTVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBTEditarVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBTEliminarVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPRegkistrarTVehiculoLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jBTBuscarTVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTTipoVehiculo)))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPRegkistrarTVehiculoLayout.setVerticalGroup(
            jPRegkistrarTVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPRegkistrarTVehiculoLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPRegkistrarTVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTTipoVehiculo, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addComponent(jBTBuscarTVehiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24)
                .addComponent(jSPListarTVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPRegkistrarTVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBTEditarVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBTRegistrarVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPRegkistrarTVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBTEliminarVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBTLimpiarRV, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 28, Short.MAX_VALUE))
        );

        jTCrudVehiculo.addTab("REGISTRAR VEHICULO", jPRegkistrarTVehiculo);

        jBTSalirVehiculo.setBackground(new java.awt.Color(255, 51, 51));
        jBTSalirVehiculo.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jBTSalirVehiculo.setForeground(new java.awt.Color(102, 102, 102));
        jBTSalirVehiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jPaqImagenes/salir.png"))); // NOI18N
        jBTSalirVehiculo.setText("CERRAR REGISRO VEHICULO");
        jBTSalirVehiculo.setToolTipText("");
        jBTSalirVehiculo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBTSalirVehiculo.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jBTSalirVehiculo.setIconTextGap(40);
        jBTSalirVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTSalirVehiculoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPSalirTVehiculoLayout = new javax.swing.GroupLayout(jPSalirTVehiculo);
        jPSalirTVehiculo.setLayout(jPSalirTVehiculoLayout);
        jPSalirTVehiculoLayout.setHorizontalGroup(
            jPSalirTVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPSalirTVehiculoLayout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(jBTSalirVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(215, Short.MAX_VALUE))
        );
        jPSalirTVehiculoLayout.setVerticalGroup(
            jPSalirTVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPSalirTVehiculoLayout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addComponent(jBTSalirVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(314, Short.MAX_VALUE))
        );

        jTCrudVehiculo.addTab("SALIR", jPSalirTVehiculo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jTCrudVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 825, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jTCrudVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTTipoVehiculoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTTipoVehiculoMouseClicked
        jTTipoVehiculo.setText("");
    }//GEN-LAST:event_jTTipoVehiculoMouseClicked

    private void jTTipoVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTTipoVehiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTTipoVehiculoActionPerformed

    private void jBTBuscarTVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTBuscarTVehiculoActionPerformed
        String varResultado = "";
        if ((jTTipoVehiculo.getText().equals("")) || (jTTipoVehiculo.getText().equals("TIPO VEHICULO"))) {
            varResultado = "";
        } else {
            varResultado = jTTipoVehiculo.getText();
        }

        int varTamañoSQL = objAdminVehiculo.tamañoSQL(varResultado, 0);
        if (varTamañoSQL == 0) {
            objException.excepcionGuardado(1, "NO HAY INFORMACION EN EL SISTEMA");
        } else {
            mostrarMatriz(objAdminVehiculo.consultarTipoVehiculos(varResultado, varTamañoSQL));
        }
    }//GEN-LAST:event_jBTBuscarTVehiculoActionPerformed
    public void mostrarMatriz(String varMatriz[][]) {
        DefaultTableModel objModel = (DefaultTableModel) jTBListarTipoVehiculo.getModel();
        objModel.setRowCount(varMatriz.length);
        objModel.setColumnCount(1);
        jTBListarTipoVehiculo.getColumn("A").setHeaderValue("TIPO DE VEHICULO");
        for (int i = 0; i < varMatriz.length; i++) {
            for (int j = 0; j < 1; j++) {
                jTBListarTipoVehiculo.setValueAt(varMatriz[i][j], i, j);
            }
        }

    }


    private void jBTLimpiarRVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTLimpiarRVActionPerformed
        jTTipoVehiculo.setText("TIPO VEHICULO");
    }//GEN-LAST:event_jBTLimpiarRVActionPerformed

    private void jBTEditarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTEditarVehiculoActionPerformed
        String varNombreV = "";
        if (validarCampoVacio()) {
            String varResultado = jTTipoVehiculo.getText();
            int varTamañoSQL = objAdminVehiculo.tamañoSQL(varResultado, 1);
            if (varTamañoSQL > 0) {
                varNombreV = objException.excepcion("INGRESE EL NUEVO NOMBRE DEL VEHICULO", 0);
                System.err.println(varNombreV);
                if ((varNombreV.equals(""))|| (varNombreV.equals("PLACA"))) {
                    objException.excepcionGuardado(1, "VALOR DEL NUEVO NOMBRE VACIO");
                } else {
                    varTamañoSQL = objAdminVehiculo.tamañoSQL(varNombreV, 1);
                    if (varTamañoSQL == 0) {
                        if (objAdminVehiculo.editarTipoVehiculo(varResultado, varNombreV)) {
                            objException.excepcionGuardado(0, "REGISTRO ACTUALIZADO");
                        } else {
                            objException.excepcionGuardado(1, "EL REGISTRO NO ACTUALIZADO");
                        }
                    } else {
                        objException.excepcionGuardado(1, "EL REGISTRO PARA ACUTALIZAR YA EXISTE");
                    }
                }
            } else {
                objException.excepcionGuardado(1, "EL REGISTRO NO EXISTE");
            }
        }
    }//GEN-LAST:event_jBTEditarVehiculoActionPerformed

    private void jBTEliminarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTEliminarVehiculoActionPerformed
        if (validarCampoVacio()) {
            String varResultado = jTTipoVehiculo.getText();
            int varTamañoSQL = objAdminVehiculo.tamañoSQL(varResultado, 1);
            if (varTamañoSQL > 0) {
                if (objAdminVehiculo.eliminarTipoVehiculo(varResultado)) {
                    objException.excepcionGuardado(0, "REGISTRO ELIMINADO");
                } else {
                    objException.excepcionGuardado(1, "EL REGISTRO NO ELIMINADO");
                }
            } else {
                objException.excepcionGuardado(1, "EL REGISTRO NO EXISTE");
            }
        }
    }//GEN-LAST:event_jBTEliminarVehiculoActionPerformed

    private void jBTSalirVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTSalirVehiculoActionPerformed
        dispose();
    }//GEN-LAST:event_jBTSalirVehiculoActionPerformed

    private void jBTRegistrarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTRegistrarVehiculoActionPerformed
        if (validarCampoVacio()) {
            String varResultado = jTTipoVehiculo.getText();
            int varTamañoSQL = objAdminVehiculo.tamañoSQL(varResultado, 1);
            if (varTamañoSQL > 0) {
                objException.excepcionGuardado(1, "SE ENCUENTRA YA UN REGISTRO EN NUESTRO SISTEMA");
            } else {
                if (objAdminVehiculo.registrarTipoVehiculo(varResultado)) {
                    objException.excepcionGuardado(0, "REGISTRO EXITOSO");
                } else {
                    objException.excepcionGuardado(1, "INCONVENIENTE EN EL REGISTRO");
                }
            }
        }
    }//GEN-LAST:event_jBTRegistrarVehiculoActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(GuiRegistarVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiRegistarVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiRegistarVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiRegistarVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiRegistarVehiculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBTBuscarTVehiculo;
    private javax.swing.JButton jBTEditarVehiculo;
    private javax.swing.JButton jBTEliminarVehiculo;
    private javax.swing.JButton jBTLimpiarRV;
    private javax.swing.JButton jBTRegistrarVehiculo;
    private javax.swing.JButton jBTSalirVehiculo;
    private javax.swing.JPanel jPRegkistrarTVehiculo;
    private javax.swing.JPanel jPSalirTVehiculo;
    private javax.swing.JScrollPane jSPListarTVehiculo;
    private javax.swing.JTable jTBListarTipoVehiculo;
    private javax.swing.JTabbedPane jTCrudVehiculo;
    private javax.swing.JTextField jTTipoVehiculo;
    // End of variables declaration//GEN-END:variables
     @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("jPaqImagenes/coche.png"));
        return retValue;
    }

}
