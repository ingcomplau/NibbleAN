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
public class ErrorAutor extends ErrorPersona{
    private boolean fechaInvalida;
  
    
    public ErrorAutor() {
        super();
        this.fechaInvalida = false;
    }

    public boolean isAutorExistente() {
        return super.isPersonaExistente();
    }
    


    public boolean isFechaInvalida() {
        return fechaInvalida;
    }


    
      public void setAutorExistente() {
        super.setPersonaExistente();
    }



    public void setFechaInvalida() {
        this.fechaInvalida = true;
}


}
