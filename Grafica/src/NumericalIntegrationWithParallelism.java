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

public class NumericalIntegrationWithParallelism {

    // Función a integrar
    static double functionToIntegrate(double x) {
        return Math.pow(x, 2);
    }

    // Clase interna para realizar la integración en paralelo
    static class IntegrationTask implements Runnable {
        private double start;
        private double end;
        private int numPoints;
        private double result;

        public IntegrationTask(double start, double end, int numPoints) {
            this.start = start;
            this.end = end;
            this.numPoints = numPoints;
        }

        public double getResult() {
            return result;
        }

        @Override
        public void run() {
            double width = (end - start) / numPoints;
            double sum = 0.0;

            for (int i = 0; i < numPoints; i++) {
                double x = start + i * width;
                sum += functionToIntegrate(x);
            }

            result = sum * width;
        }
    }

    public static void main(String[] args) {
        double a = 0;
        double b = 1;
        int numPoints = 1000;
        int numThreads = 2;

        ExecutorService executor = Executors.newFixedThreadPool(numThreads);
        XYSeries series = new XYSeries("Function");

        // Crear tareas de integración en paralelo
        for (int i = 0; i < numThreads; i++) {
            double start = a + i * (b - a) / numThreads;
            double end = a + (i + 1) * (b - a) / numThreads;

            IntegrationTask task = new IntegrationTask(start, end, numPoints);
            executor.execute(task);

            // Agregar puntos a la serie para graficar la función
            for (int j = 0; j < numPoints; j++) {
                double x = start + j * (end - start) / numPoints;
                series.add(x, functionToIntegrate(x));
            }
        }

        executor.shutdown();

        try {
            executor.awaitTermination(10, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Sumar los resultados parciales
        double totalResult = 0.0;
        for (int i = 0; i < numThreads; i++) {
            IntegrationTask task = new IntegrationTask(0, 0, 0);
            totalResult += task.getResult();
        }

        System.out.println("Resultado integral (paralelo): " + totalResult);

        // Crear el gráfico
        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(series);

        JFreeChart chart = ChartFactory.createXYLineChart(
                "Function Plot",
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
        chartPanel.setPreferredSize(new java.awt.Dimension(560, 370));

        // Agregar área bajo la curva
        plot.setForegroundAlpha(0.3f);

        // Crear el gráfico
        javax.swing.JFrame frame = new javax.swing.JFrame("Function Plot");
        frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(chartPanel);
        frame.pack();
        frame.setVisible(true);
    }
}

