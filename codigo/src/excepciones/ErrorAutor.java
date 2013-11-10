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
public class ErrorAutor extends Throwable{

    private boolean autorExistente;
    private boolean nombreLargo;
    private boolean nombreCorto;
    private boolean nombreInvalido;
    private boolean apellidoLargo;
    private boolean apellidoCorto;
    private boolean apellidoInvalido;
    private boolean fechaInvalida;
  
    
    public ErrorAutor() {
        this.autorExistente = false;
        this.nombreLargo = false;
        this.nombreCorto = false;
        this.nombreInvalido = false;
        this.apellidoLargo = false;
        this.apellidoCorto = false;
        this.apellidoInvalido = false;
        this.fechaInvalida = false;
    }

    public boolean isAutorExistente() {
        return autorExistente;
    }

    public boolean isNombreLargo() {
        return nombreLargo;
    }

    public boolean isNombreCorto() {
        return nombreCorto;
    }

    public boolean isNombreInvalido() {
        return nombreInvalido;
    }

    public boolean isApellidoLargo() {
        return apellidoLargo;
    }

    public boolean isApellidoCorto() {
        return apellidoCorto;
    }

    public boolean isApellidoInvalido() {
        return apellidoInvalido;
    }



    public boolean isFechaInvalida() {
        return fechaInvalida;
    }


    
      public void setAutorExistente() {
        this.autorExistente = true;
    }

    public void setNombreLargo() {
        this.nombreLargo = true;
    }

    public void setNombreCorto() {
        this.nombreCorto = true;
    }

    public void setNombreInvalido() {
        this.nombreInvalido = true;
    }

    public void setApellidoLargo() {
        this.apellidoLargo = true;
    }

    public void setApellidoCorto() {
        this.apellidoCorto = true;
    }

    public void setApellidoInvalido() {
        this.apellidoInvalido = true;
    }



    public void setFechaInvalida() {
        this.fechaInvalida = true;
    }


}
