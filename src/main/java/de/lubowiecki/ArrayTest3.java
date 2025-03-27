package de.lubowiecki;

public class ArrayTest3 {

    public static void main(String[] args) {

        /*
        1 0 0 0 0
        0 0 0 0 0
        0 0 0 0 0
        0 0 1 0 0
        0 0 0 0 0
        */

        int[][] spielfeld = new int[10][10];
        spielfeld[0][0] = 1;
        spielfeld[3][2] = 1;

        for(int[] zeile : spielfeld) { // Läuft durch die Zeilen (erste Dimension)
            for(int feld : zeile) { // Läuft durch die Felder einer Zeile (zweite Dimension)
                System.out.print(feld + " ");
            }
            System.out.println();
        }
    }
}
