package com.gonzalez.blanchard.ejemplolistviewviernes;

public class Personaje {

    private int id;
    private String nombre;
    private boolean estaVivo = true;
    private String foto = "";
    private String descripcion;

    public Personaje(int id, String nombre, boolean estaVivo, String foto, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.estaVivo = estaVivo;
        this.foto = foto;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEstaVivo() {
        return estaVivo;
    }

    public void setEstaVivo(boolean estaVivo) {
        this.estaVivo = estaVivo;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
