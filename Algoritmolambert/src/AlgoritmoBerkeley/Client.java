/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlgoritmoBerkeley;
import java.io.*;
import java.net.*;
import java.util.*;


public class Client extends Thread{
    private int clientID;
    private long clientTime;
    private SimulatorMonitor sm;
    private final boolean addDelay = false;
    
    public Client(int clientID, SimulatorMonitor sm){
        this.sm=sm;
        this.clientID= clientID;
        this.clientTime= System.nanoTime();
    }
    
    public void run(){
        while(true){
            this.clientTime+=(this.addDelay)? (this.clientID+1)*2:0;
            System.out.println("Temporizar (cliente " + clientID +"): "+ this.clientTime);
            this.sm.setDiffTimes(this.clientTime, this.clientID);
            this.clientTime += this.sm.getSettingTime(this.clientID);
            System.out.println("Remporizador acordado (cliente" + clientID+ "): "+ this.clientTime);
        }
    }
    
}
