package de.lubowiecki.uebungen.produktverwaltung;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ProduktTest {

    public static void main(String[] args) {

        List<Produkt> produkte = new ArrayList<>();
        produkte.add(new Produkt("Tasse", "Keramik, blau", 100, 5.99));

        LocalDate mhd = LocalDate.of(2025, 10, 15);
        produkte.add(new VerderblichesProdukt("Milch", "3,5% Fett", 150, 1.29, mhd));

        for(Produkt p : produkte) {
            System.out.println(p.getName());
        }
    }
}
