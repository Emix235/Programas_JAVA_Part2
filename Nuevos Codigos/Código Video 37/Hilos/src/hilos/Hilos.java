/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Global Tech
 */
public class Hilos extends Thread {
    int contador;
    String mensaje;

    public Hilos(){
        contador=1;
    }
    
    public Hilos(String mensaje){
        contador=1;
        this.mensaje=mensaje;
    }
    
    public void run(){
        while(true){
            //System.out.println("Hilo Corriendo");
            //System.out.println("Ejecución: "+contador++);
            System.out.println("Mensaje Recibido: #"+contador++);
            try {
                //1000 ms = 1 seg
                //10000 ms = 10 seg
                sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(Hilos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Hilos h1 = new Hilos();
        Hilos h2 = new Hilos("Hola Alumnos");
        //h1.start();
        h2.start();
    }
    
}
