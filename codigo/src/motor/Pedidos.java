/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package motor;

import java.sql.ResultSet;
import java.sql.SQLException;
import static motor.Operaciones.consultar;

/**
 *
 * @author asCii
 */
public class Pedidos extends ListaLibros {
       
    public Pedidos(Usuario usuario) { //Terminar pedidos
        super(usuario);
        ResultSet resultado;
        if (usuario != null){
            resultado = null;  
            String sql = "SELECT a.isbn,a.titulo, from libros a INNER JOIN autores b on a.autor_id=b.id order by a.titulo";
           try {
            resultado = consultar(sql);
            if(resultado != null){
                int numeroColumna = resultado.getMetaData().getColumnCount();              
                while(resultado.next()){
                    for(int i = 1;i <= numeroColumna;i++){
                        this.add((Compra)resultado.getObject(i));
                    }
                }
            }
        }catch(SQLException e){
        }

        finally{
            Operaciones.cerrar();
               }
        } else {
            
        }
    }
    
}
