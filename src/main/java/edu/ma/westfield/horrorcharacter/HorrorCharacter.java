package edu.ma.westfield.horrorcharacter;

import java.time.LocalDate;

/**
 * Represents a general horror character with a name, health, and vulnerabilities.
 * This is an abstract class that cannot be instantiated directly.
 */
public class HorrorCharacter {
    String name;
    int health;
    Vulnerability[] vulnerabilities;
    LocalDate dateOfRebirth;

    /**
     * Constructs a HorrorCharacter with a given name, health, and vulnerabilities.
     *
     * @param name the name of the character
     * @param health the starting health of the character
     * @param vulnerabilities an array of vulnerabilities
     */
    public HorrorCharacter(String name, int health, Vulnerability[] vulnerabilities, LocalDate dateOfRebirth) {
        this.name = name;
        this.health = health;
        this.vulnerabilities = vulnerabilities;
        this.dateOfRebirth = dateOfRebirth;
    }

    /**
     * Attacks a target in a manner specific to the horror character type.
     */
    void attack() {}
    /**
     * Makes the character flee from danger.
     */
    void flee() {}

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public LocalDate getDateOfRebirth() {return dateOfRebirth;}

    public void setName(String name) {this.name = name;}

    public void setHealth(int health) {
        this.health = health;
    }

    public void setDateOfRebirth(LocalDate dateOfRebirth) {
        this.dateOfRebirth = dateOfRebirth;
    }

    /**
     * Returns the vulnerabilities of this horror character.
     *
     * @return an array of Vulnerability enums representing weaknesses
     */
    Vulnerability[] getVulnerabilities() {
        return vulnerabilities;
    }

}
