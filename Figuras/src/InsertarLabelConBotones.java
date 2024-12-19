import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InsertarLabelConBotones {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Insertar JLabel con Botones");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 400);

            PanelConLabels panel = new PanelConLabels();
            frame.add(panel, BorderLayout.CENTER);

            JButton insertarLabelButton = new JButton("Insertar Label");
            insertarLabelButton.addActionListener(e -> panel.insertarLabelConBotones());
            JPanel buttonPanel = new JPanel();
            buttonPanel.add(insertarLabelButton);
            frame.add(buttonPanel, BorderLayout.SOUTH);

            frame.setVisible(true);
        });
    }
}

class PanelConLabels extends JPanel {
    private int contador = 0;

    public void insertarLabelConBotones() {
        contador++;
        JLabel label = new JLabel("Label " + contador);

        JButton boton1 = new JButton("Botón 1");
        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Botón 1 presionado en " + label.getText());
            }
        });

        JButton boton2 = new JButton("Botón 2");
        boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Botón 2 presionado en " + label.getText());
            }
        });

        // Usar FlowLayout para que la JLabel se ajuste automáticamente al tamaño de su contenido
        label.setSize(50, 150);
        label.setLayout(new FlowLayout());
        label.add(boton1);
        label.add(boton2);

        add(label);
        revalidate();
        repaint();
    }
}
