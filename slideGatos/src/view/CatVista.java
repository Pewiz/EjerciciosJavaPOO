package view;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import controller.CatController;

public class CatVista {
    private Scene scene;
    private Button startButton;

    public CatVista(Stage stage, CatController controller) {
        startButton = new Button("Cargar gatitos");

        startButton.setOnAction(e -> controller.handleStartButton());

        VBox containerBtnInicio = new VBox(10, startButton);
        containerBtnInicio.setAlignment(Pos.CENTER);

        scene = new Scene(containerBtnInicio, 800, 800);
        stage.setTitle("Gatos");
    }

    public Scene getScene() {
        return scene;
    }
}
