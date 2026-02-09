package com.maria;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Comparator;

public class App {
    public static void main(String[] args) {
        Perro p = new Perro("Firulais", LocalDate.of(2022, 2, 6), "Labrador", "corto", 1); 
        p.come();
        p.tipoEdad();
        p.sonido();
        System.out.println(p.caracteristicas());
        p.juguetes(new String[] {"Pelota", "Cuerda"}); //usando String[]
        p.juguetes2(List.of("Pelota", "Cuerda")); //usando List 
        p.tipo();
        p.paseo();
        int edad = p.getEdad();
        System.out.println("Debería imprimirse la edad "+ edad); 
        p.sonidoPeligro();
        p.cortarPelo();
    
    

        Gato g = new Gato("Gato",LocalDate.of(2008, 6, 10) , "siames", 2);
        g.jugueteFavorito("Pelota");
        g.jugueteFavorito("Balón");
        g.tipoEdad();
        g.sonido();
        System.out.println(g.caracteristicas());
        g.sonidoPeligro();

        Loro l = new Loro("Pajaro",LocalDate.of(2025, 2, 4) , new String[] {"Rojo", "Amarillo", "Azul"}, 3); 
        System.out.println(l.caracteristicas());
        l.come();
        l.tipo();
        l.sonido(); 

        Loro l2 = new Loro("A",  LocalDate.of(2018, 8, 30), new String[] {"Morado"}, 4); 
        System.out.println(l2.caracteristicas()); 

        // Vamos a trabajar con ArrayList 

        Mascota perro = new Perro("Kenai", LocalDate.of(2018, 2, 26), "Mezcla", "corto",5); 
        Mascota perro2 = new Perro("Nala",LocalDate.of(2017, 10, 26) , "Mezcla", "largo", 6); 
        Mascota gato = new Gato("Missy", LocalDate.of(2024, 5, 6), "egipcio", 7); 
        Mascota loro = new Loro("Ago", LocalDate.of(2023, 9, 2), new String[]{"Naranja", "Morado"}, 8); 
        Mascota gato3 = new Gato("Nami", LocalDate.of(2023, 3, 1), "NA", 9);
        Mascota loro2 = new Loro("Nacho", LocalDate.of(2026, 1,1), new String[]{"Morado", "Naranja"}, 10);

        // Comprobemos si podemos comparar 

        System.out.println("Comparamos ambos perros: " + perro.equals(perro2)); 
        System.out.println("Comparamos perro consigo mismo: " + perro.equals(perro)); 
        System.out.println("Comparamos perro con gato: " + perro.equals(gato)); 
        

        ArrayList <Mascota> mascotas = new ArrayList<> (); 

        mascotas.add(perro); 
        mascotas.add(perro2); 
        mascotas.add(gato); 
        mascotas.add(loro); 
        mascotas.add(gato3); 
        mascotas.add(loro2); 

        //Streams 
        List<Mascota> mayoresDeUnAño = mascotas.stream()
            .filter(mascota -> mascota.getEdad() > 1)
            .collect(Collectors.toList()); 

        System.out.println("Mascotas mayores de un año: " + mayoresDeUnAño); 

        Mascota perroMayor = mascotas.stream()
            .filter(a -> a instanceof Perro)
            .max(Comparator.comparingInt(Mascota::getEdad))
            .orElseThrow(); 

        System.out.println("EL perro de mayor edad es: " + perroMayor.getNombre()); 

        List<Mascota> mascotasNa = mascotas.stream()
            .filter(m -> m.getNombre().substring(0,2).equals("Na"))
            .collect(Collectors.toList()); 
        
        StringBuilder nombresNa = new StringBuilder(); 
        for(Mascota m :mascotasNa){
            nombresNa.append(m.getNombre() + " ");
        }
        System.out.println("Las macotas que comienzan por Na son: " + nombresNa); 


        //Strings 

        Mascota gato2 = new Gato("Minino", LocalDate.of(2025, 4, 2), "No sé", 7);
        gato2.nombreDiminutivo(); 
        perro.nombreDiminutivo();
        loro.nombreDiminutivo();

        Thread hilo = new Thread(new Tarea("   Pequeña prueba")); 
        hilo.start();


        Caja caja = new Caja(); 
        System.out.println("La caja está vacía: " + caja.estaVacia()); 

        caja.guardarEnCaja("elemento1"); 
        caja.guardarEnCaja("elemento2"); 
        var a = caja.devuelve(); 
        System.out.println("Contenido de la caja " + a);
        System.out.println("La caja está vacía: " +caja.estaVacia());  

    }
}