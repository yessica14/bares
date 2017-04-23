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

private ArrayList <Plato>listadeplatos=new ArrayList();
private ArrayList<Bebida> listadebebidas=new ArrayList();
private int contplatos;
private int contbebidas;
private int acum;

private Mozo mozo;
private Fecha fecha;

    public Pedido() {
    }

    public Pedido(Mozo mozo, Fecha fecha) {
        this.mozo = mozo;
        this.fecha = fecha;
    }
    

    public ArrayList<Plato> getListadeplatos() {
        return listadeplatos;
    }

    public void setListadeplatos(ArrayList<Plato> listadeplatos) {
        this.listadeplatos = listadeplatos;
    }

    public ArrayList<Bebida> getListadebebidas() {
        return listadebebidas;
    }

    public void setListadebebidas(ArrayList<Bebida> listadebebidas) {
        this.listadebebidas = listadebebidas;
    }
    
    public void agregarPlato(Plato p){
        listadeplatos.add(p);
    }
    public void agregarBebida(Bebida b){
         listadebebidas.add(b);
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

    public int getAcum() {
        return acum;
    }

    public void setAcum(int acum) {
        this.acum = acum;
    }
    
    public void calcula(){
        for (Plato lp : listadeplatos) {
            contplatos=lp.getPrecio()+contplatos;
         }
        for (Bebida lb : listadebebidas) {
            contbebidas=lb.getPrecio()+contbebidas;
        }
        setAcum(contplatos+contbebidas);
        System.out.println("el acum: "+acum);
    }

    @Override
    public String toString() {
        return "Pedido{" + "listadeplatos=" + listadeplatos + ", listadebebidas=" + listadebebidas + ", contplatos=" + contplatos + ", contbebidas=" + contbebidas + ", acum=" + acum + ", mozo=" + mozo + ", fecha=" + fecha + '}';
    }

   

    
   



    
    
    

   

   

    
    
    
   

}
