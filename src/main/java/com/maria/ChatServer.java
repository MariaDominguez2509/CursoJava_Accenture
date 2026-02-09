
package com.maria;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDate;
import java.util.ArrayList;

public class ChatServer {
    public static void main(String[] args) {
        //Vamos a probar una cosa: 
        Mascota perro = new Perro("Kenai", LocalDate.of(2018, 2, 26), "Mezcla", "corto",5); 
        Mascota perro2 = new Perro("Nala",LocalDate.of(2017, 10, 26) , "Mezcla", "largo", 6); 
        Mascota gato = new Gato("Missy", LocalDate.of(2024, 5, 6), "egipcio", 7); 
        Mascota loro = new Loro("Ago", LocalDate.of(2023, 9, 2), new String[]{"Naranja", "Morado"}, 8); 
        Mascota gato3 = new Gato("Nami", LocalDate.of(2023, 3, 1), "NA", 9);
        Mascota loro2 = new Loro("Nacho", LocalDate.of(2026, 1,1), new String[]{"Morado", "Naranja"}, 10);


        ArrayList <Mascota> mascotas = new ArrayList<> (); 

        mascotas.add(perro); 
        mascotas.add(perro2); 
        mascotas.add(gato); 
        mascotas.add(loro); 
        mascotas.add(gato3); 
        mascotas.add(loro2);


        System.out.println("Servidor de chat manual");
        System.out.println("Escribe la mascota de la que quieras obtener información");
        System.out.println("Escribe /salir en servidor para cerrar la conexión.");
        
        try (ServerSocket serverSocket = new ServerSocket(4999)) {
            System.out.println("Servidor en espera de conexiones...");
            
            try (Socket clientSocket = serverSocket.accept();
                    // Lo que envía el cliente 
                    InputStream input = clientSocket.getInputStream();
                    // Lo que manda el servidor al cliente
                    OutputStream output = clientSocket.getOutputStream();
                    // consola: permite escribir mensajes manuales desde el servidor.
                    BufferedReader consola = new BufferedReader(new InputStreamReader(System.in))) {
                System.out.println("Cliente conectado desde: " + clientSocket.getInetAddress());

                // Hilo 1: escucha continuamente al cliente.
                // Lo separamos en un hilo para no bloquear la escritura por consola.
                Thread lectorCliente = new Thread(() -> {
                    byte[] buffer = new byte[1024];
                    try {
                        while (true) {
                            int bytesRead = input.read(buffer);
                            if (bytesRead == -1) {
                                System.out.println("Cliente desconectado.");
                                break;
                            }
                            //Pasamos el mensaje a texto 
                            String message = new String(buffer, 0, bytesRead).trim();
                            
                            //Inicializamos encontrada a null
                            Mascota encontrada = null; 

                            for (Mascota m : mascotas) { //recorremos la lista mascotas 
                                if (m.getNombre().equalsIgnoreCase(message)) {
                                    encontrada = m; //si esta en la lista lo guardamos 
                                    break;
                                }
                            }

                            if(encontrada == null){
                                System.out.println("Mascota no encontrada"); 
                            }else{
                                System.out.println("La mascota en cuestión es: \n" + encontrada.caracteristicas()); 
                            }


                        }
                    } catch (IOException e) {
                        // Si el cliente se cae o hay error de red, salimos del hilo.
                        System.out.println("Error leyendo del cliente: " + e.getMessage());
                    }
                });

                // Hilo 2: lee texto desde la consola del servidor y lo envía al cliente.
                Thread escritorServidor = new Thread(() -> {
                    try {
                        String linea;
                        while ((linea = consola.readLine()) != null) {
                            // Comando local para cerrar la sesión desde el servidor.
                            if ("/salir".equalsIgnoreCase(linea.trim())) {
                                clientSocket.close();
                                break;
                            }
                            // Enviamos cada línea prefijada para identificar el origen.
                            output.write(("Servidor: " + linea).getBytes());
                            output.flush();
                        }
                    } catch (IOException e) {
                        System.out.println("Error escribiendo al cliente: " + e.getMessage());
                    }
                });

                lectorCliente.start();
                escritorServidor.start();
                // join() mantiene el main vivo hasta que ambos hilos terminan.
                lectorCliente.join();
                escritorServidor.join();
            }
        } catch (IOException | InterruptedException e) {
            // Capturamos errores de red y de sincronización de hilos.
            e.printStackTrace();
        }
    }

}
