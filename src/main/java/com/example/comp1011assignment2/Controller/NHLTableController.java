package com.example.comp1011assignment2.Controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class NHLTableController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}