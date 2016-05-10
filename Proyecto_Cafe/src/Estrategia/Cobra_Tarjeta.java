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
public class Cobra_Tarjeta implements Cobrar {

    float monto_cobrar;

    public Cobra_Tarjeta(float monto) {
        this.monto_cobrar = monto;
    }

    @Override
    public boolean cobrar() {
        boolean cobrado = false;
        String contrasenia = JOptionPane.showInputDialog("Ingresa clave");
        if (!contrasenia.isEmpty()) {
            
            JOptionPane.showMessageDialog(null, "Usted ha recibido un descuento del 5% por utilizar su tarjeta"
                    + "\n Monto de Compra " + monto_cobrar + ""
                    + "\n Monto que usted paga " + monto_cobrar * 0.95);
            cobrado = true;
        }
        return cobrado;
    }

}
