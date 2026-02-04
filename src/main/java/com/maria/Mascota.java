package com.maria; 
public abstract class Mascota {
    protected String nombre; 
    
    protected int edad; 
    protected static int numeroDePatas = 4; 

    protected abstract void sonido(); 
    protected abstract void come(); 
    protected abstract void bebe(); 
}
