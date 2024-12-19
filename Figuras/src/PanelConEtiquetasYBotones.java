import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class PanelConEtiquetasYBotones {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Panel con Etiquetas y Botones");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        JPanel panel = new JPanel();
        frame.add(panel);

        List<JLabel> etiquetas = new ArrayList<>();

        JButton agregarBoton = new JButton("Agregar Etiqueta");
        panel.add(agregarBoton);

        agregarBoton.addActionListener(new ActionListener() {
            int contador = 1;

            @Override
            public void actionPerformed(ActionEvent e) {
                // Crea una nueva etiqueta
                JLabel etiqueta = new JLabel("Etiqueta " + contador);
                etiqueta.setOpaque(true);
                etiqueta.setBackground(Color.red);
                etiqueta.setPreferredSize(new Dimension(100, 50));
                

                // Crea un botón para la etiqueta
                JButton boton = new JButton("Presionar");
                boton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JOptionPane.showMessageDialog(frame, "Tocaste la etiqueta " + etiquetas.indexOf(etiqueta));
                    }
                });

                // Agrega la etiqueta y el botón a un panel secundario
                JPanel etiquetaPanel = new JPanel();
                etiquetaPanel.add(etiqueta);
                etiquetaPanel.add(boton);

                // Agrega el panel secundario al panel principal
                panel.add(etiquetaPanel);

                etiquetas.add(etiqueta);

                // Vuelve a validar y repintar el panel para mostrar la nueva etiqueta
                panel.revalidate();
                panel.repaint();
                
                contador++;
            }
        });

        frame.setVisible(true);
    }
}
