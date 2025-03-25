package de.lubowiecki;

public class VariablenTest {

    // Klassenvariable: Gehört der Klasse. Alle nutzen die gleiche Variable
    static int zahl = 100;

    // Instanzvariable: Gehört dem Objekt. Jedes Objekt hat eine Eigene
    int andereZahl = 200;

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

    }

    static void machWas() {
        String name = "Carol Danvers"; // Lokale Variable
        System.out.println("Moin " + name);
    }
}
