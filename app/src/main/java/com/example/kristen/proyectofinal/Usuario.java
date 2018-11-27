package com.example.kristen.proyectofinal;

public class Usuario {
    private String nombre;
    private String contrasena;
    private Float puntaje;
    private Integer comentario;

    public String getNombre() {
        return nombre;
    }

    public String getContrasena() {
        return contrasena;
    }

    public Usuario(String nombre, String contrasena){
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.puntaje = 0.0f;
        this.comentario = 0;
    }


}
