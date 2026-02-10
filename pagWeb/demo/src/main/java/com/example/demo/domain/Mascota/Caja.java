package com.example.demo.domain.Mascota;
import java.util.List;
import java.util.ArrayList;

public class Caja<T> {
    private List<T> contenido = new ArrayList<>(); 
    public void guardarEnCaja(T a){
        this.contenido.add(a); 
    }

    public List<T> devuelve(){
        return contenido; 
    }

    public boolean estaVacia(){
        return contenido == null; 
    }
}
