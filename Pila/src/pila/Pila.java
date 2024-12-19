package pila;
import javax.swing.*;


/**
 *
 * @author Emilio Corona
 */


public class Pila {
    
     /**
     * @param args the command line arguments
     */ 
    
    class Nodo {
    int v;
    Nodo s;
    }
    
    private Nodo raiz;
    
    public Pila(){
        raiz=null;
    }    
    
    public void ingP(int x){
       Nodo nuevo= new Nodo();
        nuevo.v=x;
        if (raiz == null) {
            nuevo.s = null;
            raiz = nuevo;
        }else {
            nuevo.s = raiz;
            raiz = nuevo;
        } 
    }
    
    public int Tm(){
    int t=0;
    Nodo n= raiz;
    while(n!=null){
        t++;
        n=n.s; 
    }
        return t;
    }
    
    public void push(Nodo e, String c, int v){
        e=raiz;
        c="Elementos de la pila.\n";
        while(e!=null){
            c+=e.v+" ";
            e=e.s;
        }
        c+="Ingresa el nuevo elemento";
        v= Integer.parseInt(JOptionPane.showInputDialog(null, c));
        Nodo n=new Nodo();
        n.v=v;
        n.s=raiz;
        raiz=n;
    }
    public void pop(Nodo e, String c){
        raiz=raiz.s;
        e=raiz;
        c="Los nuevos elementos de la pila.\n";
        while(e!=null){
            c+=e.v+" ";
            e=e.s;
        }
        JOptionPane.showMessageDialog(null, c);
    }
    public void ult(Nodo e, String c){
        e=raiz;
        do{
            e=e.s;
        }while(e.s!=null);
        c+="El ultimo elemento de la pila es: "+e.v;
        JOptionPane.showMessageDialog(null, c);
    }
    
    public boolean empty(){
        if(raiz==null) return true;
		else return false;
    }
    
    public void imprimir(String cadena, Nodo ejem) {
        cadena+="\nLista de elementos.\n";
        ejem = raiz;
        while (ejem != null) {
            cadena += " " + ejem.v;
            ejem = ejem.s;
        }
        JOptionPane.showMessageDialog(null, cadena);
    }
    
    public static void main(String[] args){
        // TODO code application logic here
        Pila o= new Pila();
        Nodo e=null;
        int op=0;
        int d=5;
        String c="";
        do{
            c="";
         op = Integer.parseInt(JOptionPane.showInputDialog(null,
                "1. GENERAR PILA\n"+
                "2. REVISAR TAMAÑO\n"+
                "3. APILAR (agregar mas elementos)\n"+
                "4. DESAPILAR (1er elemento)\n"+
                "5. LEER ULTIMO\n"+
                "6. SABER, si esta vacia\n"+
                "7. IMPRIMIR PILA\n"+
                "8. SALIR\n"+
                "--------------------------------------------------------\n"+
                "INGRESE LA OPCION [1 - 7]","MENU PILA",JOptionPane.QUESTION_MESSAGE));
         
         switch(op)
         {
            case 1:
                while(d!=0){
                     c="Ingrese valor (0 para terminar)";
                     d= Integer.parseInt(JOptionPane.showInputDialog(null,c));
                     if(d!=0){
                     o.ingP(d);   
                     }
                    }
                 o.imprimir(c, e);
                
            break;
            case 2:  //size
                c="El tamaño de la pila es de: "+o.Tm();
                JOptionPane.showMessageDialog(null, c);      
            break;   //mostrar
            
            case 3: o.push(e, c, d);//PUSH
            
            break;
            case 4: o.pop(e, c); //POP
            break;
            case 5: o.ult(e, c);  // LEER ULTIMO
            break;
            case 6: if(o.empty()){  //SABER SI ESTA VACIA
                     c="La pila, actualmente se encuentra vacia";
                     JOptionPane.showMessageDialog(null, c);
                     }else{
                     c="La pila ya esta creada, no esta vacia.\n";
                     JOptionPane.showMessageDialog(null, c);
                     }
            break;
            case 7: o.imprimir(c, e); //SHOW
            break;
            case 8: System.exit(0);  //SALIR   
            break;
            default: JOptionPane.showMessageDialog(null,"Ingrese una opcion valida. \n"+JOptionPane.WARNING_MESSAGE);
            break;
         }
        }while(true);
    }  
}
