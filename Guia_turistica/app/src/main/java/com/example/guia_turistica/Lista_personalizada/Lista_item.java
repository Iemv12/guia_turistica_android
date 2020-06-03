package com.example.guia_turistica.Lista_personalizada;

public class Lista_item {

    int nombre;
    int foto;

    public Lista_item(int foto, int nombre) {
        this.nombre = nombre;
        this.foto = foto;
    }

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
