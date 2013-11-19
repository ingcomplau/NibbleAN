/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package motor;

import java.util.LinkedList;

public class Compra {
  
    TipoLista tp;
    LinkedList<TipoLista> lista;

    public Compra() {
        this.lista = new LinkedList<>();
    }
    
    public void agregar(Libro l){
 //       if(ya esta en la lista)
 //           suma en uno cantidad
 //       else
            tp=new TipoLista();
            tp.setLibro(l);
            tp.setCantidad(1);
            lista.add(tp);     
    }
    
    
}
