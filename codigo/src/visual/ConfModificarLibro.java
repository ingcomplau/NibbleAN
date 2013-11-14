/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package visual;

import excepciones.ErrorLibro;
import motor.Libro;

/**
 *
 * @author Manu
 */
public class ConfModificarLibro extends javax.swing.JFrame {
    Libro lib;
    ModificarLibro ML;
    /**
     * Creates new form ConfirmacionModificarLibro
     */
    public ConfModificarLibro(ModificarLibro m,Libro lib) {
        initComponents();
        ML=m;
        this.lib=lib;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ConfModificarLibroPanel = new javax.swing.JPanel();
        Encabezado = new javax.swing.JLabel();
        BotonSi = new javax.swing.JLabel();
        BotonNo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Modificar Libro");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        ConfModificarLibroPanel.setBackground(new java.awt.Color(218, 216, 218));
        ConfModificarLibroPanel.setPreferredSize(new java.awt.Dimension(310, 148));

        Encabezado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagen/Resource/PanelConfModificarLibro.png"))); // NOI18N

        BotonSi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagen/Resource/ButtonSi.png"))); // NOI18N
        BotonSi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonSiMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonSiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonSiMouseExited(evt);
            }
        });

        BotonNo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagen/Resource/ButtonNo.png"))); // NOI18N
        BotonNo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonNoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonNoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonNoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout ConfModificarLibroPanelLayout = new javax.swing.GroupLayout(ConfModificarLibroPanel);
        ConfModificarLibroPanel.setLayout(ConfModificarLibroPanelLayout);
        ConfModificarLibroPanelLayout.setHorizontalGroup(
            ConfModificarLibroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConfModificarLibroPanelLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(BotonSi)
                .addGap(82, 82, 82)
                .addComponent(BotonNo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(ConfModificarLibroPanelLayout.createSequentialGroup()
                .addComponent(Encabezado, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        ConfModificarLibroPanelLayout.setVerticalGroup(
            ConfModificarLibroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConfModificarLibroPanelLayout.createSequentialGroup()
                .addComponent(Encabezado, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(ConfModificarLibroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BotonNo)
                    .addComponent(BotonSi))
                .addGap(0, 35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ConfModificarLibroPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ConfModificarLibroPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        this.dispose();
        ML.setEnabled(true);
    }//GEN-LAST:event_formWindowClosing

    private void BotonSiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonSiMouseClicked
        // TODO add your handling code here:
        try {
                lib.modificar();
                this.dispose();
                ML.setEnabled(true);
                ML.LL.actualizar();
                ML.LL.setEnabled(true);
                ML.dispose();
            } catch (ErrorLibro e){
                //Visualizar error de libro existente (isbn duplicado).
            }
    }//GEN-LAST:event_BotonSiMouseClicked

    private void BotonNoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonNoMouseClicked
        // TODO add your handling code here:
        this.dispose();
        ML.setEnabled(true);
    }//GEN-LAST:event_BotonNoMouseClicked

    private void BotonSiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonSiMouseEntered
        // TODO add your handling code here:
        BotonSi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagen/Resource/ButtonSiFocus.png")));
    }//GEN-LAST:event_BotonSiMouseEntered

    private void BotonSiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonSiMouseExited
        // TODO add your handling code here:
        BotonSi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagen/Resource/ButtonSi.png")));
    }//GEN-LAST:event_BotonSiMouseExited

    private void BotonNoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonNoMouseEntered
        // TODO add your handling code here:
        BotonNo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagen/Resource/ButtonNoFocus.png")));
    }//GEN-LAST:event_BotonNoMouseEntered

    private void BotonNoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonNoMouseExited
        // TODO add your handling code here:
        BotonNo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagen/Resource/ButtonNo.png")));
    }//GEN-LAST:event_BotonNoMouseExited

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BotonNo;
    private javax.swing.JLabel BotonSi;
    private javax.swing.JPanel ConfModificarLibroPanel;
    private javax.swing.JLabel Encabezado;
    // End of variables declaration//GEN-END:variables
}
