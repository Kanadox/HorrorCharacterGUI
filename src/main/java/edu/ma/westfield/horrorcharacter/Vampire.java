package edu.ma.westfield.horrorcharacter;

import java.time.LocalDate;

/**
 * Represents a Vampire, a type of HorrorCharacter that can transform into a swarm of bats.
 * Implements the Transformable interface to allow transformation.
 */
public class Vampire extends HorrorCharacter implements Transformable {
    /** Tracks whether the vampire is currently transformed. */
    private boolean transformed = false;

    /**
     * Constructs a Vampire with a specified name and health.
     * By default, a vampire is vulnerable to SUNLIGHT and HOLY_WATER.
     *
     * @param name the name of the vampire
     * @param health the starting health of the vampire
     */
    public Vampire (String name, int health, LocalDate dateOfRebirth) {
        super(name, health, new Vulnerability[]{Vulnerability.SUNLIGHT, Vulnerability.HOLY_WATER}, dateOfRebirth);
    }

    /**
     * Performs the vampire's attack action.
     * If transformed, attacks as a swarm of bats; otherwise, lunges and bites.
     */
    public void attack() {
        if (transformed) {
            System.out.println("Vampire " + name + " attacks as a swarm of bats!");
        }
        else {
            System.out.println("Vampire " + name + " lunges and bites!");
        }
    }

    /**
     * Performs the vampire's flee action.
     * The vampire turns into mist to escape danger.
     */
    @Override
    public void flee() {
        System.out.println("Vampire " + name + " turns into mist and vanishes!");
    }

    /**
     * Transforms the vampire into or out of a swarm of bats.
     * Changes the behavior of the attack() method when transformed.
     */
    @Override
    public void transform() {
        transformed = !transformed;
        System.out.println("Vampire " + name + (transformed ? " transforms into a swarm of bats!" : " returns to normal form."));
    }

    /**
     * Returns the vulnerabilities of the vampire.
     *
     * @return an array of Vulnerability enums representing the vampire's weaknesses
     */
    @Override
    Vulnerability[] getVulnerabilities() {
        return super.getVulnerabilities();
    }
}
