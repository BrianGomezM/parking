
package jPaqInterfazMenuCliente;
import jPaqDiseno.Diseno;
import jPaqInterfazLogin.GuiLogin;
import jPaqParqueadero.GlobalUser;
import java.awt.Image;
import java.awt.Toolkit;


public class GuiMenuCliente extends javax.swing.JFrame {
   
    public GuiMenuCliente() {
        initComponents();
        setLocationRelativeTo(null);
        this.setContentPane(jpFondo);
        jLUsuarioLogin.setText("PORTERO: "+GlobalUser.getVarNombre());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpFondo = new  Diseno();
        jTPMenu = new javax.swing.JTabbedPane();
        jTPArchivo = new Diseno();
        jBTRegistrarVehiculo = new javax.swing.JButton();
        jBTReporteVehiculo = new javax.swing.JButton();
        jBTESVehiculo = new javax.swing.JButton();
        jPSalir = new Diseno();
        jBTCerrarSesionCliente = new javax.swing.JButton();
        jLUsuarioLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        setResizable(false);

        jpFondo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MENU-CLIENTE", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 0, 18))); // NOI18N
        jpFondo.setToolTipText("");

        jTPMenu.setBackground(new java.awt.Color(246, 246, 246));
        jTPMenu.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jTPArchivo.setBackground(new java.awt.Color(246, 246, 246));
        jTPArchivo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTPArchivo.setToolTipText("");
        jTPArchivo.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N

        jBTRegistrarVehiculo.setBackground(new java.awt.Color(246, 246, 246));
        jBTRegistrarVehiculo.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jBTRegistrarVehiculo.setForeground(new java.awt.Color(102, 102, 102));
        jBTRegistrarVehiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jPaqImagenes/carC.png"))); // NOI18N
        jBTRegistrarVehiculo.setText("REGISTRAR VEHICULOS");
        jBTRegistrarVehiculo.setToolTipText("");
        jBTRegistrarVehiculo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBTRegistrarVehiculo.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jBTRegistrarVehiculo.setIconTextGap(40);
        jBTRegistrarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTRegistrarVehiculoActionPerformed(evt);
            }
        });

        jBTReporteVehiculo.setBackground(new java.awt.Color(246, 246, 246));
        jBTReporteVehiculo.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jBTReporteVehiculo.setForeground(new java.awt.Color(102, 102, 102));
        jBTReporteVehiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jPaqImagenes/reporteB.png"))); // NOI18N
        jBTReporteVehiculo.setText("REPORTE DE VEHICULOS");
        jBTReporteVehiculo.setToolTipText("");
        jBTReporteVehiculo.setHideActionText(true);
        jBTReporteVehiculo.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jBTReporteVehiculo.setIconTextGap(40);
        jBTReporteVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTReporteVehiculoActionPerformed(evt);
            }
        });

        jBTESVehiculo.setBackground(new java.awt.Color(246, 246, 246));
        jBTESVehiculo.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jBTESVehiculo.setForeground(new java.awt.Color(102, 102, 102));
        jBTESVehiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jPaqImagenes/registrarES.png"))); // NOI18N
        jBTESVehiculo.setText("REGISTRAR E/S VEHICULOS");
        jBTESVehiculo.setToolTipText("");
        jBTESVehiculo.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jBTESVehiculo.setIconTextGap(40);
        jBTESVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTESVehiculoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jTPArchivoLayout = new javax.swing.GroupLayout(jTPArchivo);
        jTPArchivo.setLayout(jTPArchivoLayout);
        jTPArchivoLayout.setHorizontalGroup(
            jTPArchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jTPArchivoLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jTPArchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBTReporteVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBTESVehiculo)
                    .addComponent(jBTRegistrarVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );
        jTPArchivoLayout.setVerticalGroup(
            jTPArchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jTPArchivoLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jBTRegistrarVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jBTESVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jBTReporteVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(93, Short.MAX_VALUE))
        );

        jTPMenu.addTab("ARCHIVOS", jTPArchivo);

        jBTCerrarSesionCliente.setBackground(new java.awt.Color(255, 51, 51));
        jBTCerrarSesionCliente.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jBTCerrarSesionCliente.setForeground(new java.awt.Color(102, 102, 102));
        jBTCerrarSesionCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jPaqImagenes/salir.png"))); // NOI18N
        jBTCerrarSesionCliente.setText("CERRAR SESION");
        jBTCerrarSesionCliente.setToolTipText("");
        jBTCerrarSesionCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBTCerrarSesionCliente.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jBTCerrarSesionCliente.setIconTextGap(40);
        jBTCerrarSesionCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTCerrarSesionClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPSalirLayout = new javax.swing.GroupLayout(jPSalir);
        jPSalir.setLayout(jPSalirLayout);
        jPSalirLayout.setHorizontalGroup(
            jPSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPSalirLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jBTCerrarSesionCliente)
                .addContainerGap(79, Short.MAX_VALUE))
        );
        jPSalirLayout.setVerticalGroup(
            jPSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPSalirLayout.createSequentialGroup()
                .addGap(218, 218, 218)
                .addComponent(jBTCerrarSesionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(218, Short.MAX_VALUE))
        );

        jTPMenu.addTab("SALIR", jPSalir);

        jLUsuarioLogin.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLUsuarioLogin.setForeground(new java.awt.Color(153, 0, 0));
        jLUsuarioLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLUsuarioLogin.setText("PORTERO: BRIAN GOMEZ M. ");
        jLUsuarioLogin.setFocusable(false);
        jLUsuarioLogin.setInheritsPopupMenu(false);

        javax.swing.GroupLayout jpFondoLayout = new javax.swing.GroupLayout(jpFondo);
        jpFondo.setLayout(jpFondoLayout);
        jpFondoLayout.setHorizontalGroup(
            jpFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLUsuarioLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTPMenu))
                .addContainerGap())
        );
        jpFondoLayout.setVerticalGroup(
            jpFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLUsuarioLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTPMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpFondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBTRegistrarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTRegistrarVehiculoActionPerformed
        GuiRegistroVehiculo objRegistroVehiculo = new GuiRegistroVehiculo();
        objRegistroVehiculo.show();
    }//GEN-LAST:event_jBTRegistrarVehiculoActionPerformed

    private void jBTReporteVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTReporteVehiculoActionPerformed
        GuiReporte objReporte = new GuiReporte();
        objReporte.show();
    }//GEN-LAST:event_jBTReporteVehiculoActionPerformed

    private void jBTESVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTESVehiculoActionPerformed
      GuiRegistroESVehiculo objRegistroESVehiculo = new GuiRegistroESVehiculo();
      objRegistroESVehiculo.show();
    }//GEN-LAST:event_jBTESVehiculoActionPerformed

    private void jBTCerrarSesionClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTCerrarSesionClienteActionPerformed
        GuiLogin objLogin = new GuiLogin();
        objLogin.show();
        dispose();
    }//GEN-LAST:event_jBTCerrarSesionClienteActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiMenuCliente().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBTCerrarSesionCliente;
    private javax.swing.JButton jBTESVehiculo;
    private javax.swing.JButton jBTRegistrarVehiculo;
    private javax.swing.JButton jBTReporteVehiculo;
    private javax.swing.JLabel jLUsuarioLogin;
    private javax.swing.JPanel jPSalir;
    private javax.swing.JPanel jTPArchivo;
    private javax.swing.JTabbedPane jTPMenu;
    private javax.swing.JPanel jpFondo;
    // End of variables declaration//GEN-END:variables
     @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("jPaqImagenes/coche.png"));
        return retValue;
    }
}
