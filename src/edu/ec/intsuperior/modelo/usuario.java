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
public class usuario extends persona{
    private String passwor;
    private String user;
    String tipoUsuario;
    
    public usuario() {
    }

    public usuario(String passwor, String user, String tipoUsuario) {
        this.passwor = passwor;
        this.user = user;
        this.tipoUsuario = tipoUsuario;
    }

    public usuario(String passwor, String user, String tipoUsuario, String nombre1, String nombre2, String apellido1, String apellido2, String cedula, String direccion, String email, String telefono) {
        super(nombre1, nombre2, apellido1, apellido2, cedula, direccion, email, telefono);
        this.passwor = passwor;
        this.user = user;
        this.tipoUsuario = tipoUsuario;
    }

    

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPasswor() {
        return passwor;
    }

    public void setPasswor(String passwor) {
        this.passwor = passwor;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    @Override
    public String toString() {
        return super.toString()+"\n"
                + "nombre user: "+getUser(); //To change body of generated methods, choose Tools | Templates.
    }

    
    }
    
            
    

