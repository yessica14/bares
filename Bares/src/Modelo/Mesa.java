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
public class Mesa {
private int nroMesa;
private int cantdePersonas;
private int total;
private ArrayList<Orden_de_Pedido> listapedido=new ArrayList();


    public Mesa(int nroMesa, int cantdePersonas) {
        this.nroMesa = nroMesa;
        this.cantdePersonas = cantdePersonas;
    }

    

    
    public void agregar(Orden_de_Pedido ped){
     listapedido.add(ped);
    }

    public int getNroMesa() {
        return nroMesa;
    }

    public void setNroMesa(int nroMesa) {
        this.nroMesa = nroMesa;
    }

    public int getCantdePersonas() {
        return cantdePersonas;
    }
     public ArrayList<Orden_de_Pedido> getListapedido() {
        return listapedido;
    }

    public void setListapedido(ArrayList<Orden_de_Pedido> listapedido) {
        this.listapedido = listapedido;
    }
    public void setCantdePersonas(int cantdePersonas) {
        this.cantdePersonas = cantdePersonas;
    }
    
    public void calcularcantdepedidos(Orden_de_Pedido orden){
     int acum=0;
        
     acum=(orden.getBebida().getPrecio() + orden.getPlato().getPrecio())*cantdePersonas;
        System.out.println("la cantidad comprada por esta mesa:"+acum);
        total=acum+total;
    }

    @Override
    public String toString() {
        return "Mesa{" + "nroMesa=" + nroMesa + ", cantdePersonas=" + cantdePersonas + '}';
    }

 


}
