package com.example.comp1011assignment2.Model;

import com.example.comp1011assignment2.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class SceneChanger {
    /**
     * Loads a new scene.
     * @param event Any event (Usually a button press).
     * @param fxmlFile Specify the fxml file name of the scene you are trying to load.
     * @param title Adds a custom title to the scene.
     * @throws IOException
     */
    public static void changeScenes(ActionEvent event, String fxmlFile, String title) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource(fxmlFile));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();

        stage.setTitle(title);
        stage.setScene(scene);
        stage.show();
    }
}
