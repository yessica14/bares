/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import Modelo.*;
/**
 *
 * @author Yessica-
 */
public class Controlador {
  
  public static void main(String[] args) {
     FechaHora fh1=new FechaHora(12,20);
      FechaHora fh2=new FechaHora(13,20);
      FechaHora fh3=new FechaHora(12,50);
      Fecha f1=new Fecha(19,04,2017,fh1);
      Fecha f2=new Fecha(20,04,2017,fh2);
      
      
      
      
       Bar b=new Bar();
       
       
      Mesa m1=new Mesa(1,"disponible",f1);
      Mesa m2=new Mesa(2,"disponible",f1);
      Mesa m3=new Mesa(3,"disponible",f2);
      Mesa m4=new Mesa(4,"reservado",f1);
      
      Cliente cli=new Cliente("franco",15478952);
      Cliente cli0=new Cliente("sergio",1552478);
      
      
      Reserva res=new Reserva(1,m4,cli,5,f1);
      
      b.agregarMesa(m1);
      b.agregarMesa(m2);
      b.agregarMesa(m3);
      
      Mozo mozo1=new Mozo("yessica");
      Mozo mozo2=new Mozo("Paola");
      
      Bebida b1=new Bebida("coca cola",50);
      Bebida b2=new Bebida("fanta naranja",20);
      Bebida b3=new Bebida("vino viña de balbo",60);
      
      Plato pla1=new Plato("pollo con papa",100);
      Plato pla2=new Plato("ñoquis con salsa roja",85);
      Plato pla3=new Plato("milanesa con papa fritas",120);
      Plato pla4=new Plato("estofado de papa",120);
      Plato pla5=new Plato("pizza a la piedra",120);
      
      Pedido ped1=new Pedido(b1,pla1,3,mozo1,f1);
      Pedido ped2=new Pedido(b2,pla2,1,mozo2,f2);
      Pedido ped3=new Pedido(b3,pla3,1,mozo2,f1);
      
      Pedido ped4=new Pedido(b3,pla4,5,mozo2,f2);
      Pedido ped5=new Pedido(b3,pla5,2,mozo2,f2);
      
      m1.agregarPedido(ped3);
      m1.agregarPedido(ped1);
      m2.agregarPedido(ped1);
     // m2.agregarPedido(ped3);
     m3.agregarPedido(ped2);
      
      m1.gastosxdiaunamesa();
      
     // m2.gastosxdiaunamesa();
      m3.gastosxdiaunamesa();
      
      m1.gastosxmesaenunmez();
      m2.gastosxmesaenunmez();
      m3.gastosxmesaenunmez();
      
      b.totaldegastoseneldia();
      b.cpqestuvieronenlamesa();
      b.agregarReserva(res);
      b.cantidaddeReserva();
      b.gastostotalalmez();
      
      
      
      
      
      
      
  }  
}
