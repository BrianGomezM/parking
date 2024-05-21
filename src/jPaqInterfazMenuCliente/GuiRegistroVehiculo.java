package jPaqInterfazMenuCliente;

import jPaqConsultasSQL.ConsultasSQLClienteVehiculo;
import jPaqDiseno.Diseno;
import jPaqExcepcion.Excepcion;
import jPaqParqueadero.GlobalUser;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.table.DefaultTableModel;

public class GuiRegistroVehiculo extends javax.swing.JFrame {

    private ConsultasSQLClienteVehiculo objConsultasSQLCliente;
    private final Excepcion objException = new Excepcion();
    private String[] respuestaListarVehiculo;
    int varIdvehiculo = -1;
    String[] varRespuestaVehiculo = new String[4];

    private void validarCajas() {//METODO PARA VALIDAR LOS CAMPOS VACIOS
        jTPlaca.setText(jTPlaca.getText().toUpperCase());
        if (jTPlaca.getText().equals("")) {
            jTPlaca.setText("PLACA");
        } else if (jCBModelo.getSelectedIndex() == 0) {
            jCBModelo.setSelectedItem("MODELO");
        } else if (jCBTipoVehiculo.getSelectedIndex() == 0) {
            jCBTipoVehiculo.setSelectedItem("TIPO VEHICULO");
        }
    }
    
    private void limpiar(){
        jCBTipoVehiculo.setSelectedItem("TIPO VEHICULO");
        jCBModelo.setSelectedItem("MODELO");
        jTPlaca.setText("PLACA");
        varIdvehiculo = -1;
        jBTEditarVehiculo.setEnabled(false);
        jBTEliminarVehiculo.setEnabled(false);
        jBTRegistrarVehiculo.setEnabled(true);
    }

    private boolean validarCajasText() {
        jTPlaca.setText(jTPlaca.getText().toUpperCase());
        boolean varIngreso = true;
        if ((jTPlaca.getText().equals("")) || (jTPlaca.getText().equals("PLACA"))) {
            String varResultado = objException.excepcion("PORFAVOR INGRESE LA PLACA", 0);
            jTPlaca.setText(varResultado);
            varIngreso = false;
        } else if (jCBModelo.getSelectedIndex() == 0) {
            String varResultado = objException.excepcion("PORFAVOR SELECCIONE EL MODELO", 1);
            jCBModelo.setSelectedItem(varResultado);
            varIngreso = false;
        } else if (jCBTipoVehiculo.getSelectedIndex() == 0){
            String varResultado = objException.excepcion("PORFAVOR SELECCIONE EL TIPO DE VEHICULO", 2);
            jCBTipoVehiculo.setSelectedItem(varResultado);
            varIngreso = false;
        }
        return varIngreso;
    }

    private void cargarSelectTipoVehiculo() {
        jCBTipoVehiculo.removeAllItems();
        ConsultasSQLClienteVehiculo objCliente = new ConsultasSQLClienteVehiculo();
        respuestaListarVehiculo = objCliente.listarTipoVehiculo(objCliente.tamañoVectorListaTipoVehiculo());
        jCBTipoVehiculo.addItem("TIPO VEHICULO");
        for (int i = 0; i < respuestaListarVehiculo.length; i++) {
            jCBTipoVehiculo.addItem(respuestaListarVehiculo[i]);
        }
    }

    public GuiRegistroVehiculo() {
        initComponents();
        setLocationRelativeTo(null);
        jTUsuario.setText(GlobalUser.getVarNombre());
        cargarSelectTipoVehiculo();
        jBTEditarVehiculo.setEnabled(false);
        jBTEliminarVehiculo.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTCrudIngresoV = new javax.swing.JTabbedPane();
        jPControladoresRegistroVeh = new Diseno();
        jLIconoUsuario = new javax.swing.JLabel();
        jTPlaca = new javax.swing.JTextField();
        jTUsuario = new javax.swing.JTextField();
        jCBTipoVehiculo = new javax.swing.JComboBox<>();
        jLIconoModelo = new javax.swing.JLabel();
        jLIconoVehiculo = new javax.swing.JLabel();
        jBTRegistrarVehiculo = new javax.swing.JButton();
        jBTLimpiarV = new javax.swing.JButton();
        jBTEditarVehiculo = new javax.swing.JButton();
        jBTEliminarVehiculo = new javax.swing.JButton();
        jCBModelo = new javax.swing.JComboBox<>();
        jBTBuscarPlaca = new javax.swing.JButton();
        jPListarVehiculos = new javax.swing.JPanel();
        jSPListarVehiculos = new javax.swing.JScrollPane();
        jTListarVehiculos = new javax.swing.JTable();
        jTReporteVehiculos = new javax.swing.JTextField();
        jBTBuscarReporteVehiculos = new javax.swing.JButton();
        jPSalirRegistroVehiculos = new javax.swing.JPanel();
        jBTSalirRIV = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);

        jTCrudIngresoV.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "REGISTRAR-VEHIUCLO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 1, 18))); // NOI18N

        jLIconoUsuario.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLIconoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jPaqImagenes/nick.png"))); // NOI18N

        jTPlaca.setBackground(new java.awt.Color(246, 246, 246));
        jTPlaca.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jTPlaca.setForeground(new java.awt.Color(102, 102, 102));
        jTPlaca.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTPlaca.setText("PLACA");
        jTPlaca.setAutoscrolls(false);
        jTPlaca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTPlacaMouseClicked(evt);
            }
        });
        jTPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTPlacaActionPerformed(evt);
            }
        });

        jTUsuario.setBackground(new java.awt.Color(246, 246, 246));
        jTUsuario.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jTUsuario.setForeground(new java.awt.Color(102, 102, 102));
        jTUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTUsuario.setText("USUARIO");
        jTUsuario.setAutoscrolls(false);
        jTUsuario.setEnabled(false);
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

        jCBTipoVehiculo.setBackground(new java.awt.Color(246, 246, 246));
        jCBTipoVehiculo.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jCBTipoVehiculo.setForeground(new java.awt.Color(102, 102, 102));
        jCBTipoVehiculo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TIPO VEHICULO", "CARRO", "MOTO", "CAMION" }));
        jCBTipoVehiculo.setToolTipText("");
        jCBTipoVehiculo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jCBTipoVehiculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCBTipoVehiculoMouseClicked(evt);
            }
        });

        jLIconoModelo.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLIconoModelo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jPaqImagenes/fecha_modelo.png"))); // NOI18N

        jLIconoVehiculo.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLIconoVehiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jPaqImagenes/car.png"))); // NOI18N

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

        jBTLimpiarV.setBackground(new java.awt.Color(246, 246, 246));
        jBTLimpiarV.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jBTLimpiarV.setForeground(new java.awt.Color(102, 102, 102));
        jBTLimpiarV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jPaqImagenes/clean.png"))); // NOI18N
        jBTLimpiarV.setText("LIMPIAR");
        jBTLimpiarV.setToolTipText("");
        jBTLimpiarV.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBTLimpiarV.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jBTLimpiarV.setIconTextGap(40);
        jBTLimpiarV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTLimpiarVActionPerformed(evt);
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
        jBTEliminarVehiculo.setText("ELIMINAR VEHICULO");
        jBTEliminarVehiculo.setToolTipText("");
        jBTEliminarVehiculo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBTEliminarVehiculo.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jBTEliminarVehiculo.setIconTextGap(40);
        jBTEliminarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTEliminarVehiculoActionPerformed(evt);
            }
        });

        jCBModelo.setBackground(new java.awt.Color(246, 246, 246));
        jCBModelo.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jCBModelo.setForeground(new java.awt.Color(102, 102, 102));
        jCBModelo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MODELO", "2023", "2022", "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976" }));
        jCBModelo.setToolTipText("");
        jCBModelo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jCBModelo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCBModeloMouseClicked(evt);
            }
        });
        jCBModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBModeloActionPerformed(evt);
            }
        });

        jBTBuscarPlaca.setBackground(new java.awt.Color(246, 246, 246));
        jBTBuscarPlaca.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jBTBuscarPlaca.setForeground(new java.awt.Color(102, 102, 102));
        jBTBuscarPlaca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jPaqImagenes/placa.png"))); // NOI18N
        jBTBuscarPlaca.setToolTipText("");
        jBTBuscarPlaca.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBTBuscarPlaca.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jBTBuscarPlaca.setIconTextGap(40);
        jBTBuscarPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTBuscarPlacaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPControladoresRegistroVehLayout = new javax.swing.GroupLayout(jPControladoresRegistroVeh);
        jPControladoresRegistroVeh.setLayout(jPControladoresRegistroVehLayout);
        jPControladoresRegistroVehLayout.setHorizontalGroup(
            jPControladoresRegistroVehLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPControladoresRegistroVehLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPControladoresRegistroVehLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPControladoresRegistroVehLayout.createSequentialGroup()
                        .addComponent(jBTLimpiarV, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(jBTEliminarVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPControladoresRegistroVehLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPControladoresRegistroVehLayout.createSequentialGroup()
                            .addGroup(jPControladoresRegistroVehLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jBTBuscarPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLIconoVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPControladoresRegistroVehLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTPlaca)
                                .addComponent(jCBTipoVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPControladoresRegistroVehLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLIconoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLIconoModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPControladoresRegistroVehLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTUsuario)
                                .addComponent(jCBModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPControladoresRegistroVehLayout.createSequentialGroup()
                            .addComponent(jBTRegistrarVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBTEditarVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPControladoresRegistroVehLayout.setVerticalGroup(
            jPControladoresRegistroVehLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPControladoresRegistroVehLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPControladoresRegistroVehLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPControladoresRegistroVehLayout.createSequentialGroup()
                        .addGroup(jPControladoresRegistroVehLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCBModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPControladoresRegistroVehLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jBTBuscarPlaca, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(jTPlaca, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPControladoresRegistroVehLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPControladoresRegistroVehLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jCBTipoVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLIconoVehiculo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPControladoresRegistroVehLayout.createSequentialGroup()
                        .addComponent(jLIconoModelo)
                        .addGap(32, 32, 32)
                        .addComponent(jLIconoUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)))
                .addGap(67, 67, 67)
                .addGroup(jPControladoresRegistroVehLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBTRegistrarVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBTEditarVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPControladoresRegistroVehLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBTLimpiarV, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBTEliminarVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(95, Short.MAX_VALUE))
        );

        jTCrudIngresoV.addTab("REGISTRAR VEHICULO", jPControladoresRegistroVeh);

        jTListarVehiculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jSPListarVehiculos.setViewportView(jTListarVehiculos);

        jTReporteVehiculos.setBackground(new java.awt.Color(246, 246, 246));
        jTReporteVehiculos.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jTReporteVehiculos.setForeground(new java.awt.Color(102, 102, 102));
        jTReporteVehiculos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTReporteVehiculos.setText("FILTRAR POR PLACA");
        jTReporteVehiculos.setAutoscrolls(false);
        jTReporteVehiculos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTReporteVehiculosMouseClicked(evt);
            }
        });
        jTReporteVehiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTReporteVehiculosActionPerformed(evt);
            }
        });

        jBTBuscarReporteVehiculos.setBackground(new java.awt.Color(246, 246, 246));
        jBTBuscarReporteVehiculos.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jBTBuscarReporteVehiculos.setForeground(new java.awt.Color(102, 102, 102));
        jBTBuscarReporteVehiculos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jPaqImagenes/placa.png"))); // NOI18N
        jBTBuscarReporteVehiculos.setToolTipText("");
        jBTBuscarReporteVehiculos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBTBuscarReporteVehiculos.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jBTBuscarReporteVehiculos.setIconTextGap(40);
        jBTBuscarReporteVehiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTBuscarReporteVehiculosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPListarVehiculosLayout = new javax.swing.GroupLayout(jPListarVehiculos);
        jPListarVehiculos.setLayout(jPListarVehiculosLayout);
        jPListarVehiculosLayout.setHorizontalGroup(
            jPListarVehiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPListarVehiculosLayout.createSequentialGroup()
                .addGroup(jPListarVehiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPListarVehiculosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSPListarVehiculos, javax.swing.GroupLayout.DEFAULT_SIZE, 784, Short.MAX_VALUE))
                    .addGroup(jPListarVehiculosLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jBTBuscarReporteVehiculos, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTReporteVehiculos)))
                .addContainerGap())
        );
        jPListarVehiculosLayout.setVerticalGroup(
            jPListarVehiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPListarVehiculosLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPListarVehiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTReporteVehiculos)
                    .addComponent(jBTBuscarReporteVehiculos, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSPListarVehiculos, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTCrudIngresoV.addTab("LISTAR VEHICULOS", jPListarVehiculos);

        jBTSalirRIV.setBackground(new java.awt.Color(255, 51, 51));
        jBTSalirRIV.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jBTSalirRIV.setForeground(new java.awt.Color(102, 102, 102));
        jBTSalirRIV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jPaqImagenes/salir.png"))); // NOI18N
        jBTSalirRIV.setText("CERRAR REGISTRO VEHICULO");
        jBTSalirRIV.setToolTipText("");
        jBTSalirRIV.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBTSalirRIV.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jBTSalirRIV.setIconTextGap(40);
        jBTSalirRIV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTSalirRIVActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPSalirRegistroVehiculosLayout = new javax.swing.GroupLayout(jPSalirRegistroVehiculos);
        jPSalirRegistroVehiculos.setLayout(jPSalirRegistroVehiculosLayout);
        jPSalirRegistroVehiculosLayout.setHorizontalGroup(
            jPSalirRegistroVehiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPSalirRegistroVehiculosLayout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(jBTSalirRIV)
                .addContainerGap(213, Short.MAX_VALUE))
        );
        jPSalirRegistroVehiculosLayout.setVerticalGroup(
            jPSalirRegistroVehiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPSalirRegistroVehiculosLayout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addComponent(jBTSalirRIV, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(302, Short.MAX_VALUE))
        );

        jTCrudIngresoV.addTab("SALIR", jPSalirRegistroVehiculos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jTCrudIngresoV, javax.swing.GroupLayout.PREFERRED_SIZE, 825, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jTCrudIngresoV, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTPlacaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTPlacaMouseClicked
        jTPlaca.setText("");
    }//GEN-LAST:event_jTPlacaMouseClicked

    private void jTPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTPlacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTPlacaActionPerformed

    private void jTUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTUsuarioMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTUsuarioMouseClicked

    private void jTUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTUsuarioActionPerformed

    private void jBTRegistrarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTRegistrarVehiculoActionPerformed
        if (validarCajasText()) {
            objConsultasSQLCliente = new ConsultasSQLClienteVehiculo();
            int varIdUsuario = GlobalUser.getVarIdUsuario();
            if (objConsultasSQLCliente.registrarVehiculo(jTPlaca.getText(), jCBModelo.getSelectedItem().toString(), jCBTipoVehiculo.getSelectedIndex(), varIdUsuario, 1)) {
                objException.excepcionGuardado(0, "VEHICULO REGISTRADO");
            }else{
             objException.excepcionGuardado(1, "EL VEHICULO YA SE ENCUENTRA REGISTRADO");
            }
        } else {
            System.err.println("ERROR AL REGISTRAR GUI REGISTRO");
        }

    }//GEN-LAST:event_jBTRegistrarVehiculoActionPerformed

    private void jBTLimpiarVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTLimpiarVActionPerformed
        limpiar();
    }//GEN-LAST:event_jBTLimpiarVActionPerformed

    private void jBTEditarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTEditarVehiculoActionPerformed
        if (validarCajasText()) {
            if (varIdvehiculo >= 0) {
                objConsultasSQLCliente = new ConsultasSQLClienteVehiculo();
                int varIdUsuario = GlobalUser.getVarIdUsuario();
                if (objConsultasSQLCliente.editarVehiculo(varIdvehiculo, jTPlaca.getText(), jCBModelo.getSelectedItem().toString(), jCBTipoVehiculo.getSelectedIndex(), varIdUsuario)) {
                    objException.excepcionGuardado(0, "VEHICULO ACTUALIZADO CORRECTAMENTE");
                    limpiar();
                } else {
                    objException.excepcionGuardado(1, "EL VEHICULO NO SE PUDO ACTUALIZAR (" + jTPlaca.getText() + ")");
                }
            } else {
                objException.excepcionGuardado(1, "REALIZAR LA BUSQUEDA DEL VEHICULO Y PROCEDER A ACTUALIZAR EL REGISTRO");
            }
        } else {
            System.err.println("ERROR AL ACTUALIZAR EL VEHICULO (GUI REGISTRO VEHICULO)");
        }
    }//GEN-LAST:event_jBTEditarVehiculoActionPerformed

    private void jBTEliminarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTEliminarVehiculoActionPerformed
        if ((jTPlaca.getText().equals("PLACA")) || (jTPlaca.getText().equals(""))) {
            String varResultado = objException.excepcion("PORFAVOR INGRESE LA PLACA", 0);
            jTPlaca.setText(varResultado);
        }
        if (varIdvehiculo >= 0) {
            objConsultasSQLCliente = new ConsultasSQLClienteVehiculo();
            if (objConsultasSQLCliente.eliminarVehiculo(2, varIdvehiculo, jTPlaca.getText())) {
                objException.excepcionGuardado(0, "REGISTRO DE VEHICULO ELIMINADO CORRECTAMENTE");
                limpiar();
            } else {
                objException.excepcionGuardado(1, "EL VEHICULO NO ENCUENTRA REGISTRADO EN NUESTRO SISTEMA (" + jTPlaca.getText() + ")");
            }
        } else {
            objException.excepcionGuardado(1, "REALIZAR LA BUSQUEDA DEL VEHICULO Y PROCEDER A ACTUALIZAR EL REGISTRO");
        }
    }//GEN-LAST:event_jBTEliminarVehiculoActionPerformed

    private void jBTSalirRIVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTSalirRIVActionPerformed
        dispose();
    }//GEN-LAST:event_jBTSalirRIVActionPerformed

    private void jBTBuscarPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTBuscarPlacaActionPerformed
        if ((jTPlaca.getText().equals("PLACA")) || (jTPlaca.getText().equals(""))) {
            String varResultado = objException.excepcion("PORFAVOR INGRESE LA PLACA", 0);
            jTPlaca.setText(varResultado);
        } else {
            objConsultasSQLCliente = new ConsultasSQLClienteVehiculo();
            varRespuestaVehiculo = objConsultasSQLCliente.buscarVehiculo(jTPlaca.getText());
            if (varRespuestaVehiculo != null) {
                objException.excepcionGuardado(0, "USUARIO ENCONTRADO");
                varIdvehiculo = Integer.valueOf(varRespuestaVehiculo[0]);
                jTPlaca.setText(varRespuestaVehiculo[1]);
                jCBModelo.setSelectedItem(varRespuestaVehiculo[2]);
                jCBTipoVehiculo.setSelectedIndex(Integer.valueOf(varRespuestaVehiculo[3]));
                jBTEliminarVehiculo.setEnabled(true);
                jBTEditarVehiculo.setEnabled(true);
                jBTRegistrarVehiculo.setEnabled(false);
            }else{
                 objException.excepcionGuardado(1, "EL USUARIO NO SE ENCUENTRA EN EL SISTEMA");
            }
        }
    }//GEN-LAST:event_jBTBuscarPlacaActionPerformed

    private void jCBModeloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCBModeloMouseClicked
        validarCajas();
    }//GEN-LAST:event_jCBModeloMouseClicked

    private void jCBTipoVehiculoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCBTipoVehiculoMouseClicked
        validarCajas();
    }//GEN-LAST:event_jCBTipoVehiculoMouseClicked

    private void jTReporteVehiculosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTReporteVehiculosMouseClicked
        jTReporteVehiculos.setText("");
    }//GEN-LAST:event_jTReporteVehiculosMouseClicked

    private void jTReporteVehiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTReporteVehiculosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTReporteVehiculosActionPerformed

    private void jBTBuscarReporteVehiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTBuscarReporteVehiculosActionPerformed
        objConsultasSQLCliente = new ConsultasSQLClienteVehiculo();
        jTReporteVehiculos.setText(jTReporteVehiculos.getText().toUpperCase());
        if ((jTReporteVehiculos.getText().equals("")) || (jTReporteVehiculos.getText().equals("FILTRAR POR PLACA"))) {
            jTReporteVehiculos.setText("FILTRAR POR PLACA");
            mostrarMatriz(objConsultasSQLCliente.reporteVehiculos(""));
        } else {
            mostrarMatriz(objConsultasSQLCliente.reporteVehiculos(jTReporteVehiculos.getText()));
        }
    }//GEN-LAST:event_jBTBuscarReporteVehiculosActionPerformed

    private void jCBModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBModeloActionPerformed

    public void mostrarMatriz(String varMatriz[][]) {
        DefaultTableModel objModel = (DefaultTableModel) jTListarVehiculos.getModel();
        objModel.setRowCount(varMatriz.length);
        objModel.setColumnCount(4);
        jTListarVehiculos.getColumn("A").setHeaderValue("PLACA");
        jTListarVehiculos.getColumn("B").setHeaderValue("MODELO");
        jTListarVehiculos.getColumn("C").setHeaderValue("TIPO VEHICULO");
        jTListarVehiculos.getColumn("D").setHeaderValue("CLIENTE");
        for (int i = 0; i < varMatriz.length; i++) {
            for (int j = 0; j < 4; j++) {
                jTListarVehiculos.setValueAt(varMatriz[i][j], i, j);
            }
        }
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiRegistroVehiculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBTBuscarPlaca;
    private javax.swing.JButton jBTBuscarReporteVehiculos;
    private javax.swing.JButton jBTEditarVehiculo;
    private javax.swing.JButton jBTEliminarVehiculo;
    private javax.swing.JButton jBTLimpiarV;
    private javax.swing.JButton jBTRegistrarVehiculo;
    private javax.swing.JButton jBTSalirRIV;
    private javax.swing.JComboBox<String> jCBModelo;
    private javax.swing.JComboBox<String> jCBTipoVehiculo;
    private javax.swing.JLabel jLIconoModelo;
    private javax.swing.JLabel jLIconoUsuario;
    private javax.swing.JLabel jLIconoVehiculo;
    private javax.swing.JPanel jPControladoresRegistroVeh;
    private javax.swing.JPanel jPListarVehiculos;
    private javax.swing.JPanel jPSalirRegistroVehiculos;
    private javax.swing.JScrollPane jSPListarVehiculos;
    private javax.swing.JTabbedPane jTCrudIngresoV;
    private javax.swing.JTable jTListarVehiculos;
    private javax.swing.JTextField jTPlaca;
    private javax.swing.JTextField jTReporteVehiculos;
    private javax.swing.JTextField jTUsuario;
    // End of variables declaration//GEN-END:variables

    //METODO PARA INSERTAR UN LOGO EN EL JFRAME
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("jPaqImagenes/coche.png"));
        return retValue;
    }

}
