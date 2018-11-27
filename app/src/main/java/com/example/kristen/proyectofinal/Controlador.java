package com.example.kristen.proyectofinal;

import java.util.ArrayList;

public class Controlador {
    private static  Controlador mInstance;
    private ArrayList<Usuario> list = null;

    private Usuario usuario = null;

    public static Controlador getInstance() {
        if(mInstance == null)
            mInstance = new Controlador();
        return mInstance;
    }

    private Controlador() {
        list = new ArrayList<Usuario>();
    }
    public ArrayList<Usuario> getArray(){
        return this.list;
    }
    public void addToArray(Usuario value){
        list.add(value);
    }
    public void setUsuario(Usuario usuario){
        this.usuario = usuario;
    }
}
