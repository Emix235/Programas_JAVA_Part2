/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilosgui;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Global Tech
 */
public class HilosGUI extends Thread {
    javax.swing.JLabel jLabel1;
    int contador;

    public HilosGUI(){
        contador=1;
    }
    
    public void run(){
        while(true){
            jLabel1.setText("Ejecutando: "+contador++);
            try {
                sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(HilosGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void recibeJLabel(javax.swing.JLabel jLabel1){
        this.jLabel1= jLabel1;
    }
    
}
