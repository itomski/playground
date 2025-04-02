package de.lubowiecki.uebungen;

public class Aufgabe7 {

    /*

    Übung 1:
    Erweitere den Taschenrechner aus Aufgabe2 um ein Protokoll.
    Jede Rechen-Operation inkl. Werte und dem Ergebnis wird in das Protokoll geschrieben.
    Ruft man das Protokoll auf, bekommt man man alle Rechnungen ausgegeben, die man zuvor
    mit dem Taschenrechner gemacht hat. Benutze für das Protokoll den Stringbuilder.

    Übung 2:
    Baue eine Version des Würfelbechers, der bei der Instanzierung die Anzahl von Würfelseiten
    über den Konstruktor vorgegeben bekomment.
    Dieses Würfelbecher-Objekt kann nur diese Würfel verwenden.

    Baue davon zwei weitere Instanzen, die jeweils mit anderen Augen-Zahlen arbeiten können.

    Übung 3:
    Schreibe ein Konsolenprogramm das von dir 10 Zahlen entgegennimmt.
    Diese sollen danach sortiert ausgegeben werden.
    Danach in umgekehrter Reihenfolge.

    Übung 4:
    Versuche das Programm mit den Zahlen auch mit einer ArrayList umzusetzen.
    Für das Sortieren schaue dir die Hilfsklasse Collections an.
     */

    public static void main(String[] args) {

        double a = 10.0;
        double b = 22.5;
        double erg = a + b;
        char op = '+';
        System.out.println(a + " + " + b + " = " + erg);

        final String TPL = "%.2f %s %.2f = %.2f \n";

        // Sofortige ausgabe
        System.out.printf(TPL, a, op,  b, erg);

        StringBuilder sb = new StringBuilder();
        // String.format liefert einen formatierten String zurück
        sb.append(String.format(TPL, a, op,  b, erg));

        System.out.println();

        final String STR_TPL = "| %10s | %-10s | %n";
        System.out.printf(STR_TPL, "Peter", "Parker");
        System.out.printf(STR_TPL, "Tony", "Stark");

    }
}
