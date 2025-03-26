package de.lubowiecki;

public class ArrayTest {

    public static void main(String[] args) {

        int i = 1;
        i = 2; // alter Wert wird überschrieben
        System.out.println(i);

        // Sammlung (Array) von ints
        int[] arr = {1,5,9,22,-10,7}; // nur bei gleichzeitiger Deklaration des Arrays möglich
        System.out.println(arr);
        System.out.println(arr[0]); // der Index im Array beginnt immer bei 0
        System.out.println(arr[1]);
        // System.out.println(arr[10]); // ArrayIndexOutOfBoundsException: falscher Index

        System.out.println();
        for(int j = 0; j < arr.length; j++) {
            arr[j] += 2;
            System.out.println(arr[j]);
        }

        System.out.println();

        // j ist hier der aktuelle Wert, arr ist die Sammlung
        for(int j : arr) { // Hört nach dem letzten Element automatisch auf
            System.out.println(j + 2);
        }

        System.out.println();

        double[] dArr = new double[10]; // Ein Array in größe 10 wird erzeugt und Standardwerten gefüllt
        for (double d : dArr) {
            System.out.println(d);
        }

        // Primitive Datentypen geben ihre Werte als Kopie weiter
        int i2 = 10;
        int j2 = i2; // Kopie des Wertes hinter i2 wird auf j2 zugewiesen

        System.out.println();

        for (int zahl : generateValues()) {
            System.out.println(zahl);
        }

        System.out.println();
    }

    // Rückgabetyp ist eine Sammlung von ints
    static int[] generateValues() {
        return new int[]{10,20,30,40,50};
    }
}
