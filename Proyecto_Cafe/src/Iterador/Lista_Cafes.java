/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iterador;

import Decorador.Cafe_Solo;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Eli
 */
public class Lista_Cafes {

    private ArrayList<Cafe_Solo> array_cafes;

    public Lista_Cafes() {
        array_cafes = new ArrayList<>();
    }

    public void add(Cafe_Solo cafe) {
        array_cafes.add(cafe);
    }

    public void mostrar(Iterador it) {
        while (it.hasNext()) {
            System.out.println(it.next().toString());
        }
    }

    public DefaultTableModel modelo_tabla(Iterador it) {
        DefaultTableModel modelo;
        String[] titulos = {"Tipo", "Nombre", "Costo"};
        String[] registros = new String[3];
        modelo = new DefaultTableModel(null, titulos);

        while (it.hasNext()) {
            Cafe_Solo temp = it.next();
            if (temp.getTipo() != 'V') { // Checa que no sea un vacio

                registros[0] = temp.getTipo() + "";
                registros[1] = temp.getNombre();
                registros[2] = temp.getPrecio() + "";
                modelo.addRow(registros);
            }
        }
        return modelo;
    }

    public DefaultComboBoxModel modelo_combo(IteraTipo it) {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        while (it.hasNext()) {
            Cafe_Solo temp = it.next();
            if (temp.getTipo() != 'V') {
                modelo.addElement(temp.getNombre());
            }
        }
        return modelo;
    }

    public int size() {
        return array_cafes.size();
    }

    public Cafe_Solo get(int indice) {
        return array_cafes.get(indice);
    }

    public Float get_precio(String nombre, Iterador it) {
        float precio = 0;
        while (it.hasNext()) {
            Cafe_Solo temp = it.next();
            if (temp.getNombre().equalsIgnoreCase(nombre)) {
                precio = temp.getPrecio();
            }
        }
        return precio;
    }

    public Cafe_Solo get_elegido(String nombre, Iterador it) {
        // Imaginar que no existe
        Cafe_Solo elegido = new Cafe_Solo('V', "", 0);
        while (it.hasNext()) {
            Cafe_Solo temp = it.next();
         
            if (temp.getNombre().equalsIgnoreCase(nombre)) {
                elegido = temp;
                 
            }
        }
        System.out.println("Regreso " + elegido.getNombre());
        return elegido;     
    }

}
