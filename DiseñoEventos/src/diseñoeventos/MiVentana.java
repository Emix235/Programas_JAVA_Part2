
package diseñoeventos;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author Emilio Corona 2A
 */
public class MiVentana extends JFrame{
    public MiVentana(){
        super("Saludandote !!!");
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout (new FlowLayout());
        Container cp= getContentPane();
        cp.add(new JLabel("Nombre"));
        JTextField t= new JTextField(20);
        cp.add(t);
        JButton bts= new JButton ("Saludar");
        cp.add(bts);
        bts.addActionListener(new EventoSaludo(t));
    }
    }
    
