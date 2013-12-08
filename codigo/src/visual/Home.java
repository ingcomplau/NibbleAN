/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package visual;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.LinkedList;
import motor.Carrito;
import motor.Libro;
import motor.Operaciones;
import motor.Usuario;

public class Home extends javax.swing.JFrame {
    protected Carrito carrito = null;
    protected Usuario usuario = null;
    private LinkedList<Libro> libros = null;
    private boolean click=true;
    

    
    public Home() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.botonRegistrarse.setVisible(true);
        this.botonIdentificarse.setVisible(true);
        this.botonCuenta.setVisible(false);
        this.botonConsultar.setVisible(false);
        this.botonVer.setVisible(false);
        this.botonSalir.setVisible(false);
        this.botonAdministrar.setVisible(false);
        this.labelPedididos.setVisible(false);
        this.labelCarrito.setVisible(false);
        llenarHome();   
    }
    
    
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    public void actualizar() {
        llenarHome();
        if (usuario != null){
             //Visibilizar botón cuenta, botón carrito, botón pedidos, botón salir.         
            // Ocultar botón registrarse e identificarse
            this.botonRegistrarse.setVisible(false);
            this.botonIdentificarse.setVisible(false);
            this.botonCuenta.setVisible(true);
            this.botonConsultar.setVisible(true);
            this.labelPedididos.setVisible(true);
            this.labelCarrito.setVisible(true);
            this.botonVer.setVisible(true);
            this.botonSalir.setVisible(true);
            this.botonAdministrar.setVisible(false);
            if (usuario.isAdministrador()){
                 // Visibilizar el boton de aministrar.
                this.botonAdministrar.setVisible(true);
            }
        } else {
            //Ocultar botón cuenta, botón carrito, botón pedidos, botón salir, botón administrar.
            //Visibilizar botón registrarse e identificarse
            this.botonRegistrarse.setVisible(true);
            this.botonIdentificarse.setVisible(true);
            this.botonCuenta.setVisible(false);
            this.botonConsultar.setVisible(false);
            this.botonVer.setVisible(false);
            this.botonSalir.setVisible(false);
            this.botonAdministrar.setVisible(false);
            this.labelPedididos.setVisible(false);
            this.labelCarrito.setVisible(false);
        }
    }
    
    private void llenarHome(){//se ponen los libros en el home, pongo uno de prueba
        panelHome = new javax.swing.JPanel();
        panelHome.setBackground(new java.awt.Color(218, 216, 218));
        panelHome.setLayout(new java.awt.GridLayout(1, 0));
        jScrollPane1.setViewportView(panelHome);
        this.libros = Operaciones.getTodosLosLibros();
         for(int i = 0;i < libros.size() ;i++){
                        this.panelHome.add(new PanelComprarLibro(this, libros.get(i)));
                    }
        this.panelHome.setLayout(new GridLayout(libros.size()/2,2));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBlanco = new javax.swing.JPanel();
        imagenCookBook = new javax.swing.JLabel();
        panelBuscador = new javax.swing.JPanel();
        campoBuscador = new javax.swing.JTextField();
        selectBuscar = new javax.swing.JComboBox();
        buttonBuscar = new javax.swing.JLabel();
        buttonListarTodo = new javax.swing.JLabel();
        panelOpciones = new javax.swing.JPanel();
        botonSalir = new javax.swing.JLabel();
        botonCuenta = new javax.swing.JLabel();
        botonContacto = new javax.swing.JLabel();
        botonAyuda = new javax.swing.JLabel();
        botonAdministrar = new javax.swing.JLabel();
        panelFondo = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        panelHome = new javax.swing.JPanel();
        fondoLayer = new javax.swing.JPanel();
        labelLibro = new javax.swing.JLabel();
        panelContenedor1 = new javax.swing.JPanel();
        botonRegistrarse = new javax.swing.JLabel();
        botonIdentificarse = new javax.swing.JLabel();
        panelContenedor2 = new javax.swing.JPanel();
        botonVer = new javax.swing.JLabel();
        labelCarrito = new javax.swing.JLabel();
        labelPedididos = new javax.swing.JLabel();
        botonConsultar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home");
        setResizable(false);

        panelBlanco.setBackground(new java.awt.Color(249, 248, 248));

        imagenCookBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagen/Resource/LogoCookbook.png"))); // NOI18N
        imagenCookBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                imagenCookBookMouseEntered(evt);
            }
        });

        panelBuscador.setBackground(new java.awt.Color(110, 34, 83));
        panelBuscador.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));

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
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonListarTodoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonListarTodoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonListarTodoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelBuscadorLayout = new javax.swing.GroupLayout(panelBuscador);
        panelBuscador.setLayout(panelBuscadorLayout);
        panelBuscadorLayout.setHorizontalGroup(
            panelBuscadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBuscadorLayout.createSequentialGroup()
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
        panelBuscadorLayout.setVerticalGroup(
            panelBuscadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBuscadorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBuscadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBuscadorLayout.createSequentialGroup()
                        .addGroup(panelBuscadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(campoBuscador)
                            .addGroup(panelBuscadorLayout.createSequentialGroup()
                                .addComponent(selectBuscar)
                                .addGap(1, 1, 1)))
                        .addGap(10, 10, 10))
                    .addGroup(panelBuscadorLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(panelBuscadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonListarTodo)
                            .addComponent(buttonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        panelOpciones.setBackground(new java.awt.Color(51, 51, 51));
        panelOpciones.setMaximumSize(new java.awt.Dimension(473, 19));
        panelOpciones.setMinimumSize(new java.awt.Dimension(473, 19));

        botonSalir.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        botonSalir.setForeground(new java.awt.Color(255, 255, 255));
        botonSalir.setText("SALIR");
        botonSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonSalirMouseClicked(evt);
            }
        });

        botonCuenta.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        botonCuenta.setForeground(new java.awt.Color(255, 255, 255));
        botonCuenta.setText("CUENTA");
        botonCuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonCuentaMouseClicked(evt);
            }
        });

        botonContacto.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        botonContacto.setForeground(new java.awt.Color(153, 153, 153));
        botonContacto.setText("CONTACTO");

        botonAyuda.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        botonAyuda.setForeground(new java.awt.Color(153, 153, 153));
        botonAyuda.setText("AYUDA");

        botonAdministrar.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        botonAdministrar.setForeground(new java.awt.Color(255, 255, 255));
        botonAdministrar.setText("ADMINISTRAR");
        botonAdministrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonAdministrarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelOpcionesLayout = new javax.swing.GroupLayout(panelOpciones);
        panelOpciones.setLayout(panelOpcionesLayout);
        panelOpcionesLayout.setHorizontalGroup(
            panelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelOpcionesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonAdministrar)
                .addGap(18, 18, 18)
                .addComponent(botonSalir)
                .addGap(18, 18, 18)
                .addComponent(botonCuenta)
                .addGap(18, 18, 18)
                .addComponent(botonContacto)
                .addGap(18, 18, 18)
                .addComponent(botonAyuda)
                .addGap(81, 81, 81))
        );
        panelOpcionesLayout.setVerticalGroup(
            panelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(botonCuenta)
                .addComponent(botonContacto)
                .addComponent(botonAyuda)
                .addComponent(botonAdministrar))
        );

        panelFondo.setBackground(new java.awt.Color(216, 218, 216));

        jScrollPane1.setBackground(new java.awt.Color(216, 218, 216));
        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        panelHome.setBackground(new java.awt.Color(255, 255, 255));
        panelHome.setLayout(new java.awt.GridLayout(1, 0));
        jScrollPane1.setViewportView(panelHome);

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFondoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 845, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125))
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)
                .addContainerGap())
        );

        fondoLayer.setBackground(new java.awt.Color(216, 218, 216));

        labelLibro.setBackground(new java.awt.Color(218, 216, 218));
        labelLibro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagen/Resource/PanelLibros.png"))); // NOI18N

        javax.swing.GroupLayout fondoLayerLayout = new javax.swing.GroupLayout(fondoLayer);
        fondoLayer.setLayout(fondoLayerLayout);
        fondoLayerLayout.setHorizontalGroup(
            fondoLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 834, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        fondoLayerLayout.setVerticalGroup(
            fondoLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelLibro)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelContenedor1.setBackground(new java.awt.Color(249, 248, 248));
        panelContenedor1.setMaximumSize(new java.awt.Dimension(149, 89));
        panelContenedor1.setMinimumSize(new java.awt.Dimension(149, 89));

        botonRegistrarse.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        botonRegistrarse.setForeground(new java.awt.Color(153, 153, 153));
        botonRegistrarse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagen/Resource/ButtonRegistrarse.png"))); // NOI18N
        botonRegistrarse.setToolTipText("");
        botonRegistrarse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonRegistrarseMouseExited(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonRegistrarseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonRegistrarseMouseEntered(evt);
            }
        });

        botonIdentificarse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagen/Resource/ButtonIdentificarse.png"))); // NOI18N
        botonIdentificarse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonIdentificarseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonIdentificarseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonIdentificarseMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelContenedor1Layout = new javax.swing.GroupLayout(panelContenedor1);
        panelContenedor1.setLayout(panelContenedor1Layout);
        panelContenedor1Layout.setHorizontalGroup(
            panelContenedor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContenedor1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelContenedor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonRegistrarse)
                    .addComponent(botonIdentificarse))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelContenedor1Layout.setVerticalGroup(
            panelContenedor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContenedor1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonRegistrarse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonIdentificarse)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelContenedor2.setBackground(new java.awt.Color(249, 248, 248));
        panelContenedor2.setMinimumSize(new java.awt.Dimension(247, 86));

        botonVer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagen/Resource/ButtonVer.png"))); // NOI18N
        botonVer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonVerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonVerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonVerMouseExited(evt);
            }
        });

        labelCarrito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagen/Resource/LayerCarrito.png"))); // NOI18N

        labelPedididos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagen/Resource/LayerPedidos.png"))); // NOI18N

        botonConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagen/Resource/ButtonConsultar.png"))); // NOI18N
        botonConsultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonConsultarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonConsultarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonConsultarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelContenedor2Layout = new javax.swing.GroupLayout(panelContenedor2);
        panelContenedor2.setLayout(panelContenedor2Layout);
        panelContenedor2Layout.setHorizontalGroup(
            panelContenedor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContenedor2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelContenedor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelContenedor2Layout.createSequentialGroup()
                        .addComponent(labelPedididos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addComponent(labelCarrito))
                    .addGroup(panelContenedor2Layout.createSequentialGroup()
                        .addComponent(botonConsultar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonVer)))
                .addContainerGap())
        );
        panelContenedor2Layout.setVerticalGroup(
            panelContenedor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelContenedor2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelContenedor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelCarrito)
                    .addComponent(labelPedididos))
                .addGap(18, 18, 18)
                .addGroup(panelContenedor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonConsultar)
                    .addComponent(botonVer)))
        );

        javax.swing.GroupLayout panelBlancoLayout = new javax.swing.GroupLayout(panelBlanco);
        panelBlanco.setLayout(panelBlancoLayout);
        panelBlancoLayout.setHorizontalGroup(
            panelBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelOpciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelBlancoLayout.createSequentialGroup()
                .addGroup(panelBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBlancoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(imagenCookBook, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(panelContenedor2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panelContenedor1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelBlancoLayout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addGroup(panelBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 855, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fondoLayer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        panelBlancoLayout.setVerticalGroup(
            panelBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBlancoLayout.createSequentialGroup()
                .addGroup(panelBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBlancoLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(panelBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBlancoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelContenedor1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(panelBlancoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelContenedor2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panelBlancoLayout.createSequentialGroup()
                                .addComponent(imagenCookBook, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelOpciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(fondoLayer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelBlanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBlanco, javax.swing.GroupLayout.PREFERRED_SIZE, 702, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoBuscadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campoBuscadorMouseClicked
        // TODO add your handling code here:
          if (click) {
            campoBuscador.setText(null);
            click=false;
            campoBuscador.setForeground(Color.black);
        }
    }//GEN-LAST:event_campoBuscadorMouseClicked

    private void buttonBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonBuscarMouseExited

        buttonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagen/Resource/Buscador2.png")));
    }//GEN-LAST:event_buttonBuscarMouseExited

    private void buttonBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonBuscarMouseClicked
        // TODO add your handling code here:
        /*  if("Titulo del Libro".equals(selectBuscar.getSelectedItem().toString())){
            Operaciones.buscadorTituloLibro((DefaultTableModel)tablaLibros.getModel(),campoBuscador.getText());
        }
        else{
            if("Apellido del Autor".equals(selectBuscar.getSelectedItem().toString())){
                Operaciones.buscadorApellidoAutor((DefaultTableModel)tablaLibros.getModel(),campoBuscador.getText());
            }
        }*/
    }//GEN-LAST:event_buttonBuscarMouseClicked

    private void buttonBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonBuscarMouseEntered

        buttonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagen/Resource/Buscador.png")));
    }//GEN-LAST:event_buttonBuscarMouseEntered

    private void buttonListarTodoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonListarTodoMouseClicked
        //this.actualizar();
    }//GEN-LAST:event_buttonListarTodoMouseClicked

    private void buttonListarTodoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonListarTodoMouseEntered

        buttonListarTodo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagen/Resource/ButtonTodosLibrosFocus.png")));
    }//GEN-LAST:event_buttonListarTodoMouseEntered

    private void buttonListarTodoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonListarTodoMouseExited

        buttonListarTodo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagen/Resource/ButtonTodosLibros.png")));
    }//GEN-LAST:event_buttonListarTodoMouseExited

    private void botonAdministrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAdministrarMouseClicked
        // TODO add your handling code here:
        VentanaAdmin va=new VentanaAdmin(this);
        va.setLocationRelativeTo(this);
        va.setVisible(true);
        this.setEnabled(false);
        
    }//GEN-LAST:event_botonAdministrarMouseClicked

    private void botonVerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonVerMouseClicked
        // TODO add your handling code here:
        VentanaCarrito c=new VentanaCarrito(this, carrito);
        c.setLocationRelativeTo(this);
        c.setVisible(true);
        this.setEnabled(false);
    }//GEN-LAST:event_botonVerMouseClicked

    private void botonConsultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonConsultarMouseClicked
        // TODO add your handling code here:
        PedidosUsuario pu=new PedidosUsuario(this, usuario);
        pu.setLocationRelativeTo(this);
        pu.setVisible(true);
        this.setEnabled(false);
    }//GEN-LAST:event_botonConsultarMouseClicked

    private void botonSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSalirMouseClicked
        usuario = null;
        carrito = null;
        this.actualizar();
    }//GEN-LAST:event_botonSalirMouseClicked

    private void botonIdentificarseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonIdentificarseMouseClicked
        // TODO add your handling code here:
        Identificarse i=new Identificarse(this);
        i.setLocationRelativeTo(this);
        i.setVisible(true);
        this.setEnabled(false);
    }//GEN-LAST:event_botonIdentificarseMouseClicked

    private void botonCuentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCuentaMouseClicked
        // TODO add your handling code here:
        ModificarDatosUsuario md=new ModificarDatosUsuario(this, usuario);
        md.setLocationRelativeTo(this);
        md.setVisible(true);
        this.setEnabled(false);
    }//GEN-LAST:event_botonCuentaMouseClicked

    private void botonIdentificarseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonIdentificarseMouseEntered
        // TODO add your handling code here:
        this.botonIdentificarse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagen/Resource/ButtonIdentificarseFocus.png")));
    }//GEN-LAST:event_botonIdentificarseMouseEntered

    private void botonIdentificarseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonIdentificarseMouseExited
        // TODO add your handling code here:
        this.botonIdentificarse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagen/Resource/ButtonIdentificarse.png")));
    }//GEN-LAST:event_botonIdentificarseMouseExited

    private void botonVerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonVerMouseEntered
        // TODO add your handling code here:
        this.botonVer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagen/Resource/ButtonVerFocus.png")));
    }//GEN-LAST:event_botonVerMouseEntered

    private void botonConsultarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonConsultarMouseEntered
        // TODO add your handling code here:
        this.botonConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagen/Resource/ButtonConsultarFocus.png")));
    }//GEN-LAST:event_botonConsultarMouseEntered

    private void botonConsultarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonConsultarMouseExited
        // TODO add your handling code here:
        this.botonConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagen/Resource/ButtonConsultar.png")));
    }//GEN-LAST:event_botonConsultarMouseExited

    private void botonVerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonVerMouseExited
        // TODO add your handling code here:
        this.botonVer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagen/Resource/ButtonVer.png")));
    }//GEN-LAST:event_botonVerMouseExited

    private void botonRegistrarseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegistrarseMouseClicked
        // TODO add your handling code here:
        AgregarUsuario au=new AgregarUsuario(this);
        au.setLocationRelativeTo(this);
        au.setVisible(true);
        this.setEnabled(false);
    }//GEN-LAST:event_botonRegistrarseMouseClicked

    private void botonRegistrarseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegistrarseMouseEntered
        // TODO add your handling code here:
        this.botonRegistrarse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagen/Resource/ButtonRegistrarseFocus.png")));
    }//GEN-LAST:event_botonRegistrarseMouseEntered

    private void botonRegistrarseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegistrarseMouseExited
        // TODO add your handling code here:
        this.botonRegistrarse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagen/Resource/ButtonRegistrarse.png")));
    }//GEN-LAST:event_botonRegistrarseMouseExited

    private void imagenCookBookMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagenCookBookMouseEntered
        // TODO add your handling code here:
        this.imagenCookBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagen/Resource/LogoCookbookFocus.png")));
    }//GEN-LAST:event_imagenCookBookMouseEntered

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel botonAdministrar;
    private javax.swing.JLabel botonAyuda;
    private javax.swing.JLabel botonConsultar;
    private javax.swing.JLabel botonContacto;
    private javax.swing.JLabel botonCuenta;
    private javax.swing.JLabel botonIdentificarse;
    private javax.swing.JLabel botonRegistrarse;
    private javax.swing.JLabel botonSalir;
    private javax.swing.JLabel botonVer;
    private javax.swing.JLabel buttonBuscar;
    private javax.swing.JLabel buttonListarTodo;
    private javax.swing.JTextField campoBuscador;
    private javax.swing.JPanel fondoLayer;
    private javax.swing.JLabel imagenCookBook;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelCarrito;
    private javax.swing.JLabel labelLibro;
    private javax.swing.JLabel labelPedididos;
    private javax.swing.JPanel panelBlanco;
    private javax.swing.JPanel panelBuscador;
    private javax.swing.JPanel panelContenedor1;
    private javax.swing.JPanel panelContenedor2;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JPanel panelHome;
    private javax.swing.JPanel panelOpciones;
    private javax.swing.JComboBox selectBuscar;
    // End of variables declaration//GEN-END:variables
}
