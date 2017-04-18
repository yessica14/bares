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
public class Bares {
private Integer id_bar;
private String nombre;

    public Bares() {
    }

    public Integer getId_bar() {
        return id_bar;
    }

    public void setId_bar(Integer id_bar) {
        this.id_bar = id_bar;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Bares{" + "id_bar=" + id_bar + ", nombre=" + nombre + '}';
    }



    
}
