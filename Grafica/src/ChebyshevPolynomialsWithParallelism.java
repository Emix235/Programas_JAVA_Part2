import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ChebyshevPolynomialsWithParallelism {

    // Función para calcular el polinomio de Chebyshev de primer tipo
    static double chebyshevPolyFirstKind(int n, double x) {
        if (n == 0) {
            return 1.0;
        } else if (n == 1) {
            return x;
        } else {
            return 2 * x * chebyshevPolyFirstKind(n - 1, x) - chebyshevPolyFirstKind(n - 2, x);
        }
    }

    // Clase interna para calcular un polinomio de Chebyshev en paralelo
    static class ChebyshevTask implements Runnable {
        private int n;
        private int numPoints;
        private double[] results;

        public ChebyshevTask(int n, int numPoints) {
            this.n = n;
            this.numPoints = numPoints;
            this.results = new double[numPoints];
        }

        public double[] getResults() {
            return results;
        }

        @Override
        public void run() {
            for (int i = 0; i < numPoints; i++) {
                double x = -1 + 2.0 * i / (numPoints - 1); // Mapear x al intervalo [-1, 1]
                results[i] = chebyshevPolyFirstKind(n, x);
            }
        }
    }

    public static void main(String[] args) {
        int degree = 6;
        int numPoints = 1000;
        int numThreads = 4;

        ExecutorService executor = Executors.newFixedThreadPool(numThreads);
        XYSeriesCollection dataset = new XYSeriesCollection();

        // Calcular polinomios de Chebyshev en paralelo
        for (int i = 0; i <= degree; i++) {
            ChebyshevTask task = new ChebyshevTask(i, numPoints);
            executor.execute(task);

            // Agregar puntos a la serie para graficar el polinomio
            XYSeries series = new XYSeries("T_" + i + "(x)");
            double[] results = task.getResults();
            for (int j = 0; j < numPoints; j++) {
                double x = -1 + 2.0 * j / (numPoints - 1); // Mapear x al intervalo [-1, 1]
                series.add(x, results[j]);
            }
            dataset.addSeries(series);
        }

        executor.shutdown();

        try {
            executor.awaitTermination(10, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Crear el gráfico
        JFreeChart chart = ChartFactory.createXYLineChart(
                "Polinomios de Chebyshev de Primer Tipo",
                "x",
                "y",
                dataset,
                PlotOrientation.VERTICAL,
                true,
                true,
                false
        );

        // Mostrar el gráfico
        XYPlot plot = (XYPlot) chart.getPlot();
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(800, 600));

        // Crear el gráfico
        javax.swing.JFrame frame = new javax.swing.JFrame("Polinomios de Chebyshev");
        frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(chartPanel);
        frame.pack();
        frame.setVisible(true);
    }
}
