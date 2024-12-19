import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

public class ArrastrarFiguras extends JFrame {
    private List<Figura> figuras = new ArrayList<>();
    private Figura figuraSeleccionada = null;
    private int offsetX, offsetY;

    public ArrastrarFiguras() {
        setTitle("Arrastrar Figuras");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                for (Figura figura : figuras) {
                    figura.dibujar(g);
                }
            }
        };

        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON1) {
                    Figura cuadro = new Cuadro(e.getX(), e.getY());
                    figuras.add(cuadro);
                    repaint();
                } else if (e.getButton() == MouseEvent.BUTTON3) {
                    Figura linea = new Linea(e.getX(), e.getY());
                    figuras.add(linea);
                    repaint();
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
                for (Figura figura : figuras) {
                    if (figura.contiene(e.getX(), e.getY())) {
                        figuraSeleccionada = figura;
                        offsetX = e.getX() - figura.getX();
                        offsetY = e.getY() - figura.getY();
                        break;
                    }
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                figuraSeleccionada = null;
            }
        });

        panel.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                if (figuraSeleccionada != null) {
                    figuraSeleccionada.moverA(e.getX() - offsetX, e.getY() - offsetY);
                    repaint();
                }
            }
        });

        add(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ArrastrarFiguras app = new ArrastrarFiguras();
            app.setVisible(true);
        });
    }

    interface Figura {
        void dibujar(Graphics g);
        boolean contiene(int x, int y);
        int getX();
        int getY();
        void moverA(int x, int y);
    }

    class Cuadro implements Figura {
        private int x, y;

        public Cuadro(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public void dibujar(Graphics g) {
            g.setColor(Color.BLUE);
            g.fillRect(x, y, 40, 40);
        }

        @Override
        public boolean contiene(int x, int y) {
            return x >= this.x && x <= this.x + 40 && y >= this.y && y <= this.y + 40;
        }

        @Override
        public int getX() {
            return x;
        }

        @Override
        public int getY() {
            return y;
        }

        @Override
        public void moverA(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    class Linea implements Figura {
        private int x, y;

        public Linea(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public void dibujar(Graphics g) {
            g.setColor(Color.RED);
            ((Graphics2D) g).setStroke(new BasicStroke(5)); // Grosor de línea
            g.drawLine(x, y, x + 40, y + 40);
        }

        @Override
        public boolean contiene(int x, int y) {
            return false;  // Las líneas no se pueden seleccionar
        }

        @Override
        public int getX() {
            return x;
        }

        @Override
        public int getY() {
            return y;
        }

        @Override
        public void moverA(int x, int y) {
            // No se puede mover una línea
        }
    }
}
