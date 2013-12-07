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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author asCii
 */
public class Usuario {
    private Integer id;
    private String nombre;
    private String usuario;
    private String fechaNacimiento;
    private String apellido;
    private String clave;
    private Direccion direccion;
    private String telefono;
    private String email;
    private Boolean administrador;
    private Boolean existente;

    public Usuario() {
    }

    public Usuario(String usuario, String clave) throws ErrorUsuario {
        existente = true;
        Conexion conexion = new Conexion();
        ResultSet resultado = null;  
        String sql = "SELECT * from usuarios where usuario='"+usuario+"' and clave='"+clave+"'";
        try{
            resultado = Operaciones.consultar(sql,conexion);
            if (resultado != null & !resultado.next()) {
                Operaciones.cerrar(conexion);
                ErrorUsuario e = new ErrorUsuario();
                e.setUsuarioInvalido();
                throw e;
            } else {                
                cargarDatos(resultado,conexion);
             }
            }catch(SQLException ex){
         }
    }
    
    
     protected Usuario(int usuarioId) {
         Conexion conexion = new Conexion();
        existente = true;
        ResultSet resultado = null;  
        String sql = "SELECT * from usuarios where usuario_id='"+usuarioId+"'";
        try{
            resultado = Operaciones.consultar(sql,conexion);
            if (resultado != null & !resultado.next()) {
                Operaciones.cerrar(conexion);
                ErrorUsuario e = new ErrorUsuario();
                e.setUsuarioInvalido();
            } else {                
                cargarDatos(resultado,conexion);
            }
            }catch(SQLException | ErrorUsuario ex){
                Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
     
    private void cargarDatos(ResultSet resultado,Conexion conexion) throws SQLException, ErrorUsuario{
                this.id  = resultado.getInt("id");
                this.usuario = resultado.getString("usuario");
                this.nombre =  resultado.getString("nombre");
                this.apellido = resultado.getString("apellido");
                this.fechaNacimiento = resultado.getString("fecha_nacimiento");
                this.telefono = resultado.getString("telefono");
                this.email = resultado.getString("email");
                this.clave = resultado.getString("clave");
                this.administrador = resultado.getBoolean("administrador");                
                Operaciones.cerrar(conexion);
                this.direccion = new Direccion(usuario);
 
    }
     
    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws ErrorUsuario {
        boolean correcto = true;
        ErrorUsuario e = new ErrorUsuario();
         if ((nombre.length() == 0) | (nombre.equals(" Nombre"))) {
                e.setNombreCorto();
                correcto = false;
            } else if (nombre.length() > 100) {
                e.setNombreLargo();
                correcto = false;
            } else if (!(nombre.matches("[a-zA-Z\\s]+$"))){
                e.setNombreInvalido();
                correcto = false;
            }
          if (correcto){
           this.nombre = nombre;
        }else {
            throw e;
        }                
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) throws ErrorUsuario {
        boolean correcto = true;
        ErrorUsuario e = new ErrorUsuario();
         if ((apellido.length() == 0) | (apellido.equals(" Apellido"))) {
                e.setApellidoCorto();
                correcto = false;
            } else if (apellido.length() > 100) {
                e.setApellidoLargo();
                correcto = false;
            } else if (!(apellido.matches("[a-zA-Z\\s]+$"))){
                e.setApellidoInvalido();
                correcto = false;
            }
          if (correcto){
           this.apellido = apellido;
        }else {
            throw e;
        }               
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) throws ErrorUsuario {
        boolean correcto = true;
        ErrorUsuario e = new ErrorUsuario();
         if ((usuario.length() <= 3) | (usuario.equals(" Nombre de usuario"))) {
                e.setUsuarioCorto();
                correcto = false;
            } else if (usuario.length() > 50) {
                e.setUsuarioLargo();
                correcto = false;
            } else if (!(usuario.matches("[a-zA-Z0-9]+$"))){
                e.setUsuarioInvalido();
                correcto = false;
            }
          if (correcto){
           this.usuario = usuario;
        }else {
            throw e;
        }               
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) throws ErrorUsuario {
        if (clave.length() < 4){
            ErrorUsuario e = new ErrorUsuario();
            e.setClaveCorta();
            throw e;
        } else {
            this.clave = clave;
        }
        
    }

    public Direccion getDireccion() {
        return direccion;
    }

  

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) throws ErrorUsuario {
        boolean correcto = true;
        ErrorUsuario e = new ErrorUsuario();
             if (telefono.equals(" Teléfono")) {
                e.setTelefonoCorto();
                correcto = false;
            } else {
                if (!(telefono.matches("[0-9]+$"))){
                  e.setTelefonoInvalido();
                    correcto = false;
                } else if (Integer.parseInt(telefono) <= 0){
                   e.setTelefonoInvalido();
                   correcto = false;
              }
            }
        if (correcto){
            this.telefono = telefono;
        }else {
            throw e;
        }          
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws ErrorUsuario{
         if (!(email.matches("^[_A-Za-z0-9-\\\\+]+(\\\\.[_A-Za-z0-9-]+)*\n"
                 + "@[A-Za-z0-9-]+(\\\\.[A-Za-z0-9]+)*(\\\\.[A-Za-z]{2,})$"))) {
                ErrorUsuario e = new ErrorUsuario();
                e.setEmailInvalido();
                throw e;
            } else {
             this.email = email;
         }        
    }

    public Boolean isAdministrador() {
        return administrador;
    }
    
         public void setCalle(String calle) throws ErrorDireccion {
          direccion.setCalle(calle);
    }
  
    public void setAltura(String altura) throws ErrorDireccion{
         direccion.setAltura(altura);
    }

   
    public void setLocalidad(String localidad) throws ErrorDireccion {
      direccion.setLocalidad(localidad);
    }
    

    public void setCodigoPostal(String codigoPostal) throws ErrorDireccion{
         direccion.setCodigoPostal(codigoPostal);
    }

  
    public void setProvincia(Integer provincia) {
      direccion.setProvincia(provincia);
    }

     public void modificar() {
         if (existente){ 
                Operaciones.insertar("UPDATE usuarios SET nombre='"+ this.nombre +"', apellido='"+this.apellido+"', clave='"+this.clave+"', "
                 + "altura='"+direccion.getAltura()+"', provincia_id='"+direccion.getProvincia()+"', c_postal='"+direccion.getCodigoPostal()+"', "
                 + "calle='"+direccion.getCalle()+"', telefono='"+this.telefono+"', email='"+this.email+"', localidad='"+direccion.getLocalidad()+"' WHERE id='"+this.id+"';");
         }
         
     }
    

    
    
                            
}
