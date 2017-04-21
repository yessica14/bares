/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Yessica-
 */
public class Pedido {
private Bebida bebida;
private Plato plato;
private int cantpersonas;
private Mozo mozo;
private Fecha fecha;

    public Pedido() {
    }

    public Pedido(Bebida bebida, Plato plato, int cantpersonas, Mozo mozo, Fecha fecha) {
        this.bebida = bebida;
        this.plato = plato;
        this.cantpersonas = cantpersonas;
        this.mozo = mozo;
        this.fecha = fecha;
    }
    

    public Bebida getBebida() {
        return bebida;
    }

    public void setBebida(Bebida bebida) {
        this.bebida = bebida;
    }

    public Plato getPlato() {
        return plato;
    }

    public void setPlato(Plato plato) {
        this.plato = plato;
    }

    public int getCantpersonas() {
        return cantpersonas;
    }

    public void setCantpersonas(int cantpersonas) {
        this.cantpersonas = cantpersonas;
    }


    public Mozo getMozo() {
        return mozo;
    }

    public void setMozo(Mozo mozo) {
        this.mozo = mozo;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Orden_de_Pedido{" + "bebida=" + bebida + ", plato=" + plato + ", cantpersonas=" + cantpersonas + ", mozo=" + mozo + ", fecha=" + fecha + '}';
    }

   



    
    
    

   

   

    
    
    
   

}
