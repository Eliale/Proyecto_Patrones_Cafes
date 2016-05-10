/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iterador;

import Decorador.Cafe_Solo;

/**
 *
 * @author Eli
 */
public class IteraLista implements Iterador{
    private Lista_Cafes lista;
    private int contador;

    public IteraLista(Lista_Cafes lista) {
        this.lista = lista;
        contador = 0;
    }
    
    
    
    
    @Override
    public boolean hasNext() {
        return  contador < lista.size();
    }

    @Override
    public Cafe_Solo next() {
        return lista.get(contador++);
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
