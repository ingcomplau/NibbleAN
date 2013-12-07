/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package visual;

import java.awt.Color;

/**
 *
 * @author Franco
 */
public class AgregarUsuario extends javax.swing.JFrame {

    private boolean clickNombre=true;
    private boolean clickApellido=true;
    private boolean clickNombreUsuario=true;
    private boolean clickCiudad=true;
    private boolean clickCodPostal=true;
    private boolean clickCalle=true;
    private boolean clickNro=true;
    private boolean clickTelefono=true;
    private boolean clickContraseña=true;
    private boolean clickConfContraseña=true;
    private boolean clickEmail=true;
    private Home home;
    
    public AgregarUsuario(Home home) {
        this.home=home;
        initComponents();
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel1 = new javax.swing.JPanel();
        panelRegistrarse = new javax.swing.JLabel();
        campoCiudad = new javax.swing.JTextField();
        campoCodigoPostal = new javax.swing.JTextField();
        campoCalle = new javax.swing.JTextField();
        campoNro = new javax.swing.JTextField();
        campoTelefono = new javax.swing.JTextField();
        campoNombre = new javax.swing.JTextField();
        campoApellido = new javax.swing.JTextField();
        campoNombreUsuario = new javax.swing.JTextField();
        campoContraseña = new javax.swing.JPasswordField();
        campoConfContraseña = new javax.swing.JPasswordField();
        campoEmail = new javax.swing.JFormattedTextField();
        botonRegistrarse = new javax.swing.JLabel();
        checkAceptar = new javax.swing.JCheckBox();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fNac = new com.toedter.calendar.JDateChooser();
        labelContraeña = new javax.swing.JLabel();
        errorTelefono = new javax.swing.JLabel();
        errorNombre = new javax.swing.JLabel();
        errorApellido = new javax.swing.JLabel();
        errorNombreUsuario = new javax.swing.JLabel();
        errorEmail = new javax.swing.JLabel();
        labelConfirmar = new javax.swing.JLabel();
        errorTerminos = new javax.swing.JLabel();
        errorContraseña = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registrarse");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(218, 216, 218));
        jPanel1.setPreferredSize(new java.awt.Dimension(439, 711));

        panelRegistrarse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagen/Resource/PanelRegistrarse.png"))); // NOI18N

        campoCiudad.setBackground(new java.awt.Color(240, 230, 240));
        campoCiudad.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        campoCiudad.setForeground(new java.awt.Color(153, 153, 153));
        campoCiudad.setText(" Ciudad");
        campoCiudad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoCiudadFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                campoCiudadFocusLost(evt);
            }
        });

        campoCodigoPostal.setBackground(new java.awt.Color(240, 230, 240));
        campoCodigoPostal.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        campoCodigoPostal.setForeground(new java.awt.Color(153, 153, 153));
        campoCodigoPostal.setText(" Codigo Postal");
        campoCodigoPostal.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoCodigoPostalFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                campoCodigoPostalFocusLost(evt);
            }
        });

        campoCalle.setBackground(new java.awt.Color(240, 230, 240));
        campoCalle.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        campoCalle.setForeground(new java.awt.Color(153, 153, 153));
        campoCalle.setText(" Calle");
        campoCalle.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoCalleFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                campoCalleFocusLost(evt);
            }
        });

        campoNro.setBackground(new java.awt.Color(240, 230, 240));
        campoNro.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        campoNro.setForeground(new java.awt.Color(153, 153, 153));
        campoNro.setText(" Nro");
        campoNro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoNroFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                campoNroFocusLost(evt);
            }
        });

        campoTelefono.setBackground(new java.awt.Color(240, 230, 240));
        campoTelefono.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        campoTelefono.setForeground(new java.awt.Color(153, 153, 153));
        campoTelefono.setText(" Telefono");
        campoTelefono.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoTelefonoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                campoTelefonoFocusLost(evt);
            }
        });

        campoNombre.setBackground(new java.awt.Color(240, 230, 240));
        campoNombre.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        campoNombre.setForeground(new java.awt.Color(153, 153, 153));
        campoNombre.setText(" Nombre");
        campoNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoNombreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                campoNombreFocusLost(evt);
            }
        });

        campoApellido.setBackground(new java.awt.Color(240, 230, 240));
        campoApellido.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        campoApellido.setForeground(new java.awt.Color(153, 153, 153));
        campoApellido.setText(" Apellido");
        campoApellido.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoApellidoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                campoApellidoFocusLost(evt);
            }
        });

        campoNombreUsuario.setBackground(new java.awt.Color(240, 230, 240));
        campoNombreUsuario.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        campoNombreUsuario.setForeground(new java.awt.Color(153, 153, 153));
        campoNombreUsuario.setText(" Nombre de Usuario");
        campoNombreUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoNombreUsuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                campoNombreUsuarioFocusLost(evt);
            }
        });

        campoContraseña.setBackground(new java.awt.Color(240, 230, 240));
        campoContraseña.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        campoContraseña.setForeground(new java.awt.Color(153, 153, 153));
        campoContraseña.setText("jPasswordField1");
        campoContraseña.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoContraseñaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                campoContraseñaFocusLost(evt);
            }
        });

        campoConfContraseña.setBackground(new java.awt.Color(240, 230, 240));
        campoConfContraseña.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        campoConfContraseña.setForeground(new java.awt.Color(153, 153, 153));
        campoConfContraseña.setText("jPasswordField2");
        campoConfContraseña.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoConfContraseñaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                campoConfContraseñaFocusLost(evt);
            }
        });

        campoEmail.setBackground(new java.awt.Color(240, 230, 240));
        campoEmail.setForeground(new java.awt.Color(153, 153, 153));
        campoEmail.setText(" Email");
        campoEmail.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        campoEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                campoEmailFocusLost(evt);
            }
        });

        botonRegistrarse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagen/Resource/ButtonRegistrarse2.png"))); // NOI18N
        botonRegistrarse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonRegistrarseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonRegistrarseMouseExited(evt);
            }
        });

        checkAceptar.setBackground(new java.awt.Color(218, 216, 218));
        checkAceptar.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        checkAceptar.setForeground(new java.awt.Color(153, 153, 153));
        checkAceptar.setText(" Aceptar términos y condiciones");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Provincia: ");

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Fecha de Nacimiento:");

        fNac.setBackground(new java.awt.Color(218, 216, 218));
        fNac.setMinSelectableDate(new java.util.Date(-14830977525000L));

        labelContraeña.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        labelContraeña.setForeground(new java.awt.Color(153, 153, 153));
        labelContraeña.setText("Contraseña:");

        errorTelefono.setForeground(new java.awt.Color(255, 0, 0));

        errorNombre.setForeground(new java.awt.Color(255, 0, 0));

        errorApellido.setForeground(new java.awt.Color(255, 0, 0));

        errorNombreUsuario.setForeground(new java.awt.Color(255, 0, 0));

        errorEmail.setForeground(new java.awt.Color(255, 0, 0));

        labelConfirmar.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        labelConfirmar.setForeground(new java.awt.Color(153, 153, 153));
        labelConfirmar.setText("Confirmar Contraseña:");

        errorTerminos.setForeground(new java.awt.Color(255, 0, 0));

        errorContraseña.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRegistrarse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(errorContraseña)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(errorEmail)
                                    .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(errorTelefono)
                                    .addComponent(campoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoCodigoPostal, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(errorNombreUsuario)
                                    .addComponent(errorApellido)
                                    .addComponent(campoNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(errorNombre)
                                    .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(fNac, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(campoCalle, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(campoNro, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(labelContraeña))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoContraseña, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(labelConfirmar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(campoConfContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(errorTerminos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(checkAceptar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonRegistrarse)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(panelRegistrarse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorNombre)
                .addGap(3, 3, 3)
                .addComponent(campoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(errorApellido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(errorNombreUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(fNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(1, 1, 1)
                .addComponent(campoCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campoCodigoPostal, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoCalle, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoNro, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorTelefono)
                .addGap(4, 4, 4)
                .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorEmail)
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelContraeña))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoConfContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelConfirmar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(errorContraseña)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(errorTerminos)
                                .addGap(13, 13, 13))
                            .addComponent(checkAceptar, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 38, Short.MAX_VALUE)
                        .addComponent(botonRegistrarse)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 643, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonRegistrarseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegistrarseMouseEntered
        // TODO add your handling code here:
        botonRegistrarse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagen/Resource/ButtonRegistrarseFocus2.png"))); 
    }//GEN-LAST:event_botonRegistrarseMouseEntered

    private void botonRegistrarseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegistrarseMouseExited
         botonRegistrarse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagen/Resource/ButtonRegistrarse2.png")));
    }//GEN-LAST:event_botonRegistrarseMouseExited

    private void campoNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoNombreFocusGained
        if(clickNombre){
            clickNombre=false;
            campoNombre.setText("");
            campoNombre.setForeground(Color.black);
        }
    }//GEN-LAST:event_campoNombreFocusGained

    private void campoApellidoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoApellidoFocusGained
        if(clickApellido){
            clickApellido=false;
            campoApellido.setText("");
            campoApellido.setForeground(Color.black);
        }
    }//GEN-LAST:event_campoApellidoFocusGained

    private void campoNombreUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoNombreUsuarioFocusGained
        if(clickNombreUsuario){
            clickNombreUsuario=false;
            campoNombreUsuario.setText("");
            campoNombreUsuario.setForeground(Color.black);
        }
    }//GEN-LAST:event_campoNombreUsuarioFocusGained

    private void campoCiudadFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoCiudadFocusGained
        if(clickCiudad){
            clickCiudad=false;
            campoCiudad.setText("");
            campoCiudad.setForeground(Color.black);
        }
    }//GEN-LAST:event_campoCiudadFocusGained

    private void campoCodigoPostalFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoCodigoPostalFocusGained
        if(clickCodPostal){
            clickCodPostal=false;
            campoCodigoPostal.setText("");
            campoCodigoPostal.setForeground(Color.black);
        }
    }//GEN-LAST:event_campoCodigoPostalFocusGained

    private void campoCalleFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoCalleFocusGained
        if(clickCalle){
            clickCalle=false;
            campoCalle.setText("");
            campoCalle.setForeground(Color.black);
        }
    }//GEN-LAST:event_campoCalleFocusGained

    private void campoNroFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoNroFocusGained
        if(clickNro){
            clickNro=false;
            campoNro.setText("");
            campoNro.setForeground(Color.black);
        }
    }//GEN-LAST:event_campoNroFocusGained

    private void campoTelefonoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoTelefonoFocusGained
        if(clickTelefono){
            clickTelefono=false;
            campoTelefono.setText("");
            campoTelefono.setForeground(Color.black);
        }
    }//GEN-LAST:event_campoTelefonoFocusGained

    private void campoEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoEmailFocusGained
        if(clickEmail){
            clickEmail=false;
            campoEmail.setText("");
            campoEmail.setForeground(Color.black);
        }
    }//GEN-LAST:event_campoEmailFocusGained

    private void campoContraseñaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoContraseñaFocusGained
        if(clickContraseña){
            clickContraseña=false;
            campoContraseña.setText("");
            campoContraseña.setForeground(Color.black);
        }
    }//GEN-LAST:event_campoContraseñaFocusGained

    private void campoConfContraseñaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoConfContraseñaFocusGained
        if(clickConfContraseña){
            clickConfContraseña=false;
            campoConfContraseña.setText("");
            campoConfContraseña.setForeground(Color.black);
        }
    }//GEN-LAST:event_campoConfContraseñaFocusGained

    private void campoNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoNombreFocusLost
        if(campoNombre.getText().equals("")){
            campoNombre.setText(" Nombre");
            campoNombre.setForeground((new java.awt.Color(153, 153, 153)));
            clickNombre=true;
        }
    }//GEN-LAST:event_campoNombreFocusLost

    private void campoApellidoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoApellidoFocusLost
        if(campoApellido.getText().equals("")){
            campoApellido.setText(" Apellido");
            campoApellido.setForeground((new java.awt.Color(153, 153, 153)));
            clickApellido=true;
        }
    }//GEN-LAST:event_campoApellidoFocusLost

    private void campoCiudadFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoCiudadFocusLost
        if(campoCiudad.getText().equals("")){
            campoCiudad.setText(" Ciudad");
            campoCiudad.setForeground((new java.awt.Color(153, 153, 153)));
            clickCiudad=true;
        }
    }//GEN-LAST:event_campoCiudadFocusLost

    private void campoCodigoPostalFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoCodigoPostalFocusLost
        if(campoCodigoPostal.getText().equals("")){
            campoCodigoPostal.setText(" Codigo Postal");
            campoCodigoPostal.setForeground((new java.awt.Color(153, 153, 153)));
            clickCodPostal=true;
        }
    }//GEN-LAST:event_campoCodigoPostalFocusLost

    private void campoCalleFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoCalleFocusLost
        if(campoCalle.getText().equals("")){
            campoCalle.setText(" Nombre");
            campoCalle.setForeground((new java.awt.Color(153, 153, 153)));
            clickCalle=true;
        }
    }//GEN-LAST:event_campoCalleFocusLost

    private void campoNroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoNroFocusLost
        if(campoNro.getText().equals("")){
            campoNro.setText(" Nro");
            campoNro.setForeground((new java.awt.Color(153, 153, 153)));
            clickNro=true;
        }
    }//GEN-LAST:event_campoNroFocusLost

    private void campoTelefonoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoTelefonoFocusLost
        if(campoTelefono.getText().equals("")){
            campoTelefono.setText(" Nombre");
            campoTelefono.setForeground((new java.awt.Color(153, 153, 153)));
            clickTelefono=true;
        }
    }//GEN-LAST:event_campoTelefonoFocusLost

    private void campoEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoEmailFocusLost
        if(campoEmail.getText().equals("")){
            campoEmail.setText(" Email");
            campoEmail.setForeground((new java.awt.Color(153, 153, 153)));
            clickEmail=true;
        }
    }//GEN-LAST:event_campoEmailFocusLost

    private void campoContraseñaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoContraseñaFocusLost
        if(campoContraseña.getText().equals("")){
            campoContraseña.setText("***************");
            campoContraseña.setForeground((new java.awt.Color(153, 153, 153)));
            clickContraseña=true;
        }
    }//GEN-LAST:event_campoContraseñaFocusLost

    private void campoConfContraseñaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoConfContraseñaFocusLost
        if(campoConfContraseña.getText().equals("")){
            campoConfContraseña.setText("***************");
            campoConfContraseña.setForeground((new java.awt.Color(153, 153, 153)));
            clickConfContraseña=true;
        }
    }//GEN-LAST:event_campoConfContraseñaFocusLost

    private void campoNombreUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoNombreUsuarioFocusLost
        if(campoNombreUsuario.getText().equals("")){
            campoNombreUsuario.setText(" Nombre de Usuario");
            campoNombreUsuario.setForeground((new java.awt.Color(153, 153, 153)));
            clickNombreUsuario=true;
        }
    }//GEN-LAST:event_campoNombreUsuarioFocusLost

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        this.dispose();
        home.setEnabled(true);
    }//GEN-LAST:event_formWindowClosing


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel botonRegistrarse;
    private javax.swing.JTextField campoApellido;
    private javax.swing.JTextField campoCalle;
    private javax.swing.JTextField campoCiudad;
    private javax.swing.JTextField campoCodigoPostal;
    private javax.swing.JPasswordField campoConfContraseña;
    private javax.swing.JPasswordField campoContraseña;
    private javax.swing.JFormattedTextField campoEmail;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JTextField campoNombreUsuario;
    private javax.swing.JTextField campoNro;
    private javax.swing.JTextField campoTelefono;
    private javax.swing.JCheckBox checkAceptar;
    private javax.swing.JLabel errorApellido;
    private javax.swing.JLabel errorContraseña;
    private javax.swing.JLabel errorEmail;
    private javax.swing.JLabel errorNombre;
    private javax.swing.JLabel errorNombreUsuario;
    private javax.swing.JLabel errorTelefono;
    private javax.swing.JLabel errorTerminos;
    private com.toedter.calendar.JDateChooser fNac;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel labelConfirmar;
    private javax.swing.JLabel labelContraeña;
    private javax.swing.JLabel panelRegistrarse;
    // End of variables declaration//GEN-END:variables
}
