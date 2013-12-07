/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package motor;

import excepciones.ErrorAutor;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author asCii
 */
public class Autor {
    private String nombre;
    private String apellido;
    private Integer pais;
    private String fechaNacimiento;
    private Integer sexo;
    private String informacion;
    private Integer id;

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Integer getPais() {
        return pais;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public Integer getSexo() {
        return sexo;
    }

    public String getInformacion() {
        return informacion;
    }

    public Autor(String nombre, String apellido, Integer pais, Date fechaNacimiento, Integer sexo, String informacion) throws ErrorAutor {
        this.nombre = nombre;
        this.apellido = apellido;
        this.pais = pais + 1;
        this.fechaNacimiento = new SimpleDateFormat("dd'-'MMM'-'yyyy").format(fechaNacimiento);
        this.sexo = sexo;
        this.informacion = informacion;
    }
    
    public Autor(Integer id){
         ResultSet resultado = null; 
         Conexion conexion = new Conexion();
        String sql = "SELECT * from autores where id='"+id+"'";
        try {
            resultado = Operaciones.consultar(sql, conexion);
            if(resultado != null){
                this.id  = resultado.getInt("id");
                  this.nombre = resultado.getString("nombre");
                    this.apellido = resultado.getString("apellido");
                    this.pais = resultado.getInt("pais");
                    this.fechaNacimiento = resultado.getString("fecha_nacimiento");
                    this.sexo = resultado.getInt("sexo");
                    this.informacion = resultado.getString("acerca_de");                
            }
        }catch(SQLException e){
        }

        finally
     {
        Operaciones.cerrar(conexion);
     }
    }

    
}
