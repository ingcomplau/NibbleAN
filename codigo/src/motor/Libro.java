/*
 * To change this license header; choose License Headers in Project Properties.
 * To change this template file; choose Tools | Templates
 * and open the template in the editor.
 */

package motor;

import excepciones.ErrorLibro;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author asCii
 */
public class Libro{

 

    private Integer id;
    private String isbn;
    private String titulo; 
    private String cant_paginas; 
   private String precio; 
   private String fecha_lanzamiento; 
   private String resumen; 
  private  String primeras_paginas;
  private  Integer autor_id;
   private Integer idioma_id;
   private String urltapa;
   private boolean existente;

    public Libro() {
    }

  
   public Libro (String isbn){
        existente = true;
        ResultSet resultado = null;  
        String sql = "SELECT * from libros where isbn='"+isbn+"'";
        try {
            resultado = Operaciones.consultar(sql);
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
                
                        
                
            }
        }catch(SQLException e){
        }

        finally
     {
        Operaciones.cerrar();
     }
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
                if (!(precio.matches("\\d+$"))){ //arreglar chequeo de punto decimal
                  e.setPrecioincorrecto();
                    correcto = false;
                } else if (Float.parseFloat(precio) < 0){
                   e.setPrecionegativo();
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
        this.urltapa=s;
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
          if   (isbn != null & titulo != null & cant_paginas != null & precio != null
                 & fecha_lanzamiento != null & autor_id != null ){
              System.out.println(2);
                ResultSet resultado = null;
                resultado = Operaciones.consultar("SELECT * from libros where isbn='"+ this.isbn +"'");
                try{
                     if (resultado.next()) {
                         ErrorLibro e = new ErrorLibro();
                         Operaciones.cerrar();
                         e.setLibroExiste();
                         throw e;
                     } else {
                         Operaciones.cerrar();
                     }
                }catch(SQLException ex){
                }
                
                agregado = true;
                if (urltapa!=null){
                     Operaciones.insertar("insert into libros(isbn, titulo, cant_paginas, precio, "
                    + "fecha_lanzamiento, resumen, primeras_paginas, autor_id, idioma_id, urltapa)"
                    + "values('"+ this.isbn +"', '"+this.titulo+"',"+Integer.parseInt(this.cant_paginas)+","
                    +this.precio+",'"+this.fecha_lanzamiento+"','"+this.resumen+"','"+this.primeras_paginas+"',"+this.autor_id+","+this.idioma_id+",'"+this.urltapa+"');");
                } else {
                     Operaciones.insertar("insert into libros(isbn, titulo, cant_paginas, precio, "
                    + "fecha_lanzamiento, resumen, primeras_paginas, autor_id, idioma_id)"
                    + "values('"+ this.isbn +"', '"+this.titulo+"',"+Integer.parseInt(this.cant_paginas)+","
                    +this.precio+",'"+this.fecha_lanzamiento+"','"+this.resumen+"','"+this.primeras_paginas+"',"+this.autor_id+","+this.idioma_id+");");
                }
               
            } 
          return agregado;
     }
     
     public void modificar() throws ErrorLibro {
         if (existente){
              ResultSet resultado = null;
                resultado = Operaciones.consultar("SELECT * from libros where isbn='"+ this.isbn +"' and id<>'"+this.id+"'");
                try{
                     if (resultado.next()) {
                         ErrorLibro e = new ErrorLibro();
                         Operaciones.cerrar();
                         e.setLibroExiste();
                         throw e;
                     } else {
                         Operaciones.cerrar();
                     }
                }catch(SQLException ex){
                }
                
                Operaciones.insertar("UPDATE libros SET isbn='"+ this.isbn +"', titulo='"+this.titulo+"', cant_paginas='"+Integer.parseInt(this.cant_paginas)+"', "
                 + "precio='"+this.precio+"', fecha_lanzamiento='"+this.fecha_lanzamiento+"', resumen='"+this.resumen+"', "
                 + "primeras_paginas='"+this.primeras_paginas+"', autor_id='"+this.autor_id+"', idioma_id='"+this.idioma_id+"' WHERE id='"+this.id+"';");
         }
         
     }

     public void eliminar(){
         Operaciones.insertar("DELETE FROM libros WHERE isbn='"+this.isbn+"';");
     }
}
