package edu.ma.westfield.horrorcharactergui;

import java.time.LocalDate;
import java.util.ArrayList;

import edu.ma.westfield.horrorcharacter.HorrorCharacter;
import edu.ma.westfield.horrorcharacter.Vampire;
import edu.ma.westfield.horrorcharacter.Werewolf;
import edu.ma.westfield.horrorcharacter.Zombie;

/**
 * Holds shared application data such as the list of horror characters and
 * information about the currently selected character. This class acts as a
 * simple global state store for the application.
 */
public class AppState {
     /** The main list of all horror characters. */
     public static ArrayList<HorrorCharacter> horrorList = new ArrayList<>();
     static {
          horrorList.add(new Vampire( "Dracula", 100, LocalDate.now()));
          horrorList.add(new Werewolf("Fenrir", 120, LocalDate.now()));
          horrorList.add(new Zombie("Walker", 70, LocalDate.now()));
     }
     /** The character currently selected for editing or deletion. */
     public static HorrorCharacter selectedCharacter;
     /** Indicates whether the app is currently editing an existing character. */
     public static boolean editMode = false;
}
