/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package visual;

import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import motor.Operaciones;
import motor.Pedidos;

/**
 *
 * @author Manu
 */
public class PedidosAdmin extends javax.swing.JFrame {

    VentanaAdmin va;
    Pedidos pedidos;
    
    public PedidosAdmin(VentanaAdmin v) {
        pedidos = new Pedidos(null);
        va=v;
        initComponents();
        this.actualizar();
        Operaciones.llenarTablaPedidosAdmin((DefaultTableModel)jTable2.getModel());
 
    }
    
        private class CellRenderer extends DefaultTableCellRenderer
{
   
    @Override
    public Component getTableCellRendererComponent(JTable table,
            Object value, boolean isSelected, boolean hasFocus, int row,
            int column)
    {
        super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
              
        if (column == 3){
            setText("");
            setIcon(new ImageIcon(getClass().getResource(value.toString()))); 
        } else {
          setText(value.toString());
          setIcon(null);
        }
        return this;
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

        pedidosAdminPanel = new javax.swing.JPanel();
        encabezado = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pedidos");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        pedidosAdminPanel.setBackground(new java.awt.Color(218, 216, 218));

        encabezado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagen/Resource/PanelPedidos.png"))); // NOI18N

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable2);

        javax.swing.GroupLayout pedidosAdminPanelLayout = new javax.swing.GroupLayout(pedidosAdminPanel);
        pedidosAdminPanel.setLayout(pedidosAdminPanelLayout);
        pedidosAdminPanelLayout.setHorizontalGroup(
            pedidosAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pedidosAdminPanelLayout.createSequentialGroup()
                .addComponent(encabezado)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pedidosAdminPanelLayout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pedidosAdminPanelLayout.setVerticalGroup(
            pedidosAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pedidosAdminPanelLayout.createSequentialGroup()
                .addComponent(encabezado)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pedidosAdminPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pedidosAdminPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


     public void actualizar(){
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                
            },
            new String [] {
                "Usuario", "Tapa", "Titulo", "Autor", "Precio", "Cantidad", "Fecha de compra", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

             public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
            
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.setFocusable(false);
        jTable2.setMinimumSize(new java.awt.Dimension(60, 0));
        jTable2.setPreferredSize(new java.awt.Dimension(300, 0));
        jTable2.setRowHeight(180);
        jTable2.setShowVerticalLines(false);
        jTable2.getTableHeader().setReorderingAllowed(false);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setResizable(false);
            jTable2.getColumnModel().getColumn(1).setResizable(false);
            jTable2.getColumnModel().getColumn(2).setResizable(false);
            jTable2.getColumnModel().getColumn(3).setResizable(false);
            jTable2.getColumnModel().getColumn(4).setResizable(false);
            jTable2.getColumnModel().getColumn(5).setResizable(false);
            jTable2.getColumnModel().getColumn(6).setResizable(false);
            jTable2.getColumnModel().getColumn(7).setResizable(false);
        }
        
        Operaciones.llenarTablaPedidosAdmin((DefaultTableModel)jTable2.getModel());
    } 
    
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        this.dispose();
        va.setEnabled(true);
    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel encabezado;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JPanel pedidosAdminPanel;
    // End of variables declaration//GEN-END:variables
}
