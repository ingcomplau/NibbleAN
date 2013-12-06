/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package motor;

import java.util.LinkedList;

/**
 *
 * @author asCii
 */
public abstract class ListaCompras extends LinkedList<Compra>{
    Usuario usuario;
    
    public ListaCompras(Usuario usuario) {
        this.usuario = usuario;
    }

    
    @Override
    public boolean add(Compra e) { //Se fija si está el libro y si está solo suma la cantidad, si no lo agrega.
        if (this.contains(e)){
            int index = indexOf(e);
            this.get(index).setCantidad(e.getCantidad() + this.get(index).getCantidad()); ;
            return true;
        } else {
           return super.add(e);
        }
    }
}
