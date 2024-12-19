package diseñoeventos;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author Emilio Corona 2A
 * 
 */
public class EventoSaludo implements ActionListener{
    private JTextField texto;
    //constructor que recibe una variable del tipo TextField
    
    public EventoSaludo(JTextField textoEnviado){
        this.texto=textoEnviado;
    }
    public void actionPerformed(ActionEvent e) {
    JOptionPane.showMessageDialog(null,"Bienvendido, "+ texto.getText()+ "!");
      //concatenar y mostrar
    }
    
}
