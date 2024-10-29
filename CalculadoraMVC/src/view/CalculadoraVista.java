package view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class CalculadoraVista {

    private TextField num1Field;
    private TextField num2Field;
    private Label resultLabel;
    private Button addButton;
    private Button subtractButton;
    private Button multiplyButton;
    private Button divideButton;

    public CalculadoraVista(Stage stage) {
        num1Field = new TextField();
        num2Field = new TextField();
        resultLabel = new Label("Resultado: ");

        addButton = new Button("+");
        subtractButton = new Button("-");
        multiplyButton = new Button("*");
        divideButton = new Button("/");

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10));
        grid.setVgap(10);
        grid.setHgap(10);

        grid.add(new Label("Número 1:"), 0, 0);
        grid.add(num1Field, 1, 0);
        grid.add(new Label("Número 2:"), 0, 1);
        grid.add(num2Field, 1, 1);
        grid.add(resultLabel, 0, 2, 2, 1);

        HBox buttonBox = new HBox(10, addButton, subtractButton, multiplyButton, divideButton);
        buttonBox.setAlignment(Pos.CENTER);
        grid.add(buttonBox, 0, 3, 2, 1);

        Scene scene = new Scene(grid, 300, 200);
        stage.setTitle("Calculadora con MVC");
        stage.setScene(scene);
        stage.show();
    }

    public TextField getNum1Field() {
        return num1Field;
    }

    public TextField getNum2Field() {
        return num2Field;
    }

    public Label getResultLabel() {
        return resultLabel;
    }

    public Button getAddButton() {
        return addButton;
    }

    public Button getSubtractButton() {
        return subtractButton;
    }

    public Button getMultiplyButton() {
        return multiplyButton;
    }

    public Button getDivideButton() {
        return divideButton;
    }
}
