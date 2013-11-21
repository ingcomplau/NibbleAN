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
public class ErrorUsuario extends ErrorPersona {

    private boolean loginInvalido;
    private boolean usuarioExistente;
    private boolean usuarioCorto;
    private boolean usuarioInvalido;
    private boolean usuarioLargo;
    private boolean claveCorta;
    private boolean telefonoInvalido;
    private boolean telefonoCorto;
    private boolean emailInvalido;
    
    public ErrorUsuario() {
        super();
        this.usuarioExistente = false;
        this.usuarioCorto = false;
        this.usuarioInvalido = false;
        this.usuarioLargo = false;
        this.claveCorta = false;
        this.telefonoInvalido = false;
        this.telefonoCorto = false;
        this.emailInvalido = false;
        this.loginInvalido = false;
        
    }

    public boolean isUsuarioLargo() {
        return usuarioLargo;
    }

    public void setUsuarioLargo() {
        this.usuarioLargo = true;
    }

    public boolean isLoginInvalido() {
        return loginInvalido;
    }

    public void setLoginInvalido() {
        this.loginInvalido = true;
    }

    public boolean isUsuarioExistente() {
        return usuarioExistente;
    }

    public void setUsuarioExistente() {
        this.usuarioExistente = true;
    }

    public boolean isUsuarioCorto() {
        return usuarioCorto;
    }

    public void setUsuarioCorto() {
        this.usuarioCorto = true;
    }

    public boolean isUsuarioInvalido() {
        return usuarioInvalido;
    }

    public void setUsuarioInvalido() {
        this.usuarioInvalido = true;
    }

    public boolean isClaveCorta() {
        return claveCorta;
    }

    public void setClaveCorta() {
        this.claveCorta = true;
    }

    public boolean isTelefonoInvalido() {
        return telefonoInvalido;
    }

    public void setTelefonoInvalido() {
        this.telefonoInvalido = true;
    }

    public boolean isTelefonoCorto() {
        return telefonoCorto;
    }

    public void setTelefonoCorto() {
        this.telefonoCorto = true;
    }

    public boolean isEmailInvalido() {
        return emailInvalido;
    }

    public void setEmailInvalido() {
        this.emailInvalido = true;
    }


}
