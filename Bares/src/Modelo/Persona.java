/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.HashSet;

/**
 *
 * @author Yessica-
 */
public class Persona {
private String nombre;
private String apellido;
private int dni;
private String fecha_de_nacimiento;
private String domicilio;
private int telefono;

public Persona(String nombre, String apellido,int dni, String fecha_de_nacimiento,String domicilio,int telefono){
    this.nombre=nombre;
    this.apellido=apellido;
    this.dni=dni;
    this.fecha_de_nacimiento=fecha_de_nacimiento;
    this.domicilio=domicilio;
    this.telefono=telefono;
    
    
}
public Persona(){
    
}

    public Persona(String nombre, int telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

public void setNombre(String nombre){
  this.nombre=nombre;
}
public String getNombre(){
    return nombre;
}
public void setApellido(String apellido){
    this.apellido=apellido;
}
public String getApellido(){
    return apellido;
}
public void setDni(int dni){
    this.dni=dni;
}
public int getDni(){
    return dni;
}

    public String getFecha_de_nacimiento() {
        return fecha_de_nacimiento;
    }

    public void setFecha_de_nacimiento(String fecha_de_nacimiento) {
        this.fecha_de_nacimiento = fecha_de_nacimiento;
    }

public void setDomicilio(String domicilio){
this.domicilio=domicilio;
}
public String getDomicilio(){
    return domicilio;
}

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", fecha_de_nacimiento=" + fecha_de_nacimiento + ", domicilio=" + domicilio + ", telefono=" + telefono + '}';
    }
    
  
    

    
}
