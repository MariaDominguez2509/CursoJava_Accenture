package com.maria;

public interface SonidoPeligro {
    default void sonidoPeligro(){
        System.out.println("El animal hace un sonido para asustar");
    }
}
