package pila;
import java.io.*;
import javax.swing.*;

class nodo
{
	int dato;
	nodo sig;
	nodo ant;
	nodo(int a)
	{
		this.dato=a;
		this.sig=null;
		this.ant=null;
	}
}

public class ColasDinamicas {
	nodo primero;
	nodo ultimo;
	ColasDinamicas()
	{
		primero=null;
		ultimo=null;
	}

	     public boolean estavacio()
	     {
		if(primero==null) return true;
		else return false;
	     }
   
             public void Buscar(int Valor){//Metodo para buscar un Dato
                 if(estavacio()){
                 String cadena="Actualmente la cola se encuentra vacia";
                 JOptionPane.showMessageDialog(null, cadena);     
                 }else{
                        nodo actual;
                        int cont=1;         
		        actual=primero;         
                        String cadena="";
		        while(actual.dato!=Valor){
                         cont++;
			//cadena+="\n"+actual.dato;
			actual=actual.sig;
		        } 
                cadena+="El dato "+actual.dato+" Esta en el nodo "+cont+"\n";
                JOptionPane.showMessageDialog(null, cadena);   
                }
             }
             /*
             public void Vaciar(int Valor){ //Metodo para vaciar nuestra Cola
                                    nodo nuevo = new nodo(Valor);
                                    nuevo.sig=null;
                                    nuevo.ant=null;
                                    primero=nuevo;
                                    ultimo=nuevo;
            }*/
             
             public void V(){
                 nodo e= ultimo;
                 while(e.ant!=null){
                     ultimo=ultimo.ant;
                     e=e.ant;
                 }
                 if(ultimo.ant==null){
                     primero=null;
                 }
             }
             
             
 
            public ColasDinamicas insertar(int Valor){ //Insertar un Valor
		if(estavacio())
		{
			nodo nuevo=new nodo(Valor);
			primero=nuevo;
			ultimo=nuevo;
		}
		else
		{
			nodo nuevo=new nodo(Valor);
			ultimo.sig=nuevo;
			nuevo.ant=ultimo;
			ultimo=nuevo;
		}
		return this;       
	         }

	
        public void borrarPrimero(){  //Metodo para borrar el primer elemento, que es el ultimo
            if(estavacio()){
            String cadena="La cola se encuentra vacia";
            JOptionPane.showMessageDialog(null, cadena);   
            }else{
             nodo actual=primero;
             actual=primero.sig;
             primero=actual;
             primero.ant=null;      
            } 
        }
        
        public void imprimirAdelante(String cadena)
	{
            if(estavacio()){
            cadena="La cola se encuentra vacia";
            JOptionPane.showMessageDialog(null, cadena);   
            }else{
                nodo actual;
		actual=primero;
		while(actual!=ultimo)
		{
                        cadena+="\n"+actual.dato;
			actual=actual.sig;
		}
                cadena+="\n"+actual.dato;
                JOptionPane.showMessageDialog(null, cadena);
            }
        }
        
        public void imprimirAtras(String cadena)
	{
            if(estavacio()){
            cadena="La cola se encuentra vacia";
            JOptionPane.showMessageDialog(null, cadena);   
            }else{
                nodo actual;
		actual=ultimo;
		while(actual.ant!=null)
		{
                        cadena+="\n"+actual.dato;
			actual=actual.ant;
		}
                cadena+="\n"+actual.dato;
                JOptionPane.showMessageDialog(null, cadena);
            }
        }
        
   
   public static void main(String[] args) {
       ColasDinamicas listaD=new ColasDinamicas();
       int Opcion, Valor=5
               ;
       String cadena="";
       do {
         Valor=5;
         Opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                "1. GENERAR COLA\n"+
                "2. ELIMINAR PRIMERO\n"+
                "3. INSERTAR ULTIMO\n"+
                "4. IMPRIMIR (RECORRIDO)\n"+
                //"8. IMPRIMIR INVERTIDO\n"+
                "5. BUSCAR DATO\n"+
                "6. VACIAR COLA\n"+
                "7. SALIR\n"+
                "--------------------------------------------------------\n"+
                "INGRESE LA OPCION [1 - 7]","MENU COLAS DINAMICAS",JOptionPane.QUESTION_MESSAGE));
         
         switch(Opcion)
         {
            case 1: while (Valor != 0){ //Generar Cola
                       Valor = Integer.parseInt(JOptionPane.showInputDialog(null,
                       "INGRESAR VALOR(termina en 0)\n", JOptionPane.QUESTION_MESSAGE));
                       if (Valor != 0){
                        listaD.insertar(Valor);
                       }
                    }
                    cadena = "Lista de todos los elementos";
                    listaD.imprimirAdelante(cadena);
            break;  
            
            case 2: listaD.borrarPrimero();
                    cadena = "Se Elimino el 1er elemento.\n Lista de los elementos: \n"; //Eliminar el primer Elemento
                    listaD.imprimirAdelante(cadena);
            break;
            
            case 3:
                while(Valor!=0){
                     Valor = Integer.parseInt(JOptionPane.showInputDialog(null,  //Insertar elemento al final de la Cola
                     "INGRESAR VALOR (termina con 0)\n", JOptionPane.QUESTION_MESSAGE));
                     if (Valor != 0) {
                        listaD.insertar(Valor);
                       }  
                }
                cadena = "La nueva Cola es:\n";
                listaD.imprimirAdelante(cadena);
                         
            break;   
            
            case 4:  cadena = "Impresion de la Cola"; //Impresion de la Cola, hacia adelante
                     listaD.imprimirAdelante(cadena);  
            break;
            
            case 5:   Valor = Integer.parseInt(JOptionPane.showInputDialog(null,  
                       "INGRESAR VALOR A BUSCAR\n", JOptionPane.QUESTION_MESSAGE));   //Buscar algun Dato
                       listaD.Buscar(Valor);
            break;
            case 6: listaD.V();
                    listaD.imprimirAdelante(cadena);//Vaciar la Cola
            break;
            case 7: System.exit(0);  //SALIR   
            break;
            /*case 8: cadena="Impresion de la Cola"; //Impresion de la Cola, hacia adelante
                    listaD.imprimirAtras(cadena);
            break;*/
            default: JOptionPane.showMessageDialog(null,"ingrese una opcion valida\n"+JOptionPane.WARNING_MESSAGE);
            break;
         }
      }
      while(true);
}
}