/*
 * To change this license header; choose License Headers in Project Properties.
 * To change this template file; choose Tools | Templates
 * and open the template in the editor.
 */

package motor;

import excepciones.ErrorAutor;
import excepciones.ErrorLibro;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author asCii
 */
public class Libro{

 
    protected Etiquetas etiquetas;
    protected Integer id;
    protected String isbn;
    protected String titulo; 
    protected String cant_paginas; 
   protected String precio; 
   protected String fecha_lanzamiento; 
   protected String resumen = ""; 
  protected  String primeras_paginas;
  protected  Integer autor_id;
   protected Integer idioma_id;
   protected String urltapa = "/visual/imagen/Resource/TapaLibro.png";
   protected boolean existente;
   protected Autor autor;
    
    public Libro() {
        etiquetas = new Etiquetas();
    }

  
   public Libro (String isbn){
        existente = true;
        Conexion conexion = new Conexion();
        ResultSet resultado = null;  
        String sql = "SELECT libros.*, autores.nombre, autores.apellido, autores.pais_id, "
                + "autores.fecha_nacimiento, autores.sexo, autores.acerca_de from libros inner join "
                + "autores on libros.autor_id=autores.id where libros.isbn='"+isbn+"'";
        try {
            resultado = Operaciones.consultar(sql,conexion);
            if(resultado != null){
                this.id  = resultado.getInt("id");
                this.isbn = isbn;
                titulo = resultado.getString("titulo"); 
                cant_paginas = new Integer(resultado.getInt("cant_paginas")).toString();
                precio = new Float(resultado.getFloat("precio")).toString();
                fecha_lanzamiento = resultado.getString("fecha_lanzamiento");
                resumen = resultado.getString("resumen");
                primeras_paginas = resultado.getString("primeras_paginas");
                autor_id = resultado.getInt("autor_id");
                this.idioma_id = resultado.getInt("idioma_id");
                this.urltapa = resultado.getString("urltapa");
                if (resultado.getBytes("etiquetas") != null){
                ByteArrayInputStream bytes = new ByteArrayInputStream(resultado.getBytes("etiquetas"));
                ObjectInputStream in;
                try {
                    in = new ObjectInputStream(bytes);
                    etiquetas = (Etiquetas)in.readObject();
                } catch (        IOException | ClassNotFoundException ex) {
                    Logger.getLogger(Libro.class.getName()).log(Level.SEVERE, null, ex);
                }
                 } else {
                    etiquetas = new Etiquetas();
                }
                try {
                    this.autor = new Autor(resultado.getString("nombre"), resultado.getString("apellido"), resultado.getInt("pais_id"), new SimpleDateFormat("dd'-'MMM'-'yyyy").parse(resultado.getString("fecha_nacimiento")), resultado.getInt("sexo"), resultado.getString("acerca_de"));
               } catch (ErrorAutor | ParseException ex) {
                        Logger.getLogger(Operaciones.class.getName()).log(Level.SEVERE, null, ex);             
            }
            }
        }catch(SQLException e){
        }

        finally
     {
        Operaciones.cerrar(conexion);
     }
   }

    public Autor getAutor() {
        return autor;
    }

    public void setIsbn (String isbn) throws ErrorLibro {
         boolean correcto = true;
         ErrorLibro e = new ErrorLibro();
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
        if (correcto){
            this.isbn = isbn;
        }else {
            throw e;
        }     
        
    }

    public Integer getId() {
        return id;
    }

    public void setTitulo(String titulo) throws ErrorLibro {
         boolean correcto = true;
        ErrorLibro e = new ErrorLibro();
              if ((titulo.length() == 0) | (titulo.equals(" Título"))) {
                e.setTitulocorto();
                correcto = false;
            } else if (titulo.length() > 100) {
                e.setTitulolargo();
                correcto = false;
            }
        if (correcto){
            this.titulo = titulo;
        }else {
            throw e;
        }     
       
        
    }

    public Etiquetas getEtiquetas() {
        return etiquetas;
    }

    public void setCant_paginas(String cant_paginas) throws ErrorLibro {
         boolean correcto = true;
        ErrorLibro e = new ErrorLibro();
             if (cant_paginas.equals(" Cantidad de páginas")) {
                e.setPocaspags();
                correcto = false;
            } else {
                if (!(cant_paginas.matches("[0-9]+$"))){
                  e.setCantpagsincorrecto();
                    correcto = false;
                } else if (Integer.parseInt(cant_paginas) <= 0){
                   e.setPocaspags();
                   correcto = false;
              }
            }
        if (correcto){
            this.cant_paginas = cant_paginas;
        }else {
            throw e;
        }          
    }

    public void setPrecio(String precio) throws ErrorLibro {
        boolean correcto = true;
        ErrorLibro e = new ErrorLibro();
            if (precio.equals(" Precio ($)")) {
                e.setPrecioincorrecto();
                correcto = false;
            } else {
                precio = precio.replace(',', '.');
                try {
                    if (Float.parseFloat(precio) < 0){
                        e.setPrecionegativo();
                        correcto = false;
                    }
                } catch (NumberFormatException ex) {
                     e.setPrecioincorrecto();
                     correcto = false;
                }                                       
            }        
        if (correcto){
            this.precio = precio;
        }else {
            throw e;
        }          
    }

    public void setFecha_lanzamiento(Date fecha_lanzamiento) throws ErrorLibro {
            if (fecha_lanzamiento != null){
                this.fecha_lanzamiento = new SimpleDateFormat("dd'-'MMM'-'yyyy").format(fecha_lanzamiento);
            } else {
                ErrorLibro e = new ErrorLibro();
                e.setFechaInvalida();
                throw e;
            }             
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public void setPrimeras_paginas(String primeras_paginas) {
        this.primeras_paginas = primeras_paginas;
    }

    public void setIdioma_id(Integer idioma_id) {
       this.idioma_id = idioma_id + 1;
    }
    
     public Integer getIdioma_id() {
        return idioma_id;
    }
    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getCant_paginas() {
        return cant_paginas;
    }

    public String getPrecio() {
        return precio;
    }

    public Date getFecha_lanzamiento() {
        try {
            return new SimpleDateFormat("yyyy'-'MM'-'dd").parse(fecha_lanzamiento);
        } catch (ParseException ex) {
            try {
                return new SimpleDateFormat("dd'-'MMM'-'yyyy").parse(fecha_lanzamiento);
            } catch (ParseException ex1) {
                return null;
            }
        }
    }

    public String getResumen() {
        return resumen;
    }
    
    public String getUrlTapa(){
        return urltapa;
    }
    
    public void setUrlTapa(String s){
        if (s != null)
            this.urltapa=s;
        else
            this.urltapa = "/visual/imagen/Resource/TapaLibro.png";
    }

    public String getPrimeras_paginas() {
        return primeras_paginas;
    }



    public Integer getAutor_id() {
        return autor_id;
    }

  
     public void setAutor_id(Integer autor_id) throws ErrorLibro {
            if (autor_id >= 0) {
                this.autor_id = autor_id+1;
            } else {
                ErrorLibro e = new ErrorLibro();
                e.setSinAutor();
                throw e;
            }
        
    }
    
     public boolean agregar() throws ErrorLibro{
         boolean agregado = false;
         Conexion conexion = new Conexion();
          if   (isbn != null & titulo != null & cant_paginas != null & precio != null
                 & fecha_lanzamiento != null & autor_id != null & etiquetas.element() != null ){
                ResultSet resultado = Operaciones.consultar("SELECT * from libros where isbn='"+ this.isbn +"'", conexion);
                try{
                     if (resultado.next()) {
                         ErrorLibro e = new ErrorLibro();
                         Operaciones.cerrar(conexion);
                         e.setLibroExiste();
                         throw e;
                     } else {
                         Operaciones.cerrar(conexion);
                     }
                }catch(SQLException ex){
                }
                
                agregado = true;
                etiquetas.agregar();
                String query = "insert into libros(isbn, titulo, cant_paginas, precio, "
                + "fecha_lanzamiento, resumen, primeras_paginas, autor_id, idioma_id, urltapa, etiquetas)"
                + "values('"+ this.isbn +"', '"+this.titulo+"',"+Integer.parseInt(this.cant_paginas)+","
                +this.precio+",'"+this.fecha_lanzamiento+"','"+this.resumen+"','"+this.primeras_paginas+"',"+this.autor_id+","+this.idioma_id+",'"+this.urltapa+"', ?);";
                Operaciones.blob(query,this.etiquetas.toByteArray());
            } 
          return agregado;
     }
     
     public void modificar() throws ErrorLibro {
         
         if (existente){
             Conexion conexion = new Conexion();
              ResultSet resultado = null;
                resultado = Operaciones.consultar("SELECT * from libros where isbn='"+ this.isbn +"' and id<>'"+this.id+"'",conexion);
                try{
                     if (resultado.next()) {
                         ErrorLibro e = new ErrorLibro();
                         Operaciones.cerrar(conexion);
                         e.setLibroExiste();
                         throw e;
                     } else {
                         Operaciones.cerrar(conexion);
                     }
                }catch(SQLException ex){
                }
                
                 String query = "UPDATE libros SET isbn='"+ this.isbn +"', titulo='"+this.titulo+"', cant_paginas='"+Integer.parseInt(this.cant_paginas)+"', "
                 + "precio='"+this.precio+"', fecha_lanzamiento='"+this.fecha_lanzamiento+"', resumen='"+this.resumen+"', "
                 + "primeras_paginas='"+this.primeras_paginas+"', autor_id='"+this.autor_id+"', idioma_id='"+this.idioma_id+"', urltapa='"+this.urltapa+"', etiquetas= ? WHERE id='"+this.id+"';";
                Operaciones.blob(query,this.etiquetas.toByteArray());
         }
         
     }

     public void eliminar(){
         for(String e : etiquetas){
             etiquetas.remove(e);
         }
         Operaciones.insertar("DELETE FROM libros WHERE isbn='"+this.isbn+"';"); // Implementar borrado lógico
     }
}
