package de.lubowiecki;

public class Namenskonventionen {

    // PascalCase: Namen von Klassen, Interfaces und Enums
    // camelCase: Methoden und Variablen. Methoden haben IMMER eine Parameterklammer dran
    // snake_case: Wird in Java nicht verwendet
    // SCREAMING_SNAKE_CASE: (öffentliche) Konstanten (Nach der ersten Zuweisung ist der Wert nicht mehr änderbar)

    int zahl = 100; // Variable
    int andereZahl = 200; // auch eine Variable

    // final = Konstante
    final double PI = 3.14;

    void machWas() {
        System.out.println("Bla bla bla bla...");
        System.out.println("Pi hat den Wert: " + PI);
        System.out.println();
    }

    // void = Die Methode gibt NICHTS zurück
    public static void main(String[] args) {
        Namenskonventionen nk = new Namenskonventionen(); // Instanzierung
        nk.machWas(); // Methode wird auf dem Objekt ausgeführt
        System.out.println(nk.PI);
    }

    // Methode gibt die Summe von a und b zurück
    double add(double a, double b) {
        return a + b;
    }
}
