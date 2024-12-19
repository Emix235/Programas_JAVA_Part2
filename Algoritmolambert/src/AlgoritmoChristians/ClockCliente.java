/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlgoritmoChristians;

import java.io.*;
import java.net.*;
import java.text.*;
import java.util.*;

public class ClockCliente {
    public static void main(String[] args) throws IOException{
        String port,hostName;
        BufferedReader stdIn= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingresar numero de puerto");
        port = stdIn.readLine();
        
        int portNumber = Integer.parseInt(port);
        System.out.println("Ingresar el nombre del host");
        hostName = stdIn.readLine();
        try(
            Socket echoSocket = new Socket(hostName, portNumber);
            PrintWriter out = new PrintWriter(echoSocket.getOutputStream(),true);
            BufferedReader in = new BufferedReader(new InputStreamReader(echoSocket.getInputStream()));
            
            )
        {
        String userInput;
            System.out.println("Cliente iniciado");
            System.out.println("Enter exit to Stop");
            
            long TiempoCero;
            long Tiempo_Servidor;
            long TiempoUno;
            long Tiempo_final;
        out.println(TiempoCero=System.currentTimeMillis());
        Tiempo_Servidor  = Long.parseLong(in.readLine());
        
        TiempoUno =System.currentTimeMillis();
        Tiempo_final = (Tiempo_Servidor + (TiempoUno-TiempoCero))/2;
        DateFormat formatter = new SimpleDateFormat("HH:mm:ss:SSS");
        
            System.out.println("Tiempo del cliente: "+formatter.format(new Date(TiempoUno)));
            System.out.println("Tiempo del servidor: "+ formatter.format(new Date(Tiempo_Servidor)));
            System.out.println("Tiempo del cliente despues del reincio: "+ formatter.format(new Date(Tiempo_final)));
            out.println("SALIDA");
        }
        catch(Exception ex){
                System.out.println("Tiempo agotado");
                }
        
    }
}
