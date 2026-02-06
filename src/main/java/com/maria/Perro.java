package com.maria;
import com.maria.Paseable;
import com.maria.SonidoPeligro;
import java.util.List;
import java.util.Objects;
import java.lang.FunctionalInterface;
import java.time.LocalDate;
import java.time.Period;

public class Perro extends Mascota implements Paseable, SonidoPeligro{
    
    private String raza;
    private Pelo pelo;
    private int edadHumana;  

    @FunctionalInterface
    public interface EdadHumana{
        int edadHumana(int a); 
    }
    EdadHumana edad2 = (a) -> a * 7; 

    public Perro(String nombre, LocalDate nacimiento, String raza, String tipoPelo, int codigoUnico){
        this.nombre = Objects.requireNonNull(nombre, "Es obligatorio que tenga un nombre"); 
        this.nacimiento = nacimiento; 
        this.edad =  Period.between(nacimiento, LocalDate.now()).getYears();

        this.raza = raza; 
        this.pelo = new Pelo(tipoPelo);
        this.codigoUnico = codigoUnico; 
        this.edadHumana = edad2.edadHumana(edad); 
    }


    //Acciones comunes  
    
    public void come(){
        System.out.println("El perro come lo que pilla");
    }
    
    public void bebe(){
        System.out.println("El perro bebe agua");
    }

    public void sonido(){
        System.out.println("El perro ladra");
    }

    //Acciones propias 

    public void caracteristicas(){
        if(edad > 1){
            System.out.println("El perro se llama " + nombre + " tiene " + edad + " años (edad real " + edadHumana + ") y es un "+ raza + " y tiene " + numeroDePatas + " patas");
        } else {
            System.out.println("El perro se llama " + nombre + " tiene " + edad + " año y es un "+ raza + "y tiene " + numeroDePatas + " patas");
        }
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

    public void juguetes2( List<String> juguetes){
            int a = juguetes.size(); 
            for (int i = 0; i < a; i++){
                System.out.println("El juguete número " + (i + 1) + " es: " + juguetes.get(i));
            }
        }


    //Interfaces 

    @Override
    public void paseo(){
        System.out.println("Al perro le gusta pasear"); 
    }


    
    @Override 
    public void sonidoPeligro(){
        System.out.println("El perro gruñe cuando se asusta");
    }

    public void cortarPelo(){
        System.out.println("El pelo antes estaba " + pelo.getTipo());
        pelo.cortar();
    }

}
