/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package motor;


import excepciones.ErrorAutor;
import excepciones.ErrorLibro;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
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
        String sql = "SELECT a.l.getIsbn(),a.l.getTitulo(),b.getApellido() ||' '||b.getNombre() from libros a INNER JOIN autores b on a.autor_id=b.id order by a.l.getTitulo()";
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
        String sql = "SELECT a.l.getIsbn(),a.l.getTitulo(),b.getApellido() ||' '||b.getNombre() FROM libros a INNER JOIN autores b on a.autor_id=b.id WHERE a.l.getTitulo()='"+fraseClave+"'";
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
        String sql = "SELECT a.l.getIsbn(),a.l.getTitulo(),b.getApellido() ||' '||b.getNombre() FROM libros "
                + "a INNER JOIN autores b on a.autor_id=b.id WHERE b.getApellido()='"+fraseClave+"'";
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
     
        public static boolean agregarLibro(Libro l) throws ErrorLibro {
            ErrorLibro e = new ErrorLibro();
            boolean correcto = true;
            String fLanz = null;
            
            
            
             if ((l.getIsbn().length() < 13) | (l.getIsbn().equals(" I.S.B.N"))) {
                e.setIsbncorto();
                correcto = false;
            } else if (l.getIsbn().length() > 13) {
                e.setIsbnlargo();
                correcto = false;
            } else if (!(l.getIsbn().matches("[0-9]+$"))){
                e.setIsbnincorrecto();
                correcto = false;
            } else {
                resultado = null;
                resultado = consultar("SELECT l.getIsbn() from libros where l.getIsbn()='"+ l.getIsbn() +"'");
                try{
                     if (resultado.next()) {
                         e.setLibroExiste();
                         correcto = false;
                    }
                }catch(SQLException ex){
                }
                cerrar();
            }      
             
            if ((l.getTitulo().length() == 0) | (l.getTitulo().equals(" Título"))) {
                e.setTitulocorto();
                correcto = false;
            } else if (l.getTitulo().length() > 100) {
                e.setTitulolargo();
                correcto = false;
            }
            
             if (l.getCant_paginas().equals(" Cantidad de páginas")) {
                e.setPocaspags();
                correcto = false;
            } else {
                if (!(l.getCant_paginas().matches("[0-9]+$"))){
                  e.setCantpagsincorrecto();
                    correcto = false;
                } else if (Integer.parseInt(l.getCant_paginas()) <= 0){
                   e.setPocaspags();
                   correcto = false;
              }
            }
             
            if (l.getPrecio().equals(" Precio ($)")) {
                e.setPrecioincorrecto();
                correcto = false;
            } else {
                if (!(l.getPrecio().matches("\\d+$"))){ //arreglar chequeo de punto decimal
                  e.setPrecioincorrecto();
                  System.err.println("aca");
                    correcto = false;
                } else if (Float.parseFloat(l.getPrecio()) < 0){
                   e.setPrecionegativo();
                   correcto = false;
              }
            }
            
             if (l.getFecha_lanzamiento() != null){
                fLanz = new SimpleDateFormat("dd'-'MMM'-'yyyy").format(l.getFecha_lanzamiento());
            } else {
                e.setFechaInvalida();
                correcto = false;
            }
             
            if (l.getAutor_id() >= 0) {
                l.setAutor_id(l.getAutor_id()+1);
            } else {
                e.setSinAutor();
                correcto = false;
            }
         if (correcto) {
            insertar("insert into libros(l.getIsbn(), l.getTitulo(), l.getCant_paginas(), l.getPrecio(), "
                    + "l.get_Fecha_lanzamiento(), resumen, primeras_paginas, autor_id, idioma_id)"
                    + "values('"+ l.getIsbn() +"', '"+l.getTitulo()+"',"+Integer.parseInt(l.getCant_paginas())+","
                    +l.getPrecio()+",'"+fLanz+"','"+l.getResumen()+"','"+l.getPrimeras_paginas()+"',"+l.getAutor_id()+","+l.getIdioma_id()+");");
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