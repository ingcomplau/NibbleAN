/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package visual;

import javax.swing.ImageIcon;
import motor.Compra;
import motor.Libro;


/**
 *
 * @author Franco
 */
public class PanelComprarLibro extends javax.swing.JPanel {
    private Home home;
    private Libro libro;
   

    /**
     * Creates new form PanelCompraLibro
     */
    public PanelComprarLibro(Home h, Libro libro) {
        this.home=h;
        this.libro =libro;
        initComponents();
        if ((home.usuario == null)||(home.usuario.isAdministrador())){
            botonAgregar.setVisible(false);
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

        labelImagen = new javax.swing.JLabel();
        labelTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textoDetalle = new javax.swing.JTextArea();
        botonDetalle = new javax.swing.JLabel();
        botonAgregar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        labelPrecio = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(new javax.swing.border.MatteBorder(null));

        labelImagen.setIcon(new ImageIcon(getClass().getResource(libro.getUrlTapa())));
        labelImagen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        labelImagen.setPreferredSize(new java.awt.Dimension(128, 162));

        labelTitulo.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(153, 153, 153));
        labelTitulo.setText(libro.getTitulo());

        textoDetalle.setEditable(false);
        textoDetalle.setColumns(20);
        textoDetalle.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        textoDetalle.setForeground(new java.awt.Color(153, 153, 153));
        textoDetalle.setLineWrap(true);
        textoDetalle.setRows(5);
        textoDetalle.setText(libro.getResumen());
        textoDetalle.setAutoscrolls(false);
        textoDetalle.setFocusable(false);
        jScrollPane1.setViewportView(textoDetalle);

        botonDetalle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagen/Resource/ButtonDetalles.png"))); // NOI18N
        botonDetalle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonDetalleMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonDetalleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonDetalleMouseExited(evt);
            }
        });

        botonAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagen/Resource/ButtonAgregarCompr.png"))); // NOI18N
        botonAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonAgregarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonAgregarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonAgregarMouseExited(evt);
            }
        });

        jLabel1.setText("Precio:");

        labelPrecio.setText(libro.getPrecio());

        jLabel2.setText("$");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(botonAgregar)
                            .addGap(18, 18, 18)
                            .addComponent(botonDetalle))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelTitulo)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelPrecio)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelTitulo)
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(labelPrecio)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonDetalle)
                    .addComponent(botonAgregar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonDetalleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonDetalleMouseClicked
        // TODO add your handling code here:
        VentanaDetalle ventana=new VentanaDetalle(this.home, this.libro);       
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        this.home.setEnabled(false);
    }//GEN-LAST:event_botonDetalleMouseClicked

    private void botonAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAgregarMouseClicked
        home.carrito.add(new Compra(home.usuario,libro,1));
    }//GEN-LAST:event_botonAgregarMouseClicked

    private void botonAgregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAgregarMouseEntered
        // TODO add your handling code here:
        this.botonAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagen/Resource/ButtonAgregarComprFocus.png")));
    }//GEN-LAST:event_botonAgregarMouseEntered

    private void botonAgregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAgregarMouseExited
        // TODO add your handling code here:
        this.botonAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagen/Resource/ButtonAgregarCompr.png")));
    }//GEN-LAST:event_botonAgregarMouseExited

    private void botonDetalleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonDetalleMouseEntered
        // TODO add your handling code here:
        this.botonDetalle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagen/Resource/ButtonDetallesFocus.png")));
    }//GEN-LAST:event_botonDetalleMouseEntered

    private void botonDetalleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonDetalleMouseExited
        // TODO add your handling code here:
        this.botonDetalle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagen/Resource/ButtonDetalles.png")));
    }//GEN-LAST:event_botonDetalleMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel botonAgregar;
    private javax.swing.JLabel botonDetalle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelImagen;
    private javax.swing.JLabel labelPrecio;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JTextArea textoDetalle;
    // End of variables declaration//GEN-END:variables
}
