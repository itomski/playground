package de.lubowiecki.vererbung;

import java.time.LocalDate;

public class Person {

    private String vorname;

    private String nachname;

    private LocalDate geburtsDatum;

    public Person() {
        // super(); // Zuerst wird der Konstruktor der Elternklasse (Object) aufgerufen
        System.out.println("C: Person");
    }

    // public Eigenschaften und Methoden werden an Kindklassen vererbt
    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public LocalDate getGeburtsDatum() {
        return geburtsDatum;
    }

    public void setGeburtsDatum(LocalDate geburtsDatum) {
        this.geburtsDatum = geburtsDatum;
    }
}
