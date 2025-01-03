/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlgoritmoBerkeley;

import java.io.*;
import java.net.*;
import java.util.*;

public class SimulatorMonitor {
    private long serverTime;
    private long[] diffTimes;
    private long sumDiffs;
    private final int numClients = 3;
    private int countClientsOpered;
    
    public SimulatorMonitor(){
        this.serverTime = 0;
        this.countClientsOpered = this.numClients;
        this.diffTimes = new long[this.numClients];
        this.sumDiffs = 0;
        
    }
    
    public synchronized void setServerTime (long serverTime){
        this.serverTime = serverTime;
        try{
            notifyAll();
            wait();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
    
    public synchronized void setDiffTimes(long time, int n){
        try{
            if(serverTime==0) wait();
            
            this.diffTimes[n] = (time-serverTime);
            
            this.sumDiffs += time;
            
            countClientsOpered--;
            
            if(countClientsOpered==0) notify();
            wait();
            
        }catch(InterruptedException e){
            
            e.printStackTrace();
        }
    }
    
    public synchronized void calcAvgAndSet(){
        long avg=(this.sumDiffs/(this.numClients+1));
        for (int i = 0; i < this.numClients; i++) this.diffTimes[i] =((-this.diffTimes[i])+avg); 
        notifyAll();
        
    }
    public synchronized long getSettingTime(int n){return this.diffTimes[n]; }
    public synchronized long getAverage(){return this.sumDiffs / (this.numClients+1);}
    public synchronized void restartProcess(){
        this.serverTime=0;
        this.countClientsOpered=this.numClients;
        this.sumDiffs=0;
    }
    
    
    
}
