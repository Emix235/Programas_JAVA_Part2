/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilosbarra;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JProgressBar;

/**
 *
 * @author Global Tech
 */
public class HilosBarra extends Thread{
    JProgressBar jProgressBar1;
    int descansar;
    boolean repetir;
    int porcentaje;
    
    public HilosBarra(){
        descansar=1000;
        repetir=true;
        porcentaje=0;
    }
    public HilosBarra(int descansar){
        this.descansar=descansar;
        repetir=true;
        porcentaje=0;
    }
    public HilosBarra(int descansar, boolean repetir){
        this.descansar=descansar;
        this.repetir=repetir;
        porcentaje=0;
    }

    public void run(){
        System.out.println("Hilo Iniciado");
        while(repetir){
            if(porcentaje==100){
                System.out.println("Hilo Terminado");
                stop();
            }else{
                porcentaje++;
                jProgressBar1.setValue(porcentaje);
                
            }
            try {
                sleep(descansar);
            } catch (InterruptedException ex) {
                Logger.getLogger(HilosBarra.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void recibejProgressBar1(JProgressBar jProgressBar1){
        this.jProgressBar1=jProgressBar1;
    }
    
}
