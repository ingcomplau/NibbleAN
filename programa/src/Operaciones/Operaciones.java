/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Operaciones;


import excepciones.ErrorAutor;
import java.sql.ResultSet;
import java.sql.SQLException;
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
    
  
    private static ResultSet consultar(String sql){
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
    
    private static void cerrar(){
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
        tableModel.setRowCount(0);
        tableModel.setColumnCount(3);
        String sql = "SELECT a.isbn,a.titulo,b.apellido ||' '||b.nombre from libros a INNER JOIN autores b on a.autor_id=b.id order by a.titulo";
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
    
    public static void agregarAutor(String nombre, String apellido, String 
            pais_id, String fecha_nacimiento, String sexo, String acerca_de) throws ErrorAutor {
        ErrorAutor e = new ErrorAutor();
        if ((nombre.length() == 0) | (nombre.equals("Nombre"))) {
                e.setNombreCorto();
            } else if (nombre.length() > 100) {
                e.setNombreLargo();
            } else if (!(nombre.matches("[a-zA-Z\\s]+$"))){
                e.setNombreInvalido();
            }
         if ((apellido.length() == 0) | (apellido.equals("Apellido"))) {
                e.setApellidoCorto();
            } else if (apellido.length() > 100) {
                e.setApellidoLargo();
            } else if (!(apellido.matches("[a-zA-Z\\s]+$"))){
                e.setApellidoInvalido();
            }
    }
    
}