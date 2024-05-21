
package jPaqInterfazMenuAdmin;
import jPaqConsultasSQL.ConsultasSQLAdminMonto;
import jPaqConsultasSQL.ConsultasSQLClienteVehiculo;
import jPaqDiseno.Diseno;
import jPaqExcepcion.Excepcion;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.table.DefaultTableModel;


public class GuiRegistrarTarifa extends javax.swing.JFrame {
   ConsultasSQLAdminMonto objAdminMonto = new ConsultasSQLAdminMonto();
    private final Excepcion objException = new Excepcion();
     private String[] respuestaListarVehiculo;
    
    
    
       private void cargarSelectTipoVehiculo() {
        jCBVehiculo.removeAllItems();
        ConsultasSQLClienteVehiculo objCliente = new ConsultasSQLClienteVehiculo();
        respuestaListarVehiculo = objCliente.listarTipoVehiculo(objCliente.tamañoVectorListaTipoVehiculo());
        jCBVehiculo.addItem("TIPO VEHICULO");
        for (int i = 0; i < respuestaListarVehiculo.length; i++) {
            jCBVehiculo.addItem(respuestaListarVehiculo[i]);
        }
    }
   public boolean validarCampoVacio() {
        jTValorTarifa.setText(jTValorTarifa.getText().toUpperCase());
        if ((jTValorTarifa.getText().equals("MONTO")) || (jTValorTarifa.getText().equals(""))) {
            String varResultado = objException.excepcion("PORFAVOR INGRESE EL MONTO", 0);
            jTValorTarifa.setText(varResultado);
            return false;
        }else if (jCBVehiculo.getSelectedIndex()==0){
            String varResultado = objException.excepcion(" SELECCIONE EL TIPO DE VEHICULO", 2);
            jCBVehiculo.setSelectedItem(varResultado);
            return false;
        }
        return true;
    }
   
    public GuiRegistrarTarifa() {
        initComponents();
        setLocationRelativeTo(null);
        cargarSelectTipoVehiculo();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTCrudTarifa = new javax.swing.JTabbedPane();
        jPRegistrarMonto = new Diseno();
        jTValorTarifa = new javax.swing.JTextField();
        jCBVehiculo = new javax.swing.JComboBox<>();
        jLIconoVehiculo = new javax.swing.JLabel();
        jBTRegistrarTarifa = new javax.swing.JButton();
        jBTLimpiarT = new javax.swing.JButton();
        jBTEditarTarifa = new javax.swing.JButton();
        jBTEliminarTarifa = new javax.swing.JButton();
        jSPListarMonto = new javax.swing.JScrollPane();
        jTListarTarifa = new javax.swing.JTable();
        jBTBuscarTarifa = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jBTSalirRT = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);

        jTCrudTarifa.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "REGISTRAR-TARIFA", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 1, 18))); // NOI18N

        jTValorTarifa.setBackground(new java.awt.Color(246, 246, 246));
        jTValorTarifa.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jTValorTarifa.setForeground(new java.awt.Color(102, 102, 102));
        jTValorTarifa.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTValorTarifa.setText("MONTO");
        jTValorTarifa.setAutoscrolls(false);
        jTValorTarifa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTValorTarifaMouseClicked(evt);
            }
        });
        jTValorTarifa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTValorTarifaActionPerformed(evt);
            }
        });

        jCBVehiculo.setBackground(new java.awt.Color(246, 246, 246));
        jCBVehiculo.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jCBVehiculo.setForeground(new java.awt.Color(102, 102, 102));
        jCBVehiculo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "VEHICULOS", "MOTO", "CARRO", "CAMION" }));
        jCBVehiculo.setToolTipText("");
        jCBVehiculo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jCBVehiculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCBVehiculoMouseClicked(evt);
            }
        });

        jLIconoVehiculo.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLIconoVehiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jPaqImagenes/car.png"))); // NOI18N

        jBTRegistrarTarifa.setBackground(new java.awt.Color(246, 246, 246));
        jBTRegistrarTarifa.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jBTRegistrarTarifa.setForeground(new java.awt.Color(102, 102, 102));
        jBTRegistrarTarifa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jPaqImagenes/montoI.png"))); // NOI18N
        jBTRegistrarTarifa.setText("REGISTRAR TARIFA");
        jBTRegistrarTarifa.setToolTipText("");
        jBTRegistrarTarifa.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBTRegistrarTarifa.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jBTRegistrarTarifa.setIconTextGap(40);
        jBTRegistrarTarifa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTRegistrarTarifaActionPerformed(evt);
            }
        });

        jBTLimpiarT.setBackground(new java.awt.Color(246, 246, 246));
        jBTLimpiarT.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jBTLimpiarT.setForeground(new java.awt.Color(102, 102, 102));
        jBTLimpiarT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jPaqImagenes/clean.png"))); // NOI18N
        jBTLimpiarT.setText("LIMPIAR");
        jBTLimpiarT.setToolTipText("");
        jBTLimpiarT.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBTLimpiarT.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jBTLimpiarT.setIconTextGap(40);
        jBTLimpiarT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTLimpiarTActionPerformed(evt);
            }
        });

        jBTEditarTarifa.setBackground(new java.awt.Color(246, 246, 246));
        jBTEditarTarifa.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jBTEditarTarifa.setForeground(new java.awt.Color(102, 102, 102));
        jBTEditarTarifa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jPaqImagenes/montoU.png"))); // NOI18N
        jBTEditarTarifa.setText("EDITAR TARIFA");
        jBTEditarTarifa.setToolTipText("");
        jBTEditarTarifa.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBTEditarTarifa.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jBTEditarTarifa.setIconTextGap(40);
        jBTEditarTarifa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTEditarTarifaActionPerformed(evt);
            }
        });

        jBTEliminarTarifa.setBackground(new java.awt.Color(246, 246, 246));
        jBTEliminarTarifa.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jBTEliminarTarifa.setForeground(new java.awt.Color(102, 102, 102));
        jBTEliminarTarifa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jPaqImagenes/montoD.png"))); // NOI18N
        jBTEliminarTarifa.setText("ELIMINAR TARIFA");
        jBTEliminarTarifa.setToolTipText("");
        jBTEliminarTarifa.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBTEliminarTarifa.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jBTEliminarTarifa.setIconTextGap(40);
        jBTEliminarTarifa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTEliminarTarifaActionPerformed(evt);
            }
        });

        jTListarTarifa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jSPListarMonto.setViewportView(jTListarTarifa);

        jBTBuscarTarifa.setBackground(new java.awt.Color(246, 246, 246));
        jBTBuscarTarifa.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jBTBuscarTarifa.setForeground(new java.awt.Color(102, 102, 102));
        jBTBuscarTarifa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jPaqImagenes/monto.png"))); // NOI18N
        jBTBuscarTarifa.setToolTipText("");
        jBTBuscarTarifa.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBTBuscarTarifa.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jBTBuscarTarifa.setIconTextGap(40);
        jBTBuscarTarifa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTBuscarTarifaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPRegistrarMontoLayout = new javax.swing.GroupLayout(jPRegistrarMonto);
        jPRegistrarMonto.setLayout(jPRegistrarMontoLayout);
        jPRegistrarMontoLayout.setHorizontalGroup(
            jPRegistrarMontoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPRegistrarMontoLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPRegistrarMontoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPRegistrarMontoLayout.createSequentialGroup()
                        .addComponent(jBTBuscarTarifa, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTValorTarifa, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPRegistrarMontoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPRegistrarMontoLayout.createSequentialGroup()
                            .addComponent(jLIconoVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jCBVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jSPListarMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 717, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPRegistrarMontoLayout.createSequentialGroup()
                            .addGroup(jPRegistrarMontoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jBTRegistrarTarifa)
                                .addComponent(jBTLimpiarT, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPRegistrarMontoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jBTEliminarTarifa, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jBTEditarTarifa, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPRegistrarMontoLayout.setVerticalGroup(
            jPRegistrarMontoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPRegistrarMontoLayout.createSequentialGroup()
                .addGroup(jPRegistrarMontoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPRegistrarMontoLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPRegistrarMontoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTValorTarifa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                            .addComponent(jBTBuscarTarifa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPRegistrarMontoLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPRegistrarMontoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jCBVehiculo, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                            .addComponent(jLIconoVehiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(32, 32, 32)
                .addComponent(jSPListarMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPRegistrarMontoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBTRegistrarTarifa, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBTEditarTarifa, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPRegistrarMontoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBTEliminarTarifa, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBTLimpiarT, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 28, Short.MAX_VALUE))
        );

        jTCrudTarifa.addTab("REGISTRAR TARIFA", jPRegistrarMonto);

        jBTSalirRT.setBackground(new java.awt.Color(255, 51, 51));
        jBTSalirRT.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jBTSalirRT.setForeground(new java.awt.Color(102, 102, 102));
        jBTSalirRT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jPaqImagenes/salir.png"))); // NOI18N
        jBTSalirRT.setText("CERRAR TARIFA");
        jBTSalirRT.setToolTipText("");
        jBTSalirRT.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBTSalirRT.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jBTSalirRT.setIconTextGap(40);
        jBTSalirRT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTSalirRTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(jBTSalirRT, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(262, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addComponent(jBTSalirRT, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(314, Short.MAX_VALUE))
        );

        jTCrudTarifa.addTab("SALIR", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jTCrudTarifa, javax.swing.GroupLayout.PREFERRED_SIZE, 825, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jTCrudTarifa, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBTSalirRTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTSalirRTActionPerformed
        dispose();
    }//GEN-LAST:event_jBTSalirRTActionPerformed

    private void jBTEliminarTarifaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTEliminarTarifaActionPerformed
      if(jCBVehiculo.getSelectedIndex()!=0){
           int varTamañoSQL = objAdminMonto.tamañoSQL(jTValorTarifa.getText(), jCBVehiculo.getSelectedItem().toString(),1, 1);
           if(varTamañoSQL > 0){
                if (objAdminMonto.eliminarTarifa( jCBVehiculo.getSelectedIndex())) {
                    objException.excepcionGuardado(0, "REGISTRO ELIMINADO");
                } else {
                    objException.excepcionGuardado(1, "REGISTRO NO ELIMINADO");
                }
            }else{
                objException.excepcionGuardado(1, "NO HAY REGISTROS PARA ESTE VEHICULO");
           }
       }else{
          objException.excepcionGuardado(1, "SELECCIONE EL VEHICULO QUE REQUIERE ELIMINAR LA TARIFA");
      }
    }//GEN-LAST:event_jBTEliminarTarifaActionPerformed

    private void jBTEditarTarifaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTEditarTarifaActionPerformed
       if(validarCampoVacio()){
           int varTamañoSQL = objAdminMonto.tamañoSQL(jTValorTarifa.getText(), jCBVehiculo.getSelectedItem().toString(),1, 1);
           if(varTamañoSQL > 0){
                if (objAdminMonto.editarTarifa(jTValorTarifa.getText(), jCBVehiculo.getSelectedIndex())) {
                    objException.excepcionGuardado(0, "REGISTRO ACTUALIZADO");
                } else {
                    objException.excepcionGuardado(1, "REGISTRO NO ACTUALIZADO");
                }
            }else{
                objException.excepcionGuardado(1, "NO TIENE TARIFA ESTE VEHICULO");
           }
       }
    }//GEN-LAST:event_jBTEditarTarifaActionPerformed

    private void jBTLimpiarTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTLimpiarTActionPerformed
       jTValorTarifa.setText("MONTO");
       jCBVehiculo.setSelectedItem("TIPO VEHICULO");
    }//GEN-LAST:event_jBTLimpiarTActionPerformed

    private void jBTRegistrarTarifaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTRegistrarTarifaActionPerformed
        if(validarCampoVacio()){
            int varTamañoSQL = objAdminMonto.tamañoSQL(jTValorTarifa.getText(), jCBVehiculo.getSelectedItem().toString(),1, 1);
            if(varTamañoSQL > 0){
                 objException.excepcionGuardado(1, "YA SE ENCUENTRA UN REGISTRO CON LA TARIFA DEL VEHICULO");
            }else{
                if (objAdminMonto.registrarTarifa(jTValorTarifa.getText(), jCBVehiculo.getSelectedIndex())) {
                    objException.excepcionGuardado(0, "REGISTRO EXITOSO");
                } else {
                    objException.excepcionGuardado(1, "INCONVENIENTE EN EL REGISTRO");
                }
            }
        }
    }//GEN-LAST:event_jBTRegistrarTarifaActionPerformed

    private void jTValorTarifaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTValorTarifaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTValorTarifaActionPerformed

    private void jTValorTarifaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTValorTarifaMouseClicked
      jTValorTarifa.setText("");
    }//GEN-LAST:event_jTValorTarifaMouseClicked

    private void jBTBuscarTarifaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTBuscarTarifaActionPerformed
       int varConsulta=0;
       String varMonot = jTValorTarifa.getText();
       String varTipiVehiculo = jCBVehiculo.getSelectedItem().toString();
       
        if (((jTValorTarifa.getText().equals("MONTO")) || (jTValorTarifa.getText().equals("")))&& (jCBVehiculo.getSelectedIndex()==0)){
        varConsulta =0;
        }else if (((!jTValorTarifa.getText().equals("MONTO")) || (!jTValorTarifa.getText().equals("")))&& (jCBVehiculo.getSelectedIndex()==0)){
        varConsulta =2;
        }else if (((jTValorTarifa.getText().equals("MONTO")) || (jTValorTarifa.getText().equals("")))&& (jCBVehiculo.getSelectedIndex() !=0)){
        varConsulta =1;
        }else{
          objException.excepcionGuardado(1, "NO HAY INFORMACION EN EL SISTEMA");
        }
       int varTamañoSQL = objAdminMonto.tamañoSQL(varMonot, varTipiVehiculo, varConsulta, 0);
        if (varTamañoSQL == 0) {
            objException.excepcionGuardado(1, "NO HAY INFORMACION EN EL SISTEMA");
        } else {
            mostrarMatriz(objAdminMonto.consultarTipoMonto(varMonot, varTipiVehiculo, varTamañoSQL, varConsulta));
        }
    }//GEN-LAST:event_jBTBuscarTarifaActionPerformed
public void mostrarMatriz(String varMatriz[][]) {
        DefaultTableModel objModel = (DefaultTableModel) jTListarTarifa.getModel();
        objModel.setRowCount(varMatriz.length);
        objModel.setColumnCount(2);
        jTListarTarifa.getColumn("A").setHeaderValue("TIPO VEHICULO");
        jTListarTarifa.getColumn("B").setHeaderValue("TARIFA");
        for (int i = 0; i < varMatriz.length; i++) {
            for (int j = 0; j < 2; j++) {
                jTListarTarifa.setValueAt(varMatriz[i][j], i, j);
            }
        }

    }
    
    
    
    private void jCBVehiculoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCBVehiculoMouseClicked
       if (jTValorTarifa.getText().equals("")){
         jTValorTarifa.setText("MONTO");
       }
    }//GEN-LAST:event_jCBVehiculoMouseClicked

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
            java.util.logging.Logger.getLogger(GuiRegistrarTarifa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiRegistrarTarifa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiRegistrarTarifa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiRegistrarTarifa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiRegistrarTarifa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBTBuscarTarifa;
    private javax.swing.JButton jBTEditarTarifa;
    private javax.swing.JButton jBTEliminarTarifa;
    private javax.swing.JButton jBTLimpiarT;
    private javax.swing.JButton jBTRegistrarTarifa;
    private javax.swing.JButton jBTSalirRT;
    private javax.swing.JComboBox<String> jCBVehiculo;
    private javax.swing.JLabel jLIconoVehiculo;
    private javax.swing.JPanel jPRegistrarMonto;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jSPListarMonto;
    private javax.swing.JTabbedPane jTCrudTarifa;
    private javax.swing.JTable jTListarTarifa;
    private javax.swing.JTextField jTValorTarifa;
    // End of variables declaration//GEN-END:variables
   //METODO PARA INSERTAR UN LOGO EN EL JFRAME
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("jPaqImagenes/coche.png"));
        return retValue;
    }
}
