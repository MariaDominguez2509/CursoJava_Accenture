package com.maria;

public class Pelo {
    private String tipo; 

    public Pelo(String tipo){
        this.tipo = tipo; 
    }

    public void cortar(){
        System.out.println("Le cortan el pelo"); 

    }

    public String getTipo(){
        return tipo; 
    }
}
