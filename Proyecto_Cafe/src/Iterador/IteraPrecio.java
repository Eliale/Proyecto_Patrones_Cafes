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
public class IteraPrecio implements Iterador {

    private Lista_Cafes lista;
    private int contador;
    private float precio;
    // M para mayor que precio , m para menor que precio
    private char condicion;

    public IteraPrecio(Lista_Cafes lista, float precio, char condicion) {
        this.lista = lista;
        this.precio = precio;
        this.condicion = condicion;
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
        if (condicion == 'M') {
            if (cafe.getPrecio() >= precio) {
                return cafe;
            } else {
                return vacio;
            }
        }
        if (condicion == 'm') {
            if (cafe.getPrecio() <= precio) {
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
