package de.lubowiecki;

public class Fahrzeug {

    static int count = 0;

    // ohne einen Zugriffsmodifikator sind die Eigenschaften nur für andere Klassen im gleichen package sichtbar
    private int nr;
    String kennzeichen;
    String marke;
    String modell;
    int baujahr;
    boolean fahrbereit;

    public Fahrzeug() {
    }

    public Fahrzeug(String k) {
        this.nr = ++count; // statische Eigenschaft count wird um 1 hochgezählt bevor es auf nr zugewiesen wird
        this.kennzeichen = k;
    }

    public Fahrzeug(String kennzeichen, String marke, String mod) {
        // this = Dieses Objekt
        //this.nr = ++count; // statische Eigenschaft count wird um 1 hochgezählt bevor es auf nr zugewiesen wird
        //this.kennzeichen = kennzeichen;
        this(kennzeichen); // Verwendet den bereits vorhandenen Konstruktor mit einem Parameter
        this.marke = marke; // Namenskonflikt, daher muss das this dazu
        modell = mod; // kein Namenskonflikt, this nicht nötig
    }

//    public Fahrzeug(String kennzeichen, String marke, String modell, int baujahr, boolean fahrbereit) {
//        this.nr = ++count;
//        this.kennzeichen = kennzeichen;
//        this.marke = marke;
//        this.modell = modell;
//        this.baujahr = baujahr;
//        this.fahrbereit = fahrbereit;
//    }

    public int getNr() {
        // Angabe von this ist nur nötig, wenn ein Namenskonflikt zwischen Eigenschaften und lokalen Variablen vorliegt
        return nr;
    }

    // Hier wird die toString-Methode aus der Klasse Object ersetzt
    @Override
    public String toString() { // Konvertiert das Objekt in ein String
        return "Fahrzeug{" +
                "nr=" + nr +
                ", kennzeichen='" + kennzeichen + '\'' +
                ", marke='" + marke + '\'' +
                ", modell='" + modell + '\'' +
                ", baujahr=" + baujahr +
                ", fahrbereit=" + fahrbereit +
                '}';
    }
}
