import javafx.application.Application;
import javafx.stage.Stage;
import controller.CatController;

public class App extends Application {
    @Override
    public void start(Stage primaryStage) {
        new CatController(primaryStage);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
