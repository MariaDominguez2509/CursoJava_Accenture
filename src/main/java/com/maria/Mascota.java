package com.maria; 
import java.time.LocalDate;

public abstract class Mascota {

    //Características comunes 
    protected String nombre; 
    protected int codigoUnico; 

    protected LocalDate nacimiento; 
    protected int edad; 
    protected static int numeroDePatas = 4; 

    //Acciones comunes 
    protected abstract void sonido(); 
    protected abstract void come(); 
    protected abstract void bebe(); 

    public void tipo(){
        System.out.println("Esta mascota es un mamífero"); 
    }

    public int getEdad(){
        return edad; 
    }
    public String getNombre(){
        return nombre; 
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


    public void nombreDiminutivo(){
            String nombreMascota = nombre; 
            String nombreCarinoso = nombreMascota.substring(0,4); 
            System.out.println("El nombre cariñoso (por defecto) es: " + nombreCarinoso); 

        }
    

}
