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
        //teamListView.getItems().addAll(APIUtility.getTeamsFromJSON().getTeams());
        //ArrayList<Team> teams = new ArrayList<Team>(List.of(APIUtility.getTeamsFromJSON().getTeams()));
        teamListView.getItems().clear();
        Team[] teams = APIUtility.getTeamsFromJSON().getTeams();
        for(Team team : teams){
            if(team.getTeamName().contains(teamNameTextField.getText())){
                teamListView.getItems().add(team);
            }
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){
        teamListView.getSelectionModel().selectedItemProperty().addListener(
                (observable, old, teamSelected) -> {

                }
        );
    }
}
