/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorador;

/**
 *
 * @author Eli
 */
public abstract class Decorador_Cafe implements Cafe {

    protected Cafe elemento;
    protected String sep = " con ";

    public Decorador_Cafe(Cafe elemento) {
        this.elemento = elemento;
    }

    @Override
    public float precio() {
        return elemento.precio();
    }

    @Override
    public String ingredientes() {
        return elemento.ingredientes();
    }

}
