package com.maria;
import java.util.ArrayList;

import java.util.List;


public class DemoComposite {

    public static void main(String[] args) {

        DirectoryNode mascotas = new DirectoryNode("Mascotas");

        mascotas.add(new FileNode("Reptiles"));

        DirectoryNode mamiferos = new DirectoryNode("Mamiferos");

        DirectoryNode perro = new DirectoryNode("Perros"); 

        perro.add(new FileNode("Kenai")); 
        perro.add(new FileNode("Nala")); 

        mamiferos.add(perro); 

        DirectoryNode gato = new DirectoryNode("Gato"); 

        gato.add(new FileNode("Gato1")); 

        mamiferos.add(gato); 

        mascotas.add(mamiferos); 

        DirectoryNode aves = new DirectoryNode("Aves");

        DirectoryNode loro = new DirectoryNode("Loros");
        
        loro.add(new FileNode("Loro")); 

        aves.add(loro); 

        mascotas.add(aves);



        mascotas.print(""); // imprime todo el árbol
    }

}



