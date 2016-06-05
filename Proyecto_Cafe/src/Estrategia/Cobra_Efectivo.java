/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estrategia;

import javax.swing.JOptionPane;
import proyecto_cafe.Main;

/**
 *
 * @author Eli
 */
public class Cobra_Efectivo implements Cobrar {

    float monto_cobrar;

    public Cobra_Efectivo(float monto) {
        this.monto_cobrar = monto;
    }

    @Override
    public boolean cobrar() {
        boolean cobrado = false;
        CobraEfectivoDialogo dialogo_c = new CobraEfectivoDialogo(null, true);
        CobraEfectivoDialogo.total = monto_cobrar;
        dialogo_c.setVisible(true);
        try {
            // float dinero_ingresado = Float.parseFloat(JOptionPane.showInputDialog("Ingresa efectivo"));
            float dinero_ingresado = dialogo_c.getDato();
            if (monto_cobrar <= dinero_ingresado) {
                float cambio = dinero_ingresado - monto_cobrar;
                cobrado = true;
                JOptionPane.showMessageDialog(null, "Su cambio es : " + cambio);
            } else {
                JOptionPane.showMessageDialog(null, "Dinero Insuficiente : ");
            }
        } catch (NumberFormatException e) {
        }
        return cobrado;
    }

}
