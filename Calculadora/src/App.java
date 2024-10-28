import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class App extends Application{

    private TextField num1;
    private TextField num2;
    private Label resultado;
    

    @Override
    public void start(Stage primaryStage){
        num1 = new TextField();
        num2 = new TextField();
        resultado = new Label("Resultado: ");

        //Creacion de btn
        Button btnSumar = new Button("+");
        Button btnRestar = new Button("-");
        Button btnMultiplicar = new Button("*");
        Button btnDividir = new Button("/");


        //Accion de los btn
        btnSumar.setOnAction(e -> sumar());
        btnRestar.setOnAction(e -> restar());
        btnMultiplicar.setOnAction(e ->  multiplicar());
        btnDividir.setOnAction(e -> dividir());

        //Posicionando 
        //Grid
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10));
        grid.setVgap(10);
        grid.setHgap(10);

        grid.add((new Label("Número 1:")), 0, 0);
        grid.add(num1, 1, 0);
        grid.add((new Label("Número 2:")), 0, 1);
        grid.add(num2, 1, 1);
        grid.add(resultado, 0, 2, 2, 1);

        //HBOX
        HBox buttonBox = new HBox(10, btnSumar, btnRestar, btnMultiplicar, btnDividir );
        buttonBox.setAlignment(Pos.CENTER);
        grid.add(buttonBox, 0, 3, 2,1);


        //Unir todo
        Scene scene = new Scene(grid, 300,200);
        primaryStage.setTitle("Calculadora");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    //Metodos para botones
    private void sumar(){
        double numero1 = Double.parseDouble(num1.getText()) ;
        double numero2 = Double.parseDouble(num2.getText()) ;
        mostrarResultado(numero1+numero2);
    }
    private void restar(){
        double numero1 = Double.parseDouble(num1.getText()) ;
        double numero2 = Double.parseDouble(num2.getText()) ;
        mostrarResultado(numero1-numero2);
    }
    private void dividir(){
        double numero1 = Double.parseDouble(num1.getText()) ;
        double numero2 = Double.parseDouble(num2.getText()) ;
        mostrarResultado(numero1/numero2);
    }
    private void multiplicar(){
        double numero1 = Double.parseDouble(num1.getText()) ;
        double numero2 = Double.parseDouble(num2.getText()) ;
        mostrarResultado(numero1*numero2);
    }
    private void mostrarResultado(double resultadoLabel){
        resultado.setText("Resultado: "+ resultadoLabel);
    }


    public static void main(String[] args) {
        launch(args);
    }

}
