package diseñoeventos;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author Emilio Corona 2A
 */
public class Fondo extends JFrame{
    public Fondo(){
    super("Cambio color fondo");
    setSize(600,400);
    addWindowListener(new MainWindowListener());
    Container cp=getContentPane();
    cp.add(new ButtonPanel());
    }  
}
class MainWindowListener extends WindowAdapter{    
    public void windowClosing(WindowEvent e){
        System.exit(0);
    }
}
