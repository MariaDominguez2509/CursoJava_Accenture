package com.maria; 
public abstract class Mascota {
    private String nombre; 
    
    private int edad; 

    public Mascota(String nombre, int edad){
        this.nombre = nombre; 
        this.edad = edad; 
    }
    

    protected abstract void sonido(); 
    protected abstract void come(); 
    protected abstract void bebe(); 
}
