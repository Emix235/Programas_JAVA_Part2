import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelConEtiquetasDinamicas {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Panel con Etiquetas Dinámicas");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        JPanel panel = new JPanel();
        frame.add(panel);

        JButton agregarBoton = new JButton("Agregar Etiqueta");
        panel.add(agregarBoton);

        agregarBoton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Crea una nueva etiqueta
                JLabel etiqueta = new JLabel("Nueva Etiqueta");
                etiqueta.setPreferredSize(new Dimension(100, 50));
                panel.add(etiqueta);

                // Vuelve a validar y repinta el panel para mostrar la nueva etiqueta
                panel.revalidate();
                panel.repaint();
            }
        });

        frame.setVisible(true);
    }
}
