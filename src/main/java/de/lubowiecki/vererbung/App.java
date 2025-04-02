package de.lubowiecki.vererbung;

import java.time.LocalDate;
import java.util.ArrayList;

public class App {

    public static void main(String[] args) {

        Student s1 = new Student();
        // Methode von Student
        s1.setMatrikelNr("AB22334455X");
        // Geebte Methoden von Person
        s1.setVorname("Peter");
        s1.setNachname("Parker");
        s1.setGeburtsDatum(LocalDate.of(1985, 10, 5));

        System.out.println();

        Person p1 = new Person();
        p1.setVorname("Bruce");

        System.out.println();

        Person p2 = new Student(); // Student IS-A Person
        // Über p2 sind nur Methoden und Eigenschaften von Person sichtbar
        // Student s2 = new Person(); // Error: Person IS-NOT (nicht immer) Student

        p2 = new Rentner(); // Rentner IS-A Person

        System.out.println(p2 instanceof Student); // ist hinter p2 ein Student-Objekt auf dem Heap
        System.out.println(p2 instanceof Person);
        System.out.println(p2 instanceof Object);

        // Person (links) = Referenztyp
        // Student (rechts) = Objekttyp
        // Der Referenztyp entscheidet, welche Eigenschaften und Methoden verwendet werden können
        Person p3 = new Student();

        System.out.println();

        // Hier können Objekte aller Kindklassen von Person abgelegt werden
        ArrayList<Person> gruppe = new ArrayList<>();
        gruppe.add(new Student());
        gruppe.add(new Rentner());
        gruppe.add(new Person());

        for(Person p : gruppe) {
            System.out.println(p.getClass().getSimpleName());
        }
    }
}
