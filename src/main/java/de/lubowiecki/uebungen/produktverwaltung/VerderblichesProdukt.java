package de.lubowiecki.uebungen.produktverwaltung;

import java.time.LocalDate;

public class VerderblichesProdukt extends Produkt {

    private LocalDate mhd;

    public VerderblichesProdukt(String name, String beschreibung, int anzahl, double preis, LocalDate mhd) {
        super(name, beschreibung, anzahl, preis);
        this.mhd = mhd;
    }

    public LocalDate getMhd() {
        return mhd;
    }
}
