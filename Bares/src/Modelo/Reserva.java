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
public class Reserva {
private int nroReserva;
private Mesa mesa;
private Cliente cliente;
private int cantdepersonas;
private Fecha fecha;

    public Reserva() {
    }

    
    


    public Reserva(int nroReserva, Mesa mesa, Cliente cliente, int cantdepersonas, Fecha fecha) {
        this.nroReserva = nroReserva;
        this.mesa = mesa;
        this.cliente = cliente;
        this.cantdepersonas = cantdepersonas;
        this.fecha = fecha;
    }



    public int getNroReserva() {
        return nroReserva;
    }

    public void setNroReserva(int nroReserva) {
        this.nroReserva = nroReserva;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getCantdepersonas() {
        return cantdepersonas;
    }

    public void setCantdepersonas(int cantdepersonas) {
        this.cantdepersonas = cantdepersonas;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Reserva{" + "nroReserva=" + nroReserva + ", mesa=" + mesa + ", cliente=" + cliente + ", cantdepersonas=" + cantdepersonas + ", fecha=" + fecha + '}';
    }



}
