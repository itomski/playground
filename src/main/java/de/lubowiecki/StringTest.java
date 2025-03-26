package de.lubowiecki;

public class StringTest {

    public static void main(String[] args) {

        // String landet im String-Literal-Pool
        String s1 = "Peter Parker"; // Literal
        String s2 = "Peter Parker"; // Verwendet das Objekt aus dem Pool

        // + bei String = Verkettung
        s1 += "..."; // s1 = s1 + "..."

        // Hier wir IMMER ein neues Objekt erzeugt
        String s3 = new String("Peter Parker"); // Mit dem Konstruktor

        s1.toUpperCase(); // Änderung wird nicht auf die s1-Referenz zugewiesen und geht verloren
        s1 = s1.toUpperCase(); // Änderung greift
        System.out.println(s1);

        System.out.println();

        s1 = "Bruce Banner";
        s2 = "Bruce Banner";
        s3 = new String("Bruce Banner");

        // == bei Objekten ist ein Speichervergleich = Ist es das gleiche Objekt auf dem Speicher?
        System.out.println(s1 == s2); // == Vergleichen
        System.out.println(s1 == s3);

        System.out.println();

        // equals bei Strings ist ein Inhaltsvergleich = Hat es den gleichen Inhalt?
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));

        // Bei primitiven Datentypen vergleicht == den Inhalt
        // Sie haben keine equals Methode

        int a = 10;
        int b = 10;
        System.out.println(a == b); // Wertevergleich

        String zeug = "Bla bla bla";
        System.out.println(zeug.toUpperCase());
        System.out.println(zeug.toLowerCase());

        String z1 = zeug; // z1 zeigt als Referenz auf das gleich Objekt wie zeug
        String z2 = zeug;
        String z3 = zeug;
    }
}
