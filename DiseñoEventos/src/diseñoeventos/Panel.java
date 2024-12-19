package diseñoeventos;

/**
 *
 * @author Emilio Corona 2A
 */
public class Panel {
    public static void main(String[] args){
       Fondo f= new Fondo();
       MenuOperacion m= new MenuOperacion();
       MiVentana v = new MiVentana();
       //v.setVisible(true);
       //f.setVisible(true);
       m.setSize(300, 150);
       m.setVisible(true); 
    }
}
