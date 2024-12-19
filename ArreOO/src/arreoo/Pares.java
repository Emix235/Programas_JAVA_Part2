/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreoo;

/**
 *
 * @author Alejandra
 */
public class Pares extends LeerArray{
    
    int cont=0;
    public void  pares1(){
        
        for(i=0;i<arreglo1.length;i++){
            if(arreglo1[i]%2==0){
             cont++;
            }   
            
        }
       System.out.println("El numero de pares del arreglo 1 es "+cont); 
        }
    
    
    public void  pares2(){
        cont=0;
        for(i=0;i<arreglo1.length;i++){
            if(arreglo2[i]%2==0){
             cont++;
            }    
        }
           System.out.println("El numero de pares del arreglo 2 es "+cont);
       
        }
    
}
