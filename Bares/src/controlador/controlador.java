/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import Modelo.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.Action;
import javax.swing.table.DefaultTableModel;
import vista.*;

public class controlador implements ActionListener {
private Mesa mmesa;
private Pedido mpedido;
private Bar mbar;
private vPrincipal vprincipal;
private vBebida vbebida;
private vPedido vpedido;
private vPlato vplato;
private vReserva vreserva;
private ArrayList <Bebida> lisbebidas=new ArrayList();
private Bebida bebida;

    public controlador() {
     vprincipal=new vPrincipal(this);
     vprincipal.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getActionCommand().equals(vprincipal.MENU_PEDIDO)){
            try{
            //vbares.setVisible(false);
            vpedido=new vPedido(this);
            vpedido.setVisible(true);
            //mbar=new Bar();
             borrarcombox1();
             mostrarmesa();
             borrarcombox2();
             mostrarplato();
             //borrarcombox3();
             //mostrarbebida(mbar);
                System.out.println("aqui paso");
            }
             catch(Exception ef){
                     System.out.println("ef" +ef);
                     }
            
        }
        if(e.getActionCommand().equals(vpedido.BTN_AGREGAR_PEDIDO)){
            
           
         // listadebebidas(); 
          listadeplatos();
         
        }
       
        if(e.getActionCommand().equals(vprincipal.MENU_LISTA_BEBIDAS)){
            try{
               
            vbebida=new vBebida(this);
            vbebida.setVisible(true);
            
            }
            
             catch(Exception a){
                    System.out.println("bebidas");
             }
                    
            
            
        }
        if(e.getActionCommand().equals(vbebida.BTN_AGREGAR_BEBIDA)){
            try{ 
                
               bebida=new Bebida();
               bebida.setNombre(vbebida.getjTextField1().getText());
               bebida.setPrec(vbebida.getjTextField2().getText());
               lisbebidas.add(bebida);
               mpedido.agregarBebida(bebida);
               vbebida.getjTextField1().setText("");
               vbebida.getjTextField2().setText("");
                 listadebebidas();
                
            }
            catch(Exception g){
                System.out.println("g"+g);
               // listadebebidas(); 
            }
    
       }
        if(e.getActionCommand().equals(vbebida.BTN_BUSCAR_BEBIDA)){
          
        }
    }

    public void listadebebidas() {
        DefaultTableModel tabla=new DefaultTableModel();
        tabla.setColumnCount(0);
        tabla.setRowCount(0);
        tabla.addColumn("Nombre de bebida");
        tabla.addColumn("precio");
         
        for (Bebida lisbebida : lisbebidas) {
            Object[] fila=new Object [2];
             fila[0]=lisbebida.getNombre();
             fila[1]=lisbebida.getPrec();
             tabla.addRow(fila);  
        }
        
        vbebida.getjTable1().setModel(tabla);
      
    }

    private void listadeplatos() {
     DefaultTableModel tabla=new DefaultTableModel();
     tabla.setColumnCount(0);
     tabla.setRowCount(0);
     tabla.addColumn("Plato");
     tabla.addColumn("precio");
     
        for (Plato plato : mpedido.getListadeplatos()) {
          Object[] fila=new Object[2];
          fila[0]=plato.getDescripcion();
          fila[1]=plato.getPrecio();
          tabla.addRow(fila);
        }
        vplato.getjTable1().setModel(tabla);
    }
    
    private void borrarcombox1(){
       vpedido.getjComboBox1().removeAllItems();
    }

    private void mostrarmesa() {
        vpedido.getjComboBox1().addItem("1");
        vpedido.getjComboBox1().addItem("2");
        
    }

    private void borrarcombox2() {
      vpedido.getjComboBox2().removeAllItems();
    }

    private void mostrarplato() {
      vpedido.getjComboBox2().addItem("pollo con papa");
      vpedido.getjComboBox2().addItem("ñoquis con salsa roja");
      vpedido.getjComboBox2().addItem("milanesa con papa fritas");
      vpedido.getjComboBox2().addItem("estofado de papa");
      vpedido.getjComboBox2().addItem("pizza a la piedra");
      
    }

    private void borrarcombox3() {
        vpedido.getjComboBox3().removeAllItems();
    }

    private void mostrarbebida() {
       vpedido.getjComboBox3().addItem("");
      
    }

   





}
