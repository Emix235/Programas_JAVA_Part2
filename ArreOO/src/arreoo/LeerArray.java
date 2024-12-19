/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreoo;
import java.util.Scanner;
/**
 *
 * @author Alejandra
 */
public class LeerArray {
    
    public int[] arreglo1= new int[4];
    public int[] arreglo2= new int[4];
     public int[] suma= new int[4];
    public int n,i;
       Scanner leer=new Scanner(System.in);
    
    
    
    public void leerDatos1(){
       
        
    for(i=0;i<arreglo1.length;i++){
     System.out.println("escribe el valor "+i);
     arreglo1[i]=leer.nextInt();
      }
    }
    public void leerDatos2(){
        
      
    for(i=0;i<arreglo2.length;i++){
     System.out.println("escribe el valor "+i);
     arreglo2[i]=leer.nextInt();
      }
    }
    
    public void  mostrar1(){
        System.out.println("los valores del arreglo 1 son ");
        for(i=0;i<arreglo1.length;i++)
     System.out.println("los valores son "+arreglo1[i]);
       
    
        }
    public void  mostrar2(){
        System.out.println("los valores del arreglo 2 son ");
        for(i=0;i<arreglo2.length;i++)
     System.out.println("los valores son "+arreglo2[i]);
       
    
    
        }
 
    
        }
    


    

        
    
   
    

