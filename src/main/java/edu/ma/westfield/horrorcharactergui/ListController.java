package edu.ma.westfield.horrorcharactergui;

import java.awt.event.ActionEvent;

public class ListController {
    public void handleCreateButton(ActionEvent event) {
        AppState.editMode = false;
        // go to other view
    }
    public void handleEditButton(ActionEvent event) {
        AppState.editMode = true;
        // go to other view
    }
    public void handleDeleteButton(ActionEvent event) {

    }
}
