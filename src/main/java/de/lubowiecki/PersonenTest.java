package de.lubowiecki;

public class PersonenTest {

    public static void main(String[] args) {

        // Objekte werden leer erzeugt
        Person p1 = new Person("Peter", "Parker", 1995); // Ein neues Objekt wird auf dem Heap abgelegt
        Person p2 = new Person("Carol", "Danvers");

        // Hier werden die Variablen befüllt
        // p1.vorname = "Peter"; // Änderung nur für p1

        //p2.nachname = "Banner"; // Änderung nur für p2
        p2.setNachname("Banner");

        //p2.count = 100; // Änderung für alle, da count im Bauplan (Klasse) für alle Objekte verwendet wird
        p2.setCount(100);

        // p2.geburtsJahr = -200;
        p2.setGeburtsJahr(-200);

        //System.out.println(p1.vorname + " " + p1.nachname + ", " + p1.geburtsJahr + ", " + p1.count);
        System.out.println(p1.getVorname() + " " + p1.getNachname() + ", " + p1.getGeburtsJahr() + ", " + p1.getCount());
        //System.out.println(p2.vorname + " " + p2.nachname + ", " + p2.geburtsJahr + ", " + p2.count);
        System.out.println(p2.getVorname() + " " + p2.getNachname() + ", " + p2.getGeburtsJahr() + ", " + p2.getCount());


        // Array ist für komplexe Daten suboptimal
        // Bedeutung der Daten ist unklar
        // Ist auf Daten eines bestimmten Typs festgelegt
        String[] person = new String[2];
        person[0] = "Bruce";
        person[1] = "Banner";

    }
}
