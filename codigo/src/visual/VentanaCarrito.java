/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package visual;

import java.awt.GridLayout;
import java.awt.LayoutManager;
import motor.Carrito;

/**
 *
 * @author Franco
 */
public class VentanaCarrito extends javax.swing.JFrame {
    
    private Carrito carrito;
    Home home;

   
  
    public VentanaCarrito(Home h, Carrito carrito) {
        this.carrito = carrito;  
        home=h;
        initComponents(); 
        llenar();
    }/**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        carritoPanel = new javax.swing.JPanel();
        encabezado = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        panelPrincipal = new javax.swing.JPanel();
        botonComprar = new javax.swing.JLabel();
        total = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Carrito");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        carritoPanel.setBackground(new java.awt.Color(218, 216, 218));

        encabezado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagen/Resource/PanelCarrito.png"))); // NOI18N

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        panelPrincipal.setBackground(new java.awt.Color(218, 216, 218));
        panelPrincipal.setLayout(new java.awt.GridLayout(1, 0));
        jScrollPane1.setViewportView(panelPrincipal);

        botonComprar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagen/Resource/ButtonComprar.png"))); // NOI18N
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

        total.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        total.setForeground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout carritoPanelLayout = new javax.swing.GroupLayout(carritoPanel);
        carritoPanel.setLayout(carritoPanelLayout);
        carritoPanelLayout.setHorizontalGroup(
            carritoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, carritoPanelLayout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(total)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonComprar)
                .addContainerGap())
            .addGroup(carritoPanelLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(encabezado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        carritoPanelLayout.setVerticalGroup(
            carritoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(carritoPanelLayout.createSequentialGroup()
                .addComponent(encabezado, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(carritoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonComprar)
                    .addComponent(total))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(carritoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(carritoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void llenar(){
        float suma=0;
        while(!this.carrito.isEmpty()){
            this.panelPrincipal.add(new PanelCarrito(this.carrito.element(),this.carrito));
            suma=suma+(this.carrito.element().getCantidad()*this.carrito.element().getPrecio());
            this.carrito.iterator().next();
        }
        this.total.setText("Total: $ "+suma);
        if(this.carrito.size()==0)
            this.panelPrincipal.setLayout(new GridLayout(1,0));//como minimo grid debe tener este valor
        else
            this.panelPrincipal.setLayout(new GridLayout(this.carrito.size(),0)); 
    }
    
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        this.dispose();
        home.setEnabled(true);
    }//GEN-LAST:event_formWindowClosing

    private void botonComprarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonComprarMouseClicked
        carrito.comprar();
        carrito = null;
        this.dispose();
        home.setEnabled(true);
    }//GEN-LAST:event_botonComprarMouseClicked

    private void botonComprarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonComprarMouseEntered
        // TODO add your handling code here:
        this.botonComprar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagen/Resource/ButtonComprarFocus.png")));
    }//GEN-LAST:event_botonComprarMouseEntered

    private void botonComprarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonComprarMouseExited
        // TODO add your handling code here:
        this.botonComprar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagen/Resource/ButtonComprar.png")));
    }//GEN-LAST:event_botonComprarMouseExited

   
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel botonComprar;
    private javax.swing.JPanel carritoPanel;
    private javax.swing.JLabel encabezado;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JLabel total;
    // End of variables declaration//GEN-END:variables
}
