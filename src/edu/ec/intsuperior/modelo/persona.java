/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ec.intsuperior.modelo;

/**
 *
 * @author Usuario
 */
public class persona {
    String nombre1;
    String nombre2;
    String apellido1;
    String apellido2;
    String cedula;
    String direccion;
    String email;
    String telefono;
    
  public persona() {  
  }

    public persona(String nombre1, String nombre2, String apellido1, String apellido2, String cedula, String direccion, String email, String telefono) {
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.cedula = cedula;
        this.direccion = direccion;
        this.email = email;
        this.telefono = telefono;
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "cedula: "+getCedula()+"\n"
               + "Nombre: "+getNombre1()+" "+getNombre2()+" "+getApellido1()+" "+getApellido2()+"\n"
               + "Direccion: "+getDireccion()+"\n"
               + "Email: "+getEmail()"\n"
               + "telefono: "+getTelefono()
                           
    
  
  
  
  
  
}