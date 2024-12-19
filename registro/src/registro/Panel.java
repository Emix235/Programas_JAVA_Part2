
package registro;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;


/**
 *
 * @author Emilio C
 */

public class Panel extends JFrame{
    public Panel(){
    super("Registro Condominio");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(500,650);
    
    JPanel d= new JPanel();
    
    JPanel v= new JPanel();
    
    //Datos personales, para esto utilice un GridLayout con 5 filas y 2 columnas para cada dato
    
    
    GridLayout g0= new GridLayout(5,2,0,10);
    d.setLayout(g0);
    d.add(new JLabel("  Nombre:"));  // Etiqueta y texto de nombre
    d.add(new JTextField(12));
    d.add(new JLabel("  A. Paterno:")); //Etiqueta y texto para Apellido paterno
    d.add(new JTextField(12));
    d.add(new JLabel("  Correo:")); //Etiqueta y texto para correo
    d.add(new JTextField(12)); 
    d.add(new JLabel("  Telefono:")); //Etiqueta y texto para Telefono
    d.add(new JTextField(12));
    d.setBorder(BorderFactory.createLineBorder(Color.black)); //Utilice esta instruccion para poner un borde con color
    
    //Datos vecindad
    //Para el area de datos de vecindad, utilize la propiedad de setBounds, que sirve
    v.setLayout(null);  //Siempre y cuando el panel tenga el Layout en null
                          //Para cambiar la pocision, X location, Y location, Anchura y Altura
    v.add(new Checkbox ("   Propietario")).setBounds(200, 50, 90, 10); //El checkbox de  Propietario
    
    v.add(new Checkbox ("   Arrendado")).setBounds(200, 70, 90, 10); //El checkbox para la opcion de arrendado
    
    v.add(new Checkbox ("   Visita")).setBounds(200, 100, 90, 10); //Y la opción de visita, la cual tiene
     //El campo de registro de visita
    v.add(new JLabel("Dia")).setBounds(290, 90, 40, 15);
    
    v.add(new JLabel("Mes")).setBounds(330, 90, 40, 15);
    
    v.add(new JLabel("Año")).setBounds(370, 90, 40, 15);
    
    
    v.add(new JTextField(2)).setBounds(290, 110, 40, 15); //Texto para dia
    
    v.add(new JTextField(2)).setBounds(330, 110, 40, 15); //Texto para Mes
    
    v.add(new JTextField(2)).setBounds(370, 110, 40, 15); //Texto para Año
    
    v.setBorder(new LineBorder(Color.BLACK, 3)); //Con otro nuevo codigo para borde, de tres de grsosor y color negro
    

     //Botones
    JPanel b= new JPanel();
    b.setLayout(new FlowLayout()); //El campo de botones en el cual uso FlowLayout
    b.setBorder(new LineBorder(Color.black, 3));
    b.add(new JButton("Aceptar"));  //Los dos botones para enviar información, Aceptar y Cancelar
    b.add(new JButton("Cancelar"));
    
    
    
    Container h= getContentPane();  //El contenedor de todo, 
    h.add(d, BorderLayout.NORTH);   //El Panel de datos lo coloque en el lado norte, osea al principio, arriba
    h.add(v, BorderLayout.CENTER);  //El Panel para datos de vecindad en el centro,
    h.add(b, BorderLayout.PAGE_END); //El Panel de los botones al final de la hoja.
     //Para este archivo, mas que creatividad, use distintos atributos no vistos en clase,
     //Espero y por eso no le baje puntos a esta tarea. 
    } 
}
