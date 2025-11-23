package edu.ma.westfield.horrorcharactergui;

import edu.ma.westfield.horrorcharacter.Vampire;
import edu.ma.westfield.horrorcharacter.Werewolf;
import edu.ma.westfield.horrorcharacter.Zombie;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Slider;

import java.awt.*;
import java.awt.event.ActionEvent;

public class EditController {
    @FXML
    private RadioButton radioButtonVampire;
    @FXML
    private RadioButton radioButtonWerewolf;
    @FXML
    private RadioButton radioButtonZombie;
    @FXML
    private TextField textCharacterName;
    @FXML
    private DatePicker dateRebirthDate;
    @FXML
    private Slider sliderHealth;
    @FXML
    private Button buttonSave;
    @FXML
    private Button buttonCancel;


    public void handleSaveButton(ActionEvent event) {
        if (!AppState.editMode) {
            if (radioButtonVampire.isPressed()) {
                Vampire newVampire = new Vampire(textCharacterName.getText(), (int)sliderHealth.getValue(), dateRebirthDate.getValue());
            }
            if (radioButtonWerewolf.isPressed()) {
                Werewolf newWerewolf = new Werewolf(textCharacterName.getText(), (int)sliderHealth.getValue(), dateRebirthDate.getValue());
            }
            if (radioButtonZombie.isPressed()) {
                Zombie newZombie = new Zombie(textCharacterName.getText(), (int)sliderHealth.getValue(), dateRebirthDate.getValue());
            }
        }
        else {
           AppState.selectedCharacter.setName(textCharacterName.getText());
           AppState.selectedCharacter.setHealth((int)sliderHealth.getValue());
           AppState.selectedCharacter.setDateOfRebirth(dateRebirthDate.getValue());
        }
        // successfully created
        // return to other view
    }
    public void handleCancelButton(ActionEvent event) {
        // return to other view w/o doing anything
    }


}
