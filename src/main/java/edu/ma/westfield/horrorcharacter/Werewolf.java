package edu.ma.westfield.horrorcharacter;

import java.time.LocalDate;

/**
 * Represents a Werewolf, a type of HorrorCharacter that can transform into a ferocious beast.
 * Implements the Transformable interface to allow transformation.
 */
public class Werewolf extends HorrorCharacter implements Transformable {
    /** Tracks whether the werewolf is currently transformed. */
    private boolean transformed = false;

    /**
     * Constructs a Werewolf with a specified name and health.
     * By default, a werewolf is vulnerable to SILVER and HOLY_WATER.
     *
     * @param name the name of the werewolf
     * @param health the starting health of the werewolf
     */
    public Werewolf (String name, int health, LocalDate dateOfRebirth) {
        super(name, health, new Vulnerability[]{Vulnerability.SILVER, Vulnerability.HOLY_WATER}, dateOfRebirth);
    }

    /**
     * Performs the werewolf's attack action.
     * If transformed, attacks ferociously; otherwise, growls and slashes.
     */
    public void attack() {
        if (transformed) {
            System.out.println("Werewolf " + name + " slashes ferociously!");
        }
        else {
            System.out.println("Werewolf " + name + " growls and slashes!");
        }
    }

    /**
     * Performs the werewolf's flee action.
     * The werewolf runs off into the forest to escape danger.
     */
    @Override
    public void flee() {
        System.out.println("Werewolf " + name + " runs off into the forest!");
    }

    /**
     * Transforms the werewolf into or out of its ferocious beast form.
     * Changes the behavior of the attack() method when transformed.
     */
    @Override
    public void transform() {
        transformed = !transformed;
        System.out.println("Werewolf " + name + (transformed ? " transforms into a ferocious beast!" : " returns to human form."));
    }

    /**
     * Returns the vulnerabilities of the werewolf.
     *
     * @return an array of Vulnerability enums representing the werewolf's weaknesses
     */
    @Override
    Vulnerability[] getVulnerabilities() {
        return super.getVulnerabilities();
    }

    /**
     * Returns the name of the werewolf.
     *
     * @return the name of the werewolf
     */
    String getNames() {
        return name;
    }
}
