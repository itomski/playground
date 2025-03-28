package de.lubowiecki;

public class StackOverfloTest {

    static int i = 1;

    public static void main(String[] args) {
        int i = 100;

        {
            int j = 200;
        } // j wird hier vom Speicher entfernt: j ist out-of-scope

        double j = 200.0;
        // double i = 300.0; // Error: i aus Zeile 8 ist noch nicht out-of-scope
        machEtwas();
    }

    public static void machEtwas() {
        int[] arr1 = new int[10_000_000];
        System.out.println(i++);
        // machEtwas();
    }

}
