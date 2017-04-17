/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Yessica-
 */
public class TipodeBebida {
private String nombre;
private int precio;

    public TipodeBebida(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }



    public String getNombre() {
        return nombre;
    }
    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "TipodeBebida{" + "nombre=" + nombre + ", precio=" + precio + '}';
    }


}
