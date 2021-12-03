package com.example.comp1011assignment2.Controller;

import com.example.comp1011assignment2.Model.SceneChanger;
import com.example.comp1011assignment2.Model.Team;
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

    /**
     * Method called by NHLTableController.getMoreDetails.
     * Updates all the information labels to coincide with the Team object passed to it.
     * @param team Team object used to get text for labels
     */
    @FXML
    public void populateScene(Team team){
        teamNameLabel.setText(team.getName());
        locationlbl.setText(team.getLocationName());
        divisionlbl.setText(team.getDivision().getName());
        conferencelbl.setText(team.getConference().getName());
        franchiselbl.setText(team.getFranchise().getTeamName());
        firstYearlbl.setText(String.valueOf(team.getFirstYearOfPlay()));
        venuelbl.setText(team.getVenue().getName());
    }

    /**
     * Loads the NHL-tableview.fxml scene with a title of NHL Teams
     * @param event Attached to onAction for Return to List button
     * @throws IOException
     */
    @FXML
    void returnToList(ActionEvent event) throws IOException {
        SceneChanger.changeScenes(event, "NHL-tableview.fxml", "NHL Teams");
    }
}
