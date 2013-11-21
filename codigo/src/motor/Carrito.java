/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package motor;

import java.util.LinkedList;

public class Carrito extends LinkedList<Compra>{

    @Override
    public boolean add(Compra e) { //Se fija si está el libro y si está solo suma la cantidad, si no lo agrega.
        if (this.contains(e)){
            int index = indexOf(e);
            e.cantidad = e.cantidad + this.get(index).cantidad;
            return true;
        } else {
           return super.add(e);
        }
    }

 
}
