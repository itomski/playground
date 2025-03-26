package de.lubowiecki.uebungen;

import java.util.Locale;
import java.util.Scanner;

public class Aufgabe2 {

     /*
    Schreibe eine Klasse mit einer main-Methode
    Definiere darin für jeden primitiven Datentyp eine Variable und weise ihr einen passenden Wert zu.
    Beachte bei der Benennung die Namenskonventionen und verwende sprechende Bezeichner.

    Definiere zusätzlich zwei String Variablen (vorname und nachname).
    Gebe anschließen diese variablen verknüpft in einer Zeile aus.
    */

    /*
    Schreibe anschließend 4 Methoden für die 4 Grundrechenarten und rufe sie in der main-Methode auf.

    Lese zwei Zahlen von der Konsole ein und führe die Rechenoperationen damit aus...
    Gebe die Ergebnise aus.
     */

    public static void main(String[] args) {

        // Locale.setDefault(Locale.US); // Sprache für VM setzen

        Scanner scanner = new Scanner(System.in);

        // Zahlen werden eingelesen
        System.out.print("Zahl1: ");
        double v1 = scanner.nextDouble();
        System.out.print("Zahl2: ");
        double v2 = scanner.nextDouble();

        // Werte als Strings einlesen und dann in Zahlen parsen
        // Double.parseDouble wandelt ein String in ein double um
        // double v3 = Double.parseDouble(scanner.next());
        // double v4 = Double.parseDouble(scanner.next());


        // Methode wird ausgeführt und die Rückgabe ausgegeben
        System.out.println(Taschenrechner.add(v1, v2));

        // Methode wird ausgeführt und die Rückgabe in eine Variable gespeichert
        double erg = Taschenrechner.multi(v1, v2);
        System.out.println(erg);

        System.out.println(Taschenrechner.sub(v1, v2));

        erg = Taschenrechner.div(v1, v2);
        System.out.println(erg);

        // erg = add("Hallo", "Welt"); // Error, Werte sind keine doubles
    }


}
