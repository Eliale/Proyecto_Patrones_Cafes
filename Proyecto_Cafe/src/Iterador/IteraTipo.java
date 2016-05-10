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
public class IteraTipo implements Iterador {

    private Lista_Cafes lista;
    private int contador;
    private char tipo;

    public IteraTipo(Lista_Cafes lista, char tipo) {
        this.lista = lista;
        this.tipo = tipo;
        contador = 0;
    }

    @Override
    public boolean hasNext() {
        return contador < lista.size();
    }

    @Override
    public Cafe_Solo next() {
        Cafe_Solo cafe = lista.get(contador++);
        
        Cafe_Solo vacio = new Cafe_Solo('V', "", 0);
        if (tipo == 'C') {
            if (cafe.getTipo()== tipo) {
                return cafe;
            } else {
                return vacio;
            }
        }
        if (tipo == 'F') {
            if (cafe.getTipo()== tipo) {
                return cafe;
            } else {
                return vacio;
            }
        } else {
            return vacio;
        }
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
