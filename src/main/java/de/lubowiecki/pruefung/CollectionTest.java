package de.lubowiecki.pruefung;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CollectionTest {

    public static void main(String[] args) {

        List<String> namen = new ArrayList<>();
        namen.add("Peter"); // Hinzufügen
        System.out.println(namen.size()); // Anzahl der Elemente

        if(namen.contains("Peter")) { // Sucht nach dem Vorkommen
            System.out.println("Gefunden");
        }
        else {
            System.out.println("Nicht gefunden");
        }

        System.out.println(namen.get(0)); // Liefert das Element am vorgegebenen Index zurück

        List<String> subList = new ArrayList<>();
        subList.add("Carol");
        subList.add("Bruce");

        namen.addAll(subList); // Alle Elemente der subList werden zu namen hinzugefügt
        System.out.println(namen.size());

        namen.addAll(Arrays.asList("Carol", "Bruce")); // Oder so
        System.out.println(namen.size());

        // Seit Java 10
        namen.addAll(List.of("Carol", "Bruce")); // auch möglich
        System.out.println(namen.size());

        System.out.println(namen);

        // Länge eines Strings ermittelt man über die Methode length()

        // Größe eines Arrays ermittelt man über die Eigenschaft length
        // Größe einer Collection (z.B. ArrayList) ermittelt man über die Methode size()

        List<Integer> zahlen = new ArrayList<>();
        zahlen.addAll(List.of(10, 15, 22, 1));
        zahlen.add(7);
        System.out.println(zahlen);
        zahlen.clear();
        System.out.println(zahlen);

        // Referenz: List<Integer>
        // Objekttyp: ArrayList<Integer>
        List<Integer> zahlen2 = new ArrayList<>();
        zahlen2.add(10);
        zahlen2.add(15);

        // Referenz: List<Integer>
        // Objekttyp: LinkedList<Integer>
        zahlen2 = new LinkedList<>(zahlen2); // Wechsel von ArrayList auf LinkedList
        zahlen2.add(20);
        zahlen2.add(-10);

        zahlen2 = new ArrayList<>(zahlen2); // Wechsel von LinkedList auf ArrayList
    }
}
