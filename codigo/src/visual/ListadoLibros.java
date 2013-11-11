/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package visual;

import motor.Operaciones;
import java.awt.Color;
import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import motor.Libro;

/**
 *
 * @author Manu
 */
public class ListadoLibros extends javax.swing.JFrame {
    
    class ImageRenderer extends DefaultTableCellRenderer {
        JLabel lbl;
        ImageIcon icon;
        public ImageRenderer(String URL) {
            lbl = new JLabel();
            icon = new ImageIcon(getClass().getResource(URL));
        }
        
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
            boolean hasFocus, int row, int column) {
            lbl.setText((String) value);
            lbl.setIcon(icon);
        return lbl;
        }
    }
    
    VentanaAdmin VA;
    private boolean click=true;
    /**
     * Creates new form ListadoDeLibros
     */
    public ListadoLibros(VentanaAdmin V) {
        initComponents();
        VA=V;
         Operaciones.llenarTablaLibros((DefaultTableModel)tablaLibros.getModel());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        listadoDeLibrosPanel = new javax.swing.JPanel();
        encabezado = new javax.swing.JLabel();
        botonModificar = new javax.swing.JLabel();
        botonEliminar = new javax.swing.JLabel();
        jScrollPaneTablaLibros = new javax.swing.JScrollPane();
        tablaLibros = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        campoBuscador = new javax.swing.JTextField();
        selectBuscar = new javax.swing.JComboBox();
        buttonBuscar = new javax.swing.JLabel();
        buttonListarTodo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Listado de libros");
        setBackground(new java.awt.Color(1, 1, 1));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        listadoDeLibrosPanel.setBackground(new java.awt.Color(218, 216, 218));

        encabezado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagen/Resource/PanelListadoLibros.png"))); // NOI18N

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

        botonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagen/Resource/ButtonEliminar.png"))); // NOI18N
        botonEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonEliminarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonEliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonEliminarMouseExited(evt);
            }
        });

        jScrollPaneTablaLibros.setBackground(new java.awt.Color(218, 216, 218));

        tablaLibros.setBackground(new java.awt.Color(218, 216, 218));
        tablaLibros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Isbn", "Titulo", "Autor", "Tapa"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaLibros.setFocusable(false);
        tablaLibros.setRowHeight(180);
        tablaLibros.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaLibros.setShowVerticalLines(false);
        tablaLibros.getTableHeader().setReorderingAllowed(false);
        tablaLibros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaLibrosMouseClicked(evt);
            }
        });
        jScrollPaneTablaLibros.setViewportView(tablaLibros);
        if (tablaLibros.getColumnModel().getColumnCount() > 0) {
            tablaLibros.getColumnModel().getColumn(0).setResizable(false);
            tablaLibros.getColumnModel().getColumn(1).setResizable(false);
            tablaLibros.getColumnModel().getColumn(2).setResizable(false);
            tablaLibros.getColumnModel().getColumn(3).setResizable(false);
            tablaLibros.getColumnModel().getColumn(3).setCellRenderer(new ImageRenderer("/visual/imagen/Resource/TapaLibro.png"));
        }

        jPanel1.setBackground(new java.awt.Color(110, 34, 83));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));

        campoBuscador.setBackground(new java.awt.Color(240, 238, 240));
        campoBuscador.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        campoBuscador.setForeground(new java.awt.Color(153, 153, 153));
        campoBuscador.setText("Buscador");
        campoBuscador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                campoBuscadorMouseClicked(evt);
            }
        });

        selectBuscar.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Titulo del Libro", "Apellido del Autor" }));

        buttonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagen/Resource/Buscador2.png"))); // NOI18N
        buttonBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonBuscarMouseExited(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonBuscarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonBuscarMouseEntered(evt);
            }
        });

        buttonListarTodo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagen/Resource/ButtonTodosLibros.png"))); // NOI18N
        buttonListarTodo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonListarTodoMouseExited(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonListarTodoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonListarTodoMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(campoBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(selectBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonBuscar)
                .addGap(18, 18, 18)
                .addComponent(buttonListarTodo)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(campoBuscador)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(selectBuscar)
                                .addGap(1, 1, 1)))
                        .addGap(10, 10, 10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonListarTodo)
                            .addComponent(buttonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout listadoDeLibrosPanelLayout = new javax.swing.GroupLayout(listadoDeLibrosPanel);
        listadoDeLibrosPanel.setLayout(listadoDeLibrosPanelLayout);
        listadoDeLibrosPanelLayout.setHorizontalGroup(
            listadoDeLibrosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(encabezado, javax.swing.GroupLayout.DEFAULT_SIZE, 785, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, listadoDeLibrosPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(listadoDeLibrosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, listadoDeLibrosPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPaneTablaLibros)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, listadoDeLibrosPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(listadoDeLibrosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, listadoDeLibrosPanelLayout.createSequentialGroup()
                                .addComponent(botonEliminar)
                                .addGap(130, 130, 130)
                                .addComponent(botonModificar)
                                .addGap(179, 179, 179))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, listadoDeLibrosPanelLayout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(113, 113, 113))))))
        );
        listadoDeLibrosPanelLayout.setVerticalGroup(
            listadoDeLibrosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(listadoDeLibrosPanelLayout.createSequentialGroup()
                .addComponent(encabezado)
                .addGap(39, 39, 39)
                .addGroup(listadoDeLibrosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonModificar)
                    .addComponent(botonEliminar))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPaneTablaLibros, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(listadoDeLibrosPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(listadoDeLibrosPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEliminarMouseClicked
        if(this.tablaLibros.getSelectedRowCount()!=0){
             EliminarLibro venEli= new EliminarLibro (this);
             venEli.setLocationRelativeTo(this);
             venEli.setVisible(true);
             this.setEnabled(false);
        }

    }//GEN-LAST:event_botonEliminarMouseClicked

    private void botonModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonModificarMouseClicked
       if(this.tablaLibros.getSelectedRowCount()!=0){
            ModificarLibro ML=new ModificarLibro(this, new Libro(tablaLibros.getValueAt(tablaLibros.getSelectedRow(), 0).toString()));
            ML.setVisible(true);
            ML.setLocationRelativeTo(this);
            this.setEnabled(false);

        }
    }//GEN-LAST:event_botonModificarMouseClicked

    private void buttonBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonBuscarMouseClicked
        // TODO add your handling code here:
        if("Titulo del Libro".equals(selectBuscar.getSelectedItem().toString())){
            Operaciones.buscadorTituloLibro((DefaultTableModel)tablaLibros.getModel(),campoBuscador.getText());
        }
        else{
            if("Apellido del Autor".equals(selectBuscar.getSelectedItem().toString())){
                 Operaciones.buscadorApellidoAutor((DefaultTableModel)tablaLibros.getModel(),campoBuscador.getText());
            }
        }
    }//GEN-LAST:event_buttonBuscarMouseClicked

    private void tablaLibrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaLibrosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaLibrosMouseClicked

    private void buttonBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonBuscarMouseEntered
        // TODO add your handling code here:
        buttonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagen/Resource/Buscador.png")));
    }//GEN-LAST:event_buttonBuscarMouseEntered

    private void buttonBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonBuscarMouseExited
        // TODO add your handling code here:
         buttonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagen/Resource/Buscador2.png")));
    }//GEN-LAST:event_buttonBuscarMouseExited

    private void buttonListarTodoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonListarTodoMouseEntered
        // TODO add your handling code here:
        buttonListarTodo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagen/Resource/ButtonTodosLibrosFocus.png")));
    }//GEN-LAST:event_buttonListarTodoMouseEntered

    private void buttonListarTodoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonListarTodoMouseExited
        // TODO add your handling code here:
        buttonListarTodo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagen/Resource/ButtonTodosLibros.png")));
    }//GEN-LAST:event_buttonListarTodoMouseExited

    private void buttonListarTodoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonListarTodoMouseClicked
       tablaLibros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Isbn", "Titulo", "Autor", "Tapa"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
       if (tablaLibros.getColumnModel().getColumnCount() > 0) {
            tablaLibros.getColumnModel().getColumn(0).setResizable(false);
            tablaLibros.getColumnModel().getColumn(1).setResizable(false);
            tablaLibros.getColumnModel().getColumn(2).setResizable(false);
            tablaLibros.getColumnModel().getColumn(3).setResizable(false);
            tablaLibros.getColumnModel().getColumn(3).setCellRenderer(new ImageRenderer("/visual/imagen/Resource/TapaLibro.png"));
        }
       Operaciones.llenarTablaLibros((DefaultTableModel)tablaLibros.getModel());
    }//GEN-LAST:event_buttonListarTodoMouseClicked

    private void campoBuscadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campoBuscadorMouseClicked
        // TODO add your handling code here:
              if (click) {
                campoBuscador.setText(null);
                click=false;
                campoBuscador.setForeground(Color.black);
    }
    }//GEN-LAST:event_campoBuscadorMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        this.dispose();
        VA.setEnabled(true);
    }//GEN-LAST:event_formWindowClosing

    private void botonEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEliminarMouseEntered
        // TODO add your handling code here:
          botonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagen/Resource/ButtonEliminarFocus.png")));
    }//GEN-LAST:event_botonEliminarMouseEntered

    private void botonEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEliminarMouseExited
        // TODO add your handling code here:
        botonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagen/Resource/ButtonEliminar.png")));
    }//GEN-LAST:event_botonEliminarMouseExited

    private void botonModificarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonModificarMouseEntered
        // TODO add your handling code here:
        botonModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagen/Resource/ButtonModificarFocus.png")));
    }//GEN-LAST:event_botonModificarMouseEntered

    private void botonModificarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonModificarMouseExited
        // TODO add your handling code here:
        botonModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagen/Resource/ButtonModificar.png")));
    }//GEN-LAST:event_botonModificarMouseExited

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel botonEliminar;
    private javax.swing.JLabel botonModificar;
    private javax.swing.JLabel buttonBuscar;
    private javax.swing.JLabel buttonListarTodo;
    private javax.swing.JTextField campoBuscador;
    private javax.swing.JLabel encabezado;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPaneTablaLibros;
    private javax.swing.JPanel listadoDeLibrosPanel;
    private javax.swing.JComboBox selectBuscar;
    private javax.swing.JTable tablaLibros;
    // End of variables declaration//GEN-END:variables
}
