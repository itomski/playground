package de.lubowiecki;

import de.lubowiecki.uebungen.Aufgabe1;
import de.lubowiecki.uebungen.Taschenrechner;

import java.util.Date;

public class Import {

    public static void main(String[] args) {

        Starter s; // Kein Import, da im gleichen Package
        Aufgabe1 a1; // Import nötig, da Klasse in einem anderen Package liegt

        Date heute = new Date(); // Muss importiert werden
        System.out.println(heute);

        // Alle Klassen aus Package java.lang sind automatisch verfügbar
        System.out.println(Math.PI); // Muss NICHT importiert werden

        System.out.println(Taschenrechner.add(15, 33));
    }
}
