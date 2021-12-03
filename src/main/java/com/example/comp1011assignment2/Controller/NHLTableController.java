package com.example.comp1011assignment2.Controller;
import com.example.comp1011assignment2.Model.Team;
import com.example.comp1011assignment2.Utilities.APIUtility;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

public class NHLTableController implements Initializable {

    @FXML
    private TextField teamNameTextField;

    @FXML
    private ListView<Team> teamListView;

    @FXML
    private Label teamsFoundLabel;

    @FXML
    private Button searchButton;

    @FXML
    void getSearchResults(ActionEvent event) {
        teamListView.getItems().clear();
        Team[] teams = APIUtility.getTeamsFromJSON().getTeams();
        for(Team team : teams){
            if(team.getName().toLowerCase().contains(teamNameTextField.getText().toLowerCase())){
                teamListView.getItems().add(team);
            }
        }
        teamsFoundLabel.setText("Number of Teams Found: " + String.valueOf(teamListView.getItems().size()));
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){
        teamListView.getSelectionModel().selectedItemProperty().addListener(
                (observable, old, teamSelected) -> {

                }
        );
    }
}
