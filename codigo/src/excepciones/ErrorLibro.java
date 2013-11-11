/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package excepciones;

/**
 *
 * @author asCii
 */
public class ErrorLibro extends Throwable{
    private boolean isbnlargo = false;
    private boolean isbncorto = false;
    private boolean isbnincorrecto = false;
    private boolean titulolargo = false;
    private boolean titulocorto = false;
    private boolean cantpagsincorrecto = false;
    private boolean pocaspags = false;
    private boolean precioincorrecto = false;
    private boolean precionegativo = false;
    private boolean sinAutor = false;
    private boolean fechaInvalida = false;
    
    public ErrorLibro() {
        
    }

    public void setFechaInvalida() {
        this.fechaInvalida = true;
    }

    public boolean isIsbnlargo() {
        return isbnlargo;
    }

    public void setIsbnlargo() {
        this.isbnlargo = true;
    }

    public boolean isIsbncorto() {
        return isbncorto;
    }

    public boolean isFechaInvalida() {
        return fechaInvalida;
    }

    public void setIsbncorto() {
        this.isbncorto = true;
    }

    public boolean isIsbnincorrecto() {
        return isbnincorrecto;
    }

    public void setIsbnincorrecto() {
        this.isbnincorrecto = true;
    }

    public boolean isTitulolargo() {
        return titulolargo;
    }

    public void setTitulolargo() {
        this.titulolargo = true;
    }

    public boolean isTitulocorto() {
        return titulocorto;
    }

    public void setTitulocorto() {
        this.titulocorto = true;
    }

    public boolean isCantpagsincorrecto() {
        return cantpagsincorrecto;
    }

    public void setCantpagsincorrecto() {
        this.cantpagsincorrecto = true;
    }

    public boolean isPocaspags() {
        return pocaspags;
    }

    public void setPocaspags() {
        this.pocaspags = true;
    }

    public boolean isPrecioincorrecto() {
        return precioincorrecto;
    }

    public void setPrecioincorrecto() {
        this.precioincorrecto = true;
    }

    public boolean isPrecionegativo() {
        return precionegativo;
    }

    public void setPrecionegativo() {
        this.precionegativo = true;
    }

    public boolean isSinAutor() {
        return sinAutor;
    }

    public void setSinAutor() {
        this.sinAutor = true;
    }


}
