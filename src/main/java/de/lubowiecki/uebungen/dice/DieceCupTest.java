package de.lubowiecki.uebungen.dice;

public class DieceCupTest {

    public static void main(String[] args) {

        System.out.println(DiceCup.roll());

        System.out.println(DiceCup.roll());

        int z = DiceCup.roll();
        System.out.println(z);

        System.out.println();

        DiceCup.setFaces(100); // Anzahl der Seiten vorgeben

        int[] werte = DiceCup.roll(10);
        for(int wert : werte) {
            System.out.println(wert);
        }
    }
}
