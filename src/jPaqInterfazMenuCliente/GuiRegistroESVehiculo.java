package jPaqInterfazMenuCliente;

import jPaqConsultasSQL.ConsultasSQLClienteFactura;
import jPaqConsultasSQL.ConsultasSQLClienteReporte;
import jPaqDiseno.Diseno;
import jPaqExcepcion.Excepcion;
import jPaqGenerarPDF.PDF;
import jPaqParqueadero.GlobalUser;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.table.DefaultTableModel;

public class GuiRegistroESVehiculo extends javax.swing.JFrame implements Runnable {

    String varHoraInicio;
    String varHora, varMinutos, varSegundos;
    Thread varHilo;
    int varIdVehiculo = 0;
    String varPlaca = "";
    private final Excepcion objException = new Excepcion();
    ConsultasSQLClienteFactura objClienteFactura;
    

    private void validarCajas() {//METODO PARA VALIDAR LOS CAMPOS VACIOS
        jTPlacaVehiculo.setText(jTPlacaVehiculo.getText().toUpperCase());
        if (jTPlacaVehiculo.getText().equals("")) {
            jTPlacaVehiculo.setText("PLACA");
        }
    }

    public GuiRegistroESVehiculo() {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
        varHilo = new Thread(this);
        varHilo.start();
        validarCajas();
        jBTRegistrarVehiculoEntrada.setEnabled(false);
        jBTRegistroSalida.setEnabled(false);
    }

    private boolean validarCajasText() {
        jTPlacaVehiculo.setText(jTPlacaVehiculo.getText().toUpperCase());
        boolean varIngreso = true;
        if ((jTPlacaVehiculo.getText().equals("")) || (jTPlacaVehiculo.getText().equals("PLACA"))) {
            String varResultado = objException.excepcion("PORFAVOR INGRESE LA PLACA", 0);
            jTPlacaVehiculo.setText(varResultado);
            varIngreso = false;
        }
        return varIngreso;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTCrudUsuario = new javax.swing.JTabbedPane();
        jPControladoresRegistroV = new Diseno();
        jLIconoFehca = new javax.swing.JLabel();
        jLIconoHSalida = new javax.swing.JLabel();
        jTHoraSalida = new javax.swing.JTextField();
        jLIconoPago = new javax.swing.JLabel();
        jTPlacaVehiculo = new javax.swing.JTextField();
        jTHoraIngreso = new javax.swing.JTextField();
        jTPago = new javax.swing.JTextField();
        jLIconoHIngreso = new javax.swing.JLabel();
        jLIconoHTotal = new javax.swing.JLabel();
        jBTRegistrarVehiculoEntrada = new javax.swing.JButton();
        jBTLimpiarVehiculo = new javax.swing.JButton();
        jBTRegistroSalida = new javax.swing.JButton();
        jBTBuscarVehiculoES = new javax.swing.JButton();
        jTTiempoTotal = new javax.swing.JTextField();
        jTFecha = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLFechaHora = new javax.swing.JLabel();
        jPListarV = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTListaRegistroVehiculos = new javax.swing.JTable();
        jBTBuscarReporteVehiculosES = new javax.swing.JButton();
        jTReporteES = new javax.swing.JTextField();
        jPCerrarRV = new javax.swing.JPanel();
        jBTSalirRU1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);

        jTCrudUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "REGISTRAR-E&S-VEHICULOS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 1, 18))); // NOI18N

        jLIconoFehca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jPaqImagenes/fecha_modelo.png"))); // NOI18N

        jLIconoHSalida.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLIconoHSalida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jPaqImagenes/horaF.png"))); // NOI18N

        jTHoraSalida.setEditable(false);
        jTHoraSalida.setBackground(new java.awt.Color(246, 246, 246));
        jTHoraSalida.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jTHoraSalida.setForeground(new java.awt.Color(102, 102, 102));
        jTHoraSalida.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTHoraSalida.setText("HORA DE SALIDA");
        jTHoraSalida.setAutoscrolls(false);
        jTHoraSalida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTHoraSalidaMouseClicked(evt);
            }
        });
        jTHoraSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTHoraSalidaActionPerformed(evt);
            }
        });

        jLIconoPago.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLIconoPago.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jPaqImagenes/monto.png"))); // NOI18N

        jTPlacaVehiculo.setBackground(new java.awt.Color(246, 246, 246));
        jTPlacaVehiculo.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jTPlacaVehiculo.setForeground(new java.awt.Color(102, 102, 102));
        jTPlacaVehiculo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTPlacaVehiculo.setText("PLACA");
        jTPlacaVehiculo.setAutoscrolls(false);
        jTPlacaVehiculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTPlacaVehiculoMouseClicked(evt);
            }
        });
        jTPlacaVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTPlacaVehiculoActionPerformed(evt);
            }
        });

        jTHoraIngreso.setEditable(false);
        jTHoraIngreso.setBackground(new java.awt.Color(246, 246, 246));
        jTHoraIngreso.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jTHoraIngreso.setForeground(new java.awt.Color(102, 102, 102));
        jTHoraIngreso.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTHoraIngreso.setText("HORA DE INGRESO");
        jTHoraIngreso.setAutoscrolls(false);
        jTHoraIngreso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTHoraIngresoMouseClicked(evt);
            }
        });
        jTHoraIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTHoraIngresoActionPerformed(evt);
            }
        });

        jTPago.setEditable(false);
        jTPago.setBackground(new java.awt.Color(246, 246, 246));
        jTPago.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jTPago.setForeground(new java.awt.Color(102, 102, 102));
        jTPago.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTPago.setText("TOTAL A PAGAR");
        jTPago.setAutoscrolls(false);
        jTPago.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTPagoMouseClicked(evt);
            }
        });
        jTPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTPagoActionPerformed(evt);
            }
        });

        jLIconoHIngreso.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLIconoHIngreso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jPaqImagenes/horaI.png"))); // NOI18N

        jLIconoHTotal.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLIconoHTotal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jPaqImagenes/tiempo.png"))); // NOI18N

        jBTRegistrarVehiculoEntrada.setBackground(new java.awt.Color(246, 246, 246));
        jBTRegistrarVehiculoEntrada.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jBTRegistrarVehiculoEntrada.setForeground(new java.awt.Color(102, 102, 102));
        jBTRegistrarVehiculoEntrada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jPaqImagenes/registrarE.png"))); // NOI18N
        jBTRegistrarVehiculoEntrada.setText("REGISTRAR ENTRADA");
        jBTRegistrarVehiculoEntrada.setToolTipText("");
        jBTRegistrarVehiculoEntrada.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBTRegistrarVehiculoEntrada.setDoubleBuffered(true);
        jBTRegistrarVehiculoEntrada.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jBTRegistrarVehiculoEntrada.setIconTextGap(40);
        jBTRegistrarVehiculoEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTRegistrarVehiculoEntradaActionPerformed(evt);
            }
        });

        jBTLimpiarVehiculo.setBackground(new java.awt.Color(246, 246, 246));
        jBTLimpiarVehiculo.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jBTLimpiarVehiculo.setForeground(new java.awt.Color(102, 102, 102));
        jBTLimpiarVehiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jPaqImagenes/clean.png"))); // NOI18N
        jBTLimpiarVehiculo.setText("LIMPIAR");
        jBTLimpiarVehiculo.setToolTipText("");
        jBTLimpiarVehiculo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBTLimpiarVehiculo.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jBTLimpiarVehiculo.setIconTextGap(40);
        jBTLimpiarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTLimpiarVehiculoActionPerformed(evt);
            }
        });

        jBTRegistroSalida.setBackground(new java.awt.Color(246, 246, 246));
        jBTRegistroSalida.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jBTRegistroSalida.setForeground(new java.awt.Color(102, 102, 102));
        jBTRegistroSalida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jPaqImagenes/registrarS.png"))); // NOI18N
        jBTRegistroSalida.setText("REGISTRAR SALIDA");
        jBTRegistroSalida.setToolTipText("");
        jBTRegistroSalida.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBTRegistroSalida.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jBTRegistroSalida.setIconTextGap(40);
        jBTRegistroSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTRegistroSalidaActionPerformed(evt);
            }
        });

        jBTBuscarVehiculoES.setBackground(new java.awt.Color(246, 246, 246));
        jBTBuscarVehiculoES.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jBTBuscarVehiculoES.setForeground(new java.awt.Color(102, 102, 102));
        jBTBuscarVehiculoES.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jPaqImagenes/placa.png"))); // NOI18N
        jBTBuscarVehiculoES.setToolTipText("");
        jBTBuscarVehiculoES.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBTBuscarVehiculoES.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBTBuscarVehiculoES.setIconTextGap(0);
        jBTBuscarVehiculoES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTBuscarVehiculoESActionPerformed(evt);
            }
        });

        jTTiempoTotal.setEditable(false);
        jTTiempoTotal.setBackground(new java.awt.Color(246, 246, 246));
        jTTiempoTotal.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jTTiempoTotal.setForeground(new java.awt.Color(102, 102, 102));
        jTTiempoTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTTiempoTotal.setText("TIEMPO-MINUTOS");
        jTTiempoTotal.setAutoscrolls(false);
        jTTiempoTotal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTTiempoTotalMouseClicked(evt);
            }
        });
        jTTiempoTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTTiempoTotalActionPerformed(evt);
            }
        });

        jTFecha.setEditable(false);
        jTFecha.setBackground(new java.awt.Color(246, 246, 246));
        jTFecha.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jTFecha.setForeground(new java.awt.Color(102, 102, 102));
        jTFecha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFecha.setText("FECHA");
        jTFecha.setAutoscrolls(false);
        jTFecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTFechaMouseClicked(evt);
            }
        });
        jTFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFechaActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLFechaHora.setBackground(new java.awt.Color(255, 255, 255));
        jLFechaHora.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLFechaHora.setForeground(new java.awt.Color(255, 255, 255));
        jLFechaHora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLFechaHora.setText("11:51 AM 11/09/2020");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLFechaHora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLFechaHora)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPControladoresRegistroVLayout = new javax.swing.GroupLayout(jPControladoresRegistroV);
        jPControladoresRegistroV.setLayout(jPControladoresRegistroVLayout);
        jPControladoresRegistroVLayout.setHorizontalGroup(
            jPControladoresRegistroVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPControladoresRegistroVLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPControladoresRegistroVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPControladoresRegistroVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jBTRegistrarVehiculoEntrada, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBTLimpiarVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPControladoresRegistroVLayout.createSequentialGroup()
                        .addGroup(jPControladoresRegistroVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jBTBuscarVehiculoES, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLIconoPago, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLIconoFehca, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPControladoresRegistroVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTFecha, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTPago, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTPlacaVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(jPControladoresRegistroVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPControladoresRegistroVLayout.createSequentialGroup()
                        .addGroup(jPControladoresRegistroVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLIconoHTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLIconoHSalida)
                            .addComponent(jLIconoHIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPControladoresRegistroVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTHoraSalida, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTTiempoTotal)
                            .addComponent(jTHoraIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jBTRegistroSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );
        jPControladoresRegistroVLayout.setVerticalGroup(
            jPControladoresRegistroVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPControladoresRegistroVLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(jPControladoresRegistroVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPControladoresRegistroVLayout.createSequentialGroup()
                        .addGroup(jPControladoresRegistroVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTPlacaVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBTBuscarVehiculoES))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPControladoresRegistroVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPControladoresRegistroVLayout.createSequentialGroup()
                                .addComponent(jLIconoPago, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(17, 17, 17))
                            .addComponent(jTPago, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPControladoresRegistroVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLIconoFehca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFecha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jBTRegistrarVehiculoEntrada)
                        .addGap(18, 18, 18)
                        .addComponent(jBTLimpiarVehiculo)
                        .addGap(78, 78, 78))
                    .addGroup(jPControladoresRegistroVLayout.createSequentialGroup()
                        .addGroup(jPControladoresRegistroVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLIconoHIngreso, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTHoraIngreso, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPControladoresRegistroVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLIconoHSalida, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTHoraSalida, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPControladoresRegistroVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLIconoHTotal)
                            .addComponent(jTTiempoTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jBTRegistroSalida)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jTCrudUsuario.addTab("REGISTRAR E&S", jPControladoresRegistroV);

        jTListaRegistroVehiculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTListaRegistroVehiculos);

        jBTBuscarReporteVehiculosES.setBackground(new java.awt.Color(246, 246, 246));
        jBTBuscarReporteVehiculosES.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jBTBuscarReporteVehiculosES.setForeground(new java.awt.Color(102, 102, 102));
        jBTBuscarReporteVehiculosES.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jPaqImagenes/placa.png"))); // NOI18N
        jBTBuscarReporteVehiculosES.setToolTipText("");
        jBTBuscarReporteVehiculosES.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBTBuscarReporteVehiculosES.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jBTBuscarReporteVehiculosES.setIconTextGap(40);
        jBTBuscarReporteVehiculosES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTBuscarReporteVehiculosESActionPerformed(evt);
            }
        });

        jTReporteES.setBackground(new java.awt.Color(246, 246, 246));
        jTReporteES.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jTReporteES.setForeground(new java.awt.Color(102, 102, 102));
        jTReporteES.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTReporteES.setText("FILTRAR POR PLACA");
        jTReporteES.setAutoscrolls(false);
        jTReporteES.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTReporteESMouseClicked(evt);
            }
        });
        jTReporteES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTReporteESActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPListarVLayout = new javax.swing.GroupLayout(jPListarV);
        jPListarV.setLayout(jPListarVLayout);
        jPListarVLayout.setHorizontalGroup(
            jPListarVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPListarVLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPListarVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 784, Short.MAX_VALUE)
                    .addGroup(jPListarVLayout.createSequentialGroup()
                        .addComponent(jBTBuscarReporteVehiculosES, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTReporteES)))
                .addContainerGap())
        );
        jPListarVLayout.setVerticalGroup(
            jPListarVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPListarVLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPListarVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTReporteES)
                    .addComponent(jBTBuscarReporteVehiculosES, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jTCrudUsuario.addTab("LISTAR ENTRADAS", jPListarV);

        jBTSalirRU1.setBackground(new java.awt.Color(255, 51, 51));
        jBTSalirRU1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jBTSalirRU1.setForeground(new java.awt.Color(102, 102, 102));
        jBTSalirRU1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jPaqImagenes/salir.png"))); // NOI18N
        jBTSalirRU1.setText("CERRAR REGISTRO USUARIO");
        jBTSalirRU1.setToolTipText("");
        jBTSalirRU1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBTSalirRU1.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jBTSalirRU1.setIconTextGap(40);
        jBTSalirRU1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTSalirRU1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPCerrarRVLayout = new javax.swing.GroupLayout(jPCerrarRV);
        jPCerrarRV.setLayout(jPCerrarRVLayout);
        jPCerrarRVLayout.setHorizontalGroup(
            jPCerrarRVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCerrarRVLayout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(jBTSalirRU1)
                .addContainerGap(223, Short.MAX_VALUE))
        );
        jPCerrarRVLayout.setVerticalGroup(
            jPCerrarRVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCerrarRVLayout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addComponent(jBTSalirRU1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(314, Short.MAX_VALUE))
        );

        jTCrudUsuario.addTab("SALIR", jPCerrarRV);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jTCrudUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 825, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jTCrudUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTHoraSalidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTHoraSalidaMouseClicked

    }//GEN-LAST:event_jTHoraSalidaMouseClicked

    private void jTHoraSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTHoraSalidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTHoraSalidaActionPerformed

    private void jTPlacaVehiculoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTPlacaVehiculoMouseClicked
        jTPlacaVehiculo.setText("");
    }//GEN-LAST:event_jTPlacaVehiculoMouseClicked

    private void jTPlacaVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTPlacaVehiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTPlacaVehiculoActionPerformed

    private void jTHoraIngresoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTHoraIngresoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTHoraIngresoMouseClicked

    private void jTHoraIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTHoraIngresoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTHoraIngresoActionPerformed

    private void jTPagoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTPagoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTPagoMouseClicked

    private void jTPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTPagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTPagoActionPerformed

    private void jBTRegistrarVehiculoEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTRegistrarVehiculoEntradaActionPerformed
        if ((varIdVehiculo > 0) && (jTPlacaVehiculo.getText().equals(varPlaca.toUpperCase()))) {
            objClienteFactura = new ConsultasSQLClienteFactura();
            varHoraInicio = varHora + ":" + varMinutos + ":" + varSegundos;
            if (objClienteFactura.registrarFactura(varPlaca, varHoraInicio, "00:00:00.000000", 0, 0, fecha(), 1, varIdVehiculo)) {
                objException.excepcionGuardado(0, "FACTURA REGISTRADA");
                jBTRegistrarVehiculoEntrada.setEnabled(false);
                jBTRegistroSalida.setEnabled(true);
                completar();
            } else {
                objException.excepcionGuardado(1, "INCONVENEINTE REGISTRANDO LA FACTURA");
            }
        } else {
            objException.excepcionGuardado(1, "BUSCAR EL VEHICULO");
            jBTRegistrarVehiculoEntrada.setEnabled(false);
        }
    }//GEN-LAST:event_jBTRegistrarVehiculoEntradaActionPerformed

    private void jBTLimpiarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTLimpiarVehiculoActionPerformed
        limpiarCajas();
    }//GEN-LAST:event_jBTLimpiarVehiculoActionPerformed

    private void limpiarCajas() {
        jTPlacaVehiculo.setText("PLACA");
        jTHoraIngreso.setText("HORA DE INGRESO");
        jTPago.setText("TOTAL A PAGAR");
        jTHoraSalida.setText("HORA DE SALIDA");
        jTFecha.setText("FECHA");
        jTTiempoTotal.setText("TIEMPO-MINUTOS");
        jBTRegistrarVehiculoEntrada.setEnabled(false);
        jBTRegistroSalida.setEnabled(false);
        varIdVehiculo = 0;
        GlobalUser.setCodigoFactura("");
    }

    private void jBTRegistroSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTRegistroSalidaActionPerformed
        if ((varIdVehiculo > 0) && (jTPlacaVehiculo.getText().equals(varPlaca.toUpperCase()))) {
            objClienteFactura = new ConsultasSQLClienteFactura();
            varHoraInicio = varHora + ":" + varMinutos + ":" + varSegundos;
            if (objClienteFactura.registrarSalidaVehiculo(jTPlacaVehiculo.getText(), varHoraInicio)) {
                
                objException.excepcionGuardado(0, "FACTURA CERRADA CON EXITO");
                jBTRegistroSalida.setEnabled(false);
                cerrarRegistro();
            } else {
                objException.excepcionGuardado(1, "FALLO AL CERRAR LA FACTURA");
            }
        } else {
            objException.excepcionGuardado(1, "RELIZAR LA RESPECTIVA BUSQUEDA DEL VEHICULO PARA CREAR LA FACTURA");
            jBTRegistroSalida.setEnabled(false);
        }

    }//GEN-LAST:event_jBTRegistroSalidaActionPerformed

    private void jBTSalirRU1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTSalirRU1ActionPerformed
        dispose();
    }//GEN-LAST:event_jBTSalirRU1ActionPerformed

    private void jTTiempoTotalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTTiempoTotalMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTTiempoTotalMouseClicked

    private void jTTiempoTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTTiempoTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTTiempoTotalActionPerformed

    private void jTFechaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTFechaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFechaMouseClicked

    private void jTFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFechaActionPerformed

    private void jBTBuscarVehiculoESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTBuscarVehiculoESActionPerformed
        this.varPlaca = jTPlacaVehiculo.getText();
        limpiarCajas();
        jTPlacaVehiculo.setText(varPlaca);
        if (validarCajasText()) {
            objClienteFactura = new ConsultasSQLClienteFactura();
            this.varIdVehiculo = objClienteFactura.buscarVehiculo(jTPlacaVehiculo.getText());
            if (varIdVehiculo > 0) {
                objException.excepcionGuardado(0, "BUSQUEDA REALIZADA");
                if (objClienteFactura.buscarFactura(jTPlacaVehiculo.getText())) {
                    jTPlacaVehiculo.setText(GlobalUser.getVarPlaca());
                    jTHoraIngreso.setText(GlobalUser.getVarHoraIngreso());
                    jTFecha.setText(GlobalUser.getVarFecha());
                    jBTRegistroSalida.setEnabled(true);
                    jBTRegistrarVehiculoEntrada.setEnabled(false);
                } else {
                    jBTRegistrarVehiculoEntrada.setEnabled(true);
                    jBTRegistroSalida.setEnabled(false);
                }
            } else {
                String varRespuesta = objException.excepcion("EL VEHICULO NO SE ENCUENTRA REGISTRADO EN EL SISTEMA \n POR FAVOR REGISTRARLO (" + jTPlacaVehiculo.getText() + ")", 3);
                int varRegis = Integer.valueOf(varRespuesta);
                if (varRegis == 0) {
                    GuiRegistroVehiculo objRegistroVehiculo = new GuiRegistroVehiculo();
                    objRegistroVehiculo.show();
                    this.dispose();
                }
            }
        }
    }//GEN-LAST:event_jBTBuscarVehiculoESActionPerformed

    private void jBTBuscarReporteVehiculosESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTBuscarReporteVehiculosESActionPerformed
        objClienteFactura = new ConsultasSQLClienteFactura();;
        jTReporteES.setText(jTReporteES.getText().toUpperCase());
        if ((jTReporteES.getText().equals("")) || (jTReporteES.getText().equals("FILTRAR POR PLACA"))) {
            jTReporteES.setText("FILTRAR POR PLACA");
            mostrarMatriz(objClienteFactura.reporteES(""));
        } else {
            mostrarMatriz(objClienteFactura.reporteES(jTReporteES.getText()));
        }
    }//GEN-LAST:event_jBTBuscarReporteVehiculosESActionPerformed

    public void mostrarMatriz(String varMatriz[][]) {
        DefaultTableModel objModel = (DefaultTableModel) jTListaRegistroVehiculos.getModel();
        objModel.setRowCount(varMatriz.length);
        objModel.setColumnCount(7);
        jTListaRegistroVehiculos.getColumn("A").setHeaderValue("CODIGO FACTURA");
        jTListaRegistroVehiculos.getColumn("B").setHeaderValue("PLACA");
        jTListaRegistroVehiculos.getColumn("C").setHeaderValue("VEHICULO");
        jTListaRegistroVehiculos.getColumn("D").setHeaderValue("COSTO");
        jTListaRegistroVehiculos.getColumn("E").setHeaderValue("HORA DE INGRESO");
        jTListaRegistroVehiculos.getColumn("F").setHeaderValue("HORA DE SALIDA");
        jTListaRegistroVehiculos.getColumn("G").setHeaderValue("FECHA REGISTRO");
        for (int i = 0; i < varMatriz.length; i++) {
            for (int j = 0; j < 7; j++) {
                jTListaRegistroVehiculos.setValueAt(varMatriz[i][j], i, j);
            }
        }
    }
    private void jTReporteESMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTReporteESMouseClicked
        jTReporteES.setText("");
    }//GEN-LAST:event_jTReporteESMouseClicked

    private void jTReporteESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTReporteESActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTReporteESActionPerformed
    private void completar() {
        jTPlacaVehiculo.setText(jTPlacaVehiculo.getText());
        jTHoraIngreso.setText(varHoraInicio);
        jTFecha.setText(fecha());
    }

    private void cerrarRegistro() {
        jTPlacaVehiculo.setText(GlobalUser.getVarPlaca().toUpperCase());
        jTHoraIngreso.setText(GlobalUser.getVarHoraIngreso());
        jTHoraSalida.setText(GlobalUser.getVarHoraSalida());
        jTPago.setText(GlobalUser.getVarPagar());
        jTFecha.setText(GlobalUser.getVarFecha());
        jTTiempoTotal.setText(GlobalUser.getVarHoraTotal());
        descargar();
    }

    public void descargar(){
       String varTitulo = "FACTURA";
        String varRuta = "\\Desktop\\PROYECTO FINAL DESARROLO 1\\proyecto desarrolado en java y xampp/FacturaCliente.pdf";
        PDF objPDF = new PDF();
        String[][] varFacturaCliente = new String[1][7];
        varFacturaCliente[0][0] = GlobalUser.getVarCodigoFactura();
        varFacturaCliente[0][1] = jTPlacaVehiculo.getText();
        varFacturaCliente[0][2] = "CARRO";
        varFacturaCliente[0][3] = jTPago.getText();
        varFacturaCliente[0][4] = jTHoraIngreso.getText(); 
        varFacturaCliente[0][5] =  jTHoraSalida.getText(); 
        varFacturaCliente[0][6] = jTFecha.getText();
        objPDF.gemerarPDF(varFacturaCliente, varTitulo, varRuta);
    
    }
    public void hora() {
        Calendar objCalendario = new GregorianCalendar();
        Date objHoraActual = new Date();
        objCalendario.setTime(objHoraActual);
        this.varHora = objCalendario.get(Calendar.HOUR_OF_DAY) > 9 ? "" + objCalendario.get(Calendar.HOUR_OF_DAY) : "0" + objCalendario.get(Calendar.HOUR_OF_DAY);
        this.varMinutos = objCalendario.get(Calendar.MINUTE) > 9 ? "" + objCalendario.get(Calendar.MINUTE) : "0" + objCalendario.get(Calendar.MINUTE);
        this.varSegundos = objCalendario.get(Calendar.SECOND) > 9 ? "" + objCalendario.get(Calendar.SECOND) : "0" + objCalendario.get(Calendar.SECOND);
    }

    @Override
    public void run() {
        for (int i = 1; i > 0; i++) {
            if (i > 0) {
                hora();
                jLFechaHora.setText(varHora + ":" + varMinutos + ":" + varSegundos + " " + fecha());
            }
        }
    }

    public static String fecha() {
        Date fecha = new Date();
        SimpleDateFormat objFomratoFecha = new SimpleDateFormat("dd/MM/YY");
        return objFomratoFecha.format(fecha);
    }

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
            java.util.logging.Logger.getLogger(GuiRegistroESVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiRegistroESVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiRegistroESVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiRegistroESVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new GuiRegistroESVehiculo().setVisible(true);
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBTBuscarReporteVehiculosES;
    private javax.swing.JButton jBTBuscarVehiculoES;
    private javax.swing.JButton jBTLimpiarVehiculo;
    private javax.swing.JButton jBTRegistrarVehiculoEntrada;
    private javax.swing.JButton jBTRegistroSalida;
    private javax.swing.JButton jBTSalirRU1;
    private javax.swing.JLabel jLFechaHora;
    private javax.swing.JLabel jLIconoFehca;
    private javax.swing.JLabel jLIconoHIngreso;
    private javax.swing.JLabel jLIconoHSalida;
    private javax.swing.JLabel jLIconoHTotal;
    private javax.swing.JLabel jLIconoPago;
    private javax.swing.JPanel jPCerrarRV;
    private javax.swing.JPanel jPControladoresRegistroV;
    private javax.swing.JPanel jPListarV;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTCrudUsuario;
    private javax.swing.JTextField jTFecha;
    private javax.swing.JTextField jTHoraIngreso;
    private javax.swing.JTextField jTHoraSalida;
    private javax.swing.JTable jTListaRegistroVehiculos;
    private javax.swing.JTextField jTPago;
    private javax.swing.JTextField jTPlacaVehiculo;
    private javax.swing.JTextField jTReporteES;
    private javax.swing.JTextField jTTiempoTotal;
    // End of variables declaration//GEN-END:variables
    //METODO PARA INSERTAR UN LOGO EN EL JFRAME
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("jPaqImagenes/coche.png"));
        return retValue;
    }
}
