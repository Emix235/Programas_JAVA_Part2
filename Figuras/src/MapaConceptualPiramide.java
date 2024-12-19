import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MapaConceptualPiramide {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Mapa Conceptual Pirámide");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 600);

            ConceptoPanel conceptoPanel = new ConceptoPanel();
            frame.add(conceptoPanel);

            frame.setVisible(true);

            String[] palabras = {"Tema 1", "Subtema 1", "Subtema 2", "Tema 2", "Subtema 3"};
            conceptoPanel.mostrarConceptos(palabras);
        });
    }
}

class ConceptoPanel extends JPanel {
    private final int ANCHO_CONCEPTO = 100;
    private final int ALTO_CONCEPTO = 30;
    private final int ESPACIO_HORIZONTAL = 50;
    private final int ESPACIO_VERTICAL = 50;

    private String[] palabras;
    private Point[] puntos;
    private int nivel;

    public void mostrarConceptos(String[] palabras) {
        this.palabras = palabras;
        this.nivel = palabras.length - 1;
        this.puntos = new Point[palabras.length];

        int x = getWidth() / 2 - nivel * ANCHO_CONCEPTO / 2;
        int y = getHeight() - (nivel + 1) * (ALTO_CONCEPTO + ESPACIO_VERTICAL);
        
        for (int i = 0; i < palabras.length; i++) {
            puntos[i] = new Point(x + i * ANCHO_CONCEPTO, y + i * (ALTO_CONCEPTO + ESPACIO_VERTICAL));
        }

        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                for (int i = 0; i < puntos.length; i++) {
                    if (puntos[i].x <= e.getX() && e.getX() <= puntos[i].x + ANCHO_CONCEPTO &&
                        puntos[i].y <= e.getY() && e.getY() <= puntos[i].y + ALTO_CONCEPTO) {
                        nivel = i;
                        repaint();
                        break;
                    }
                }
            }
        });

        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (int i = 0; i <= nivel; i++) {
            g.setColor(Color.WHITE);
            g.fillRect(puntos[i].x, puntos[i].y, ANCHO_CONCEPTO, ALTO_CONCEPTO);
            g.setColor(Color.BLACK);
            g.drawRect(puntos[i].x, puntos[i].y, ANCHO_CONCEPTO, ALTO_CONCEPTO);

            g.setColor(Color.BLACK);
            g.drawString(palabras[i], puntos[i].x + 10, puntos[i].y + ALTO_CONCEPTO / 2 + 5);

            // Dibuja enlaces entre las palabras
            if (i > 0) {
                g.drawLine(puntos[i - 1].x + ANCHO_CONCEPTO / 2, puntos[i - 1].y + ALTO_CONCEPTO,
                           puntos[i].x + ANCHO_CONCEPTO / 2, puntos[i].y);
            }
        }
    }
}
