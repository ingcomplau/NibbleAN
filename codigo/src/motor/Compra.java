/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package motor;

public class Compra {
    Libro libro;
    int cantidad;

    public Compra(Libro libro, int cantidad) {
        this.libro = libro;
        this.cantidad = cantidad;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (!(obj instanceof Compra))
            return false;
        if (this.libro == ((Compra)obj).libro){
            return true;
        } else {
            return false;
        }
    }
     
}
