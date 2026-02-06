package com.maria;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

public class Loro extends Mascota{
    private final static int numeroDeAlas = 2;
    private String[] colores;  

    private int numeroDePatas = 2; // lo sobreescribimos porque los loros son una excepcion

    public Loro(String nombre, LocalDate nacimiento, String[] colores, int codigoUnico){
        this.nombre = Objects.requireNonNull(nombre, "Es obligatorio que tenga un nombre"); 
        this.nacimiento = nacimiento; 
        this.edad = Period.between(nacimiento, LocalDate.now()).getYears(); 
        this.colores = colores; 
        this.codigoUnico = codigoUnico; 
    }

    public void caracteristicas(){
        int a = colores.length; 
        String frase = ""; 
        if(edad > 1){
            frase += "El loro se llama " + nombre + " tiene " + edad + " años y es "; 
                       
        } else {
           frase += "El loro se llama " + nombre + " tiene " + edad + " año y es "; 
        }
        if(a > 1){
            for(int i = 0; i < a - 1; i++){
                frase += colores[i] + ", ";
            }
            frase +="y " + colores[a-1];
        } else {
            frase += colores[0];
        }
        frase += ", tiene " + numeroDePatas + " patas y " + numeroDeAlas + " alas";
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

    @Override
    public void tipo(){
        System.out.println("Esta mascota es un ave"); 
    }


}
