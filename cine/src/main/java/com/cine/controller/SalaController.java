package com.cine.controller;

import java.io.IOException;

import com.cine.App;
import com.cine.model.Sala;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

public class SalaController {

    private static Sala salas[] = {new Sala(), new Sala(), new Sala()};
    private int sala;
    
    public void setSala(int sala){
        this.sala = sala;
    }

    @FXML
    private GridPane gridAsiento;

    @FXML
    private Button btnAtrasAsientos;

    @FXML
    private Button btnBoleta;

    @FXML
    private Button btnMatine;

    @FXML
    private Button btnVermut;

    @FXML
    private Button btnVespertino;

    @FXML
    void handleBtnAsientosAction(ActionEvent event) {
        Button button = (Button) event.getSource();
        int x = GridPane.getRowIndex(button) == null ? 0 : GridPane.getRowIndex(button);
        int y = GridPane.getColumnIndex(button) == null ? 0 : GridPane.getColumnIndex(button);

        salas[sala].setX(x);
        salas[sala].setY(y);

        if (salas[sala].verificarPosicionTabla(x, y)) {
            button.setStyle("-fx-background-color: green");
        }

        salas[sala].seleccionarAsientos();
    }

    @FXML
    void handleBtnAtrasAsientosAction(ActionEvent event) throws IOException {
        App.setRoot("catalogo");
    }

    @FXML
    void handleBtnBoletaAction(ActionEvent event) {

    }

    @FXML
    void handleBtnMatineAction(ActionEvent event) {
        gridAsiento.setVisible(true);
        salaHorarioYAsiento(0);
        pintarAsientos();
    }

    @FXML
    void handleBtnVermutAction(ActionEvent event) {
        gridAsiento.setVisible(true);
        salaHorarioYAsiento(1);
        pintarAsientos();
    }

    @FXML
    void handleBtnVespertinoAction(ActionEvent event) {
        gridAsiento.setVisible(true);
        salaHorarioYAsiento(2);
        pintarAsientos();
    }
    
    public void salaHorarioYAsiento(int horario){
        salas[sala].seleccionarHorarioSala(horario);
    }

    

    private void pintarAsientos() {
        gridAsiento.getChildren().forEach((Node node) -> {
            int rowIndex = GridPane.getRowIndex(node) == null ? 0 : GridPane.getRowIndex(node);
            int columnIndex = GridPane.getColumnIndex(node) == null ? 0 : GridPane.getColumnIndex(node);
    
            if (!salas[sala].verificarPosicionTabla(rowIndex, columnIndex)) {
                node.setStyle("-fx-background-color: red"); 
            } else {
                node.setStyle("-fx-background-color: white"); 
            }
        });
    }
    
 
}
