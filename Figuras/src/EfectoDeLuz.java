import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;

public class EfectoDeLuz {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Efecto de Luz");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 400);

            LightPanel lightPanel = new LightPanel();
            frame.add(lightPanel);

            frame.setVisible(true);
        });
    }
}

class LightPanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Dibuja un fondo oscuro
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, getWidth(), getHeight());

        // Dibuja un círculo que representa la fuente de luz
        g.setColor(Color.WHITE);
        int centerX = getWidth() / 2;
        int centerY = getHeight() / 2;
        int radius = 100;
        g.fillOval(centerX - radius, centerY - radius, radius * 2, radius * 2);

        // Crea una forma elíptica para simular el efecto de luz
        Shape lightShape = new Ellipse2D.Double(centerX - radius, centerY - radius, radius * 2, radius * 2);

        // Crea un gradiente para el efecto de luz
        RadialGradientPaint gradient = new RadialGradientPaint(
            new Point2D.Double(centerX, centerY),
            radius,
            new float[] { 0.0f, 1.0f },
            new Color[] { new Color(0, 0, 0, 0), Color.WHITE }
        );

        // Aplica el gradiente a la forma elíptica
        Graphics2D g2d = (Graphics2D) g;
        g2d.setPaint(gradient);
        g2d.fill(lightShape);
    }
}
