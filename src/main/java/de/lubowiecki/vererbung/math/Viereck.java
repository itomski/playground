package de.lubowiecki.vererbung.math;

public class Viereck extends GeoForm {

    private int laenge;

    private int breite;

    public Viereck(int x, int y, int laenge, int breite) {
        super(x, y);
        this.laenge = laenge;
        this.breite = breite;
    }
}
