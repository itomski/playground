package de.lubowiecki.uebungen.kursverwaltung;

public class Dozent {

    private String vorname;

    private String nachname;

    // Sammlung von Kurs-Objekten
    //private Kurs[] kurse;

    public Dozent() {
    }

    public Dozent(String vorname, String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        // this.vorname: Instanzvariable (Eigenschaft des Obejts)
        // vorname: Prameter, der an die Methode übergeben wird
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }
}