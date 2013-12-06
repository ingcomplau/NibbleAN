/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package motor;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Compra {
    private final Libro libro;
    private int cantidad;
    private Float precio;
    private String estado;
    private final String fecha;
    private final int usuarioId;

    protected Compra(int usuarioID, Libro libro, int cantidad, String estado, String fecha) {
        this.usuarioId = usuarioID;
        this.libro = libro;
        this.cantidad = cantidad;
        this.precio = Float.parseFloat(libro.getPrecio())*cantidad;
        this.estado = estado;
        this.fecha = fecha;
    }

    public Compra(Usuario usuario, Libro libro, int cantidad) {
        this.usuarioId = usuario.getId();
        this.libro = libro;
        this.cantidad = cantidad;
        this.precio = Float.parseFloat(libro.getPrecio())*cantidad;
        this.estado = "PENDIENTE";
        this.fecha = (new SimpleDateFormat("dd'-'MMM'-'yyyy")).format(new Date());
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
        this.precio = Float.parseFloat(libro.getPrecio())*cantidad;
    }
    
    public Usuario getUsuario(){
        return new Usuario(usuarioId);
    }
    
    public Libro getLibro() {
        return libro;
    }

    public int getCantidad() {
        return cantidad;
    }

    public Float getPrecio() {
        return precio;
    }

    public String getEstado() {
        return estado;
    }

    public String getFecha() {
        return fecha;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    
    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (!(obj instanceof Compra))
            return false;
        return (this.libro == ((Compra)obj).libro) & (this.fecha.equals(((Compra)obj).fecha));
    }
     
}
