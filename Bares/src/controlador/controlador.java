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
import javax.swing.JOptionPane;
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
private ArrayList <Plato> lisplato=new ArrayList();
private Bebida bebida;
private Plato plato;

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
            
        }//
        if(e.getActionCommand().equals(vpedido.BTN_AGREGAR_PEDIDO)){
            
           
         
         
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
            try{String nombre=vbebida.getjTextField1().getText(); 
                    buscarBebida(nombre);
            
             }
               catch(Exception gt){
                    System.out.println(""+gt);
                                
               
            
    }
    }
        if(e.getActionCommand().equals(vbebida.BTN_MODIFICAR_BEBIDA)){
        try{
            int posicion=vbebida.getjTable1().getSelectedRow();
            int codigo=Integer.parseInt(vbebida.getjTable1().getValueAt(posicion, 0).toString());
            String nombre=vbebida.getjTable1().getValueAt(posicion, 1).toString();
            String precio=vbebida.getjTable1().getValueAt(posicion, 2).toString();
            
            System.out.println("nombre: "+nombre);
            System.out.println("precio: "+precio);
            System.out.println("codigo="+codigo);
            vbebida.getjTextField1().setText(vbebida.getjTable1().getValueAt(posicion, 0).toString());
          vbebida.getjTextField2().setText(vbebida.getjTable1().getValueAt(posicion, 1).toString());
         
            
//            System.out.println("pos: "+posicion);
//          String nombre=vbebida.getjTextField1().getText();
//          String prec=vbebida.getjTextField2().getText();
          modificar(nombre,precio,posicion);
          
        
        }
        catch(Exception f){
            System.out.println("es:"+f);
        }
        }
        
        if(e.getActionCommand().equals(vbebida.BTN_MOSTRAR_TODO)){
            try{ 
                listadebebidas();
                System.out.println("paso por aqui");
            
            }
            catch(Exception m){
                System.out.println(""+m);
            }
        }
        if(e.getActionCommand().equals(vbebida.BTN_ELIMINAR_BEBIDA)){
           
            try {
                //JOptionPane.showConfirmDialog(null, "Esta seguro de borrar?", "Confirmar salida", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                //if(JOptionPane.YES_NO_OPTION){
                removeSelectedRows();
                
                
                System.out.println("");
                
                
            } catch (Exception n) {
                System.out.println("");
            }
  
        }
                
            
            
        
        
        if(e.getActionCommand().equals(vprincipal.MENU_LISTA_PLATOS)){
          vplato=new vPlato(this);
          vplato.setVisible(true);
           
        }
        if(e.getActionCommand().equals(vplato.BTN_AGREGAR_PLATO)){
            try{
            plato=new Plato();
            plato.setDescripcion(vplato.getjTextField1().getText());
            plato.setPrec(vplato.getjTextField2().getText());
            lisplato.add(plato);
            
            vplato.getjTextField1().setText("");
            vplato.getjTextField2().setText("");
            
            listadeplatos();
            }
            catch(Exception m){
                System.out.println("paso por try catch"+m);
            }
            
                    
            
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
     
        for (Plato lisplato : lisplato) {
          Object[] fila=new Object[2];
          fila[0]=lisplato.getDescripcion();
          fila[1]=lisplato.getPrec();
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

    private void buscarBebida(String nombre) {
        DefaultTableModel tabla1=new DefaultTableModel();
        tabla1.setColumnCount(0);
        tabla1.setRowCount(0);
        tabla1.addColumn("bebida");
        tabla1.addColumn("precio");
        int b=0;
          
         for (Bebida lisbebida : lisbebidas) {
                
               if(nombre.equals(lisbebida.getNombre())){
                    
             Object[] fila=new Object [2];
             fila[0]=nombre;
             fila[1]=lisbebida.getPrec();
             tabla1.addRow(fila);  
             b=1;
               }
               
         }
         if(b==0){
             
          JOptionPane.showMessageDialog(vbebida, "ERROR NO SE ENCUENTRA LA BEBIDA INGRESADA", "",JOptionPane.INFORMATION_MESSAGE); 
        
               
         }
        
        vbebida.getjTable1().setModel(tabla1);

    }

   public void modificar(String nombre, String prec,int posicion){
       
       
       for (int i = 0; i < lisbebidas.size(); i++) {
           if (i==posicion) {
               lisbebidas.get(i).setNombre(nombre);
               lisbebidas.get(i).setPrec(prec);
//               lisbebidas.set(i, new Bebida(nombre, prec));
           }
       }
       
       
       DefaultTableModel tabla1=new DefaultTableModel();
        tabla1.setColumnCount(0);
        tabla1.setRowCount(0);
        tabla1.addColumn("bebida");
        tabla1.addColumn("precio");
       
            for (Bebida lisbebida : lisbebidas) {
                if(nombre.equals(lisbebida.getNombre())){
                    Object[] fila=new Object [2];
                    fila[0]=nombre;
                    fila[1]=prec;
                    tabla1.addRow(fila);
                    
                }
                   
       }
//              bebida.setNombre(nombre);
//          bebida.setPrec(prec);
//          lisbebidas.add(bebida);
     
        
        
        vbebida.getjTable1().setModel(tabla1); 
           
   }
   
   
   
   
   // public void jTable1MouseClicked(java.awt.event.MouseEvent evt){
        
    //}
   //public void agregar(){
       
       
   //}
   public void removeSelectedRows(){
   DefaultTableModel model = (DefaultTableModel) vbebida.getjTable1().getModel();
   int[] rows =vbebida.getjTable1().getSelectedRows();
   for(int i=0;i<rows.length;i++){
     model.removeRow(rows[i]-i);
   }
   borrarcampos();
}

   /*private void eliminarbebida() {
      int i;
      DefaultTableModel t=new DefaultTableModel();
      t.setColumnCount(0);
      t.setRowCount(0);
      t.addColumn("nombre");
      t.addColumn("precio");
        for (Bebida lisbebida : lisbebidas) {
             Object[] fila=new Object [2];
             fila[0]=lisbebida.getNombre();
             fila[1]=lisbebida.getPrec();
             t.addRow(fila);  
              vbebida.getjTable1().getSelectedRows();
             System.out.println("fila"+fila);
        }
        
     t.removeRow(vbebida.getjTable1().getSelectedRow());
      vbebida.getjTable1().setModel(t);
      
    }*/

    private void borrarcampos() {
        DefaultTableModel table=new DefaultTableModel();
        table.setColumnCount(0);
        table.setRowCount(0);
        table.addColumn("nombre");
        table.addColumn("precio");
        for (Bebida lisbebida : lisbebidas) {
           lisbebida.setNombre("");
           lisbebida.setPrec("");
        }
        lisbebidas.remove(0);
        
    }





}
