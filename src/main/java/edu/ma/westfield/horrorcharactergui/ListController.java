package edu.ma.westfield.horrorcharactergui;

import edu.ma.westfield.horrorcharacter.HorrorCharacter;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.media.AudioClip;

import java.io.IOException;

/**
 * Controller for the character list view. Displays all characters and manages
 * the creation, editing, and deletion of entries.
 */
public class ListController {
    @FXML
    public ListView<HorrorCharacter> listViewCharacters;
    AudioClip buttonClick = new AudioClip(getClass().getResource("/sounds/button.wav").toString());

    /**
     * Initializes the list view by loading all horror characters.
     */
    public void initialize() {
        listViewCharacters.getItems().setAll(AppState.horrorList); // Shows list
    }

    /**
     * Switches to the create-new-character screen.
     *
     * @param event the button event
     * @throws IOException if the view fails to load
     */
    public void handleCreateButton(javafx.event.ActionEvent event) throws IOException {
        buttonClick.play();
        AppState.editMode = false;
        Main.setScene("EditView.fxml");
    }

    /**
     * Opens the edit screen for the currently selected character.
     *
     * @param event the button event
     * @throws IOException if the view fails to load
     */
    public void handleEditButton(javafx.event.ActionEvent event) throws IOException {
        buttonClick.play();
        AppState.selectedCharacter = listViewCharacters.getSelectionModel().getSelectedItem();
        AppState.editMode = true;
        Main.setScene("EditView.fxml");
    }

    /**
     * Deletes the currently selected character from the list.
     *
     * @param event the button event
     */
    public void handleDeleteButton(javafx.event.ActionEvent event) {
        buttonClick.play();
        AppState.selectedCharacter = listViewCharacters.getSelectionModel().getSelectedItem();
        AppState.horrorList.remove(AppState.selectedCharacter);
        listViewCharacters.getItems().setAll(AppState.horrorList);
    }
}