/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package visual;

import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import motor.Compra;
import motor.Libro;

/**
 *
 * @author Franco
 */
public class VentanaDetalle extends javax.swing.JFrame {
    private Home home;
    private Libro libro;
    /**
     * Creates new form VentanaDetalle
     */
    public VentanaDetalle(Home home, Libro libro) { 
        this.home=home;
        this.libro = libro;
        initComponents();
        if((this.home.usuario==null)||(this.home.usuario.isAdministrador())){
          botonComprar.setVisible(false);
          compraSeg.setVisible(false);
        }
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
        panelDetalle = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        labelImagen = new javax.swing.JLabel();
        botonHojear = new javax.swing.JLabel();
        botonComprar = new javax.swing.JLabel();
        compraSeg = new javax.swing.JLabel();
        labelPrecio = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        labelIdioma = new javax.swing.JLabel();
        labelPublicacion = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        labelPaginas = new javax.swing.JLabel();
        labelIsbn = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        labelAutor = new javax.swing.JLabel();
        labelTitulo = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Detalles");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(218, 216, 218));

        panelDetalle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagen/Resource/panelDetalle.JPG"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(249, 248, 248));

        labelImagen.setIcon(new ImageIcon(getClass().getResource(libro.getUrlTapa())));
        labelImagen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        labelImagen.setPreferredSize(new java.awt.Dimension(100, 147));

        botonHojear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagen/Resource/ButtonHojear.png"))); // NOI18N
        botonHojear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonHojearMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonHojearMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonHojearMouseExited(evt);
            }
        });

        botonComprar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagen/Resource/ButtonAgregarCompr.png"))); // NOI18N
        botonComprar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonComprarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonComprarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonComprarMouseExited(evt);
            }
        });

        compraSeg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagen/Resource/LogoComp.png"))); // NOI18N

        labelPrecio.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        labelPrecio.setForeground(new java.awt.Color(51, 51, 51));
        labelPrecio.setText("Precio: $");

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel4.setText(libro.getPrecio());

        labelIdioma.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        labelIdioma.setForeground(new java.awt.Color(102, 102, 102));
        labelIdioma.setText("Idioma:");

        labelPublicacion.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        labelPublicacion.setForeground(new java.awt.Color(102, 102, 102));
        labelPublicacion.setText("Etiquetas:");

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel5.setText(libro.getEtiquetas().toString());

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel3.setText(libro.getCant_paginas());

        labelPaginas.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        labelPaginas.setForeground(new java.awt.Color(102, 102, 102));
        labelPaginas.setText("Paginas:");

        labelIsbn.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        labelIsbn.setForeground(new java.awt.Color(102, 102, 102));
        labelIsbn.setText("I.S.B.N:");

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel2.setText(libro.getIsbn());

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel1.setText(libro.getAutor().getNombre() + " " +libro.getAutor().getApellido());

        labelAutor.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        labelAutor.setForeground(new java.awt.Color(102, 102, 102));
        labelAutor.setText("Autor:");

        labelTitulo.setBackground(new java.awt.Color(153, 153, 153));
        labelTitulo.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        labelTitulo.setText(libro.getTitulo());

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel6.setText(libro.getIdioma());

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Fecha de lanzamiento:");

        jLabel8.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel8.setText(new SimpleDateFormat("dd'-'MMM'-'yyyy").format(libro.getFecha_lanzamiento()));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(botonHojear)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTitulo)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(labelIdioma)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(labelPublicacion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(labelPrecio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(labelPaginas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(labelIsbn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(labelAutor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(compraSeg)
                        .addGap(18, 18, 18)
                        .addComponent(botonComprar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)))
                .addContainerGap(276, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(labelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonHojear)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(labelTitulo)
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAutor)
                    .addComponent(jLabel1))
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelIsbn)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelIdioma)
                                    .addComponent(jLabel6)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelPaginas)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelPublicacion)
                                    .addComponent(jLabel5))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelPrecio)
                            .addComponent(jLabel4))
                        .addGap(28, 28, 28)
                        .addComponent(compraSeg))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(botonComprar)))
                .addGap(71, 71, 71))
        );

        jTabbedPane1.setFocusable(false);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(51, 51, 51));
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText(libro.getResumen());
        jScrollPane1.setViewportView(jTextArea1);

        jTabbedPane1.addTab("Detalles", jScrollPane1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelDetalle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(panelDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        this.dispose();
        this.home.setEnabled(true);
    }//GEN-LAST:event_formWindowClosing

    private void botonHojearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonHojearMouseEntered
        // TODO add your handling code here:
         botonHojear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagen/Resource/ButtonHojearFocus.png")));
    }//GEN-LAST:event_botonHojearMouseEntered

    private void botonHojearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonHojearMouseExited
        // TODO add your handling code here:
         botonHojear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagen/Resource/ButtonHojear.png")));
    }//GEN-LAST:event_botonHojearMouseExited

    private void botonComprarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonComprarMouseClicked
        // TODO add your handling code here:
        home.carrito.add(new Compra(home.usuario,libro,1));
    }//GEN-LAST:event_botonComprarMouseClicked

    private void botonComprarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonComprarMouseEntered
        // TODO add your handling code here:
        botonComprar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagen/Resource/ButtonAgregarComprFocus.png")));
    }//GEN-LAST:event_botonComprarMouseEntered

    private void botonComprarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonComprarMouseExited
        // TODO add your handling code here:
        botonComprar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagen/Resource/ButtonAgregarCompr.png")));
    }//GEN-LAST:event_botonComprarMouseExited

    private void botonHojearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonHojearMouseClicked
        // TODO add your handling code here:
        VentanaHojear vh=new VentanaHojear(this,libro.getPrimeras_paginas());
        vh.setLocationRelativeTo(this);
        vh.setVisible(true);
        this.setEnabled(false);
    }//GEN-LAST:event_botonHojearMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel botonComprar;
    private javax.swing.JLabel botonHojear;
    private javax.swing.JLabel compraSeg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel labelAutor;
    private javax.swing.JLabel labelIdioma;
    private javax.swing.JLabel labelImagen;
    private javax.swing.JLabel labelIsbn;
    private javax.swing.JLabel labelPaginas;
    private javax.swing.JLabel labelPrecio;
    private javax.swing.JLabel labelPublicacion;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel panelDetalle;
    // End of variables declaration//GEN-END:variables
}
