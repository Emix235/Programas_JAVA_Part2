/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import javax.swing.JOptionPane;

/**
 *
 * @author Global Tech
 */
public class ValidarGUI {
    //Declaración de Variables
    
    /*
     * Metodo Constructor de la Clase
    */
    public ValidarGUI(){
        
    }
    // Validar Campos Vacios****************************************************
    
    public boolean jTextFieldVacio(String texto){
        
        int cantidad = texto.length();
        if(cantidad==0){
            //Campo esta Vacio
            JOptionPane.showMessageDialog(null, "Debe Llenar todos los campos", 
                "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }else{return true;
        }
    }
    
    public boolean jTextFieldVacio(javax.swing.JTextField campoTexto){
        
        String cadena = campoTexto.getText();
        int cantidad = cadena.length();
        if(cantidad==0){
            //Campo esta Vacio
            JOptionPane.showMessageDialog(null, "Debe Llenar todos los campos", 
                "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }else{return true;
        }
    }
    
    public boolean jTextFieldVacio( // True - False
            javax.swing.JLabel tituloCampo, 
            javax.swing.JTextField campoTexto, 
            javax.swing.JLabel imagenCampo, 
            javax.swing.JFrame jFrame1){
        
        String cadena = campoTexto.getText();
        int cantidad = cadena.length();
        if(cantidad==0){
            //Campo esta Vacio
            jFrame1.getToolkit().beep(); // Emite Sonido de Error (campana)
            imagenCampo.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                    "/Imagenes/Cancel_16px.png")));
            JOptionPane.showMessageDialog(null, "Debe Llenar el "+tituloCampo.getText(), 
                "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }else{ 
        //Actualizar Imagen
        imagenCampo.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                    "/Imagenes/Ok_16px.png")));
        return true;
        }
    }
    
    public boolean jTextAreaVacio( // True - False
            javax.swing.JLabel tituloCampo, 
            javax.swing.JTextArea areaTexto, 
            javax.swing.JLabel imagenCampo, 
            javax.swing.JFrame jFrame1){
        
        String cadena = areaTexto.getText();
        int cantidad = cadena.length();
        if(cantidad==0){
            //Campo esta Vacio
            jFrame1.getToolkit().beep(); // Emite Sonido de Error (campana)
            imagenCampo.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                    "/Imagenes/Cancel_16px.png")));
            JOptionPane.showMessageDialog(null, "Debe Llenar el \""+tituloCampo.getText()+"\"", 
                "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }else{ 
        //Actualizar Imagen
        imagenCampo.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                    "/Imagenes/Ok_16px.png")));
        return true;
        }
    }
    
    //Validar Entrada Mayuscula*************************************************
    
    public void entradaMayuscula(java.awt.event.KeyEvent evt){
        char C= evt.getKeyChar();
        if(Character.isLowerCase(C)){
            String cad= (""+C).toUpperCase();
            C=cad.charAt(0);
            evt.setKeyChar(C);
        }
    }
    
    //Validar Entrada Numeros*************************************************
    
    public void entradaNoNumeros(
            java.awt.event.KeyEvent evt, 
            javax.swing.JFrame jFrame1){
        char C= evt.getKeyChar();
        if(Character.isDigit(C)){
            jFrame1.getToolkit().beep(); // Emite Sonido de Error (campana)
            evt.consume(); // Borra el ultimo caracter
            JOptionPane.showMessageDialog(null, 
                    "NO SE PERMITEN ENTRADA DE NUMEROS",
                    "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void entradaNoNumeros(
            java.awt.event.KeyEvent evt, 
            javax.swing.JFrame jFrame1, boolean mensaje){
        char C= evt.getKeyChar();
        if(Character.isDigit(C)){
            jFrame1.getToolkit().beep(); // Emite Sonido de Error (campana)
            evt.consume(); // Borra el ultimo caracter
            if(mensaje == true){
                JOptionPane.showMessageDialog(null, 
                    "NO SE PERMITEN ENTRADA DE NUMEROS",
                    "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
            }else{
                // No se emite mensaje
            }
        }
    }
    
    
    //Validar Entrada Letras*************************************************
    
    public void entradaNoLetras(
            java.awt.event.KeyEvent evt, 
            javax.swing.JFrame jFrame1){
        char C= evt.getKeyChar();
        if(Character.isAlphabetic(C)){
            jFrame1.getToolkit().beep(); // Emite Sonido de Error (campana)
            evt.consume(); // Borra el ultimo caracter
            JOptionPane.showMessageDialog(null, 
                    "NO SE PERMITEN ENTRADA DE NUMEROS",
                    "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void entradaNoLetras(
            java.awt.event.KeyEvent evt, 
            javax.swing.JFrame jFrame1, boolean mensaje){
        char C= evt.getKeyChar();
        if(Character.isAlphabetic(C)){
            jFrame1.getToolkit().beep(); // Emite Sonido de Error (campana)
            evt.consume(); // Borra el ultimo caracter
            if(mensaje){
            JOptionPane.showMessageDialog(null, 
                    "NO SE PERMITEN ENTRADA DE NUMEROS",
                    "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
            }else{}
        }
    }
    
    //Validar Entrada Especial*************************************************
    
    //Permite todos los caracteres Imprimibles Alt+32 hasta Alt+126
    public void entradaEspecial(
            java.awt.event.KeyEvent evt, 
            javax.swing.JFrame jFrame1) {
        if((int)evt.getKeyChar()<32 || (int)evt.getKeyChar()>57){
            jFrame1.getToolkit().beep();
            evt.consume();
        }
        
    }
    /*
    * No permite Caracteres Especiales: "#$%&/()+-;:
    */
    public void entradaEspecial(
            java.awt.event.KeyEvent evt, 
            javax.swing.JFrame jFrame1, boolean mensaje) {
        if((int)evt.getKeyChar()>=0 && (int)evt.getKeyChar()<=31
                || (int)evt.getKeyChar()>=33 && (int)evt.getKeyChar()<=47
                || (int)evt.getKeyChar()>=58 && (int)evt.getKeyChar()<=64){
            jFrame1.getToolkit().beep();
            evt.consume();
            if(mensaje){
            JOptionPane.showMessageDialog(null, 
                    "NO SE PERMITEN ENTRADA DE CARACTERES ESPECIALES",
                    "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
            }else{}
        }
    }
    
    
    
}
