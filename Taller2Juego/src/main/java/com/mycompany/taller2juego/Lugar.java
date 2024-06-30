package com.mycompany.taller2juego;

public class Lugar {
    private int idLugar;
    private String nombre;
    private String descripcion;

    public Lugar(int idLugar, String nombre, String descripcion) {
        this.idLugar = idLugar;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public int getIdLugar() {
        return idLugar;
    }

    public void setIdLugar(int idLugar) {
        this.idLugar = idLugar;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
