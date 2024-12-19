import javax.swing.*;

public class PilaArreglo {
   public static void main(String args[]) {
      int Pila[]=new int[5];
      String cadena="";
      int cima=-1;
      int maximo=Pila.length-1;
      int Opcion;
      for (int i=0; i<Pila.length; i++){
         Pila[i]=0;//inicializar la pila en 0
         cadena+=Pila[i]+"  ";
       }
       JOptionPane.showMessageDialog(null, cadena);
       
       do {
         Opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                "1. INGRESAR\n"+
                "2. ELIMINAR\n"+
                "3. MOSTRAR\n"+
                "4. VACIAR\n"+
                "5. SALIR\n"+
                "--------------------------------------------------------\n"+
                "INGRESE LA OPCION [1 - 5]","MENU PILA",JOptionPane.QUESTION_MESSAGE));
         
         switch(Opcion)
         {
            case 1: if (cima == maximo){
                  cadena="\n La Pila esta llena";
                  JOptionPane.showMessageDialog(null, cadena);
               }  
               else {
                  cima+=1;
                  cadena=JOptionPane.showInputDialog("Introduce un numero");
                  Pila[cima]=(int)Integer.parseInt(cadena);
               }   
               cadena=""; 
               for (int i=0; i<Pila.length; i++)
                  cadena+=Pila[i]+"  ";
               JOptionPane.showMessageDialog(null, cadena); //ingresar
            break;
            
            case 2:  cadena="";//pop
                 if (cima == -1){
                     cadena="\n La Pila esta vacia";
                     JOptionPane.showMessageDialog(null, cadena);
                     cadena="";
                  } //eliminar 
                  else {
                     cadena+=Pila[cima];      
                     Pila[cima]=0;
                     cima-=1;
                     JOptionPane.showMessageDialog(null, cadena);
                  }  
                  cadena="";        
            break;   //mostrar
            
            case 3: for (int i=0; i<Pila.length; i++)
                        cadena+=Pila[i]+"  ";
               JOptionPane.showMessageDialog(null, cadena);
            
            break;
            case 4: cadena="";
                  for (int i=0; i<Pila.length; i++){
                        Pila[i]=0;//inicializar la pila en 0
                        cadena+=Pila[i]+"  ";
                  }
                  JOptionPane.showMessageDialog(null, cadena); //VACIAR
            break;
            case 5: System.exit(0);  //SALIR   
            break;
            default: JOptionPane.showMessageDialog(null,"ingrese una opcion valida\n"+JOptionPane.WARNING_MESSAGE);
            break;
         }
      }
      while(true); //-- SEGUIRA HASTA QUE OPCION SEA IGUAL A 5
            
      //cadena+=maximo;  
      //cadena=JOptionPane.showInputDialog("Mensaje");
      //variable=(int)Integer.parseInt(cadena);
      //Pop
      //cadena="";
      //if (cima == -1){
      //   cadena="\n La Pila esta vacia";
        // JOptionPane.showMessageDialog(null, cadena);
         //cadena="";
      /*}
      
      else {
         cadena+=Pila[cima];      
         Pila[cima]=0;
         cima-=1;
         JOptionPane.showMessageDialog(null, cadena);
      }  
      cadena="";    
      for (int i=0; i<Pila.length; i++){
         cadena+=Pila[i]+"  ";
       }
       JOptionPane.showMessageDialog(null, cadena);*/

   }
}     
