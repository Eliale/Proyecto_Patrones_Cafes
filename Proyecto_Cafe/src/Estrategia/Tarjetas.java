/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estrategia;

/**
 *
 * @author Eli
 */
public class Tarjetas extends  CobrarCafes{

    public Tarjetas(float monto_cobrar) {
        super(monto_cobrar);
        fijar_solucion();
    }

    
    
    
    @Override
    public void fijar_solucion() {
        cobrar = new Cobra_Tarjeta(monto_cobrar);
    }
    
    
}
