package de.lubowiecki.vererbung.zoo;

// Wenn eine Klasse nur als Basis für Vererbung genutzt werden soll, kann sie abstrakt sein
public abstract class Tier {

    private String name = "Unbekannt";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Hat eine Klasse eine abstrakte Methode, muss sie selbst abstrakt sein
    // Eine abstakte Methode MUSS in den Kindklassen implementiert werden
    public abstract void gibLaut(); // Abstrakte Methoden haben keinen Body

    public void gibLaut(String laut) {
        System.out.println(getName() + ": " + laut);
    }
}
