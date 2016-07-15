package com.despositos.model;

/**
 * Created by sebastian.suarez on 15/07/2016.
 */
public class Persona {
    private Integer id;
    private String Nombre;
    private String Apellido;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }
}
