package diseñoeventos;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
    
      //Emilio Corona 2A

public class MenuOperacion extends JFrame {
 Container panel;
 private JTextField n1,n2, resultado;
 JMenuItem S,R,M,D,Cerrar;
 
 public MenuOperacion(){
    super("Menus");
    JMenuBar mim= new JMenuBar(); //crear el objeto de tipo barrra de seleccion
    setJMenuBar(mim);
    JMenu operationMenu = new JMenu("Operaciones");
    operationMenu.setMnemonic('0');
    mim.add(operationMenu);
    operationMenu.add(S= new JMenuItem("Suma",'S'));
    operationMenu.add(R= new JMenuItem("Resta",'R'));
    operationMenu.add(M= new JMenuItem("Multiplicacion",'M'));
    operationMenu.add(D= new JMenuItem("Division",'D'));
    
    JMenu exitMenu = new JMenu("Salir");
    mim.add(exitMenu);
    exitMenu.add(Cerrar = new JMenuItem("Cerrar", 'C'));
    
    JPanel p1 = new JPanel();  //crear los componentes   
    p1.setLayout(new FlowLayout());
    p1.add( new JLabel ("Numero 1:"));
    p1.add( n1 = new JTextField(5));
    p1.add( new JLabel ("Numero 2:"));
    p1.add( n2 = new JTextField(5));       
    p1.add( new JLabel ("Resultado:"));
    p1.add( resultado = new JTextField(5));
    resultado.setEditable(false);
    getContentPane().setLayout( new BorderLayout());
    getContentPane().add(p1, BorderLayout.CENTER);
    //Oyentes
    S.addActionListener(new OyenteMenu());
    R.addActionListener(new OyenteMenu());
    M.addActionListener(new OyenteMenu());
    D.addActionListener(new OyenteMenu());
    Cerrar.addActionListener(new OyenteMenu());     
} //termina el constructor
 
 class OyenteMenu implements ActionListener{
     @Override
     public void actionPerformed(ActionEvent e) {
     String actionCommand = e.getActionCommand();
     Panel p= new Panel();
     if(e.getSource() instanceof JMenuItem){  //recupera el item seleccionado y lo compara
         if("Suma".equals(actionCommand)) calculate('+'); //Si es igual a la suma, invoca al metodo calculate
         else if("Resta".equals(actionCommand)) calculate('-'); //Pasa al parametro, ya sea +,-,*,/
         else if("Multiplicacion".equals(actionCommand)) calculate('*');
         else if("Division".equals(actionCommand)) calculate('/');
         else if("Cerrar".equals(actionCommand)){ System.exit(0);
         }
                 }
         }
     } //fin del oyente
 
private void calculate(char operador){
     int no1= (Integer.parseInt(n1.getText()));
     int no2= (Integer.parseInt(n2.getText().trim()));
     int res=0;
     switch(operador){
         case '+': res = no1 + no2 ; 
         break;
         case '-': res = no1-no2; 
         break;
         case '*': res = no1*no2; 
         break;
         case '/': res = no1/no2; 
         break;
     }
     resultado.setText(String.valueOf(res));
 } 
}
     
 
 
