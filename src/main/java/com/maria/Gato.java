package com.maria;
import com.maria.Paseable;

public class Gato extends Mascota implements Paseable, SonidoPeligro {
    private String raza; 

    public Gato(String nombre, int edad, String raza) {
        this.nombre = nombre; 
        this.edad = edad; 
        this.raza = raza; 
    }

    public void caracteristicas(){
        if(edad > 1){
            System.out.println("El gato se llama " + nombre + " tiene " + edad + " años y es un "+ raza + " y tiene " + numeroDePatas + " patas" );
        } else {
            System.out.println("El gato se llama " + nombre + " tiene " + edad + " año y es un "+ raza + " y tiene " + numeroDePatas + " patas" );
        }
    }

    public void come(){
        System.out.println("El gato come pienso");
    }
    public void bebe(){
        System.out.println("El gato bebe agua");
    }
    public void sonido(){
        System.out.println("El gato maulla");
    }

    public void jugueteFavorito(String juguete){
        System.out.println("El juguete favorito del gato es su " + juguete);
    }

    public void tipoEdad(){
        if(this.edad > 2){ //2 por poner un número 
            System.out.println("El gato es adulto");
        } else{ 
            System.out.println("Todavía es un cachorro");
        }
    }

    @Override
    public void paseo(){
        System.out.println("A los gatos no les suele gustar pasear");
    }


}
