/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package motor;

public class Carrito extends ListaCompras{

    public Carrito(Usuario usuario) {
        super(usuario);
    }
    
    public void comprar(){
        
        while (!this.isEmpty()){
            this.listIterator().next();
            Operaciones.insertar("insert into compras(usuario_id, libro_id, precio, fecha, cantidad) "
                    + "values('"+ usuario.getId() +"', '"+this.element().getLibro().getId()+"',"+this.element().getLibro().getPrecio()+","
                    +this.element().getFecha()+",'"+this.element().getCantidad()+"');"); 
            this.remove();
        }                     
    }
 
}
