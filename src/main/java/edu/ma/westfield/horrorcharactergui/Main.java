package edu.ma.westfield.horrorcharactergui;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.media.AudioClip;

import java.io.IOException;

/**
 * Main entry point for the JavaFX application. Manages scene switching
 * and initializes the primary stage.
 */
public class Main extends Application {
    private static Stage currentStage;
    AudioClip audioBuffer = new AudioClip(getClass().getResource("/sounds/buffer.wav").toString());

    /**
     * Starts the application by loading the main list view.
     *
     * @param stage the primary JavaFX stage
     * @throws IOException if the FXML file cannot be loaded
     */
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

    /**
     * Changes the current scene displayed by the application.
     *
     * @param fxmlFile the FXML file to load
     * @throws IOException if the file cannot be loaded
     */
    public static void setScene(String fxmlFile) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource(fxmlFile));
        Scene scene = new Scene(fxmlLoader.load(), 620, 440);
        currentStage.setScene(scene);
        currentStage.show();
    }

    /**
     * Launches the JavaFX application.
     *
     * @param args command-line arguments (unused)
     */
    public static void main(String[] args) {
        launch();
    }
}