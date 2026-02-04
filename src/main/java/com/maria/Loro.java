package com.maria;
public class Loro extends Mascota{
    private final static int numeroDeAlas = 2;
    private String[] colores;  

    private int numeroDePatas = 2; 

    public Loro(String nombre, int edad, String[] colores){
        this.nombre = nombre; 
        this.edad = edad; 
        this.colores = colores; 
    }

    public void caracteristicas(){
        int a = colores.length; 
        String frase = ""; 
        if(edad > 1){
            frase += "El loro se llama " + nombre + " tiene " + edad + " años y es "; 
                       
        } else {
           frase += "El loro se llama " + nombre + " tiene " + edad + " año y es "; 
        }
        for(int i = 0; i < a - 1; i++){
            frase += colores[i] + ", ";
        }
        frase +="y " + colores[a-1] + ", tiene " + numeroDePatas + " patas y " + numeroDeAlas + " alas";
        System.out.println(frase);
    }
    public void come(){
        System.out.println("No sé lo que come el loro"); 
    }
    public void bebe(){
        System.out.println("El loro bebe agua"); 
    }
    public void sonido(){
        System.out.println("El loro habla y no se calla"); 
    }



}
