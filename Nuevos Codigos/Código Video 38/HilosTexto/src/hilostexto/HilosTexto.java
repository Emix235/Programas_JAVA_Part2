/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilostexto;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Global Tech
 */
public class HilosTexto extends Thread{
    javax.swing.JLabel jLabel1;
    String[] texto;
    java.awt.Font[] estilos;
    int n;

    public HilosTexto(){
        texto = new String[5];
        estilos = new java.awt.Font[5];
        cargarTexto();
        cargarEstilos();
        n=0;
    }
    
    public void run(){
        while(true){
            if(n<=4){
                jLabel1.setText(texto[n]);
                jLabel1.setFont(estilos[n]);
                n++;
            }else{
                n=0;
            }
            try {
                sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(HilosTexto.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void recibeJLabel(javax.swing.JLabel jLabel1){
        this.jLabel1= jLabel1;
    }
    
    public void cargarTexto(){
        texto[0] = "Hola,";
        texto[1] = "Bienvenido";
        texto[2] = "a este";
        texto[3] = "Ejemplo";
        texto[4] = "de Hilos";
    }
    
    public void cargarEstilos(){
        estilos[0] = new java.awt.Font("Tahoma", 1, 36); 
        estilos[1] = new java.awt.Font("Bauhaus 93", 1, 30); 
        estilos[2] = new java.awt.Font("Algerian", 1, 36); 
        estilos[3] = new java.awt.Font("Bradley Hand ITC", 1, 30); 
        estilos[4] = new java.awt.Font("Comic Sans MS", 1, 36); 
    }
    
}
