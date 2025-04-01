package de.lubowiecki.collections;

import de.lubowiecki.uebungen.tasklist.Task;

import java.util.ArrayList;

public class ArrayListTest {

    public static void main(String[] args) {

        // <Integer> die Liste wird auf Objekte vom Typ Integer eingeschränkt
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(100); // Element an die nächste freie Position ablegen
        list1.add(200);
        list1.add(-100);
        list1.add(32);

        System.out.println(list1);

        int i = list1.get(0); // Objekt an Index 0 abfragen
        System.out.println(i);

        list1.add(0, 1000); // Auf Index 0 wird ein neuew Wert abgelegt
        System.out.println(list1);

        list1.remove(2); // Element auf Index 2 wird entfernt
        System.out.println(list1);

        System.out.println(list1.size()); // Liefert die Anzahl der Elemente

        list1.set(2, 75); // Element auf Index 2 wird ersetzt
        System.out.println(list1);

        ArrayList<String> namen = new ArrayList<>();
        ArrayList<Task> aufgaben = new ArrayList<>();
        // Jede Klasse kann als Inhalts-Typ verwendet werden

        // Zu jedem primitiven Tatentyp gibt es auch einen Wrapper-Typ
        // byte - Byte
        // short - Short
        // int - Integer
        // char - Character
        // long - Long
        // float - Float
        // double - Double
        // boolean - Boolean
        byte b = 100;
        Byte b2 = b; // Autoboxing: primitiv wird in Objekt eingepackt
        b = b2; // Auto-Unboxing: Objekt wird wieder zu primitiv ausgepackt
        b = Byte.parseByte("12"); // Jede Wrapper-Klasse hat noch statische Hilfs-Methoden
    }
}
