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

/**
 *
 * @author launote
 */
public class PedidosAdmin extends javax.swing.JFrame {
  VentanaAdmin va;
    /**
     * Creates new form pedidosAdmin
     */
    public PedidosAdmin(VentanaAdmin VA) {
        initComponents();
        this.va=VA;
        Operaciones.llenarTablaPedidosAdmin((DefaultTableModel) tablaPedidos.getModel());
        tablaPedidos.setDefaultRenderer(Object.class, new CellRenderer());
    }
    
       private class CellRenderer extends DefaultTableCellRenderer
{
   
    @Override
    public Component getTableCellRendererComponent(JTable table,
            Object value, boolean isSelected, boolean hasFocus, int row,
            int column)
    {
        super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
              
        if (column == 1){
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPedidos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pedidos");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(218, 216, 218));

        tablaPedidos.setBackground(new java.awt.Color(218, 216, 218));
        tablaPedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Usuario", "Tapa", "Titulo", "Autor", "Precio", "Cantidad", "Fecha", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        tablaPedidos.setFocusable(false);
        tablaPedidos.setRowHeight(180);
        tablaPedidos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaPedidos.setShowVerticalLines(false);
        tablaPedidos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tablaPedidos);
        if (tablaPedidos.getColumnModel().getColumnCount() > 0) {
            tablaPedidos.getColumnModel().getColumn(0).setResizable(false);
            tablaPedidos.getColumnModel().getColumn(0).setPreferredWidth(45);
            tablaPedidos.getColumnModel().getColumn(1).setResizable(false);
            tablaPedidos.getColumnModel().getColumn(1).setPreferredWidth(50);
            tablaPedidos.getColumnModel().getColumn(2).setResizable(false);
            tablaPedidos.getColumnModel().getColumn(2).setPreferredWidth(150);
            tablaPedidos.getColumnModel().getColumn(3).setResizable(false);
            tablaPedidos.getColumnModel().getColumn(3).setPreferredWidth(70);
            tablaPedidos.getColumnModel().getColumn(4).setResizable(false);
            tablaPedidos.getColumnModel().getColumn(4).setPreferredWidth(30);
            tablaPedidos.getColumnModel().getColumn(5).setResizable(false);
            tablaPedidos.getColumnModel().getColumn(5).setPreferredWidth(10);
            tablaPedidos.getColumnModel().getColumn(6).setResizable(false);
            tablaPedidos.getColumnModel().getColumn(6).setPreferredWidth(40);
            tablaPedidos.getColumnModel().getColumn(7).setResizable(false);
            tablaPedidos.getColumnModel().getColumn(7).setPreferredWidth(25);
        }

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagen/Resource/PanelPedidos.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        this.dispose();
        va.setEnabled(true);
    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaPedidos;
    // End of variables declaration//GEN-END:variables
}
