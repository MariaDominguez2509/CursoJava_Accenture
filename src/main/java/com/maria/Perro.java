package com.maria;
public class Perro extends Mascota{
    
    private String raza;

    public Perro(String nombre, int edad, String raza){
        this.nombre = nombre; 
        this.edad = edad; 
        this.raza = raza; 
    }

    public void caracteristicas(){
        if(edad > 1){
            System.out.println("El perro se llama " + nombre + " tiene " + edad + " años y es un "+ raza + " y tiene " + numeroDePatas + " patas");
        } else {
            System.out.println("El perro se llama " + nombre + " tiene " + edad + " año y es un "+ raza + "y tiene " + numeroDePatas + " patas");
        }
    }
    
    public void come(){
        System.out.println("El perro come lo que pilla");
    }
    
    public void bebe(){
        System.out.println("El perro bebe agua");
    }

    public void sonido(){
        System.out.println("El perro ladra");
    }
    public void tipoEdad(){
        if(this.edad > 1){
            System.out.println("El perro es adulto");
        } else{ 
            System.out.println("Todavía es un cachorro");
        }
    }

    public void juguetes( String[] juguetes){
        int a = juguetes.length; 
        for (int i = 0; i < a; i++){
            System.out.println("El juguete número " + (i + 1) + " es: " + juguetes[i]);
        }
    }
}
