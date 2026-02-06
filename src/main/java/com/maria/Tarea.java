package com.maria;
public class Tarea implements Runnable{
    private String mensaje; 

    public Tarea(String mensaje){
        this.mensaje = mensaje; 
    }
    @Override
    public void run(){
        System.out.println("Sé que no es eficiente pero esto es: \n" + mensaje); 
    }
}
