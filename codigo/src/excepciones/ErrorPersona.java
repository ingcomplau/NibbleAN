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
public class ErrorPersona extends Throwable {
    protected boolean apellidoCorto;
    protected boolean apellidoInvalido;
    protected boolean apellidoLargo;
    protected boolean nombreCorto;
    protected boolean nombreInvalido;
    protected boolean nombreLargo;
    protected boolean personaExistente;

    public ErrorPersona() {
        this.personaExistente = false;
        this.nombreLargo = false;
        this.nombreCorto = false;
        this.nombreInvalido = false;
        this.apellidoLargo = false;
        this.apellidoCorto = false;
        this.apellidoInvalido = false;
    }

    public boolean isPersonaExistente() {
        return personaExistente;
    }

    public void setPersonaExistente() {
        this.personaExistente = true;
    }

    public boolean isApellidoCorto() {
        return apellidoCorto;
    }

    public boolean isApellidoInvalido() {
        return apellidoInvalido;
    }

    public boolean isApellidoLargo() {
        return apellidoLargo;
    }

    public boolean isNombreCorto() {
        return nombreCorto;
    }

    public boolean isNombreInvalido() {
        return nombreInvalido;
    }

    public boolean isNombreLargo() {
        return nombreLargo;
    }

    public void setApellidoCorto() {
        this.apellidoCorto = true;
    }

    public void setApellidoInvalido() {
        this.apellidoInvalido = true;
    }

    public void setApellidoLargo() {
        this.apellidoLargo = true;
    }

    public void setNombreCorto() {
        this.nombreCorto = true;
    }

    public void setNombreInvalido() {
        this.nombreInvalido = true;
    }

    public void setNombreLargo() {
        this.nombreLargo = true;
    }
    
}
