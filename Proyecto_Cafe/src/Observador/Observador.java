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
public interface Observador {
    public void actualiza(float costo_total,float costo_unitario,int cantidad, String nombre);
}
