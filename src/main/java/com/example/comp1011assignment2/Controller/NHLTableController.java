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

import java.net.URL;
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
    void getSearchResults(ActionEvent event){
        teamListView.getItems().addAll(APIUtility.getTeamsFromJSON().getTeams());
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){
        teamListView.getSelectionModel().selectedItemProperty().addListener(
                (observable, old, teamSelected) -> {

                }
        );
    }
}
