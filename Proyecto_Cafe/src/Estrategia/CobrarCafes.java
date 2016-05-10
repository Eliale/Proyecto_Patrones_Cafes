/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estrategia;

import javax.swing.JOptionPane;

/**
 *
 * @author Eli
 */
public abstract class CobrarCafes {
    float monto_cobrar;
    Cobrar cobrar;

    public CobrarCafes(float monto_cobrar) {
        this.monto_cobrar = monto_cobrar;
    }
    
    
    public abstract void fijar_solucion();
    
        public void mostrar_pago() {
        boolean acepta = cobrar.cobrar();
        if(acepta == true){
            JOptionPane.showMessageDialog(null,"Exito en el cobro");
        }else{
            JOptionPane.showMessageDialog(null,"Error en el cobro");
        }

    }
}
