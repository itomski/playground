package de.lubowiecki.vererbung.zoo;

import java.util.ArrayList;

public class Zoo {

    public static void main(String[] args) {

        Hund h1 = new Hund();
        h1.gibLaut();
        h1.setName("Stanley");
        h1.gibLaut();

        Katze k1 = new Katze();
        k1.gibLaut();
        k1.setName("Big Boss");
        k1.gibLaut();

        System.out.println();

        // Abstrakte Klassen dürfen nicht direkt instanziert werden
        // Tier t1 = new Tier(); // Error
        // t1.gibLaut();

        // Referenztyp = Tier
        // Objekttyp = Hund
        Tier t; // Deklaration der Variable

        t = h1; // Hund IS-A Tier
        t.gibLaut();

        // Referenztyp = Tier
        // Objekttyp = Katze
        t = k1; // Katze IS-A Tier
        t.gibLaut();

        System.out.println();

        ArrayList<Tier> tiere = new ArrayList<>();
        tiere.add(new Katze());
        tiere.add(new Hund());
        tiere.add(new Affe());
        tiere.add(new Katze());
        tiere.add(new Katze());
        tiere.add(new Affe());
        tiere.add(new Affe());
        tiere.add(new Hund());

        for(Tier tier  : tiere) {
            tier.gibLaut();
        }
    }
}
