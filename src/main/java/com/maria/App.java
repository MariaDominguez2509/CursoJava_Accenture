package com.maria;
public class App {
    public static void main(String[] args) {
        Perro p = new Perro("Firulais", 7, "Labrador"); 
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
    
    

        Gato g = new Gato("Gato", 1, "siames");
        g.jugueteFavorito("Pelota");
        g.tipoEdad();
        g.sonido();
        g.caracteristicas();
        g.sonidoPeligro();

        Loro l = new Loro("Pajaro", 3, new String[] {"Rojo", "Amarillo", "Azul"}); 
        l.caracteristicas();
        l.come();
        l.tipo();
        l.sonido(); 

        Loro l2 = new Loro("A", 4 , new String[] {"Morado"}); 
        l2.caracteristicas(); 

    }
}
