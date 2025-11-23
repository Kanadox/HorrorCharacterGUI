package edu.ma.westfield.horrorcharacter;

import java.time.LocalDate;

/**
 * Represents a Zombie, a type of HorrorCharacter that attacks with claws and moves slowly when fleeing.
 */
public class Zombie extends HorrorCharacter {

    /**
     * Constructs a Zombie with a specified name and health.
     * By default, a zombie is vulnerable to FIRE and SUNLIGHT.
     *
     * @param name the name of the zombie
     * @param health the starting health of the zombie
     */
    public Zombie (String name, int health, LocalDate dateOfRebirth) {
        super(name, health, new Vulnerability[]{Vulnerability.FIRE, Vulnerability.SUNLIGHT}, dateOfRebirth);
    }

    /**
     * Performs the zombie's attack action.
     * The zombie claws viciously at its target.
     */
    @Override
    public void attack() {
        System.out.println("Zombie " + name + " claws viciously!");
    }

    /**
     * Performs the zombie's flee action.
     * The zombie shambles away from danger.
     */
    @Override
    public void flee() {
        System.out.println("Zombie " + name + " shambles away!");
    }

    /**
     * Returns the vulnerabilities of the zombie.
     *
     * @return an array of Vulnerability enums representing the zombie's weaknesses
     */
    @Override
    Vulnerability[] getVulnerabilities() {
        return super.getVulnerabilities();
    }

    /**
     * Returns the name of the zombie.
     *
     * @return the name of the zombie
     */
    String getNames() {
        return name;
    }
}
