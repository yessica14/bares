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
public class Bebida {
    private int cod;
private String nombre;
private int precio;
private String prec;

    public Bebida(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    public Bebida(String nombre, String prec){
        this.nombre=nombre;
        this.prec=prec;
    }
    
    public Bebida(){
        
    }
    

    public Bebida(int cod, String nombre, String prec) {
        this.cod = cod;
        this.nombre = nombre;
        this.prec = prec;
    }

    public String getPrec() {
        return prec;
    }

    public void setPrec(String prec) {
        this.prec = prec;
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
