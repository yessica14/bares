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
private ArrayList<Pedido> listadepedido=new ArrayList();
private String estado;
private int total;
private int sum=0;
private Fecha fec;  //esto es para la fecha consultada
private int gastos=0;
private int cm;



    public Mesa(int nroMesa, Fecha fec) {
        this.nroMesa = nroMesa;
        this.fec = fec;
    }

    public Mesa(int nroMesa, String estado, Fecha fec) {
        this.nroMesa = nroMesa;
        this.estado = estado;
        this.fec = fec;
    }

    public int getGastos() {
        return gastos;
    }

    public void setGastos(int gastos) {
        this.gastos = gastos;
    }
    

    public ArrayList<Pedido> getListadepedido() {
        return listadepedido;
    }

    public void setListadepedido(ArrayList<Pedido> listadepedido) {
        this.listadepedido = listadepedido;
    }
    
    

    public Mesa() {
    }


    public int getNroMesa() {
        return nroMesa;
    }

    public void setNroMesa(int nroMesa) {
        this.nroMesa = nroMesa;
    }
    public void agregarPedido(Pedido pe){
        listadepedido.add(pe);
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Fecha getFec() {
        return fec;
    }

    public void setFec(Fecha fec) {
        this.fec = fec;
    }
    
    
    
    public void gastosxdiaunamesa(){
        int GT=0;// variable para calcular el gasto para la fecha consultada
        for (Pedido pedido : listadepedido) {
            if(pedido.getFecha().equals(fec) && estado.equals("disponible")){
               GT=( pedido.getBebida().getPrecio() + pedido.getPlato().getPrecio())*pedido.getCantpersonas();
                     setSum(sum +GT);
                     System.out.println("             ");
                     
                    System.out.println("el gasto de la mesa: "+nroMesa+" atendido por:" +pedido.getMozo().getNombre()+", en el horario de atencion: "+pedido.getFecha().getFh().getHora()+":"+pedido.getFecha().getFh().getMinutos()+" es: "+GT);
                 
                }
                   
                }
        System.out.println("                            ");
            
        System.out.println("1) el gasto generado en el dia de la fecha="+fec+ " por el nro de mesa: '"+nroMesa+"' es: "+ sum);
    }
    public void gastosxmesaenunmez(){
        for (Pedido pedido : listadepedido) {
            if(this.fec.getMez() == pedido.getFecha().getMez()){
                if(pedido.getFecha().getDia() >=1 && pedido.getFecha().getDia() <=30 ){
                   // System.out.println(" "+gastos);
                    cm=((pedido.getBebida().getPrecio() + pedido.getPlato().getPrecio()) *pedido.getCantpersonas());
                    setGastos(gastos=gastos+cm);
                    System.out.println("gastos= "+gastos+" nromesa: "+nroMesa);
                }
            }
        }
        
    }
    
    @Override
    public String toString() {
        return "Mesa{" + "nroMesa=" + nroMesa + ", listadepedido=" + listadepedido + ", total=" + total + ", sum=" + sum + ", fec=" + fec + '}';
    }

    
    
    
}
        
   

 




    
