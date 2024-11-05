package view;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import controller.CatController;

public class CatSlide {
    private Scene scene;
    private Label catLabel;
    private ImageView catImageView;
    private Button backButton;
    private Button nextButton;

    public CatSlide(Stage stage, CatController controller) {
        catLabel = new Label("Gatitos");
        catImageView = new ImageView();

        backButton = new Button("Atrás");
        nextButton = new Button("Adelante");

        backButton.setOnAction(e -> controller.handleBackButton());
        nextButton.setOnAction(e -> controller.handleNextButton());

        HBox buttonLayout = new HBox(10, backButton, nextButton);
        buttonLayout.setAlignment(Pos.CENTER);

        VBox layout = new VBox(10, catLabel, catImageView, buttonLayout);
        layout.setAlignment(Pos.CENTER);

        scene = new Scene(layout, 800, 800);
    }

    public Scene getScene() {
        return scene;
    }

    public void setCatImage(String imageUrl) {
        Image catImage = new Image(imageUrl);
        catImageView.setImage(catImage);
        catImageView.setFitWidth(600);
        catImageView.minHeight(600);
        catImageView.setFitHeight(600);
        catImageView.setPreserveRatio(true);
    }
}
