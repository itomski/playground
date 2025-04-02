package de.lubowiecki;

import java.util.Objects;

public class EqualsTest {

    public static void main(String[] args) {

        int i = 10;
        int j = 10;
        System.out.println(i == j); // Wertevergleich
        // System.out.println(i.equals(j)); // Error: primitive Datentypen haben keine Methoden

        System.out.println();

        String s1 = "Moin"; // Landet im Pool
        String s2 = "Moin"; // Verwendet den Pool
        String s3 = new String("Moin");
        // == bei Objekten = Referenzvergleich: Zeigen beide Referenzen auf das gleiche Objekt auf dem Heap?
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);

        System.out.println();
        // equals = Wertevergleich
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));

        System.out.println();

        NumberBox nb1 = new NumberBox(10);
        NumberBox nb2 = new NumberBox(10);

        System.out.println(nb1 == nb2);
        System.out.println(nb1.equals(nb2));
        System.out.println(nb1.hashCode());
        System.out.println(nb2.hashCode());

        System.out.println(Farbe.BLAU.getRgb());

    }
}

class NumberBox {

    private int nr;

    public NumberBox(int nr) {
        this.nr = nr;
    }

    // equals und hashCode werden gemeinsam eingebaut und basieren auf den gleichen Instanzvariablen
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        NumberBox numberBox = (NumberBox) o;
        return nr == numberBox.nr;
    }

    // Die geebte hashCode-Methode wird hier überschrieben
    @Override // Annotation: zeigt an, dass eine Methode mit gleicher Signatur in der Elternklasse vorliegt
    public int hashCode() {
        return Objects.hashCode(nr);
    }
}
