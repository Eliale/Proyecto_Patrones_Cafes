/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Observador;

/**
 *
 * @author Eli Salinas
 */
public interface Sujeto {
    public void registraObservador(Observador o);
    public void remueveObservador(Observador o);
    public void notificaObservadores();
}
