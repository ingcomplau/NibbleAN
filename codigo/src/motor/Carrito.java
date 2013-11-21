/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package motor;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Carrito extends ListaLibros{

    public Carrito(Usuario usuario) {
        super(usuario);
    }
    
    public void comprar(){
        String fechaDeHoy = (new SimpleDateFormat("dd'-'MMM'-'yyyy")).format(new Date());
        while (!this.isEmpty()){
            this.listIterator().next();
            Operaciones.insertar("insert into compras(usuario_id, libro_id, precio, fecha, cantidad) "
                    + "values('"+ usuario.getId() +"', '"+this.element().libro.getId()+"',"+this.element().libro.getPrecio()+","
                    +fechaDeHoy+",'"+this.element().cantidad+"');"); 
            this.remove();
        }                     
    }
 
}
