/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilosgui;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Global Tech
 */
public class HilosGUI extends Thread {
    javax.swing.JLabel jLabel1, jLabel2;
    String fechaDate, fechaHora;
    int contador;

    public HilosGUI(){
        contador=1;
    }
    
    public void run(){
        while(true){
            obtenerFecha();
            jLabel1.setText(fechaDate);
            jLabel2.setText(fechaHora);
            try {
                sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(HilosGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void recibeJLabel(javax.swing.JLabel jLabel1, javax.swing.JLabel jLabel2){
        this.jLabel1= jLabel1;
        this.jLabel2= jLabel2;
    }
    
    public void obtenerFecha(){
        Date fecha1 = new Date();
        //SimpleDateFormat formatofecha1= new SimpleDateFormat("YYYY-MM-dd");
        SimpleDateFormat formatofecha1= new SimpleDateFormat("dd-MM-YYYY");
        fechaDate = formatofecha1.format(fecha1); 
        System.out.println(fechaDate);
        
        Date fecha2 = new Date();
        SimpleDateFormat formatofecha2= new SimpleDateFormat("hh:mm:ss");
        fechaHora = formatofecha2.format(fecha2); 
        System.out.println(fechaHora);
    }

    
}
