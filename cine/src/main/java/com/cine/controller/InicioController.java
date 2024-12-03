package com.cine.controller;

import java.io.IOException;

import com.cine.App;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class InicioController {

    @FXML
    private Button btnCatalogo;

    @FXML
    private Button btnIngresos;

    @FXML
    void handleBtnCatalogoAction(ActionEvent event) throws IOException {
        App.setRoot("catalogo");
    }

    @FXML
    void handleBtnIngresoAction(ActionEvent event) {

    }

}

