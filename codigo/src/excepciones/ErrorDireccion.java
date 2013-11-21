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
public class ErrorDireccion extends Throwable{
        private boolean alturaIncorrecta;
        private boolean alturaCorta;
        private boolean codigoIncorrecto;
        private boolean calleCorta;
        private boolean calleInvalida;
        private boolean calleLarga;
        private boolean localidadIncorrecta;
        private boolean localidadCorta;

   

    public ErrorDireccion() {
        this.alturaIncorrecta = false;
        this.codigoIncorrecto = false;
        this.calleCorta = false;
        this.localidadIncorrecta = false;
        this.localidadCorta = false;
        this.calleInvalida = false;
        this.calleLarga = false;
        this.alturaCorta = false;
    }

    public boolean isAlturaCorta() {
        return alturaCorta;
    }

    public void setAlturaCorta() {
        this.alturaCorta = true;
    }

    public boolean isCalleLarga() {
        return calleLarga;
    }

    public void setCalleLarga() {
        this.calleLarga = true;
    }

    public boolean isCalleInvalida() {
        return calleInvalida;
    }

    public void setCalleInvalida() {
        this.calleInvalida = true;
    }
    
 public boolean isLocalidadCorta() {
        return localidadCorta;
    }

    public void setLocalidadCorta() {
        this.localidadCorta = true;
    }
    public boolean isAlturaIncorrecta() {
        return alturaIncorrecta;
    }

    public void setAlturaIncorrecta() {
        this.alturaIncorrecta = true;
    }

    public boolean isCodigoIncorrecto() {
        return codigoIncorrecto;
    }

    public void setCodigoIncorrecto() {
        this.codigoIncorrecto = true;
    }

    public boolean isCalleCorta() {
        return calleCorta;
    }

    public void setCalleCorta() {
        this.calleCorta = true;
    }

    public boolean isLocalidadIncorrecta() {
        return localidadIncorrecta;
    }

    public void setLocalidadIncorrecta() {
        this.localidadIncorrecta = true;
    }


    
}


