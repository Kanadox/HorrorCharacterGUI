package edu.ma.westfield.horrorcharactergui;

import edu.ma.westfield.horrorcharacter.Vampire;
import edu.ma.westfield.horrorcharacter.Werewolf;
import edu.ma.westfield.horrorcharacter.Zombie;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.IOException;

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
    ToggleGroup horrorType = new ToggleGroup();


    public void initialize() {
        radioButtonVampire.setToggleGroup(horrorType);
        radioButtonWerewolf.setToggleGroup(horrorType);
        radioButtonZombie.setToggleGroup(horrorType);
        if (AppState.editMode) {
            if (AppState.selectedCharacter.getClass() == Vampire.class)
                radioButtonVampire.setSelected(true);
            else if (AppState.selectedCharacter.getClass() == Werewolf.class)
                radioButtonWerewolf.setSelected(true);
            else if (AppState.selectedCharacter.getClass() == Zombie.class)
                radioButtonZombie.setSelected(true);
            textCharacterName.setText(AppState.selectedCharacter.getName());
            dateRebirthDate.setValue(AppState.selectedCharacter.getDateOfRebirth());
            sliderHealth.setValue((int)AppState.selectedCharacter.getHealth());
        }
    }

    public void handleSaveButton(javafx.event.ActionEvent event) throws IOException {
        if (radioButtonVampire.isSelected()) {
            Vampire vampire = new Vampire(textCharacterName.getText(), (int)sliderHealth.getValue(), dateRebirthDate.getValue());
            if (!AppState.editMode)
                AppState.horrorList.add(vampire);
            else {
                AppState.horrorList.set(AppState.horrorList.indexOf(AppState.selectedCharacter), vampire);
            }
        }
        else if (radioButtonWerewolf.isSelected()) {
            Werewolf werewolf = new Werewolf(textCharacterName.getText(), (int)sliderHealth.getValue(), dateRebirthDate.getValue());
            if (!AppState.editMode)
                AppState.horrorList.add(werewolf);
            else {
                AppState.horrorList.set(AppState.horrorList.indexOf(AppState.selectedCharacter), werewolf);
            }
        }
        else if (radioButtonZombie.isSelected()) {
            Zombie zombie = new Zombie(textCharacterName.getText(), (int)sliderHealth.getValue(), dateRebirthDate.getValue());
            if (!AppState.editMode)
                AppState.horrorList.add(zombie);
            else {
                AppState.horrorList.set(AppState.horrorList.indexOf(AppState.selectedCharacter), zombie);
            }
        }
        Main.setScene("ListView.fxml");
    }
    public void handleCancelButton(javafx.event.ActionEvent event) throws IOException {
        Main.setScene("ListView.fxml");
    }


}
