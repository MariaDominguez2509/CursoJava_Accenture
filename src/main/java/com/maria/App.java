package com.maria;
public class App {
    public static void main(String[] args) {
        Perro p = new Perro("Firulais", 7, "Labrador"); 
        p.come();
        p.tipoEdad();
        p.sonido();
        p.caracteristicas();
        p.juguetes(new String[] {"Pelota", "Cuerda"});
    

        Gato g = new Gato("Gato", 1, "siames");
        g.jugueteFavorito("Pelota");
        g.tipoEdad();
        g.sonido();
        g.caracteristicas();

        Loro l = new Loro("Pajaro", 3, new String[] {"Rojo", "Amarillo", "Azul"}); 
        l.caracteristicas();
        l.come();

    }
}
