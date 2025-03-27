package de.lubowiecki.uebungen.dice;

public class DiceCup {

    // TODO: Mögliche Werte validieren
    private static int faces = 6;

    public static int roll() {
        return (int)(Math.random() * faces) + 1;
    }

    public static int[] roll(int num) {

        int[] werte = new int[num]; // Leeres Array in passender Größe

        for (int i = 0; i < werte.length; i++) {
            werte[i] = roll(); // Positionen des Arrays mit Zufallswerten füllen
        }

        return werte; // Array an den Aufrufer zurückgeben
    }

    public static void setFaces(int f) {
        // TODO: Mögliche Werte validieren
        if(f > 0) {
            faces = f;
        }
    }
}
