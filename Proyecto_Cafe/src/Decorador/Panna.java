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
public class Panna extends Decorador_Cafe {

    public Panna(Cafe elemento) {
        super(elemento);
    }

    @Override
    public float precio() {
        return super.precio() + 2;
    }

    @Override
    public String ingredientes() {
        return super.ingredientes() + sep + "Panna";
    }
}
