package de.lubowiecki.uebungen;

/**
 * Die Klasse beschreibt eine Aufgabe
 * @author Tomasz Lubowiecki
 * @since 1.0
 */
public class /* Bla bla bla */ Aufgabe1 {

    /*
    Zu Beginn des Programmes wird der Variable a der Wert 1 zugewiesen.
    Direkt im Anschluss wird dieser Wert ausgegeben.
    Daraufhin wird der Wert von a um 1 erhöht und erneut ausgegeben.
    Erneut wird a um 1 erhöht und sein Wert anschließend ausgegeben …
    dies wiederholt sich bis a den Wert 5 hat.
    Dann endet das Programm.
     */

    // Methoden sind Funktionen, die zu einer Klasse gehören

    // static = Klassenmethode. Kann direkt auf dem Bauplan ausgeführt werden
    // ohne static = Instanzmethode. Kann nur auf einem Objekt ausgeführt werden
    public static void main(String[] args) {

        int a = 1;
        int b = 7;
        b = 10;

        System.out.println(a += 1);
        //a = a + 1;
        System.out.println(a += 1);
        System.out.println(a += 1);
        System.out.println(a += 1);
        System.out.println(a += 1);

        machWas("Peter");
    }

    /**
     * Gibt einen Text mit dem passenden Namen aus
     * @param name Name der im Text verwendet werden soll
     */
    public static void machWas(String name) {
        System.out.println("Das ist das Haus von " + name);
    }
}

/*
// Mehrere Klassen in gleicher Datei: Möglich, aber nicht schön!
class Butterbrot {

}
*/
