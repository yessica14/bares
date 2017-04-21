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
public class Cliente extends Persona{
  private int id_cliente; 
  
  public Cliente(){
      
  }

    public Cliente(String nombre, int telefono) {
        super(nombre, telefono);
    }
  

    public Cliente(String nombre, String apellido, int dni, String fecha_de_nacimiento, String domicilio, int telefono) {
        super(nombre, apellido, dni, fecha_de_nacimiento, domicilio, telefono);
    }

    public Cliente(int id_cliente, String nombre, String apellido, int dni, String fecha_de_nacimiento, String domicilio, int telefono) {
        super(nombre, apellido, dni, fecha_de_nacimiento, domicilio, telefono);
        this.id_cliente = id_cliente;
    }

  
  

  
    public void setId_cliente(int id_cliente){
        this.id_cliente=id_cliente;
    }
    public int getId_cliente(){
        return id_cliente;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id_cliente=" + id_cliente + '}';
    }
    
   
}
