/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.server.model;

import cl.cliente.Duenio;
import cl.cliente.Mascota;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author XZeroMarx
 */
public class ConexionSocketServer extends Thread {

    private ServerSocket server;
    private Socket cliente;
    private ObjectInputStream input;
    private Mascota m;
    private Duenio duenio;

    public ConexionSocketServer() throws IOException {

    }

    @Override
    public void run() {
        try {
            server = new ServerSocket(5000);//se crea el server en el puerto 5000
        } catch (IOException ex) {
            Logger.getLogger(ConexionSocketServer.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("se conecta al puerto 5000");

        while (true) {
            try {
                System.out.println("espera a cliente");
                cliente = server.accept(); //queda esperando el ingreso de un cliente
                System.out.println("acepta la peticion");
                input = new ObjectInputStream(cliente.getInputStream()); //se usará para leer OBJETOS ENTRANTES

                Object objeto = input.readObject();//se crea un objeto auxiliar para el objeto que viene llegando, para a ser un Objeto que pueda ser compa rado
                System.out.println("compureba if de lista");
                if (objeto instanceof List) { //si el Objeto que llega es una instancia de la clase Mascota
                    System.out.println("loop for");
                    for (Object item : ((List) objeto)) {
                        System.out.println("comprueba if de lista");
                        if (item instanceof Mascota) {
                            System.out.println("setea mascota");
                            this.m = (Mascota) item;

                        } else if (item instanceof Duenio) {
                            System.out.println("setea dueño");
                            this.duenio = (Duenio) item;
                        }
                    }

                    //el objeto que llega se castea a Mascota
                    //INSERTA LOS DATOS RESCATADOS DE LA MASCOTA A LA BASE DE DATOS
                    System.out.println("data");

                    sleep(1000);

                    System.out.println("crearMascota y dueño");

                    Data d = new Data();
                    d.crearMascotaAndDuenio(m, duenio);
                    join();

                } else {
                    System.out.println("cacacacaccacacacacaca");
                }
            } catch (IOException iOException) {
            } catch (ClassNotFoundException classNotFoundException) {
            } catch (SQLException sQLException) {
            } catch (InterruptedException ex) {
                Logger.getLogger(ConexionSocketServer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
