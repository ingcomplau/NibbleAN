/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Operaciones;


import excepciones.ErrorAutor;
import excepciones.ErrorLibro;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
    
     private static boolean insertar(String sql){
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
    
    public static boolean agregarAutor(String nombre, String apellido, Integer 
            pais_id, Date fecha_nacimiento, Integer sexo, String acerca_de) throws ErrorAutor { 
        ErrorAutor e = new ErrorAutor();
        boolean correcto = true;
        String fNac = null;
        char sx = 'M';
        pais_id++;
       
        if ((nombre.length() == 0) | (nombre.equals(" Nombre"))) {
                e.setNombreCorto();
                correcto = false;
            } else if (nombre.length() > 100) {
                e.setNombreLargo();
                correcto = false;
            } else if (!(nombre.matches("[a-zA-Z\\s]+$"))){
                e.setNombreInvalido();
                correcto = false;
            }
         if ((apellido.length() == 0) | (apellido.equals(" Apellido"))) {
                e.setApellidoCorto();
                correcto = false;
            } else if (apellido.length() > 100) {
                e.setApellidoLargo();
                correcto = false;
            } else if (!(apellido.matches("[a-zA-Z\\s]+$"))){
                e.setApellidoInvalido();
                correcto = false;
            }
     
          resultado = null;
          resultado = consultar("SELECT nombre, apellido from autores where apellido='"+ apellido +"'"
                + " and nombre='"+ nombre +"'");
          try{
              if (resultado.next()) {
                e.setAutorExistente();
                correcto = false;
               }
         }catch(SQLException ex){
        }
          cerrar();
       
       if (fecha_nacimiento != null){
            fNac = new SimpleDateFormat("dd'-'MMM'-'yyyy").format(fecha_nacimiento);
        } else {
            e.setFechaInvalida();
            correcto = false;
        }
        if (sexo == 1){
            sx = 'F';
         }
         if (correcto) {
            insertar("insert into Autores(nombre, apellido, pais_id, fecha_nacimiento, sexo, acerca_de)"
                    + "values('"+ nombre +"', '"+apellido+"',"+pais_id+",'"+fNac+"','"+sx+"','"+acerca_de+"');");
            return true;
         } else {
             throw e;
         }
             
    }
     
        public static boolean agregarLibro(String isbn, String titulo, String cant_paginas, 
                String precio, Date fecha_lanzamiento, String resumen, String primeras_paginas,
                Integer autor_id, Integer idioma_id) throws ErrorLibro {
            ErrorLibro e = new ErrorLibro();
            boolean correcto = true;
            String fLanz = null;
            autor_id++;
            idioma_id++;
             if ((isbn.length() < 13) | (isbn.equals(" I.S.B.N"))) {
                e.setIsbncorto();
                correcto = false;
            } else if (isbn.length() > 13) {
                e.setIsbnlargo();
                correcto = false;
            } else if (!(isbn.matches("[0-9]+$"))){
                e.setIsbnincorrecto();
                correcto = false;
            }
            
            if ((titulo.length() == 0) | (titulo.equals(" Título"))) {
                e.setTitulocorto();
                correcto = false;
            } else if (titulo.length() > 100) {
                e.setTitulolargo();
                correcto = false;
            }
            
             if (cant_paginas.equals(" Cantidad de páginas")) {
                e.setPocaspags();
                correcto = false;
            } else {
                if (!(cant_paginas.matches("[0-9]+$"))){
                  e.setCantpagsincorrecto();
                    correcto = false;
                } else if (Integer.parseInt(cant_paginas) <= 0){
                   e.setPocaspags();
              }
            }
             
            if (precio.equals(" Precio ($)")) {
                e.setPrecioincorrecto();
                correcto = false;
            } else {
                if (!(precio.matches("[0-9]\\u002e+$"))){
                  e.setPrecioincorrecto();
                    correcto = false;
                } else if (Float.parseFloat(precio) < 0){
                   e.setPrecionegativo();
              }
            }
            
             if (fecha_lanzamiento != null){
                fLanz = new SimpleDateFormat("dd'-'MMM'-'yyyy").format(fecha_lanzamiento);
            } else {
                e.setFechaInvalida();
                correcto = false;
            }
             
         if (correcto) {
            insertar("insert into libros(isbn, titulo, cant_paginas, precio, "
                    + "fecha_lanzamiento, resumen, primeras_paginas, autor_id, idioma_id)"
                    + "values('"+ isbn +"', '"+titulo+"',"+Integer.parseInt(cant_paginas)+","
                    + "'"+fLanz+"','"+resumen+"','"+primeras_paginas+","+autor_id+","+idioma_id+"');");
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
}