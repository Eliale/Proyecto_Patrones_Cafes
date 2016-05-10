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
public interface Iterador {
    public boolean hasNext();
    public Cafe_Solo next();
    public void remove();
}
