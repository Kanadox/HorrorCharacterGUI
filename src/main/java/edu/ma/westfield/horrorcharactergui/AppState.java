package edu.ma.westfield.horrorcharactergui;

import java.time.LocalDate;
import java.util.ArrayList;

import edu.ma.westfield.horrorcharacter.HorrorCharacter;
import edu.ma.westfield.horrorcharacter.Vampire;
import edu.ma.westfield.horrorcharacter.Werewolf;
import edu.ma.westfield.horrorcharacter.Zombie;

public class AppState {
     public static ArrayList<HorrorCharacter> horrorList = new ArrayList<>();
     static {
          horrorList.add(new Vampire( "Dracula", 100, LocalDate.now()));
          horrorList.add(new Werewolf("Fenrir", 120, LocalDate.now()));
          horrorList.add(new Zombie("Walker", 70, LocalDate.now()));
     }
     public static HorrorCharacter selectedCharacter;
     public static boolean editMode = false;
}
