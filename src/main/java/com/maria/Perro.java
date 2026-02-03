package com.maria;
public class Perro extends mascotas{
    private String raza;

    public Perro(String nombre, int edad, String raza){
        super(nombre);
        super(edad);
        this.raza = raza; 
    }
    @Override 
    public void come(){
        System.out.println("El perro come lo que pilla");
    }
    @Override
    public void bebe(){
        System.out.println("El perro bebe agua");
    }
}
