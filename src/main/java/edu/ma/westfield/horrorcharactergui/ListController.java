package edu.ma.westfield.horrorcharactergui;

import edu.ma.westfield.horrorcharacter.HorrorCharacter;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.media.AudioClip;

import java.io.IOException;


public class ListController {
    @FXML
    public ListView<HorrorCharacter> listViewCharacters;
    AudioClip buttonClick = new AudioClip(getClass().getResource("/sounds/button.wav").toString());

    public void initialize() {
        listViewCharacters.getItems().setAll(AppState.horrorList); // Shows list
    }

    public void handleCreateButton(javafx.event.ActionEvent event) throws IOException {
        buttonClick.play();
        AppState.editMode = false;
        Main.setScene("EditView.fxml");
    }
    public void handleEditButton(javafx.event.ActionEvent event) throws IOException {
        buttonClick.play();
        AppState.selectedCharacter = listViewCharacters.getSelectionModel().getSelectedItem();
        AppState.editMode = true;
        Main.setScene("EditView.fxml");
    }
    public void handleDeleteButton(javafx.event.ActionEvent event) {
        buttonClick.play();
        AppState.selectedCharacter = listViewCharacters.getSelectionModel().getSelectedItem();
        AppState.horrorList.remove(AppState.selectedCharacter);
        listViewCharacters.getItems().setAll(AppState.horrorList);
    }
}
