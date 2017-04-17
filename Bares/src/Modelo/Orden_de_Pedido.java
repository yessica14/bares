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
public class Orden_de_Pedido {
private TipodeBebida bebida;
private Plato plato;
 private Mesero mesero;
 
 private Fecha fecha;

    public Orden_de_Pedido(Mesero mesero, Fecha fecha) {
        this.mesero = mesero;
        this.fecha = fecha;
    }
    
    
    

    public TipodeBebida getBebida() {
        return bebida;
    }

    public void setBebida(TipodeBebida bebida) {
        this.bebida = bebida;
    }

    public Plato getPlato() {
        return plato;
    }

    public void setPlato(Plato plato) {
        this.plato = plato;
    }
 
 

   

    
    
    
    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }
 
 

    public Mesero getMesero() {
        return mesero;
    }

}
