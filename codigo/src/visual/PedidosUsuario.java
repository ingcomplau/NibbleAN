/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package visual;

import motor.Pedidos;
import motor.Usuario;


public class PedidosUsuario extends javax.swing.JFrame {

    Home home;
    Pedidos pedidos;
    
    public PedidosUsuario(Home h, Usuario usuario) {
        pedidos = new Pedidos(usuario);
        home=h;
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

        pedidosUsuarioPanel = new javax.swing.JPanel();
        jScrollTablaPedidos = new javax.swing.JScrollPane();
        tablaPedidos = new javax.swing.JTable();
        encabezado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pedidos");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        pedidosUsuarioPanel.setBackground(new java.awt.Color(218, 216, 218));

        tablaPedidos.setBackground(new java.awt.Color(218, 216, 218));
        tablaPedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Tapa", "Titulo", "Autor", "Precio", "Cantidad", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaPedidos.setFocusable(false);
        tablaPedidos.setMinimumSize(new java.awt.Dimension(60, 0));
        tablaPedidos.setPreferredSize(new java.awt.Dimension(300, 0));
        tablaPedidos.setRowHeight(180);
        tablaPedidos.setShowVerticalLines(false);
        tablaPedidos.getTableHeader().setReorderingAllowed(false);
        jScrollTablaPedidos.setViewportView(tablaPedidos);

        encabezado.setText("ENCABEZADO");

        javax.swing.GroupLayout pedidosUsuarioPanelLayout = new javax.swing.GroupLayout(pedidosUsuarioPanel);
        pedidosUsuarioPanel.setLayout(pedidosUsuarioPanelLayout);
        pedidosUsuarioPanelLayout.setHorizontalGroup(
            pedidosUsuarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pedidosUsuarioPanelLayout.createSequentialGroup()
                .addGap(286, 286, 286)
                .addComponent(encabezado)
                .addContainerGap(317, Short.MAX_VALUE))
            .addGroup(pedidosUsuarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollTablaPedidos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE))
        );
        pedidosUsuarioPanelLayout.setVerticalGroup(
            pedidosUsuarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pedidosUsuarioPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(encabezado)
                .addContainerGap(446, Short.MAX_VALUE))
            .addGroup(pedidosUsuarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pedidosUsuarioPanelLayout.createSequentialGroup()
                    .addGap(0, 78, Short.MAX_VALUE)
                    .addComponent(jScrollTablaPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pedidosUsuarioPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pedidosUsuarioPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        this.dispose();
        home.setEnabled(true);
    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel encabezado;
    private javax.swing.JScrollPane jScrollTablaPedidos;
    private javax.swing.JPanel pedidosUsuarioPanel;
    private javax.swing.JTable tablaPedidos;
    // End of variables declaration//GEN-END:variables
}