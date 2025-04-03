package de.lubowiecki.uebungen.produktverwaltung;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ProduktTest {

    public static void main(String[] args) {

        List<Produkt> produkte = new ArrayList<>();
        produkte.add(new Produkt("Tasse", "Keramik, blau", 100, 5.99));


        for(Produkt p : produkte) {
            System.out.println(p.getName());
        }
    }
}
