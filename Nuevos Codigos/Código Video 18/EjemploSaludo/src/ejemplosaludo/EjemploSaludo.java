/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosaludo;

/**
 *
 * @author Global Tech
 */
public class EjemploSaludo {
    javax.swing.JTextField jTextField1;

    public EjemploSaludo() {
    }
    
    public void recibeCampoTexto(javax.swing.JTextField jTextField1){
        this.jTextField1 = jTextField1;
        System.out.println("Dato Recibido");
    }
        
    public void mostrarDato(){
        System.out.println(""+jTextField1.getText());
    }
    
    public void modificarDato(){
        jTextField1.setText("Nuevo Nombre");
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        VentanaPrincipal interfaz = new VentanaPrincipal();
        interfaz.setTitle("Nuevo Mensaje de Titulo");
        interfaz.setSize(600,600);
        interfaz.modificarColor();
        interfaz.modificarMensaje();
        interfaz.setVisible(true);
    }
    
}
