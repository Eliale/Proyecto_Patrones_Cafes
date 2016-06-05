/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observador;

import java.util.Date;
import proyecto_cafe.Main;

/**
 *
 * @author Eli Salinas
 */
public class GranHermano implements Observador, MonitorElemento {

    private float costo_total, costo_unitario;
    private int cantidad;
    private String nombre;
    private Sujeto suj;

    public GranHermano(Sujeto sujeto) {
        this.suj = sujeto;
        sujeto.registraObservador(this);
    }

    @Override
    public void actualiza(float costo_total, float costo_unitario, int cantidad, String nombre) {
        this.costo_total = costo_total;
        this.costo_unitario = costo_unitario;
        this.cantidad = cantidad;
        this.nombre = nombre;
        Telepantalla();
    }

    @Override
    public void Telepantalla() {
        String cadena = ("Gran Hermano Informa :\n " + getFechaActual() + "\nCafe " + nombre + "\nCosto total " + costo_total + "\nCosto Unitario " + costo_unitario
                + "\nCantidad " + cantidad);

        Main.areaInforme.append(cadena + "\n");
    }

    private String getFechaActual() {
        return new Date().toString();
    }
}
