package de.lubowiecki;

import java.util.Arrays;

public class ArraysClassTest {

    public static void main(String[] args) {

        int[] zahlen = {2,7,22,18,-7,100};
        System.out.println(zahlen.length);
        System.out.println(Arrays.toString(zahlen)); // Arrays.toString: Konvertiert ein Array in einen String

        // Ist eine Klasse in der Java Bibliothek in plural geschrieben, handelt es sich dabei
        // um eine Utility-Klasse d.h. eine Hilfsklasse
        // Hilfsklassen enthalten Methoden zum Verarbeiten von bestimmten Daten: hier Arrays
        // Hilfsklassen enthalten NUR statische Methoden und verarbeiten Parameter

        Arrays.fill(zahlen, 100); // befüllt das Array mit vorgegebenen Wert
        System.out.println(Arrays.toString(zahlen));

        zahlen = new int[]{2,7,22,18,-7,100}; // Variable ist bereits deklariert. Schreibweise mit new erforderlich
        Arrays.sort(zahlen); // Array gem. der natürlichen Ordnung sortieren
        System.out.println(Arrays.toString(zahlen));

        // binarySearch erfordert eine Sortierung
        // Wird ein Wert nicht gefunden ist die Antwort -(Position) - 1;
        System.out.println(Arrays.binarySearch(zahlen, 10));

        int[] copy = Arrays.copyOfRange(zahlen, 0, 4);

        System.out.println(Arrays.toString(copy));

        // System.out.println(copy[5]); // ArrayIndexOutOfBoundsException
        // int[] arr = new int[-10]; // NegativeArraySizeException

    }
}
