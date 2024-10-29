import controller.CalculadoraControlador;
import javafx.application.Application;
import javafx.stage.Stage;
import model.CalculadoraModelo;
import view.CalculadoraVista;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Crear modelo, vista y controlador
        CalculadoraModelo modelo = new CalculadoraModelo();
        CalculadoraVista vista = new CalculadoraVista(primaryStage);
        new CalculadoraControlador(modelo, vista);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
