package de.lubowiecki;

public class AccessTest {

    public static void main(String[] args) {

        int zahl = 100; // Lokale Variable
        zahl = 200; // alter Wert wird überschrieben

        // Komplexe Datentypen werden durch eine Klasse beschrieben
        // Eine Objekt ist mit einem Datensatz aus der Datenbank zu vergleichen
        // Eine Klasse ist mir den Sammlung der Spalten eine Tabelle zu vergleichen

        // Objekt gleicht einem Datensatz
        // Objekte werden IMMER mit einem Konstruktor gebaut
        Fahrzeug f1 = new Fahrzeug("HH-AB:123"); // Aufruf des Konstruktors: Baut ein Leeres Objekt
        //f1.nr = 10; // Error: ist jetzt privat. Wenn static, dann gleichbedeutend mit Fahrzeug.nr = 1
        //f1.kennzeichen = "HH-AB:123";
        f1.marke = "Renault";
        f1.modell = "Zoe";
        f1.baujahr = 2020;
        f1.fahrbereit = true;

        System.out.println();

        Fahrzeug f2 = new Fahrzeug("HH-XY:567", "VW", "Polo"); // Aufruf des Konstruktors
        //f2.nr = 15;
        //f2.kennzeichen = "HH-XY:567";
        //f2.marke = "VW";
        //f2.modell = "Polo";
        f2.baujahr = 2015;
        f2.fahrbereit = false;

        System.out.println();

        System.out.println(f1); // Objekt als ganzes ausgeben. toString wird automatisch verwendet

        System.out.println();

        System.out.println(f1.getNr());
        System.out.println(f1.kennzeichen);
        System.out.println(f1.marke);
        System.out.println(f1.modell);
        System.out.println(f1.baujahr);
        System.out.println(f1.fahrbereit);

        System.out.println();

        System.out.println(f2);

        System.out.println();

        System.out.println(f2.getNr());
        System.out.println(f2.kennzeichen);
        System.out.println(f2.marke);
        System.out.println(f2.modell);
        System.out.println(f2.baujahr);
        System.out.println(f2.fahrbereit);

    }
}
