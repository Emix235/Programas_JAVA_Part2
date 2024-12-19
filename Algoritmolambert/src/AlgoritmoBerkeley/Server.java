/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlgoritmoBerkeley;

import java.io.*;
import java.net.*;
import java.util.*;

public class Server extends Thread{
    private SimulatorMonitor sm;
    private final int sleepMSeconds;
    private long serverTime;
    
    public Server(SimulatorMonitor sm){
        this.sm=sm;
        this.sleepMSeconds=10000;
        this.serverTime=System.nanoTime();
    }
    public void run(){
    while(true){
        try{
            Thread.sleep(this.sleepMSeconds);
            System.out.println("Temporizador (servidor): "+ this.serverTime);
            this.sm.setServerTime(this.serverTime);
            this.sm.calcAvgAndSet();
            this.serverTime += this.sm.getAverage();
            System.out.println("Temporizacion acordadd (SERVIDOR): "+ this.serverTime);
            this.sm.restartProcess();
        }catch(InterruptedException e){
            
        }
        
        
    }
        
        
    }
    
}
