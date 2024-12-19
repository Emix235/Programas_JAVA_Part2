import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class MapaConceptualApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Mapa Conceptual");

        Canvas canvas = new Canvas(800, 600);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        Pane root = new Pane(canvas);
        Scene scene = new Scene(root, 800, 600);

        primaryStage.setScene(scene);
        primaryStage.show();

        DibujarConcepto(gc, 130, 130, "Concepto 1");
        DibujarConcepto(gc, 270, 130, "Concepto 2");
        DibujarConcepto(gc, 200, 300, "Concepto 3");

        DibujarLinea(gc, 150, 150, 250, 150);
        DibujarLinea(gc, 250, 150, 200, 275);
    }

    private void DibujarConcepto(GraphicsContext gc, double x, double y, String concepto) {
        gc.setFill(Color.LIGHTGRAY);
        gc.fillRect(x - 50, y - 20, 100, 40);
        gc.setFill(Color.BLACK);
        gc.strokeRect(x - 50, y - 20, 100, 40);
        gc.fillText(concepto, x - 40, y);
    }

    private void DibujarLinea(GraphicsContext gc, double x1, double y1, double x2, double y2) {
        gc.setStroke(Color.BLACK);
        gc.setLineWidth(2);
        gc.strokeLine(x1, y1, x2, y2);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
