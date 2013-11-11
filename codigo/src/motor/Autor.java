/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package motor;

import excepciones.ErrorAutor;
import java.util.Date;

/**
 *
 * @author asCii
 */
public class Autor {
    private String nombre;
    private String apellido;
    private Integer pais;
    private Date fechaNacimiento;
    private Integer sexo;
    private String informacion;

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Integer getPais() {
        return pais;
    }

    public Date getFechaNacimiento() {
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
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
        this.informacion = informacion;
    }
    

    
}
