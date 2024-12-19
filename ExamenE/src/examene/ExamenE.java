package examene;
import javax.swing.*;
/**
 *
 * @author Admin
 */
public class ExamenE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int Pila[]=new int[5];
        int cima=-1;
        int m1=Pila.length-1;
        int Cola[]= new int[5];
        int frente, fin;
        String cadena="";
        frente=fin=-1;
        int Opcion,m2;
        m2=Cola.length-1;
        int op;
        do{
        cadena="";
        cadena+="Menú, escribe para seleccionar\nel numero de la opción:\n";
        cadena+="1. PILAS\n2. COLAS\n3. Salir\n";
        op = Integer.parseInt(JOptionPane.showInputDialog(null,cadena));   
        switch(op){
            case 1:
            cadena="La pila se encuentra vacia. \n";
               for (int i=0; i<Pila.length; i++){
                      Pila[i]=0;//inicializar la pila en 0
                      cadena+=Pila[i]+"  ";
               }
                     JOptionPane.showMessageDialog(null, cadena);
               do{
             Opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                "1. Ingresar datos\n"+
                "2. Eliminar datos\n"+
                "3. Mostrar los datos\n"+
                "4. Vaciar pila\n"+
                "5. Salir\n"+
                "--------------------------------------------------------\n"+
                "INGRESE LA OPCION [1 - 5]","MENU DE PILA",JOptionPane.QUESTION_MESSAGE));
            switch(Opcion)
            {
            case 1: if (cima == m1){
                  cadena="\n La Pila esta llena";
                  JOptionPane.showMessageDialog(null,cadena);
            }else {
                  cima+=1;
                  cadena=JOptionPane.showInputDialog("Introduce un numero");
                  Pila[cima]=(int)Integer.parseInt(cadena);
               }   
               cadena="";
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
               cadena="";
            
            break;
            case 4:
                if(cima==-1){
                    cadena="La pila ya se encuentra vacia.\n";
                    JOptionPane.showMessageDialog(null, cadena);
                    
                }else{
                cadena="";
                  cadena="La pila esta vacia.\n";
                  for (int i=0; i<Pila.length; i++){
                        Pila[i]=0;//inicializar la pila en 0
                        cadena+=Pila[i]+"  ";
                  }
                  cima=-1;
                  JOptionPane.showMessageDialog(null, cadena); //VACIAR    
                }
                
            break;
            case 5:;  //SALIR   
            break;
            default: JOptionPane.showMessageDialog(null,"Ingrese una opcion valida. \n"+JOptionPane.WARNING_MESSAGE);
            break;
            }
            }while(Opcion!=5);
            break;
            case 2:
            cadena="";
            cadena+="La cola se encuentra vacia.\n";
            for (int i=0; i<Cola.length; i++){
            Cola[i]=-1;//inicializar la cola en -1
            cadena+=Cola[i]+"  ";
            }
             JOptionPane.showMessageDialog(null, cadena);
            do{
                Opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                "1. Ingresar datos\n"+
                "2. Eliminar datos\n"+
                "3. Mostrar los elementos\n"+
                "4. Frente\n"+
                "5. Tamaño\n"+
                "6. Salir"+
                "--------------------------------------------------------\n"+
                "INGRESE LA OPCION [1 - 6]","MENU DE COLA",JOptionPane.QUESTION_MESSAGE));
            switch(Opcion)
            {
            case 1: if (fin== m2){
                  cadena="\n La Cola ya esta llena";
                  JOptionPane.showMessageDialog(null,cadena);
            }else {
                  fin++;
                  cadena=JOptionPane.showInputDialog("Introduce un numero");
                  Cola[fin]=(int)Integer.parseInt(cadena);
                  if(frente==-1){
                      frente++;
                  }
               } 
            cadena="";
            break;
            case 2:  cadena="";//pop
                 if (frente == -1){
                     cadena="\n La Cola ya esta vacia";
                     JOptionPane.showMessageDialog(null, cadena);
                     cadena="";
                  } //eliminar 
                  else {
                     cadena+=Cola[frente];      
                     Cola[frente]=-1;
                     frente+=1;
                     JOptionPane.showMessageDialog(null, cadena);
                  }  
                  cadena="";        
            break;   //mostrar
            
            case 3: 
                cadena="";
                for (int i=0; i<Cola.length; i++)
               cadena+=Cola[i]+"  ";
               JOptionPane.showMessageDialog(null, cadena);
               //cadena="";
            break;
            case 4:
                if(frente==-1){
                cadena="El valor que esta al frente es "+Cola[frente+1];
                JOptionPane.showMessageDialog(null, cadena); //Frente    
                }else{
                  cadena="El valor que esta al frente es "+Cola[frente];
                JOptionPane.showMessageDialog(null, cadena); //Frente   
                }
            break;
            case 5: 
                cadena="";
                if(frente==-1){
                    cadena="El tamaño de la Cola es de 0 elementos";
                }else{
                    int tam=fin-frente+1;
                    cadena="El tamaño de la Cola es de "+tam+" elementos.";
                }
                JOptionPane.showMessageDialog(null, cadena);
            break;
            case 6:;  //SALIR   
            break;
            default: JOptionPane.showMessageDialog(null,"Ingrese una opcion valida. \n"+JOptionPane.WARNING_MESSAGE);
            break;
         }      
         }while(Opcion!=6);
         break;   
            case 3:;   
            break;
            default:JOptionPane.showMessageDialog(null,"Ingrese una opcion valida. \n"+JOptionPane.WARNING_MESSAGE);
            break;
        }
        }while(op!=3);  
    }
    
}
