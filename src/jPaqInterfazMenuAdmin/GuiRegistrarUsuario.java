package jPaqInterfazMenuAdmin;

import jPaqConsultasSQL.ConsultasSQLAdminUsuario;
import jPaqDiseno.Diseno;
import jPaqExcepcion.Excepcion;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.table.DefaultTableModel;

public class GuiRegistrarUsuario extends javax.swing.JFrame {

    ConsultasSQLAdminUsuario objAdminUsuario = new ConsultasSQLAdminUsuario();
    private final Excepcion objException = new Excepcion();
    private String[] varUsuario = new String[7];
    private int varIdUsuario = 0;

    public boolean validarCampos() {
        if ((jTUsuario.getText().equals("USUARIO")) || (jTUsuario.getText().equals(""))) {
            String varResultado = objException.excepcion("POR FAVOR INGRESA EL NICK", 0);
            jPassword.setText(varResultado);
            return false;
        } else if ((jPassword.getText().equals("PASSWORD")) || (jPassword.getText().equals(""))) {
            String varResultado = objException.excepcion("POR FAVOR INGRESE EL PASSWORD", 0);
            jPassword.setText(varResultado);
            return false;
        } else if ((jTNombreApellido.getText().equals("NOMBRE - APELLIDO")) || (jTNombreApellido.getText().equals(""))) {
            String varResultado = objException.excepcion("POR FAVOR INGRESE EL NOMBRE Y APELLIDO", 0);
            jTNombreApellido.setText(varResultado);
            return false;
        } else if ((jTCorreo.getText().equals("CORREO")) || (jTCorreo.getText().equals(""))) {
            String varResultado = objException.excepcion("POR FAVOR INGRESE EL CORREO", 0);
            jTCorreo.setText(varResultado);
            return false;
        } else if ((jTDocumento.getText().equals("DOCUMENTO")) || (jTDocumento.getText().equals(""))) {
            String varResultado = objException.excepcion("POR FAVOR INGRESE EL DOCUMENTO", 0);
            jTCorreo.setText(varResultado);
            return false;
        } else if (jCBRol.getSelectedIndex() == 0) {
            objException.excepcionGuardado(1, "POR FAVOR SELECCIONE EL ROL");
            return false;
        }
        return true;
    }

    public void limpiar() {
        jTUsuario.setText("USUARIO");
        jPassword.setText("PASSWORD");
        jTCorreo.setText("CORREO");
        jTDocumento.setText("DOCUMENTO");
        jTNombreApellido.setText("NOMBRE - APELLIDO");
        jCBRol.setSelectedIndex(0);
        jBTEditarUsuario.setEnabled(false);
        jBTEliminarRegistrol.setEnabled(false);
        jBTRegistrarUsuario.setEnabled(true);
    }

    public GuiRegistrarUsuario() {
        initComponents();
        setLocationRelativeTo(null);
        jBTEditarUsuario.setEnabled(false);
        jBTEliminarRegistrol.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTCrudUsuario = new javax.swing.JTabbedPane();
        jPControladoresRegistroUsu = new Diseno();
        jLIconoUser = new javax.swing.JLabel();
        jLIconoCorreo = new javax.swing.JLabel();
        jPassword = new javax.swing.JPasswordField();
        jTNombreApellido = new javax.swing.JTextField();
        jLIconoNombreA = new javax.swing.JLabel();
        jTUsuario = new javax.swing.JTextField();
        jTCorreo = new javax.swing.JTextField();
        jTDocumento = new javax.swing.JTextField();
        jCBRol = new javax.swing.JComboBox<>();
        jLIconoPassword = new javax.swing.JLabel();
        jLIconoRol = new javax.swing.JLabel();
        jBTRegistrarUsuario = new javax.swing.JButton();
        jBTLimpiar = new javax.swing.JButton();
        jBTEditarUsuario = new javax.swing.JButton();
        jBTEliminarRegistrol = new javax.swing.JButton();
        jBTBuscarUsuarioDocumento = new javax.swing.JButton();
        jPListarUsuarios = new javax.swing.JPanel();
        jSPListarUsuario = new javax.swing.JScrollPane();
        jTListarRegistroUsuarios = new javax.swing.JTable();
        jBTBuscarUsuario = new javax.swing.JButton();
        jTFiltrarNombre = new javax.swing.JTextField();
        jPSalirRegistroUsuario = new javax.swing.JPanel();
        jBTSalirRegistroUsuario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);

        jTCrudUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "REGISTRAR-USUARIO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 1, 18))); // NOI18N

        jLIconoUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jPaqImagenes/nick.png"))); // NOI18N

        jLIconoCorreo.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLIconoCorreo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jPaqImagenes/correo.png"))); // NOI18N

        jPassword.setBackground(new java.awt.Color(246, 246, 246));
        jPassword.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPassword.setText("PASSWORD");
        jPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPasswordMouseClicked(evt);
            }
        });

        jTNombreApellido.setBackground(new java.awt.Color(246, 246, 246));
        jTNombreApellido.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jTNombreApellido.setForeground(new java.awt.Color(102, 102, 102));
        jTNombreApellido.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTNombreApellido.setText("NOMBRE - APELLIDO");
        jTNombreApellido.setAutoscrolls(false);
        jTNombreApellido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTNombreApellidoMouseClicked(evt);
            }
        });
        jTNombreApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTNombreApellidoActionPerformed(evt);
            }
        });

        jLIconoNombreA.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLIconoNombreA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jPaqImagenes/user.png"))); // NOI18N

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

        jTCorreo.setBackground(new java.awt.Color(246, 246, 246));
        jTCorreo.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jTCorreo.setForeground(new java.awt.Color(102, 102, 102));
        jTCorreo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTCorreo.setText("CORREO");
        jTCorreo.setAutoscrolls(false);
        jTCorreo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTCorreoMouseClicked(evt);
            }
        });
        jTCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTCorreoActionPerformed(evt);
            }
        });

        jTDocumento.setBackground(new java.awt.Color(246, 246, 246));
        jTDocumento.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jTDocumento.setForeground(new java.awt.Color(102, 102, 102));
        jTDocumento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTDocumento.setText("DOCUMENTO");
        jTDocumento.setAutoscrolls(false);
        jTDocumento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTDocumentoMouseClicked(evt);
            }
        });
        jTDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTDocumentoActionPerformed(evt);
            }
        });

        jCBRol.setBackground(new java.awt.Color(246, 246, 246));
        jCBRol.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jCBRol.setForeground(new java.awt.Color(102, 102, 102));
        jCBRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ROL", "ADMINISTRADOR", "PORTERO" }));
        jCBRol.setToolTipText("");
        jCBRol.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLIconoPassword.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLIconoPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jPaqImagenes/contrasena.png"))); // NOI18N

        jLIconoRol.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLIconoRol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jPaqImagenes/rol.png"))); // NOI18N

        jBTRegistrarUsuario.setBackground(new java.awt.Color(246, 246, 246));
        jBTRegistrarUsuario.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jBTRegistrarUsuario.setForeground(new java.awt.Color(102, 102, 102));
        jBTRegistrarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jPaqImagenes/userI.png"))); // NOI18N
        jBTRegistrarUsuario.setText("REGISTRAR USUARIO");
        jBTRegistrarUsuario.setToolTipText("");
        jBTRegistrarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBTRegistrarUsuario.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jBTRegistrarUsuario.setIconTextGap(40);
        jBTRegistrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTRegistrarUsuarioActionPerformed(evt);
            }
        });

        jBTLimpiar.setBackground(new java.awt.Color(246, 246, 246));
        jBTLimpiar.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jBTLimpiar.setForeground(new java.awt.Color(102, 102, 102));
        jBTLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jPaqImagenes/clean.png"))); // NOI18N
        jBTLimpiar.setText("LIMPIAR");
        jBTLimpiar.setToolTipText("");
        jBTLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBTLimpiar.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jBTLimpiar.setIconTextGap(40);
        jBTLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTLimpiarActionPerformed(evt);
            }
        });

        jBTEditarUsuario.setBackground(new java.awt.Color(246, 246, 246));
        jBTEditarUsuario.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jBTEditarUsuario.setForeground(new java.awt.Color(102, 102, 102));
        jBTEditarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jPaqImagenes/userU.png"))); // NOI18N
        jBTEditarUsuario.setText("EDITAR USUARIO");
        jBTEditarUsuario.setToolTipText("");
        jBTEditarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBTEditarUsuario.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jBTEditarUsuario.setIconTextGap(40);
        jBTEditarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTEditarUsuarioActionPerformed(evt);
            }
        });

        jBTEliminarRegistrol.setBackground(new java.awt.Color(246, 246, 246));
        jBTEliminarRegistrol.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jBTEliminarRegistrol.setForeground(new java.awt.Color(102, 102, 102));
        jBTEliminarRegistrol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jPaqImagenes/userD.png"))); // NOI18N
        jBTEliminarRegistrol.setText("ELIMINAR USUARIO");
        jBTEliminarRegistrol.setToolTipText("");
        jBTEliminarRegistrol.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBTEliminarRegistrol.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jBTEliminarRegistrol.setIconTextGap(40);
        jBTEliminarRegistrol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTEliminarRegistrolActionPerformed(evt);
            }
        });

        jBTBuscarUsuarioDocumento.setBackground(new java.awt.Color(246, 246, 246));
        jBTBuscarUsuarioDocumento.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jBTBuscarUsuarioDocumento.setForeground(new java.awt.Color(102, 102, 102));
        jBTBuscarUsuarioDocumento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jPaqImagenes/documento.png"))); // NOI18N
        jBTBuscarUsuarioDocumento.setToolTipText("");
        jBTBuscarUsuarioDocumento.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBTBuscarUsuarioDocumento.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jBTBuscarUsuarioDocumento.setIconTextGap(40);
        jBTBuscarUsuarioDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTBuscarUsuarioDocumentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPControladoresRegistroUsuLayout = new javax.swing.GroupLayout(jPControladoresRegistroUsu);
        jPControladoresRegistroUsu.setLayout(jPControladoresRegistroUsuLayout);
        jPControladoresRegistroUsuLayout.setHorizontalGroup(
            jPControladoresRegistroUsuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPControladoresRegistroUsuLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPControladoresRegistroUsuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPControladoresRegistroUsuLayout.createSequentialGroup()
                        .addComponent(jBTLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBTEliminarRegistrol, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPControladoresRegistroUsuLayout.createSequentialGroup()
                        .addGroup(jPControladoresRegistroUsuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBTRegistrarUsuario)
                            .addGroup(jPControladoresRegistroUsuLayout.createSequentialGroup()
                                .addGroup(jPControladoresRegistroUsuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPControladoresRegistroUsuLayout.createSequentialGroup()
                                        .addGroup(jPControladoresRegistroUsuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLIconoNombreA, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLIconoUser))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPControladoresRegistroUsuLayout.createSequentialGroup()
                                        .addComponent(jBTBuscarUsuarioDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(8, 8, 8)))
                                .addGroup(jPControladoresRegistroUsuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTDocumento)
                                    .addComponent(jTUsuario)
                                    .addComponent(jTNombreApellido, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE))))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPControladoresRegistroUsuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPControladoresRegistroUsuLayout.createSequentialGroup()
                                .addComponent(jLIconoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTCorreo))
                            .addGroup(jPControladoresRegistroUsuLayout.createSequentialGroup()
                                .addComponent(jLIconoPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPControladoresRegistroUsuLayout.createSequentialGroup()
                                .addComponent(jLIconoRol, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jCBRol, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jBTEditarUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPControladoresRegistroUsuLayout.setVerticalGroup(
            jPControladoresRegistroUsuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPControladoresRegistroUsuLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPControladoresRegistroUsuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLIconoUser, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLIconoPassword)
                    .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPControladoresRegistroUsuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLIconoRol)
                    .addGroup(jPControladoresRegistroUsuLayout.createSequentialGroup()
                        .addGroup(jPControladoresRegistroUsuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLIconoNombreA)
                            .addComponent(jTNombreApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLIconoCorreo)
                            .addComponent(jTCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPControladoresRegistroUsuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPControladoresRegistroUsuLayout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jCBRol, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPControladoresRegistroUsuLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(jPControladoresRegistroUsuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTDocumento, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                                    .addComponent(jBTBuscarUsuarioDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))))
                .addGap(51, 51, 51)
                .addGroup(jPControladoresRegistroUsuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBTRegistrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBTEditarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPControladoresRegistroUsuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBTLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBTEliminarRegistrol, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jCBRol.getAccessibleContext().setAccessibleName("");

        jTCrudUsuario.addTab("REGISTRAR USUARIO", jPControladoresRegistroUsu);

        jTListarRegistroUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jSPListarUsuario.setViewportView(jTListarRegistroUsuarios);

        jBTBuscarUsuario.setBackground(new java.awt.Color(246, 246, 246));
        jBTBuscarUsuario.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jBTBuscarUsuario.setForeground(new java.awt.Color(102, 102, 102));
        jBTBuscarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jPaqImagenes/user.png"))); // NOI18N
        jBTBuscarUsuario.setToolTipText("");
        jBTBuscarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBTBuscarUsuario.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jBTBuscarUsuario.setIconTextGap(40);
        jBTBuscarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTBuscarUsuarioActionPerformed(evt);
            }
        });

        jTFiltrarNombre.setBackground(new java.awt.Color(246, 246, 246));
        jTFiltrarNombre.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jTFiltrarNombre.setForeground(new java.awt.Color(102, 102, 102));
        jTFiltrarNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFiltrarNombre.setText("FILTRAR POR DOCUMENTO");
        jTFiltrarNombre.setAutoscrolls(false);
        jTFiltrarNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTFiltrarNombreMouseClicked(evt);
            }
        });
        jTFiltrarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFiltrarNombreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPListarUsuariosLayout = new javax.swing.GroupLayout(jPListarUsuarios);
        jPListarUsuarios.setLayout(jPListarUsuariosLayout);
        jPListarUsuariosLayout.setHorizontalGroup(
            jPListarUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPListarUsuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPListarUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSPListarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 784, Short.MAX_VALUE)
                    .addGroup(jPListarUsuariosLayout.createSequentialGroup()
                        .addComponent(jBTBuscarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTFiltrarNombre)))
                .addContainerGap())
        );
        jPListarUsuariosLayout.setVerticalGroup(
            jPListarUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPListarUsuariosLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPListarUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTFiltrarNombre)
                    .addComponent(jBTBuscarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jSPListarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jTCrudUsuario.addTab("LISTAR USUARIOS", jPListarUsuarios);

        jBTSalirRegistroUsuario.setBackground(new java.awt.Color(255, 51, 51));
        jBTSalirRegistroUsuario.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jBTSalirRegistroUsuario.setForeground(new java.awt.Color(102, 102, 102));
        jBTSalirRegistroUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jPaqImagenes/salir.png"))); // NOI18N
        jBTSalirRegistroUsuario.setText("CERRAR REGISTRO USUARIO");
        jBTSalirRegistroUsuario.setToolTipText("");
        jBTSalirRegistroUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBTSalirRegistroUsuario.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jBTSalirRegistroUsuario.setIconTextGap(40);
        jBTSalirRegistroUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTSalirRegistroUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPSalirRegistroUsuarioLayout = new javax.swing.GroupLayout(jPSalirRegistroUsuario);
        jPSalirRegistroUsuario.setLayout(jPSalirRegistroUsuarioLayout);
        jPSalirRegistroUsuarioLayout.setHorizontalGroup(
            jPSalirRegistroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPSalirRegistroUsuarioLayout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(jBTSalirRegistroUsuario)
                .addContainerGap(223, Short.MAX_VALUE))
        );
        jPSalirRegistroUsuarioLayout.setVerticalGroup(
            jPSalirRegistroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPSalirRegistroUsuarioLayout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addComponent(jBTSalirRegistroUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(314, Short.MAX_VALUE))
        );

        jTCrudUsuario.addTab("SALIR", jPSalirRegistroUsuario);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jTCrudUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 825, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jTCrudUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTNombreApellidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTNombreApellidoMouseClicked
        jTNombreApellido.setText("");
        if ((jTUsuario.getText().equals("USUARIO")) || (jTUsuario.getText().equals(""))) {
            jTUsuario.setText("USUARIO");
        }
        if ((jPassword.getText().equals("PASSWORD")) || (jPassword.getText().equals(""))) {
            jPassword.setText("PASSWORD");
        }
        if ((jTCorreo.getText().equals("CORREO")) || (jTCorreo.getText().equals(""))) {
            jTCorreo.setText("CORREO");
        }
        if ((jTDocumento.getText().equals("DOCUMENTO")) || (jTDocumento.getText().equals(""))) {
            jTDocumento.setText("DOCUMENTO");
        }
    }//GEN-LAST:event_jTNombreApellidoMouseClicked

    private void jTNombreApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTNombreApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTNombreApellidoActionPerformed

    private void jPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordMouseClicked
        jPassword.setText("");
        if ((jTUsuario.getText().equals("USUARIO")) || (jTUsuario.getText().equals(""))) {
            jTUsuario.setText("USUARIO");
        }
        if ((jTNombreApellido.getText().equals("NOMBRE - APELLIDO")) || (jTNombreApellido.getText().equals(""))) {
            jTNombreApellido.setText("NOMBRE - APELLIDO");
        }
        if ((jTCorreo.getText().equals("CORREO")) || (jTCorreo.getText().equals(""))) {
            jTCorreo.setText("CORREO");
        }
        if ((jTDocumento.getText().equals("DOCUMENTO")) || (jTDocumento.getText().equals(""))) {
            jTDocumento.setText("DOCUMENTO");
        }
    }//GEN-LAST:event_jPasswordMouseClicked

    private void jTUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTUsuarioMouseClicked
        jTUsuario.setText("");
        if ((jPassword.getText().equals("PASSWORD")) || (jPassword.getText().equals(""))) {
            jPassword.setText("PASSWORD");
        }
        if ((jTNombreApellido.getText().equals("NOMBRE - APELLIDO")) || (jTNombreApellido.getText().equals(""))) {
            jTNombreApellido.setText("NOMBRE - APELLIDO");
        }
        if ((jTCorreo.getText().equals("CORREO")) || (jTCorreo.getText().equals(""))) {
            jTCorreo.setText("CORREO");
        }
        if ((jTDocumento.getText().equals("DOCUMENTO")) || (jTDocumento.getText().equals(""))) {
            jTDocumento.setText("DOCUMENTO");
        }
    }//GEN-LAST:event_jTUsuarioMouseClicked

    private void jTUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTUsuarioActionPerformed

    private void jTCorreoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTCorreoMouseClicked
        jTCorreo.setText("");
        if ((jTUsuario.getText().equals("USUARIO")) || (jTUsuario.getText().equals(""))) {
            jTUsuario.setText("USUARIO");
        }
        if ((jPassword.getText().equals("PASSWORD")) || (jPassword.getText().equals(""))) {
            jPassword.setText("PASSWORD");
        }
        if ((jTNombreApellido.getText().equals("NOMBRE - APELLIDO")) || (jTNombreApellido.getText().equals(""))) {
            jTNombreApellido.setText("NOMBRE - APELLIDO");
        }
        if ((jTDocumento.getText().equals("DOCUMENTO")) || (jTDocumento.getText().equals(""))) {
            jTDocumento.setText("DOCUMENTO");
        }
    }//GEN-LAST:event_jTCorreoMouseClicked

    private void jTCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTCorreoActionPerformed

    private void jTDocumentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTDocumentoMouseClicked
        jTDocumento.setText("");
        if ((jTUsuario.getText().equals("USUARIO")) || (jTUsuario.getText().equals(""))) {
            jTUsuario.setText("USUARIO");
        }
        if ((jPassword.getText().equals("PASSWORD")) || (jPassword.getText().equals(""))) {
            jPassword.setText("PASSWORD");
        }
        if ((jTNombreApellido.getText().equals("NOMBRE - APELLIDO")) || (jTNombreApellido.getText().equals(""))) {
            jTNombreApellido.setText("NOMBRE - APELLIDO");
        }
        if ((jTCorreo.getText().equals("CORREO")) || (jTCorreo.getText().equals(""))) {
            jTCorreo.setText("CORREO");
        }
    }//GEN-LAST:event_jTDocumentoMouseClicked

    private void jTDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTDocumentoActionPerformed

    private void jBTRegistrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTRegistrarUsuarioActionPerformed
        if (validarCampos()) {
            int varTamañoSQL = objAdminUsuario.tamañoSQL(jTDocumento.getText(), 0);
            if (varTamañoSQL > 0) {
                objException.excepcionGuardado(1, "YA SE ENCUENTRA UN REGISTRO CON ESTE DOCUMENTO");
            } else {
                if (objAdminUsuario.registrarUsuario(jTUsuario.getText(), jPassword.getText(), jTNombreApellido.getText(), jTCorreo.getText(), jTDocumento.getText(), jCBRol.getSelectedIndex())) {
                    objException.excepcionGuardado(0, "REGISTRO EXITOSO");
                    limpiar();
                } else {
                    objException.excepcionGuardado(1, "INCONVENEINTE CON EL REGISRO");
                }
            }
        }
    }//GEN-LAST:event_jBTRegistrarUsuarioActionPerformed

    private void jBTSalirRegistroUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTSalirRegistroUsuarioActionPerformed
        dispose();
    }//GEN-LAST:event_jBTSalirRegistroUsuarioActionPerformed

    private void jBTEliminarRegistrolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTEliminarRegistrolActionPerformed
        if (varIdUsuario > 0) {
            if (validarCampos()) {
                if (objAdminUsuario.eliminarUsuario(varIdUsuario)) {
                    objException.excepcionGuardado(0, "REGISTRO EKIMINADO");
                    limpiar();
                } else {
                    objException.excepcionGuardado(1, "INCONVENEINTE CON LA ELIMINACION DEL USUARIO");
                }
            }
        } else {
            objException.excepcionGuardado(1, "REALIZAR LA BUSQUEDA DEL USUARIO PARA PROCEDER A ELIMINAR");
        }
    }//GEN-LAST:event_jBTEliminarRegistrolActionPerformed

    private void jBTLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_jBTLimpiarActionPerformed

    private void jBTEditarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTEditarUsuarioActionPerformed
        if (varIdUsuario > 0) {
            if (validarCampos()) {
                if (objAdminUsuario.editarUsuario(varIdUsuario, jTUsuario.getText(), jPassword.getText(), jTNombreApellido.getText(), jTCorreo.getText(), jTDocumento.getText(), jCBRol.getSelectedIndex())) {
                    objException.excepcionGuardado(0, "REGISTRO ACTUALIZADO");
                    limpiar();
                } else {
                    objException.excepcionGuardado(1, "INCONVENEINTE CON LA ACTUALIZACION DEL USUARIO");
                }
            }
        } else {
            objException.excepcionGuardado(1, "REALIZAR LA BUSQUEDA DEL USUARIO PARA PROCEDER A ACTUALIZAR");
        }
    }//GEN-LAST:event_jBTEditarUsuarioActionPerformed

    private void jBTBuscarUsuarioDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTBuscarUsuarioDocumentoActionPerformed
        if ((jTDocumento.getText().equals("DOCUMENTO")) || (jTDocumento.getText().equals(""))) {
            String varResultado = objException.excepcion("POR FAVOR INGRESE EL DOCUMENTO", 0);
            jTCorreo.setText(varResultado);
        } else {
            int varTamañoSQL = objAdminUsuario.tamañoSQL(jTDocumento.getText(), 0);
            if (varTamañoSQL > 0) {
                varUsuario = objAdminUsuario.consultaUsuario(jTDocumento.getText());
                varIdUsuario = Integer.valueOf(varUsuario[0]);
                jTUsuario.setText(varUsuario[1]);
                jPassword.setText(varUsuario[2]);
                jTNombreApellido.setText(varUsuario[3]);
                jTCorreo.setText(varUsuario[4]);
                jTDocumento.setText(varUsuario[5]);
                jCBRol.setSelectedIndex(Integer.valueOf(varUsuario[6]));
                jBTEditarUsuario.setEnabled(true);
                jBTEliminarRegistrol.setEnabled(true);
                jBTRegistrarUsuario.setEnabled(false);

            } else {
                objException.excepcionGuardado(1, "NO HAY REGISTROS CON ESE DOCUMENTO");
            }
        }
    }//GEN-LAST:event_jBTBuscarUsuarioDocumentoActionPerformed

    private void jBTBuscarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTBuscarUsuarioActionPerformed
        String varResultado = "";
        int varSQL = 2;
        if ((jTFiltrarNombre.getText().equals("")) || (jTFiltrarNombre.getText().equals("FILTRAR POR DOCUMENTO"))) {
            varResultado = "";
            varSQL = 2;
        } else {
            varResultado = jTFiltrarNombre.getText();
            varSQL = 1;
        }
        int varTamañoSQL = objAdminUsuario.tamañoSQL(varResultado, varSQL);
        if (varTamañoSQL > 0) {
            mostrarMatriz(objAdminUsuario.consultarUsuarios(varResultado, varTamañoSQL, varSQL));
        } else {
            objException.excepcionGuardado(1, "NO HAY INFORMACION EN EL SISTEMA");
        }
    }//GEN-LAST:event_jBTBuscarUsuarioActionPerformed
    public void mostrarMatriz(String varMatriz[][]) {
        if (varMatriz != null) {
            DefaultTableModel objModel = (DefaultTableModel) jTListarRegistroUsuarios.getModel();
            objModel.setRowCount(varMatriz.length);
            objModel.setColumnCount(5);
            jTListarRegistroUsuarios.getColumn("A").setHeaderValue("USUARIO");
            jTListarRegistroUsuarios.getColumn("B").setHeaderValue("NOMBRE-APELLIDO");
            jTListarRegistroUsuarios.getColumn("C").setHeaderValue("CORREO");
            jTListarRegistroUsuarios.getColumn("D").setHeaderValue("DOCUMENTO");
            jTListarRegistroUsuarios.getColumn("E").setHeaderValue("ROL");
            for (int i = 0; i < varMatriz.length; i++) {
                for (int j = 0; j < 5; j++) {
                    jTListarRegistroUsuarios.setValueAt(varMatriz[i][j], i, j);
                }
            }
        } else {
            objException.excepcionGuardado(1, "NO HAY INFORMACION EN EL SISTEMA");
        }

    }
    private void jTFiltrarNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTFiltrarNombreMouseClicked
        jTFiltrarNombre.setText("");
    }//GEN-LAST:event_jTFiltrarNombreMouseClicked

    private void jTFiltrarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFiltrarNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFiltrarNombreActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiRegistrarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBTBuscarUsuario;
    private javax.swing.JButton jBTBuscarUsuarioDocumento;
    private javax.swing.JButton jBTEditarUsuario;
    private javax.swing.JButton jBTEliminarRegistrol;
    private javax.swing.JButton jBTLimpiar;
    private javax.swing.JButton jBTRegistrarUsuario;
    private javax.swing.JButton jBTSalirRegistroUsuario;
    private javax.swing.JComboBox<String> jCBRol;
    private javax.swing.JLabel jLIconoCorreo;
    private javax.swing.JLabel jLIconoNombreA;
    private javax.swing.JLabel jLIconoPassword;
    private javax.swing.JLabel jLIconoRol;
    private javax.swing.JLabel jLIconoUser;
    private javax.swing.JPanel jPControladoresRegistroUsu;
    private javax.swing.JPanel jPListarUsuarios;
    private javax.swing.JPanel jPSalirRegistroUsuario;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JScrollPane jSPListarUsuario;
    private javax.swing.JTextField jTCorreo;
    private javax.swing.JTabbedPane jTCrudUsuario;
    private javax.swing.JTextField jTDocumento;
    private javax.swing.JTextField jTFiltrarNombre;
    private javax.swing.JTable jTListarRegistroUsuarios;
    private javax.swing.JTextField jTNombreApellido;
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
