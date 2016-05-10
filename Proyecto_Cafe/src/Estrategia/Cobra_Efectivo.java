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
public class Cobra_Efectivo implements Cobrar{
    
    float monto_cobrar;
    public Cobra_Efectivo(float monto) {
        this.monto_cobrar= monto;
    }
    
    
    @Override
    public boolean cobrar() {
        boolean cobrado = false;
        float dinero_ingresado = Float.parseFloat(JOptionPane.showInputDialog("Ingresa efectivo"));
        if(monto_cobrar <= dinero_ingresado){
            float cambio = dinero_ingresado - monto_cobrar;
            cobrado = true;
            JOptionPane.showMessageDialog(null, "Su cambio es : " + cambio );        
        } else{
            JOptionPane.showMessageDialog(null, "Dinero Insuficiente : " ); 
        }    
       return cobrado; 
    }
    
}
