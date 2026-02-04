package com.maria;
import java.util.ArrayList;
public class App {
    public static void main(String[] args) {
        Perro p = new Perro("Firulais", 7, "Labrador", "corto", 001); 
        p.come();
        p.tipoEdad();
        p.sonido();
        p.caracteristicas();
        p.juguetes(new String[] {"Pelota", "Cuerda"});
        p.tipo();
        p.paseo();
        int edad = p.getEdad();
        System.out.println("Debería imprimirse la edad "+ edad); 
        p.sonidoPeligro();
        p.cortarPelo();
    
    

        Gato g = new Gato("Gato", 1, "siames", 002);
        g.jugueteFavorito("Pelota");
        g.tipoEdad();
        g.sonido();
        g.caracteristicas();
        g.sonidoPeligro();

        Loro l = new Loro("Pajaro", 3, new String[] {"Rojo", "Amarillo", "Azul"}, 003); 
        l.caracteristicas();
        l.come();
        l.tipo();
        l.sonido(); 

        Loro l2 = new Loro("A", 4 , new String[] {"Morado"}, 004); 
        l2.caracteristicas(); 

        // Vamos a trabajar con ArrayList 

        Mascota perro = new Perro("Kenai", 7, "Mezcla", "corto",004); 
        Mascota perro2 = new Perro("Nala", 8, "Mezcla", "largo", 005); 
        Mascota gato = new Gato("Missy", 2, "egipcio", 006); 
        Mascota loro = new Loro("Ago", 4, new String[]{"Naranja", "Morado"}, 007); 


        // Comprobemos si podemos comparar 

        System.out.println("Comparamos ambos perros: " + perro.equals(perro2)); 
        System.out.println("Comparamos perro consigo mismo: " + perro.equals(perro)); 
        System.out.println("Comparamos perro con gato: " + perro.equals(gato)); 
        

        ArrayList <Mascota> mascotas = new ArrayList<> (); 

        mascotas.add(perro); 
        mascotas.add(perro2); 
        mascotas.add(gato); 
        mascotas.add(loro); 

        

    }
}