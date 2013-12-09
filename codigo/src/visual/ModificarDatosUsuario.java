/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package visual;

import excepciones.ErrorUsuario;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import motor.Operaciones;
import motor.Usuario;


public class ModificarDatosUsuario extends javax.swing.JFrame {

    /**
     * Creates new form ModificarDatosUsuario
     */
    private Home home;
    private Usuario usuario;
    boolean clickContraseña1=true;
    boolean clickContraseña2=true;
    boolean clickContraseña3=true;
    
    
    
    public ModificarDatosUsuario(Home h, Usuario usuario) {
        this.usuario = usuario;
        this.home=h;
        initComponents();
        this.setSize(430, 250);
        this.jPanel1.setVisible(false);
        int provincia_id = usuario.getDireccion().getProvincia() - 1;
        Operaciones.llenarListaProvincias((DefaultComboBoxModel)selecProv.getModel());
        selecProv.setSelectedIndex(provincia_id);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        tablaDatos = new javax.swing.JTabbedPane();
        paneModificarlDatos = new javax.swing.JPanel();
        campoCiudad = new javax.swing.JTextField();
        campoCodigoPostal = new javax.swing.JTextField();
        campoCalle = new javax.swing.JTextField();
        campoTelefono = new javax.swing.JTextField();
        campoNro = new javax.swing.JTextField();
        campoEmail = new javax.swing.JFormattedTextField();
        errorTelefono = new javax.swing.JLabel();
        errorEmail = new javax.swing.JLabel();
        provPanel = new javax.swing.JPanel();
        selecProv = new javax.swing.JComboBox();
        provLabel = new javax.swing.JLabel();
        panelCambiarContraseña = new javax.swing.JPanel();
        campoContraseñaActual = new javax.swing.JPasswordField();
        campoContraseñaNueva = new javax.swing.JPasswordField();
        campoConfirmarContraseña = new javax.swing.JPasswordField();
        labelContraseñaActual = new javax.swing.JLabel();
        labelContraseñaNueva = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        errorContraseñaActual = new javax.swing.JLabel();
        errorContraseñaNueva = new javax.swing.JLabel();
        errorConfirmarContraseña = new javax.swing.JLabel();
        botonGuardar = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        apellido1 = new javax.swing.JLabel();
        nombre1 = new javax.swing.JLabel();
        nombreUsuario1 = new javax.swing.JLabel();
        fecha1 = new javax.swing.JLabel();
        botonModificar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Datos de cuenta");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(218, 216, 218));

        paneModificarlDatos.setBackground(new java.awt.Color(218, 216, 218));

        campoCiudad.setBackground(new java.awt.Color(240, 238, 240));
        campoCiudad.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        campoCiudad.setText(usuario.getDireccion().getLocalidad());
        campoCiudad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                campoCiudadFocusLost(evt);
            }
        });

        campoCodigoPostal.setBackground(new java.awt.Color(240, 238, 240));
        campoCodigoPostal.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        campoCodigoPostal.setText(usuario.getDireccion().getCodigoPostal());
        campoCodigoPostal.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                campoCodigoPostalFocusLost(evt);
            }
        });

        campoCalle.setBackground(new java.awt.Color(240, 238, 240));
        campoCalle.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        campoCalle.setText(usuario.getDireccion().getCalle());
        campoCalle.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                campoCalleFocusLost(evt);
            }
        });

        campoTelefono.setBackground(new java.awt.Color(240, 238, 240));
        campoTelefono.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        campoTelefono.setText(usuario.getTelefono());
        campoTelefono.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                campoTelefonoFocusLost(evt);
            }
        });

        campoNro.setBackground(new java.awt.Color(240, 238, 240));
        campoNro.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        campoNro.setText(usuario.getDireccion().getAltura());
        campoNro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                campoNroFocusLost(evt);
            }
        });

        campoEmail.setBackground(new java.awt.Color(240, 238, 240));
        campoEmail.setText(usuario.getEmail());
        campoEmail.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        campoEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                campoEmailFocusLost(evt);
            }
        });

        errorTelefono.setForeground(new java.awt.Color(255, 0, 0));

        errorEmail.setForeground(new java.awt.Color(255, 0, 0));

        selecProv.setBackground(new java.awt.Color(218, 216, 218));
        selecProv.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                selecProvItemStateChanged(evt);
            }
        });

        provLabel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        provLabel.setText("Provincia:");

        javax.swing.GroupLayout provPanelLayout = new javax.swing.GroupLayout(provPanel);
        provPanel.setLayout(provPanelLayout);
        provPanelLayout.setHorizontalGroup(
            provPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, provPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(provLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(selecProv, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        provPanelLayout.setVerticalGroup(
            provPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(provPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(provPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selecProv, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(provLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout paneModificarlDatosLayout = new javax.swing.GroupLayout(paneModificarlDatos);
        paneModificarlDatos.setLayout(paneModificarlDatosLayout);
        paneModificarlDatosLayout.setHorizontalGroup(
            paneModificarlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneModificarlDatosLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(paneModificarlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneModificarlDatosLayout.createSequentialGroup()
                        .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(paneModificarlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(errorEmail)
                            .addComponent(errorTelefono)))
                    .addGroup(paneModificarlDatosLayout.createSequentialGroup()
                        .addComponent(campoCalle, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(campoNro, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(campoCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(provPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoCodigoPostal, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        paneModificarlDatosLayout.setVerticalGroup(
            paneModificarlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneModificarlDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(provPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(campoCodigoPostal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(paneModificarlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoCalle, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoNro, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(campoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(campoEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorTelefono)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(errorEmail))
        );

        tablaDatos.addTab("Modificar Datos", paneModificarlDatos);

        panelCambiarContraseña.setBackground(new java.awt.Color(218, 216, 218));

        campoContraseñaActual.setBackground(new java.awt.Color(240, 238, 240));
        campoContraseñaActual.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        campoContraseñaActual.setText("asdasd");
        campoContraseñaActual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                campoContraseñaActualMouseClicked(evt);
            }
        });
        campoContraseñaActual.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                campoContraseñaActualFocusLost(evt);
            }
        });

        campoContraseñaNueva.setBackground(new java.awt.Color(240, 238, 240));
        campoContraseñaNueva.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        campoContraseñaNueva.setText("asdasd");
        campoContraseñaNueva.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoContraseñaNuevaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                campoContraseñaNuevaFocusLost(evt);
            }
        });

        campoConfirmarContraseña.setBackground(new java.awt.Color(240, 238, 240));
        campoConfirmarContraseña.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        campoConfirmarContraseña.setText("asdasd");
        campoConfirmarContraseña.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoConfirmarContraseñaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                campoConfirmarContraseñaFocusLost(evt);
            }
        });

        labelContraseñaActual.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        labelContraseñaActual.setText("Contraseña Actual:");

        labelContraseñaNueva.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        labelContraseñaNueva.setText("Contaseña Nueva:");

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel4.setText("Confirmar Contaseña:");

        errorContraseñaActual.setForeground(new java.awt.Color(255, 0, 0));

        errorContraseñaNueva.setForeground(new java.awt.Color(255, 0, 0));

        errorConfirmarContraseña.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout panelCambiarContraseñaLayout = new javax.swing.GroupLayout(panelCambiarContraseña);
        panelCambiarContraseña.setLayout(panelCambiarContraseñaLayout);
        panelCambiarContraseñaLayout.setHorizontalGroup(
            panelCambiarContraseñaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCambiarContraseñaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCambiarContraseñaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCambiarContraseñaLayout.createSequentialGroup()
                        .addGroup(panelCambiarContraseñaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(errorContraseñaActual)
                            .addComponent(errorContraseñaNueva))
                        .addGap(257, 328, Short.MAX_VALUE)
                        .addComponent(errorConfirmarContraseña)
                        .addGap(7, 87, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCambiarContraseñaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(panelCambiarContraseñaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCambiarContraseñaLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoConfirmarContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCambiarContraseñaLayout.createSequentialGroup()
                                .addGroup(panelCambiarContraseñaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelContraseñaNueva)
                                    .addComponent(labelContraseñaActual))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panelCambiarContraseñaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(campoContraseñaNueva, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                                    .addComponent(campoContraseñaActual))))
                        .addContainerGap())))
        );
        panelCambiarContraseñaLayout.setVerticalGroup(
            panelCambiarContraseñaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCambiarContraseñaLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(panelCambiarContraseñaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoContraseñaActual, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelContraseñaActual))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorContraseñaActual)
                .addGap(47, 47, 47)
                .addGroup(panelCambiarContraseñaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoContraseñaNueva, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelContraseñaNueva))
                .addGap(3, 3, 3)
                .addComponent(errorContraseñaNueva)
                .addGap(1, 1, 1)
                .addGroup(panelCambiarContraseñaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoConfirmarContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorConfirmarContraseña)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        tablaDatos.addTab("Cambiar Contraseña", panelCambiarContraseña);

        botonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagen/Resource/Guardar.png"))); // NOI18N
        botonGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonGuardarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(tablaDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonGuardar)
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tablaDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonGuardar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(218, 216, 218));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagen/Resource/PanelCuenta.png"))); // NOI18N

        apellido1.setText(usuario.getApellido());

        nombre1.setText(usuario.getNombre());

        nombreUsuario1.setText(usuario.getUsuario());

        fecha1.setText(usuario.getFechaNacimiento());

        botonModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagen/Resource/ButtonModificar.png"))); // NOI18N
        botonModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonModificarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonModificarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonModificarMouseExited(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagen/Resource/LogoUsers.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombreUsuario1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(nombre1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(apellido1))
                            .addComponent(fecha1))
                        .addGap(104, 104, 104))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(botonModificar)
                        .addGap(27, 27, 27))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombre1)
                            .addComponent(apellido1))
                        .addGap(18, 18, 18)
                        .addComponent(fecha1)
                        .addGap(18, 18, 18)
                        .addComponent(nombreUsuario1)
                        .addGap(22, 22, 22)
                        .addComponent(botonModificar)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoCiudadFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoCiudadFocusLost
        if(campoCiudad.getText().equals("")){
            campoCiudad.setText(" Ciudad");
            campoCiudad.setForeground((new java.awt.Color(153, 153, 153)));
        }
    }//GEN-LAST:event_campoCiudadFocusLost

    private void campoCodigoPostalFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoCodigoPostalFocusLost
        // TODO add your handling code here:
        if(campoCodigoPostal.getText().equals("")){
            campoCodigoPostal.setText(" Codigo Postal");
            campoCodigoPostal.setForeground((new java.awt.Color(153, 153, 153)));         
        }
    }//GEN-LAST:event_campoCodigoPostalFocusLost

    private void campoCalleFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoCalleFocusLost
        // TODO add your handling code here:
        if(campoCalle.getText().equals("")){
            campoCalle.setText(" Calle");
            campoCalle.setForeground((new java.awt.Color(153, 153, 153)));
        }
    }//GEN-LAST:event_campoCalleFocusLost

    private void campoNroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoNroFocusLost
        // TODO add your handling code here:
        if(campoNro.getText().equals("")){
            campoNro.setText(" Número");
            campoNro.setForeground((new java.awt.Color(153, 153, 153)));
        }
    }//GEN-LAST:event_campoNroFocusLost

    private void campoTelefonoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoTelefonoFocusLost
        // TODO add your handling code here:
         if (((javax.swing.JTextField) evt.getSource()).getName() != null) {
            try {
                usuario.setTelefono(campoTelefono.getText());
                //modificar.setEnabled(true);
                errorTelefono.setText(null);                              
            } catch (ErrorUsuario e) {
                //Procesar visualización de error.
                if(e.isTelefonoCorto()){
                    errorTelefono.setText("Numero de telefono corto");
                } else if(e.isTelefonoInvalido()){
                    errorTelefono.setText("Numero de telefono incorrecto");
                }
               this.botonGuardar.setEnabled(false);
                ((javax.swing.JTextField) evt.getSource()).requestFocus();
            }
         }
    }//GEN-LAST:event_campoTelefonoFocusLost

    private void campoEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoEmailFocusLost
        // TODO add your handling code here:
        if (((javax.swing.JTextField) evt.getSource()).getName() != null) {
            try {
                usuario.setEmail(campoEmail.getText());
                //modificar.setEnabled(true);
                errorEmail.setText(null);                              
            } catch (ErrorUsuario e) {             
                if(e.isEmailInvalido()){
                    errorEmail.setText("Email invalido");
                }
               //modificar.setEnabled(false);
                ((javax.swing.JTextField) evt.getSource()).requestFocus();
            }
        }
    }//GEN-LAST:event_campoEmailFocusLost
 
    private void campoContraseñaActualFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoContraseñaActualFocusLost
        // TODO add your handling code here:
        if (((javax.swing.JPasswordField) evt.getSource()).getName() != null) {
            try {
                usuario.setClave(String.valueOf(campoContraseñaActual.getPassword()));
                usuario.modificar();
                errorContraseñaActual.setText(null);                              
            } catch (ErrorUsuario e) {             
                if(e.isClaveCorta()){
                    errorContraseñaActual.setText("Contraseña Corta");
                }
               //modificar.setEnabled(false);
                ((javax.swing.JPasswordField) evt.getSource()).requestFocus();
            }
        }
    }//GEN-LAST:event_campoContraseñaActualFocusLost

    private void campoContraseñaNuevaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoContraseñaNuevaFocusLost
         if (((javax.swing.JPasswordField) evt.getSource()).getName() != null) {
            try {
                usuario.setClave(String.valueOf(campoContraseñaActual.getPassword()));
                usuario.modificar();
                errorContraseñaNueva.setText(null);                              
            } catch (ErrorUsuario e) {             
                if(e.isClaveCorta()){
                    errorContraseñaNueva.setText("Contraseña Corta");
                }
               //modificar.setEnabled(false);
                ((javax.swing.JPasswordField) evt.getSource()).requestFocus();
            }
        }
    }//GEN-LAST:event_campoContraseñaNuevaFocusLost

    private void campoConfirmarContraseñaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoConfirmarContraseñaFocusLost
         if (((javax.swing.JPasswordField) evt.getSource()).getName() != null) {
            try {
                usuario.setClave(String.valueOf(campoContraseñaActual.getPassword()));
                usuario.modificar();
                errorConfirmarContraseña.setText(null);  
            } catch (ErrorUsuario e) {             
                if(e.isClaveCorta()){
                    errorConfirmarContraseña.setText("Contraseña Corta");   
                }
               //modificar.setEnabled(false);
                ((javax.swing.JPasswordField) evt.getSource()).requestFocus();
            }
        }
    }//GEN-LAST:event_campoConfirmarContraseñaFocusLost

    private void campoContraseñaNuevaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoContraseñaNuevaFocusGained
       if (clickContraseña2) {
            campoContraseñaNueva.setText(null);
            clickContraseña2=false;
            campoContraseñaNueva.setForeground(Color.black);
    }
    }//GEN-LAST:event_campoContraseñaNuevaFocusGained

    private void campoConfirmarContraseñaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoConfirmarContraseñaFocusGained
        if (clickContraseña3) {
            campoConfirmarContraseña.setText(null);
            clickContraseña3=false;
            campoConfirmarContraseña.setForeground(Color.black);
    }
    }//GEN-LAST:event_campoConfirmarContraseñaFocusGained

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        this.dispose();
        home.setEnabled(true);
    }//GEN-LAST:event_formWindowClosing

    private void botonModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonModificarMouseClicked
        // TODO add your handling code here:
        jPanel1.setVisible(true);
        this.setSize(430, 695);
        this.setLocationRelativeTo(home);
        
    }//GEN-LAST:event_botonModificarMouseClicked

    private void botonGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonGuardarMouseClicked
        usuario.modificar();
        this.dispose();
        home.setEnabled(true);
        
    }//GEN-LAST:event_botonGuardarMouseClicked

    private void selecProvItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_selecProvItemStateChanged
        // TODO add your handling code here:
        usuario.setProvincia(selecProv.getSelectedIndex());
    }//GEN-LAST:event_selecProvItemStateChanged

    private void campoContraseñaActualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campoContraseñaActualMouseClicked
        // TODO add your handling code here:
        if (clickContraseña1) {
            campoContraseñaActual.setText(null);
            clickContraseña1=false;
            campoContraseñaActual.setForeground(Color.black);
    }
    }//GEN-LAST:event_campoContraseñaActualMouseClicked

    private void botonModificarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonModificarMouseEntered
        // TODO add your handling code here:
        this.botonModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagen/Resource/ButtonModificarFocus.png")));
    }//GEN-LAST:event_botonModificarMouseEntered

    private void botonModificarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonModificarMouseExited
        // TODO add your handling code here:
                this.botonModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagen/Resource/ButtonModificar.png")));
    }//GEN-LAST:event_botonModificarMouseExited

 
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apellido1;
    private javax.swing.JLabel botonGuardar;
    private javax.swing.JLabel botonModificar;
    private javax.swing.JTextField campoCalle;
    private javax.swing.JTextField campoCiudad;
    private javax.swing.JTextField campoCodigoPostal;
    private javax.swing.JPasswordField campoConfirmarContraseña;
    private javax.swing.JPasswordField campoContraseñaActual;
    private javax.swing.JPasswordField campoContraseñaNueva;
    private javax.swing.JFormattedTextField campoEmail;
    private javax.swing.JTextField campoNro;
    private javax.swing.JTextField campoTelefono;
    private javax.swing.JLabel errorConfirmarContraseña;
    private javax.swing.JLabel errorContraseñaActual;
    private javax.swing.JLabel errorContraseñaNueva;
    private javax.swing.JLabel errorEmail;
    private javax.swing.JLabel errorTelefono;
    private javax.swing.JLabel fecha1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelContraseñaActual;
    private javax.swing.JLabel labelContraseñaNueva;
    private javax.swing.JLabel nombre1;
    private javax.swing.JLabel nombreUsuario1;
    private javax.swing.JPanel paneModificarlDatos;
    private javax.swing.JPanel panelCambiarContraseña;
    private javax.swing.JLabel provLabel;
    private javax.swing.JPanel provPanel;
    private javax.swing.JComboBox selecProv;
    private javax.swing.JTabbedPane tablaDatos;
    // End of variables declaration//GEN-END:variables
}
