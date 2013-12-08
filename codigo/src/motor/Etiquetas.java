/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package motor;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author asCii
 */

public class Etiquetas extends LinkedList<String>{
    
    public byte[] toByteArray() {
        ByteArrayOutputStream stream = new ByteArrayOutputStream(); 
        try {
            ObjectOutputStream out = new ObjectOutputStream(stream);
            out.writeObject(this);
            stream.close();
        } catch (IOException ex) {
            Logger.getLogger(Etiquetas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return stream.toByteArray();
    }

    @Override
    public boolean add(String e) {
        Conexion conexion = new Conexion();
        ResultSet resultado = Operaciones.consultar("SELECT * from etiquetas where nombre='"+ e +"'", conexion);
        try{
             if (!resultado.next()) {
               Operaciones.insertar("insert into etiquetas (nombre) values ('"+e+"')");
            } else {
               Operaciones.insertar("update etiquetas set cant='"+(resultado.getInt("cant") + 1)+"' where nombre='"+e+"'");
             }
        Operaciones.cerrar(conexion);        
        } catch(SQLException ex){
        
        }
    return super.add(e);

    }

    @Override
    public boolean remove(Object o) {
        Conexion conexion = new Conexion();
        String e = (String) o;
        ResultSet resultado = Operaciones.consultar("SELECT * from etiquetas where nombre='"+ e +"'", conexion);
        try{
            if (resultado.getInt("cant") != 1) {
              Operaciones.insertar("update etiquetas set cant='"+(resultado.getInt("cant") - 1)+"' where nombre='"+e+"'");
          } else {
              Operaciones.insertar("DELETE FROM etiquetas WHERE nombre='"+e+"';");
            }
        Operaciones.cerrar(conexion);        
        } catch(SQLException ex){
            
        }
        return super.remove(o);
    }

    @Override
    public String remove() {
        //No hace nada
        return null;
    }

    @Override
    public String remove(int index) {
        //No hace nada
        return null; 
    }
    
    
    
    public void cargarTodas(){
        
    }
}
