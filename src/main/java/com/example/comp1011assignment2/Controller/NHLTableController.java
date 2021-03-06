package com.example.comp1011assignment2.Controller;
import com.example.comp1011assignment2.Main;
import com.example.comp1011assignment2.Model.SceneChanger;
import com.example.comp1011assignment2.Model.Team;
import com.example.comp1011assignment2.Utilities.APIUtility;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.stage.Stage;

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
    private Label detailsLabel;

    @FXML
    private Button detailsButton;

    /**
     * When Search button is pressed, the JSON file is read and returns an array of Teams.
     * Each team is checked to see if it contains the corresponding String from the search bar.
     * @param event Button Press
     */
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

    /**
     * This method is called when the More Details Button is pressed.
     * Grabs the selected team and uses it to call a controller method from the new scene.
     * Loads the teamDetailView.fxml file with a title of Team Details.
     * @param event More details button
     * @throws IOException
     */
    @FXML
    public void getMoreDetails(ActionEvent event) throws IOException {
        Team selectedTeam = teamListView.getSelectionModel().getSelectedItem();

        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("teamDetailView.fxml"));
        Parent root = fxmlLoader.load();

        TeamDetailController teamDetailController = fxmlLoader.getController();
        teamDetailController.populateScene(selectedTeam);

        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setTitle("Team Details");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * When the scene loads, details label and button are made invisible and the teams found label is updated.
     * An event listener for when a team is selected is implemented as well.
     * @param url
     * @param resourceBundle
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){
        detailsLabel.setVisible(false);
        detailsButton.setVisible(false);
        teamsFoundLabel.setText("Number of Teams Found: " + String.valueOf(teamListView.getItems().size()));
        teamListView.getSelectionModel().selectedItemProperty().addListener(
                (observable, old, teamSelected) -> {
                    detailsLabel.setVisible(true);
                    detailsButton.setVisible(true);
                }
        );

    }
}
