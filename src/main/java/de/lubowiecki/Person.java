package de.lubowiecki;

import java.util.Objects;

public class Person {

    // Klassenvariable: Alle Objekte und die Klasse teilen sich eine und die gleiche Variable
    private static int count = 0;

    // Instanzvariablen: Jedes Objekt hat eigene
    private String vorname;
    private String nachname;
    private int geburtsJahr;

    // Pflichtangaben für das Bauen des Objekts
    public Person(String vorname, String nachname, int geburtsJahr) {
        // this.vorname = Instanzvariable von diesem Objekt
        // vorname = Lokale Variable/Parameter
        this.vorname = vorname;
        this.nachname = nachname;
        this.geburtsJahr = geburtsJahr;
    }

    public Person(String vorname, String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        Person.count = count;
    }

    public String getVorname() { // Lesen
        return vorname;
    }

    public void setVorname(String vorname) { // Schreiben
        // TODO: Validierung der Daten
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        // TODO: Validierung der Daten
        this.nachname = nachname;
    }

    public int getGeburtsJahr() {
        return geburtsJahr;
    }

    public void setGeburtsJahr(int geburtsJahr) {
        if(geburtsJahr > 1900 && geburtsJahr < 2026)
            this.geburtsJahr = geburtsJahr;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return geburtsJahr == person.geburtsJahr && Objects.equals(vorname, person.vorname) && Objects.equals(nachname, person.nachname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vorname, nachname, geburtsJahr);
    }
}
