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
    private boolean sinPais;
    private boolean fechaInvalida;
     private boolean sinSexo;
  
    
    public ErrorAutor() {
        this.autorExistente = false;
        this.nombreLargo = false;
        this.nombreCorto = false;
        this.nombreInvalido = false;
        this.apellidoLargo = false;
        this.apellidoCorto = false;
        this.apellidoInvalido = false;
        this.sinPais = false;
        this.fechaInvalida = false;
        this.sinSexo = false;
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

    public boolean isSinPais() {
        return sinPais;
    }

    public boolean isFechaInvalida() {
        return fechaInvalida;
    }

    public boolean isSinSexo() {
        return sinSexo;
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

    public void setSinPais() {
        this.sinPais = true;
    }

    public void setFechaInvalida() {
        this.fechaInvalida = true;
    }

    public void setSinSexo() {
        this.sinSexo = true;
    }
}
