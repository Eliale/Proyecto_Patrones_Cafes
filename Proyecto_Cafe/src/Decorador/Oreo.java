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
public class Oreo extends Decorador_Cafe {

    public Oreo(Cafe elemento) {
        super(elemento);
    }

    @Override
    public float precio() {
        return super.precio() + 10;
    }

    @Override
    public String ingredientes() {
        return super.ingredientes() + sep + "Oreo";
    }
}
