/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package motor;

import excepciones.ErrorDireccion;
import excepciones.ErrorUsuario;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author asCii
 */
public class Direccion {
    private String calle;
    private String altura;
    private String localidad;
    private String codigoPostal;
    private Integer provincia;

    public Direccion(String usuario) throws ErrorUsuario {
        Conexion conexion = new Conexion();
        ResultSet resultado = null;  
        String sql = "SELECT * from usuarios where usuario='"+usuario+"'";
        try{
            resultado = Operaciones.consultar(sql,conexion);
            if (resultado != null & !resultado.next()) {
                Operaciones.cerrar(conexion);
                ErrorUsuario e = new ErrorUsuario();
                e.setUsuarioInvalido();
                throw e;
            } else {                
                this.calle  = resultado.getString("calle");
                this.altura =  new Integer(resultado.getInt("altura")).toString();
                this.localidad = resultado.getString("localidad");
                this.provincia = resultado.getInt("provincia_id");
                this.codigoPostal = new Integer(resultado.getInt("c_postal")).toString();  
                Operaciones.cerrar(conexion);
             }
            }catch(SQLException ex){
         }
    }

    public Direccion() {
        
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) throws ErrorDireccion {
          boolean correcto = true;
        ErrorDireccion e = new ErrorDireccion();
        
        if ((calle.length() == 0) | (calle.equals(" Calle"))) {
                e.setCalleCorta();
                correcto = false;
            } else if (calle.length() > 100) {
                e.setCalleLarga();
                correcto = false;
            } else if (!(calle.matches("[a-zA-Z0-9\\s]+$"))){
                e.setCalleInvalida();
                correcto = false;
            }
            
        if (correcto){
            this.calle = calle;
        }else {
            throw e;
        }          
        
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) throws ErrorDireccion{
         boolean correcto = true;
        ErrorDireccion e = new ErrorDireccion();
             if (altura.equals(" Altura")) {
                e.setAlturaIncorrecta();
                correcto = false;
            } else {
                if (!(altura.matches("[0-9]+$"))){
                  e.setAlturaIncorrecta();
                    correcto = false;
                } else if (Integer.parseInt(altura) <= 0){
                   e.setAlturaIncorrecta();
                   correcto = false;
              }
            }
        if (correcto){
            this.altura = altura;
        }else {
            throw e;
        }          
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) throws ErrorDireccion {
       boolean correcto = true;
        ErrorDireccion e = new ErrorDireccion();
        
        if ((localidad.length() == 0) | (localidad.equals(" Localidad"))) {
                e.setCalleCorta();
                correcto = false;
            } else if (localidad.length() > 100) {
                e.setCalleLarga();
                correcto = false;
            } else if (!(localidad.matches("[a-zA-Z0-9\\s]+$"))){
                e.setCalleInvalida();
                correcto = false;
            }
            
        if (correcto){
            this.localidad = localidad;
        }else {
            throw e;
        }          
        
    }
    

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) throws ErrorDireccion{
         boolean correcto = true;
        ErrorDireccion e = new ErrorDireccion();
             if (codigoPostal.equals(" Código postal")) {
                e.setAlturaIncorrecta();
                correcto = false;
            } else {
                if (!(codigoPostal.matches("[0-9]+$"))){
                  e.setAlturaIncorrecta();
                    correcto = false;
                } else if (Integer.parseInt(codigoPostal) <= 0){
                   e.setAlturaIncorrecta();
                   correcto = false;
              }
            }
        if (correcto){
           this.codigoPostal = codigoPostal;
        }else {
            throw e;
        }                  
    }

    public Integer getProvincia() {
        return provincia;
    }

    public void setProvincia(Integer provincia) {
        this.provincia = provincia + 1;
    }
    
    
}
