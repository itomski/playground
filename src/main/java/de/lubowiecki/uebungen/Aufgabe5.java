package de.lubowiecki.uebungen;

import de.lubowiecki.uebungen.kursverwaltung.Dozent;

public class Aufgabe5 {

    /* Schreibe 3 Klassen, die später die Daten einer Kursverwaltung repräsentieren werden
    Dozent, Teilnehmer, Kurs
    Definiere in jeder Klasse, die aus deiner Sicht wichtigen Eigenschaften und verwende dafür die passenden Datentypen
    Wende Datenkapselung an d.h. alle Eigenschaften sollen privat sein und es soll dafür Getter und Setter geben.
    Deklariere auch passende Konstruktoren.

    Instanziere jede der Klasse 3 mal und schaue dir die Daten im Debugger an.
    */

    public static void main(String[] args) {

        final Dozent d1 = new Dozent("Peter", "Parker");
        Dozent d2 = new Dozent("Carol", "Danvers");
        Dozent d3 = new Dozent("Scott", "Lang");

        // d1.vorname = "Hans"; // Error: Eigenschaft ist privat
        d1.setVorname("Hans"); // Schreiben
        // System.out.println(d1.vorname); // Error: Eigenschaft ist privat
        System.out.println(d1.getVorname()); // Lesen

        d2 = new Dozent("Natasha", "Romanov");
        //d1 = new Dozent("Tony", "Stark"); // Error: d1 ist final
        d1.setVorname("Peter");

        // Lokale Variablen bekommen keine Access-Modifikatoren
        final int zahl = 100;
        // zahl = 120; // Error


    }

}
