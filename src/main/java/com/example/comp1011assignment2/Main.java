package com.example.comp1011assignment2;

import com.example.comp1011assignment2.Model.NHLStatsApiResponse;
import com.example.comp1011assignment2.Utilities.APIUtility;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Main extends Application {
    /**
     * Loads initial Scene when program is launched.
     * @param stage
     * @throws IOException
     */
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("NHL-tableview.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("NHL Teams");
        Image icon = new Image(Objects.requireNonNull(getClass().getResourceAsStream("nhlLogo.png")));
        stage.getIcons().add(icon);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}