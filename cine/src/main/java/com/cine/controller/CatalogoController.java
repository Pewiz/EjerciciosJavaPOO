package com.cine.controller;

import java.io.IOException;

import com.cine.App;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class CatalogoController {
    
    SalaController salaC = new SalaController();
    
    @FXML
    private Button btnAtras;

    @FXML
    private Button btnCars;

    @FXML
    private Button btnJohnWick;

    @FXML
    private Button btnSpiderMan;

    @FXML
    void handleBtnAtrasAction(ActionEvent event) throws IOException {
        App.setRoot("inicio");
    }

    @FXML
    void handleBtnCarsAction(ActionEvent event) throws IOException {
        App.setRoot("salas");
        salaC.setSala(0);
    }

    @FXML
    void handleBtnJohnWickAction(ActionEvent event) throws IOException {
        App.setRoot("salas");
        salaC.setSala(1);
    }

    @FXML
    void handlebtnSpiderManAction(ActionEvent event) throws IOException {
        App.setRoot("salas");
        salaC.setSala(2);
    }
    


}
