package de.lubowiecki;

import java.time.LocalDate;

public class VariablenTest {

    // Klassenvariable: Gehört der Klasse. Alle nutzen die gleiche Variable
    static int zahl = 100;

    // Instanzvariable: Gehört dem Objekt. Jedes Objekt hat eine Eigene
    int andereZahl; // Wenn nicht initialisiert, dann wird der Standardwert zugeweisen

    public static void main(String[] args) {

        // Variablen, die innerhalb einer Methode deklariert (vorgestellt) werden
        // sind lokale Variablen. Sie werden entfernt, sobald die Methode beendet ist
        // Ihre Geltungsbereich/Scope ist auch die Methode eingeschränkt, in der sie deklariert wurde

        // String ist ein komplexer Datentyp
        String name = "Peter Parker"; // Lokale Variable

        machWas();

        // int ist ein primitiver Datentyp
        int alter = 25; // Lokale Variable

        boolean altGenug = false;

        byte b = 126;
        short s = 2000;
        int i = 20235; // Standard für Ganzzahlen


        // primitive Narrowing. Nur mit einem Cast möglich
        byte b2 = (byte)1000; // Überlauf
        System.out.println(b2);

        long l = b2; // primitive widening
        System.out.println(l);

        int sum = b + b2; // Alle Werte kleiner als int, werden zum Rechnen auf mind. int angehoben

        // Bei mathematischen Operationen mit gemischten Typen promovieren die kleineren zu größeren Typen

        char c; // Deklaration
        int x, y = 10, z; // Deklaration von 3 Variablen gleich Typs
        x = y = z = 15; // Alle Variablen werden mit dem gleichen Wert belegt

        // Lokale Variablen bekommen KEINE Standardwerte
        // Sie MÜSSEN vor der ersten Verwendung Initialisiert werden
        // System.out.println(c); // ERROR

        long l2 = 1_000_000_000_000L;
        l2 = 1_000_000_000; // primitive Widening von int auf long

        int j = 16; // Dezimal: Standard
        System.out.println(j);
        j = 020;
        System.out.println(j);
        i = 0b10000;
        System.out.println(j);
        i = 0x10;
        System.out.println(j);

        System.out.println("\n"); // 2 x Leerzeile
        System.out.printf("Mein Name ist %s %n", "Toni"); // Schablone und dann Werte für die Platzhalter
        System.out.println(); // Leerzeile
        System.out.print("..."); // Ausgabe ohne Zeilenumbruch
        System.out.print("..." + i); // Fertige String

        System.out.println();

        System.out.println(Integer.toHexString(125));
        System.out.println(Integer.toBinaryString(125));

        LocalDate datum = LocalDate.of(2000, 10, 25);
        System.out.println(datum);

        add(10, 15);

        var v1 = 100; // Kompiler ermittelt den Datentyp
        v1 = 200;
        // v1 = 200.5; // v1 ist ein int

        char c1 = 'A';
        System.out.println(c1);
        System.out.println((int)c1);
        System.out.println((char)25200);

    }

    static void machWas() {
        String name = "Carol Danvers"; // Lokale Variable
        System.out.println("Moin " + name);
    }

    static int add(int a, int b) {
        return a + b;
    }
}
