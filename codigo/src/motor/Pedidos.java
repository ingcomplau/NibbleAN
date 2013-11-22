/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package motor;

import java.sql.ResultSet;
import java.sql.SQLException;
import static motor.Operaciones.consultar;
import static motor.Operaciones.cerrar;

/**
 * Recibe en el constructor un usuario o null. Si recibe un usuario se vuelve una lista de los
 * libros comprados por ese usuario. Si recibe null se vuelve una lista de los libros comprados por todos los usuarios.
 * Para obtener los datos de cada compra de la lista, recurrir a los métodos de la clase Compra.
 * @author asCii
 */
public class Pedidos extends ListaCompras {
     
      public Pedidos(Usuario usuario) { 
        super(usuario);
        ResultSet resultado;
        if (usuario != null){
            resultado = null;  
            String sql = "SELECT * FROM Libros INNER JOIN Compras ON Libros.id=compras.libro_id where compras.usuario_id='"+usuario.getId()+"'";
           try {
            resultado = consultar(sql);
            if(resultado != null){
                Libro libaux;
                while(resultado.next()){
                    libaux = cargarLibro(resultado);
                    this.add(new Compra(usuario.getId(), libaux, resultado.getInt("compras.cantidad"),resultado.getString("estado"),resultado.getString("fecha")));
                }
            }
        }catch(SQLException e){
        }

        finally{
            cerrar();
               }
        } else {
            resultado = null;  
            String sql = "SELECT * FROM Libros INNER JOIN Compras ON Libros.id=compras.libro_id";
           try {
            resultado = consultar(sql);
            if(resultado != null){
                Libro libaux;
                while(resultado.next()){
                    libaux = cargarLibro(resultado);
                    this.add(new Compra(resultado.getInt("compras.usuario_id"), libaux, resultado.getInt("compras.cantidad"),resultado.getString("estado"),resultado.getString("fecha")));
                }
            }
        }catch(SQLException e){
        }

        finally{
            cerrar();
               }
        }
    }
    
    private Libro cargarLibro(ResultSet resultado){
          Libro libaux = new Libro();
          try {
              libaux.id  = resultado.getInt("libros.id");
              libaux.isbn = resultado.getString("libros.isbn");
              libaux.titulo = resultado.getString("libros.titulo"); 
              libaux.cant_paginas = new Integer(resultado.getInt("libros.cant_paginas")).toString();
              libaux.precio = new Float(resultado.getFloat("libros.precio")).toString();
              libaux.fecha_lanzamiento = resultado.getString("libros.fecha_lanzamiento");
              libaux.resumen = resultado.getString("libros.resumen");
              libaux.primeras_paginas = resultado.getString("libros.primeras_paginas");
              libaux.autor_id = resultado.getInt("libros.autor_id");
              libaux.idioma_id = resultado.getInt("libros.idioma_id");
              libaux.urltapa = resultado.getString("libros.urltapa");
              return libaux;
          } catch (SQLException ex) {
             return null;
          }
                  
        }
    
}
