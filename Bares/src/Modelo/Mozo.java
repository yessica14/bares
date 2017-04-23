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
private int id_mozo;



    public Mozo() {
    }
    public Mozo(String nombre){
        super(nombre);
    }

    public Mozo(String nombre, String apellido, int dni, String fecha_de_nacimiento, String domicilio, int telefono) {
        super(nombre, apellido, dni, fecha_de_nacimiento, domicilio, telefono);
    }
    
   
   

   


}
