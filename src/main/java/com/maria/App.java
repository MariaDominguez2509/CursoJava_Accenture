package com.maria;
public class App {
    public static void main(String[] args) {
        Perro p = new Perro("Firulais", 7, "Labrador"); 
        p.come();
        p.tipoEdad();
        p.sonido();
        p.caracteristicas();
    

        Gato g = new Gato("Gato", 1, "siames");
        g.jugueteFavorito("Pelota");
        g.tipoEdad();
        g.sonido();
        g.caracteristicas();
    }
}
