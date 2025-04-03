package de.lubowiecki.vererbung.zoo;

public class Hund extends Tier {

    private final String LAUT = "Wau Wau!";


    @Override
    public void gibLaut() {
        //System.out.println(getName() + ": " + LAUT);
        gibLaut(LAUT);
    }
}
