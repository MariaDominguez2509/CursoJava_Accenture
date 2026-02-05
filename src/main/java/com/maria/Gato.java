package com.maria;
import com.maria.Paseable;
import java.util.ArrayList; 
import java.util.List; 
import java.util.Set; 
import java.util.HashSet; 
import java.time.LocalDate;
import java.time.Period;

public class Gato extends Mascota implements Paseable, SonidoPeligro {
    private String raza; 
    private Set<String> posiblesJuguetes = new HashSet<>(Set.of("Balón", "Cuerda", "Ratón")); 
    
   


    public Gato(String nombre, LocalDate nacimiento, String raza, int codigoUnico) {
        this.nombre = nombre; 
        this.nacimiento = nacimiento; 
        this.edad = Period.between(nacimiento, LocalDate.now()).getYears();
        this.raza = raza; 
        this.codigoUnico = codigoUnico; 
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
        if(posiblesJuguetes.contains(juguete)){
            System.out.println("El juguete favorito del gato es su " + juguete);
        }else{
            System.out.println(juguete + " no es un juguete");
        }
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
