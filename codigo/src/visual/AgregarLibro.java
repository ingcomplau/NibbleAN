package visual;



import motor.Operaciones;
import excepciones.ErrorLibro;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import motor.Libro;

        
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author launote
 */
public class AgregarLibro extends javax.swing.JFrame {
  Operaciones operaciones;
  VentanaAdmin VA;
    /**
     * Creates new form NewJFrame
     */
    private boolean click1 = true;
    private boolean click2 = true;
    private boolean click3 = true;
    private boolean click4 = true;
    private boolean click5 = true;
    private boolean click6 = true;
    private boolean click7 = true;
    
    public AgregarLibro(VentanaAdmin V) {
        initComponents();
        VA=V;
        Operaciones.llenarListaIdiomas((DefaultComboBoxModel)selectIdioma.getModel());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AgregarLibroPanel = new javax.swing.JPanel();
        campoIsbn = new javax.swing.JTextField();
        campoCantPag = new javax.swing.JTextField();
        campoPrecio = new javax.swing.JTextField();
        campoTitulo = new javax.swing.JTextField();
        encabezado = new javax.swing.JLabel();
        jScrollPaneAreaDesc = new javax.swing.JScrollPane();
        areaDesc = new javax.swing.JTextArea();
        agregar = new javax.swing.JLabel();
        jTabbedPane = new javax.swing.JTabbedPane();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        Añadir = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaAutores = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanelImagen = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        selectIdioma = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        fLanz = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agregar Libro");
        setResizable(false);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        AgregarLibroPanel.setBackground(new java.awt.Color(218, 216, 218));
        AgregarLibroPanel.setToolTipText("");
        AgregarLibroPanel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        campoIsbn.setBackground(new java.awt.Color(240, 238, 240));
        campoIsbn.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        campoIsbn.setForeground(new java.awt.Color(153, 153, 153));
        campoIsbn.setText(" I.S.B.N");
        campoIsbn.setToolTipText("Solo numeros");
        campoIsbn.setPreferredSize(new java.awt.Dimension(165, 34));
        campoIsbn.setSelectionColor(new java.awt.Color(110, 34, 83));
        campoIsbn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                campoIsbnMouseClicked(evt);
            }
        });
        campoIsbn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoIsbnActionPerformed(evt);
            }
        });

        campoCantPag.setBackground(new java.awt.Color(240, 238, 240));
        campoCantPag.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        campoCantPag.setForeground(new java.awt.Color(153, 153, 153));
        campoCantPag.setText(" Cantidad de páginas");
        campoCantPag.setToolTipText("");
        campoCantPag.setPreferredSize(new java.awt.Dimension(165, 34));
        campoCantPag.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                campoCantPagMouseClicked(evt);
            }
        });
        campoCantPag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCantPagActionPerformed(evt);
            }
        });

        campoPrecio.setBackground(new java.awt.Color(240, 238, 240));
        campoPrecio.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        campoPrecio.setForeground(new java.awt.Color(153, 153, 153));
        campoPrecio.setText(" Precio ($)");
        campoPrecio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                campoPrecioMouseClicked(evt);
            }
        });
        campoPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoPrecioActionPerformed(evt);
            }
        });

        campoTitulo.setBackground(new java.awt.Color(240, 238, 240));
        campoTitulo.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        campoTitulo.setForeground(new java.awt.Color(153, 153, 153));
        campoTitulo.setText(" Título");
        campoTitulo.setDisabledTextColor(new java.awt.Color(110, 34, 83));
        campoTitulo.setSelectionColor(new java.awt.Color(110, 34, 83));
        campoTitulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                campoTituloMouseClicked(evt);
            }
        });

        encabezado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagen/Resource/PanelAgregarLibro.png"))); // NOI18N

        jScrollPaneAreaDesc.setToolTipText("");

        areaDesc.setBackground(new java.awt.Color(240, 238, 240));
        areaDesc.setColumns(20);
        areaDesc.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        areaDesc.setForeground(new java.awt.Color(153, 153, 153));
        areaDesc.setRows(5);
        areaDesc.setText("Descripción del producto");
        areaDesc.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        areaDesc.setFocusCycleRoot(true);
        areaDesc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                areaDescMouseClicked(evt);
            }
        });
        jScrollPaneAreaDesc.setViewportView(areaDesc);

        agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagen/Resource/ButtonAgregar.png"))); // NOI18N
        agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agregarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                agregarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                agregarMouseExited(evt);
            }
        });

        jTabbedPane.setBackground(new java.awt.Color(218, 216, 218));

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Añadir.setBackground(new java.awt.Color(218, 216, 218));
        Añadir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagen/Resource/ButtonNuevoAutor.png"))); // NOI18N
        Añadir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AñadirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AñadirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AñadirMouseExited(evt);
            }
        });

        listaAutores.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jScrollPane1.setViewportView(listaAutores);

        jLabel1.setText("Lista de autores");

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Añadir)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel1)))
                .addContainerGap(544, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Añadir)
                .addGap(18, 18, 18))
        );
        jLayeredPane1.setLayer(Añadir, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTabbedPane.addTab("Autor", jLayeredPane1);

        jLayeredPane2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Tapa"));

        jButton2.setText("limpiar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setText("agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanelImagen.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanelImagenLayout = new javax.swing.GroupLayout(jPanelImagen);
        jPanelImagen.setLayout(jPanelImagenLayout);
        jPanelImagenLayout.setHorizontalGroup(
            jPanelImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 127, Short.MAX_VALUE)
        );
        jPanelImagenLayout.setVerticalGroup(
            jPanelImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 167, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jPanelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(31, 31, 31))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)
                        .addGap(64, 64, 64)))
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Primeras páginas"));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 293, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(50, 50, 50))
        );
        jLayeredPane2.setLayer(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jPanel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTabbedPane.addTab("Carga Libro", jLayeredPane2);

        jPanel1.setBackground(new java.awt.Color(240, 238, 240));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));

        selectIdioma.setBackground(new java.awt.Color(218, 216, 218));
        selectIdioma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectIdiomaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel2.setText("Idioma: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(38, 38, 38)
                .addComponent(selectIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(124, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(240, 238, 240));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel3.setText("Fecha de lanzamiento: ");

        fLanz.setMinSelectableDate(new java.util.Date(-14830977525000L));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fLanz, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fLanz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3)))
                .addContainerGap())
        );

        javax.swing.GroupLayout AgregarLibroPanelLayout = new javax.swing.GroupLayout(AgregarLibroPanel);
        AgregarLibroPanel.setLayout(AgregarLibroPanelLayout);
        AgregarLibroPanelLayout.setHorizontalGroup(
            AgregarLibroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(encabezado)
            .addGroup(AgregarLibroPanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(AgregarLibroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AgregarLibroPanelLayout.createSequentialGroup()
                        .addGroup(AgregarLibroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campoCantPag, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                            .addComponent(campoIsbn, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                            .addComponent(campoTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(AgregarLibroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(campoPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(96, 96, 96))
                    .addGroup(AgregarLibroPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPaneAreaDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 724, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))
                    .addGroup(AgregarLibroPanelLayout.createSequentialGroup()
                        .addGroup(AgregarLibroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 724, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AgregarLibroPanelLayout.createSequentialGroup()
                                .addComponent(agregar)
                                .addGap(14, 14, 14)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        AgregarLibroPanelLayout.setVerticalGroup(
            AgregarLibroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AgregarLibroPanelLayout.createSequentialGroup()
                .addComponent(encabezado, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(AgregarLibroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(AgregarLibroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(campoCantPag, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AgregarLibroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(jScrollPaneAreaDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(186, 186, 186))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AgregarLibroPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 777, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(AgregarLibroPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 719, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoIsbnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoIsbnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoIsbnActionPerformed

    private void agregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarMouseEntered
        // TODO add your handling code here:
        agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagen/Resource/ButtonAgregarFocus.png")));
    }//GEN-LAST:event_agregarMouseEntered

    private void agregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarMouseExited
        // TODO add your handling code here:
        agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagen/Resource/ButtonAgregar.png")));
    }//GEN-LAST:event_agregarMouseExited

    private void campoIsbnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campoIsbnMouseClicked
        // TODO add your handling code here:
        
        if (click1) {
            campoIsbn.setText(null);
            click1=false;
            campoIsbn.setForeground(Color.black);
    }
    }//GEN-LAST:event_campoIsbnMouseClicked

    private void campoCantPagMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campoCantPagMouseClicked
        // TODO add your handling code here:
        if (click2) {
            campoCantPag.setText(null);
            click2=false;
            campoCantPag.setForeground(Color.black);
    }
    }//GEN-LAST:event_campoCantPagMouseClicked

    private void campoTituloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campoTituloMouseClicked
        // TODO add your handling code here:
        if (click3) {
            campoTitulo.setText(null);
            click3=false;
            campoTitulo.setForeground(Color.black);
    }
    }//GEN-LAST:event_campoTituloMouseClicked

    private void campoPrecioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campoPrecioMouseClicked
        // TODO add your handling code here:
        if (click4) {
            campoPrecio.setText(null);
            click4=false;
            campoPrecio.setForeground(Color.black);
    }
    }//GEN-LAST:event_campoPrecioMouseClicked

    private void areaDescMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_areaDescMouseClicked
        // TODO add your handling code here:
        if (click7) {
            areaDesc.setText(null);
            click7=false;
            areaDesc.setForeground(Color.black);
    }
    }//GEN-LAST:event_areaDescMouseClicked

    private void selectIdiomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectIdiomaActionPerformed

    }//GEN-LAST:event_selectIdiomaActionPerformed

    private void campoCantPagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCantPagActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCantPagActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        this.dispose();
        VA.setEnabled(true);
    }//GEN-LAST:event_formWindowClosing

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jPanelImagen.removeAll();
        jPanelImagen.repaint();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        m.Abrir_Dialogo(jPanelImagen);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void AñadirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AñadirMouseExited
        Añadir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagen/Resource/ButtonNuevoAutor.png")));
    }//GEN-LAST:event_AñadirMouseExited

    private void AñadirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AñadirMouseEntered
        Añadir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagen/Resource/ButtonNuevoAutorFocus.png")));
    }//GEN-LAST:event_AñadirMouseEntered

    private void AñadirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AñadirMouseClicked
        AgregarAutor AA=new AgregarAutor(this);
        AA.setLocationRelativeTo(this);
        AA.setVisible(true);
        this.setEnabled(false);
    }//GEN-LAST:event_AñadirMouseClicked

    private void campoPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoPrecioActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        Operaciones.llenarListaAutores(listaAutores);
    }//GEN-LAST:event_formWindowGainedFocus

    private void agregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarMouseClicked
          boolean agregado = false;
        try {
            agregado = Operaciones.agregarLibro(new Libro(campoIsbn.getText(), campoTitulo.getText(),
                    campoCantPag.getText(),campoPrecio.getText(), fLanz.getDate(), areaDesc.getText(),
                    "test", listaAutores.getSelectedIndex(), selectIdioma.getSelectedIndex())); //hay que cambiar lo de la fecha y lo de las primeras paginas
        } catch (ErrorLibro e){
            System.err.println(e.isCantpagsincorrecto());
            System.err.println(e.isFechaInvalida());
            System.err.println(e.isIsbncorto());
            System.err.println(e.isIsbnincorrecto());
            System.err.println(e.isIsbnlargo());
            System.err.println(e.isPocaspags());
            System.err.println(e.isPrecioincorrecto());
            System.err.println(e.isPrecionegativo());
            System.err.println(e.isSinAutor());
            System.err.println(e.isTitulocorto());
            System.err.println(e.isTitulolargo());
            System.err.println("");
        }
        if (agregado){
           // TODO Código para cerrar ventana.              
        }
        
    }//GEN-LAST:event_agregarMouseClicked

    /**
     * @param args the command line arguments
     */
    
  metodos m=new metodos();  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AgregarLibroPanel;
    private javax.swing.JLabel Añadir;
    private javax.swing.JLabel agregar;
    private javax.swing.JTextArea areaDesc;
    private javax.swing.JTextField campoCantPag;
    private javax.swing.JTextField campoIsbn;
    private javax.swing.JTextField campoPrecio;
    private javax.swing.JTextField campoTitulo;
    private javax.swing.JLabel encabezado;
    private com.toedter.calendar.JDateChooser fLanz;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanelImagen;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPaneAreaDesc;
    private javax.swing.JTabbedPane jTabbedPane;
    private javax.swing.JList listaAutores;
    private javax.swing.JComboBox selectIdioma;
    // End of variables declaration//GEN-END:variables
}
