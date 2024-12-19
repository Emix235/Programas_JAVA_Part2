package diseñoeventos;
import java.awt.*;
import java.awt.Event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class ButtonPanel extends JPanel implements ActionListener {
    private JButton botonRojo;
      private JButton botonVerde;
        private JButton botonAzul;
        
        public ButtonPanel(){
            botonRojo=new JButton("Pizarra Roja");
             botonVerde=new JButton("Pizarra Verde");
              botonAzul=new JButton("Pizarra Azul");
              this.add(botonRojo);
               this.add(botonVerde);
                this.add(botonAzul);
                botonRojo.addActionListener(this);
                 botonVerde.addActionListener(this);
                  botonAzul.addActionListener(this);
        }

        public void actionPerformed(ActionEvent event){
            Object source=event.getSource();
            Color color=getBackground();
            if(source==botonRojo)
                color=Color.RED;
            else if(source==botonVerde)
                color=Color.GREEN;
            else if(source==botonAzul)
                color=Color.BLUE;
            setBackground(color);
            repaint();
        }
}

