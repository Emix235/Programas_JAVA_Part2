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
public class ArraySuma extends LeerArray {
    
    public void  sumar(){
        
        for(i=0;i<arreglo1.length;i++){
        suma[i]=arreglo1[i]+arreglo2[i];
        }
      System.out.println(" la suma de los arreglos es :");      
   for(i=0;i<suma.length;i++){
        System.out.println(arreglo1[i]+ " + " +arreglo2[i]+" = "+suma[i]);
        }
       
  
    
        }
    

}
