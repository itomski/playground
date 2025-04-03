package de.lubowiecki.vererbung.zoo;

public class Affe extends Tier {

    // Implementierung wird erzwungen
    @Override
    public void gibLaut() {
        System.out.println("Grrrrr!!!!");
        // throw new UnsupportedOperationException();
    }
}
