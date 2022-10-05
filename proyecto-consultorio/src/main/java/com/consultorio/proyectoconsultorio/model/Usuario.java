package com.consultorio.proyectoconsultorio.model;


public class Usuario {
    private Long dni;
    private String nombre;
    private String apellido;
    private String contraseña;
    private String email;
    private String rol;


    public Usuario(){

    }

    public Usuario(Long dni, String nombre, String apellido,String contraseña, String email){
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Long getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getContraseña() {
        return contraseña;
    }
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
    
}
