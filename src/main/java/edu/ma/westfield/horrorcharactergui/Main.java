package edu.ma.westfield.horrorcharactergui;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.media.AudioClip;

import java.io.IOException;

public class Main extends Application {
    private static Stage currentStage;
    AudioClip audioBuffer = new AudioClip(getClass().getResource("/sounds/buffer.wav").toString());


    @Override
    public void start(Stage stage) throws IOException {
        currentStage = stage;
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("ListView.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 620, 440);
        stage.setTitle("Horror Character List");
        stage.setScene(scene);
        stage.show();
        audioBuffer.setVolume(0); // Silent
        audioBuffer.setCycleCount(AudioClip.INDEFINITE); // Loops forever
        audioBuffer.play(); // Allows sound to play
    }

    public static void setScene(String fxmlFile) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource(fxmlFile));
        Scene scene = new Scene(fxmlLoader.load(), 620, 440);
        currentStage.setScene(scene);
        currentStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
