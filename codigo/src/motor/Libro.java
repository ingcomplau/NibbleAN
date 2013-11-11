/*
 * To change this license header; choose License Headers in Project Properties.
 * To change this template file; choose Tools | Templates
 * and open the template in the editor.
 */

package motor;

import java.util.Date;

/**
 *
 * @author asCii
 */
public class Libro {


    private String isbn;
    private String titulo; 
    private String cant_paginas; 
   private String precio; 
   private Date fecha_lanzamiento; 
   private String resumen; 
  private  String primeras_paginas;
  private  Autor autor; 

    public void setAutor_id(Integer autor_id) {
        this.autor_id = autor_id;
    }
  private  Integer autor_id;
   private Integer idioma_id;

   public Libro(String isbn, String titulo, String cant_paginas, String precio, Date fecha_lanzamiento, String resumen, String primeras_paginas, Integer autor_id, Integer idioma_id) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.cant_paginas = cant_paginas;
        this.precio = precio;
        this.fecha_lanzamiento = fecha_lanzamiento;
        this.resumen = resumen;
        this.primeras_paginas = primeras_paginas;
        this.autor_id = autor_id;
        this.idioma_id = idioma_id + 1;
    }
    public Libro(String isbn, String titulo, String cant_paginas, String precio, Date fecha_lanzamiento, String resumen, String primeras_paginas, Autor autor, Integer idioma_id) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.cant_paginas = cant_paginas;
        this.precio = precio;
        this.fecha_lanzamiento = fecha_lanzamiento;
        this.resumen = resumen;
        this.primeras_paginas = primeras_paginas;
        this.autor = autor;
        this.idioma_id = idioma_id + 1;
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
        return fecha_lanzamiento;
    }

    public String getResumen() {
        return resumen;
    }

    public String getPrimeras_paginas() {
        return primeras_paginas;
    }

    public Autor getAutor() {
        return autor;
    }

    public Integer getAutor_id() {
        return autor_id;
    }

    public Integer getIdioma_id() {
        return idioma_id;
    }
}
