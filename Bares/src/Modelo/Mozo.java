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
public class Mozo extends Persona{
private int id_mesero;
private ArrayList<Mesa> listademesas=new ArrayList();


    public Mozo() {
    }
    public Mozo(String nombre){
        super(nombre);
    }

    public Mozo(String nombre, String apellido, int dni, String fecha_de_nacimiento, String domicilio, int telefono) {
        super(nombre, apellido, dni, fecha_de_nacimiento, domicilio, telefono);
    }
    
   
    public Mozo(int id_mesero) {
        this.id_mesero = id_mesero;
    }
    public void asignaciondemesa(Mesa m){
     
    }
    public void totaldepedidospormesa(){
      int acum1=0;
      
    }



   







}
