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
public class Bar {
private Integer id_bar;
private String nombre;
private ArrayList<Mesa> listademesa=new ArrayList();
private ArrayList <Reserva> listadereserva=new ArrayList();
private int cantReserva;
private int acum;

private int conGastos=0; //acumulador para el conteo de los gastos del total de mesas 
private int mez;//variable q sirve para arrojar resultado de mez
private int año;//variable q sirve para arrojar resultado de año
private Fecha fech1;

    public Bar() {
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

    public ArrayList<Mesa> getListademesa() {
        return listademesa;
    }

    public void setListademesa(ArrayList<Mesa> listademesa) {
        this.listademesa = listademesa;
    }

    public ArrayList<Reserva> getListadereserva() {
        return listadereserva;
    }

    public void setListadereserva(ArrayList<Reserva> listadereserva) {
        this.listadereserva = listadereserva;
    }
    public void agregarMesa(Mesa m){
        listademesa.add(m);
    }
    public void agregarReserva(Reserva re){
        listadereserva.add(re);
        
    }
   
    public void totaldegastoseneldia(){
        acum=0;
        for (Mesa mesa : listademesa) {
          acum =mesa.getSum() +acum;  
          
            
        }
        System.out.println("                       ");
        System.out.println("2) el total de gastos en el dia es: "+acum);
        System.out.println("                 ");
    }
     public void cantidaddeReserva(){
        
        for (Reserva reserva : listadereserva) {
            if(reserva.getMesa().getEstado()=="reservado"){
                cantReserva++; 
                fech1=reserva.getFecha();
            }
        }
         System.out.println("                  ");
       
        System.out.println("3) la cantidad de reserva en el dia de la fecha="+fech1+" es:"+cantReserva+"");
    }
     public void cpqestuvieronenlamesa(){//aqui se ve la cantidad de personas q estivieron en la mesa
         
         for (Mesa mesa : listademesa) {
             int cant=0;
             
                 
             
             System.out.println("          ");
        System.out.println("la mesa nro: "+mesa.getNroMesa()+" tiene: "+mesa.getCantPersona()+ " clientes");
         }
         
       
 
    }
     public void gastostotalalmez(){
         for (Mesa mesa : listademesa) {
             conGastos=conGastos+mesa.getGastos();
             for (Pedido ped : mesa.getListadepedido()) {
                  if(mesa.getFec().getMez() == ped.getFecha().getMez() && mesa.getFec().getAño() == ped.getFecha().getAño()){
                      if(ped.getFecha().getDia()>=1 && ped.getFecha().getDia()<=30){
                             
                             mez=mesa.getFec().getMez();
                             año=mesa.getFec().getAño();
                             
                      }
                      
                  }
           
             }//cierre de pedidos
             
         }//cierre de lista de mesas
           System.out.println("                    ");
         System.out.println("los gastos generados en el mez : "+ mez + "/"+año+ " es: "+conGastos);
     }


    @Override
    public String toString() {
        return "Bares{" + "id_bar=" + id_bar + ", nombre=" + nombre + '}';
    }



    
}
