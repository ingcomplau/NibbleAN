/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package motor;


import excepciones.ErrorAutor;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Operaciones extends Conexion{
    /**
     * Constructor for objects of class Operaciones
     */
    private static ResultSet resultado = null;

  
    
    public Operaciones()
    {
        // initialise instance variables
    }
    
  
    protected static ResultSet consultar(String sql){
        conectar();
        resultado = null;
        try {
            resultado = Operaciones.consulta.executeQuery(sql);

        } catch (SQLException e) {
                System.out.println("Mensaje:"+e.getMessage());
                System.out.println("Estado:"+e.getSQLState());
                System.out.println("Codigo del error:"+e.getErrorCode());
                JOptionPane.showMessageDialog(null, ""+e.getMessage());
            }
        return resultado;
    }
    
     protected static boolean insertar(String sql){
        boolean valor = true;
        conectar();
        try {
            consulta.executeUpdate(sql);
        } catch (SQLException e) {
                valor = false;
                JOptionPane.showMessageDialog(null, e.getMessage());
            }      
        finally{  
           cerrar();
        }
        return valor;
     }
    protected static void cerrar(){
        try
         {
             Operaciones.consulta.close();
             Operaciones.conexion.close();
             if(resultado != null){
                resultado.close();
             }
         }
         catch (SQLException e)
         {
         }
    }

  
    public static void consultarPaises(DefaultComboBoxModel comboModel){
        resultado = null;
        String sql = "select nombre from paises";
        try {
            resultado = consultar(sql);
            if(resultado != null){
                while(resultado.next()){
                   comboModel.addElement(resultado.getObject(1)); 
                }
            }
        }catch(SQLException e){
            
        }

        finally
     {
         cerrar();
     }
    }
    
     public static void consultarIdioma(DefaultComboBoxModel comboModel){
        resultado = null;
        String sql = "select nombre from idiomas";
        try {
            resultado = consultar(sql);
            if(resultado != null){
                while(resultado.next()){
                   comboModel.addElement(resultado.getObject(1)); 
                }
            }
        }catch(SQLException e){
        }

        finally
     {
        cerrar();
     }
    }
     
     public static void llenarListaAutores(JList listaModel){
        resultado = null;
        DefaultListModel x = new javax.swing.DefaultListModel();
        String sql = "SELECT nombre ||' '|| apellido  FROM autores";
        try {
            resultado = consultar(sql);
            if(resultado != null){
                while(resultado.next()){
                   x.addElement(resultado.getObject(1));
                }
            }
            listaModel.setModel(x);
        }catch(SQLException e){
        }

        finally
     {
        cerrar();
     }
    }
     

     
     public static void llenarTablaLibros(DefaultTableModel tableModel){
        resultado = null;  
        String sql = "SELECT a.isbn,a.titulo,b.apellido ||' '||b.nombre, a.urltapa from libros a INNER JOIN autores b on a.autor_id=b.id order by a.titulo";
        try {
            resultado = consultar(sql);
            if(resultado != null){
                int numeroColumna = resultado.getMetaData().getColumnCount();              
                while(resultado.next()){
                    Object []objetos = new Object[numeroColumna];
                    for(int i = 1;i <= numeroColumna - 1 ;i++){
                        objetos[i-1] = resultado.getObject(i);
                    }
                    objetos[numeroColumna - 1] = resultado.getString(numeroColumna);                    
                    tableModel.addRow(objetos);
                }
            }
        }catch(SQLException e){
        }

        finally
     {
        cerrar();
     }
    }
     
      public static void llenarTablaPedidosAdmin(DefaultTableModel tableModel) {
         resultado = null;  
        String sql = "SELECT c.usuario,b.urltapa,b.titulo,d.apellido ||' '||d.nombre,a.precio,a.cantidad,a.fecha,a.estado from compras a INNER JOIN libros b on a.libro_id=b.id  INNER JOIN usuarios c on a.usuario_id=c.id INNER JOIN autores d on b.autor_id=d.id order by c.usuario";
        try {
            resultado = consultar(sql);
            if(resultado != null){
                int numeroColumna = resultado.getMetaData().getColumnCount();              
                while(resultado.next()){
                    Object []objetos = new Object[numeroColumna];
                    for(int i = 1;i <= numeroColumna - 1 ;i++){
                        objetos[i-1] = resultado.getObject(i);
                    }
                    objetos[numeroColumna - 1] = resultado.getString(numeroColumna);                    
                    tableModel.addRow(objetos);
                }
            }
        }catch(SQLException e){
        }

        finally
     {
        cerrar();
     }
    }
     

     
         public static void buscadorTituloLibro(DefaultTableModel tableModel,String fraseClave){
        resultado = null;
        tableModel.setRowCount(0);
        tableModel.setColumnCount(3);
        String sql = "SELECT a.isbn,a.titulo,b.apellido ||' '||b.nombre FROM libros a INNER JOIN autores b on a.autor_id=b.id WHERE a.titulo='"+fraseClave+"'";
        try {
            resultado = consultar(sql);
            if(resultado != null){
                int numeroColumna = resultado.getMetaData().getColumnCount();             
                while(resultado.next()){
                    Object []objetos = new Object[numeroColumna];
                    for(int i = 1;i <= numeroColumna;i++){
                        objetos[i-1] = resultado.getObject(i);
                    }
                    tableModel.addRow(objetos);
                }
            }
        }catch(SQLException e){
        }

        finally
     {
        cerrar();
     }
    }
    
         
    public static void buscadorApellidoAutor(DefaultTableModel tableModel,String fraseClave){
        resultado = null;
        tableModel.setRowCount(0);
        tableModel.setColumnCount(3);
        String sql = "SELECT a.isbn,a.titulo,b.apellido ||' '||b.nombre FROM libros "
                + "a INNER JOIN autores b on a.autor_id=b.id WHERE b.apellido='"+fraseClave+"'";
        try {
            resultado = consultar(sql);
            if(resultado != null){
                int numeroColumna = resultado.getMetaData().getColumnCount();
             
                while(resultado.next()){
                    Object []objetos = new Object[numeroColumna];
                    for(int i = 1;i <= numeroColumna;i++){
                        objetos[i-1] = resultado.getObject(i);
                    }
                    tableModel.addRow(objetos);
                }
            }
        }catch(SQLException e){
        }
        finally
     {
        cerrar();
     }
    }
    
    public static boolean agregarAutor(Autor a) throws ErrorAutor { 
        ErrorAutor e = new ErrorAutor();
        boolean correcto = true;
        String fNac = null;
        char sx = 'M';
               
        if ((a.getNombre().length() == 0) | (a.getNombre().equals(" Nombre"))) {
                e.setNombreCorto();
                correcto = false;
            } else if (a.getNombre().length() > 100) {
                e.setNombreLargo();
                correcto = false;
            } else if (!(a.getNombre().matches("[a-zA-Z\\s]+$"))){
                e.setNombreInvalido();
                correcto = false;
            }
         if ((a.getApellido().length() == 0) | (a.getApellido().equals(" Apellido"))) {
                e.setApellidoCorto();
                correcto = false;
            } else if (a.getApellido().length() > 100) {
                e.setApellidoLargo();
                correcto = false;
            } else if (!(a.getApellido().matches("[a-zA-Z\\s]+$"))){
                e.setApellidoInvalido();
                correcto = false;
            }
     
          resultado = null;
          resultado = consultar("SELECT nombre, apellido from autores where apellido='"+ a.getApellido() +"'"
                + " and nombre='"+ a.getNombre() +"'");
          try{
              if (resultado.next()) {
                e.setAutorExistente();
                correcto = false;
               }
         }catch(SQLException ex){
        }
          cerrar();
       
       if (a.getFechaNacimiento() != null){
            fNac = new SimpleDateFormat("dd'-'MMM'-'yyyy").format(a.getFechaNacimiento());
        } else {
            e.setFechaInvalida();
            correcto = false;
        }
        if (a.getSexo() == 1){
            sx = 'F';
         }
         if (correcto) {
            insertar("insert into Autores(nombre, apellido, pais_id, fecha_nacimiento, sexo, acerca_de)"
                    + "values('"+ a.getNombre() +"', '"+a.getApellido()+"',"+a.getPais()+",'"+fNac+"','"+sx+"','"+a.getInformacion()+"');");
            return true;
         } else {
             throw e;
         }
             
    }
    
        
     public static void llenarListaIdiomas(DefaultComboBoxModel comboModel){
        resultado = null;
        String sql = "select nombre from idiomas";
        try {
            resultado = consultar(sql);
            if(resultado != null){
                while(resultado.next()){
                   comboModel.addElement(resultado.getObject(1)); 
                }
            }
        }catch(SQLException e){
            
        }

        finally
     {
         cerrar();
     }
    }
     
     public LinkedList<Libro> getTodosLosLibros() {
         LinkedList<Libro> lista = new LinkedList<>();
         Libro libro;
         resultado = null;  
        String sql = "SELECT * from libros order by titulo";
        try {
            resultado = consultar(sql);
            if(resultado != null){            
                while(resultado.next()){
                    libro = new Libro();
                    libro.id  = resultado.getInt("id");
                    libro.isbn = resultado.getString("isbn");
                    libro.titulo = resultado.getString("titulo"); 
                    libro.cant_paginas = new Integer(resultado.getInt("cant_paginas")).toString();
                    libro.precio = new Float(resultado.getFloat("precio")).toString();
                    libro.fecha_lanzamiento = resultado.getString("fecha_lanzamiento");
                    libro.resumen = resultado.getString("resumen");
                    libro.primeras_paginas = resultado.getString("primeras_paginas");
                    libro.autor_id = resultado.getInt("autor_id");
                    libro.idioma_id = resultado.getInt("idioma_id");
                    libro.urltapa = resultado.getString("urltapa");
                    lista.add(libro);
                }
            }
        }catch(SQLException e){
        }

        finally
     {
        cerrar();
     }
         return lista;
     }
}