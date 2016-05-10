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
public class Cafe_Solo implements Cafe{
    // Frio o Caliente F O C
    private char tipo; 
    // Nombre de Cafe
    private String nombre;
    // Precio base
    private float precio;

    public Cafe_Solo(char tipo, String nombre, float precio) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.precio = precio;
    }
   
    @Override
    public float precio() {
        return precio;
    }

    @Override
    public String ingredientes() {
        return nombre;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Cafe_Solo{" + "tipo=" + tipo + ", nombre=" + nombre + ", precio=" + precio + '}';
    }


    
    
    
}
