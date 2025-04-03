package de.lubowiecki.vererbung.zoo;

public class Katze extends Tier {

    @Override
    public void gibLaut() {
        System.out.println(getName() + ": Miau... Miau!");
    }
}
