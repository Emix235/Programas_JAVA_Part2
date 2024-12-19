/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlgoritmoBerkeley;

/**
 *
 * @author FernandoCDV
 */
public class Simulation {
    public static void main(String[] args) {
     SimulatorMonitor simulacionTiempo= new SimulatorMonitor();
        Server srv= new Server(simulacionTiempo);
        srv.start();
        Client clv[] = new Client [3];
        for (int i = 0; i < 3; i++) {
            clv[i]=new Client(i,simulacionTiempo);
            clv[i].start();
        }   
    }
}
