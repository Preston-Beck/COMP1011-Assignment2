package com.example.comp1011assignment2.Controller;

import com.example.comp1011assignment2.Model.SceneChanger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.io.IOException;

public class TeamDetailController {

    @FXML
    private Label teamNameLabel;

    @FXML
    private Label locationlbl;

    @FXML
    private Label divisionlbl;

    @FXML
    private Label conferencelbl;

    @FXML
    private Label franchiselbl;

    @FXML
    private Label firstYearlbl;

    @FXML
    private Label venuelbl;


    @FXML
    void returnToList(ActionEvent event) throws IOException {
        SceneChanger.changeScenes(event, "NHL-tableview.fxml", "NHL Teams");
    }
}
