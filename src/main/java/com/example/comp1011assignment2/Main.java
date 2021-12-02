package com.example.comp1011assignment2;

import com.example.comp1011assignment2.Model.NHLStatsApiResponse;
import com.example.comp1011assignment2.Utilities.APIUtility;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("NHL-tableview.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("NHL Teams");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
//        NHLStatsApiResponse result = APIUtility.getTeamsFromJSON();
//        System.out.println(result);
    }
}