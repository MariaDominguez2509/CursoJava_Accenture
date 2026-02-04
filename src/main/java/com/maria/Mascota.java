package com.maria; 
public abstract class Mascota {
    protected String nombre; 
    protected int codigoUnico; 

    protected int edad; 
    protected static int numeroDePatas = 4; 

    protected abstract void sonido(); 
    protected abstract void come(); 
    protected abstract void bebe(); 

    public void tipo(){
        System.out.println("Esta mascota es un mamífero"); 
    }

    @Override 
    public boolean equals(Object obj) {
        if(this == obj){
            return true; 
        }
        if(!(obj instanceof Mascota)){
            return false; 
        }

        Mascota mascota = (Mascota) obj; 
        return this.codigoUnico == mascota.codigoUnico; 
    }     

    @Override
    public int hashCode() {
        return Integer.hashCode(codigoUnico); 
    }

}
