package de.lubowiecki.pruefung;

import java.util.Arrays;

public class ArrayTest1 {

    public static void main(String[] args) {

        int i = 10; // primitiver Datentyp. Haben KEINE Eigenschaften oder Methoden

        int[] zahlen = {1,2,3,4}; // Arrays sind Objekte

        zahlen = new int[10]; // Neues Array im Größe 10
        zahlen = new int[]{1,2,3,4}; // Neues mit vorgegebenen Inhalt (Größe 4)

        // length ist nicht der Index, sondern die Anzahl der Elemente
        System.out.println(zahlen.length); // Objekte haben Eigenschaften und Methoden


        // JaggedArray: 2d Arrays mit unterschiedlich großen Arrays im Inneren
        int[][] arr = {{2,3,4}, {0, 5}, {}};
        System.out.println(arr[1][1]);

        try {
            System.out.println(arr[2][2]); // ArrayIndexOutOfBoundsException
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Falscher Index!");
        }

        System.out.println();

        // Sortieren
        // zahlen = {15,22,1,3,18,7,9}; // Error: Diese Schreibweise ist bei nur gleichzeitiger Deklaration erlaubt
        zahlen = new int[]{15,22,1,3,18,7,9}; // Ok
        Arrays.sort(zahlen); // Sortierung nach Wert

        for(int j : zahlen) {
            System.out.print(j + " ");
        }

        System.out.println();
        zahlen = new int[]{15,22,1,3,18,7,9};
        Arrays.sort(zahlen, 2, 7); // Sortierung nach Wert abr dem Index 2 bis 7 (Endindex exklusive)

        for(int j : zahlen) {
            System.out.print(j + " ");
        }

        System.out.println();

        String[][] heros = {{"Spiderman","Cap. Marvel","Hulk"}, {"Ironman", "Cap. America"}, {"Antman"}};
        System.out.println(heros[1][0]);

        System.out.println();

        String[] heros1d = {"Spiderman","Cap. Marvel","Hulk"};
        Arrays.sort(heros1d);
        System.out.println(heros1d); // toString-Methode von array ist nicht gut ausprogrammiert
        System.out.println(Arrays.toString(heros1d));

        System.out.println();

        Arrays.sort(heros); // Bei mehrdimensionalen Arrays gibt es beim Sortieren eine Exception!
    }
}
