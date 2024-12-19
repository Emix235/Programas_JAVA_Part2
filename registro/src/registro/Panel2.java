
package registro;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;

/**
 *
 * @author Emilio C
 */
public class Panel2 extends JFrame {
    public Panel2(){
    super("Registro Condominio");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(500,650);
    
    JPanel d= new JPanel();
    
    JPanel v= new JPanel();
    
    //Datos personales
    //Datos personales, para esto utilice un GridLayout con 5 filas y 2 columnas para cada dato
    GridLayout g0= new GridLayout(5,2,0,10);
    d.setLayout(g0);
    d.add(new JLabel("  Nombre:")); // Etiqueta y texto de nombre
    d.add(new JTextField(12));
    d.add(new JLabel("  A. Paterno:")); //Etiqueta y texto para A.Paterno
    d.add(new JTextField(12));
    d.add(new JLabel("  Correo:")); //Etiqueta y texto para correo
    d.add(new JTextField(12));
    d.add(new JLabel("  Telefono:")); //Etiqueta y texto para No. telefonico
    d.add(new JTextField(12));
    d.setBorder(BorderFactory.createLineBorder(Color.black));
    
    //Datos vecindad
    //En esta area ocupo los GridLayout para los datos
    GridLayout g1= new GridLayout(3,1,0, 1);
    v.setLayout(g1);
    v.add(new Checkbox ("   Propietario")); 
    v.add(new Checkbox ("   Arrendado"));
    GridLayout g2= new GridLayout(1,4, 10, -10);
    JPanel v2= new JPanel();  //Pabel 2 para los datos de visita
    
    v2.setLayout(g2);
    v2.add(new Checkbox ("   Visita"));
    v2.add(new JTextField(2));
    
    v2.add(new JTextField(2));
    
    v2.add(new JTextField(2));
    v2.setBorder(BorderFactory.createLineBorder(Color.black)); //Y la misma linea, para el borde de negro
    v.add(v2); //Le indico que en el panel v, esta adentro en panel v2
    
     //Botones
    JPanel b= new JPanel();
    b.setLayout(new FlowLayout());
    b.setBorder(new LineBorder(Color.BLACK, 3));
    b.add(new JButton("Aceptar"));  //Boton de aceptar
    b.add(new JButton("Cancelar"));  //Boton de cancelar
    
    
    
    Container h= getContentPane();
    h.add(d, BorderLayout.PAGE_START);
    h.add(v, BorderLayout.CENTER);
    h.add(b, BorderLayout.SOUTH); //Tienen la misma orientación, solo cambie el end_page por south y north por page_start
    }
}
