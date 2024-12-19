import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

public class CuadrosConLineasAvanzado {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Cuadros con Líneas Avanzado");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 600);

            CuadrosPanel cuadrosPanel = new CuadrosPanel();
            frame.add(cuadrosPanel, BorderLayout.CENTER);

            JPanel buttonPanel = new JPanel();
            JButton agregarCuadroButton = new JButton("Agregar Cuadro");
            agregarCuadroButton.addActionListener(e -> cuadrosPanel.agregarCuadro());
            buttonPanel.add(agregarCuadroButton);
            frame.add(buttonPanel, BorderLayout.SOUTH);

            frame.setVisible(true);
        });
    }
}

class Cuadro {
    private Rectangle rectangulo;
    private Color color;

    public Cuadro(int x, int y, int width, int height, Color color) {
        rectangulo = new Rectangle(x, y, width, height);
        this.color = color;
    }

    public Rectangle getRectangulo() {
        return rectangulo;
    }

    public Color getColor() {
        return color;
    }
}

class Linea {
    private Point punto1;
    private Point punto2;

    public Linea(Point punto1, Point punto2) {
        this.punto1 = punto1;
        this.punto2 = punto2;
    }

    public Point getPunto1() {
        return punto1;
    }

    public Point getPunto2() {
        return punto2;
    }

    public void actualizarPunto2(Point nuevoPunto) {
        punto2 = nuevoPunto;
    }
}

class CuadrosPanel extends JPanel {
    private List<Cuadro> cuadros;
    private List<Linea> lineas;
    private Cuadro cuadroSeleccionado;
    private Linea lineaEnCreacion;
    private Point puntoDeUnion;

    public CuadrosPanel() {
        cuadros = new ArrayList<>();
        lineas = new ArrayList();

        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                for (Cuadro cuadro : cuadros) {
                    if (cuadro.getRectangulo().contains(e.getPoint())) {
                        if (cuadroSeleccionado != null) {
                            cuadroSeleccionado = null;
                        }
                        cuadroSeleccionado = cuadro;
                        if (lineaEnCreacion != null) {
                            lineaEnCreacion.actualizarPunto2(new Point(cuadro.getRectangulo().x + cuadro.getRectangulo().width / 2, cuadro.getRectangulo().y + cuadro.getRectangulo().height / 2));
                            lineas.add(lineaEnCreacion);
                            lineaEnCreacion = null;
                        }
                        repaint();
                        break;
                    }
                }
            }

            public void mousePressed(MouseEvent e) {
                if (cuadroSeleccionado != null) {
                    puntoDeUnion = e.getPoint();
                    lineaEnCreacion = new Linea(puntoDeUnion, puntoDeUnion);
                }
            }

            public void mouseReleased(MouseEvent e) {
                if (cuadroSeleccionado != null) {
                    if (puntoDeUnion != null) {
                        puntoDeUnion = e.getPoint();
                        repaint();
                    }
                }
            }
        });

        addMouseMotionListener(new MouseAdapter() {
            public void mouseDragged(MouseEvent e) {
                if (cuadroSeleccionado != null) {
                    cuadroSeleccionado.getRectangulo().translate(e.getX() - puntoDeUnion.x, e.getY() - puntoDeUnion.y);
                    puntoDeUnion = new Point(cuadroSeleccionado.getRectangulo().x + cuadroSeleccionado.getRectangulo().width / 2, cuadroSeleccionado.getRectangulo().y + cuadroSeleccionado.getRectangulo().height / 2);
                    if (lineaEnCreacion != null) {
                        lineaEnCreacion.actualizarPunto2(puntoDeUnion);
                    }
                    repaint();
                }
            }
        });
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (Cuadro cuadro : cuadros) {
            g.setColor(cuadro.getColor());
            g.fillRect(cuadro.getRectangulo().x, cuadro.getRectangulo().y, cuadro.getRectangulo().width, cuadro.getRectangulo().height);
        }

        g.setColor(Color.BLACK);
        for (Linea linea : lineas) {
            g.drawLine(linea.getPunto1().x, linea.getPunto1().y, linea.getPunto2().x, linea.getPunto2().y);
        }

        if (lineaEnCreacion != null) {
            g.drawLine(lineaEnCreacion.getPunto1().x, lineaEnCreacion.getPunto1().y, lineaEnCreacion.getPunto2().x, lineaEnCreacion.getPunto2().y);
        }
    }

    public void agregarCuadro() {
        int x = (int) (Math.random() * (getWidth() - 50));
        int y = (int) (Math.random() * (getHeight() - 50));
        int width = 50;
        int height = 50;
        cuadros.add(new Cuadro(x, y, width, height, Color.BLUE));
        repaint();
    }
}
