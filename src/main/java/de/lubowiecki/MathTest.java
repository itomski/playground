package de.lubowiecki;

public class MathTest {

    public static void main(String[] args) {

        System.out.println(Math.PI);
        System.out.println(Math.E);

        System.out.println(Math.random());
        System.out.println(Math.random() * 6);
        // Beim cast (int) von double auf int wird die Nachkommastelle abgeschnitten
        System.out.println((int)(Math.random() * 6));
        System.out.println((int)(Math.random() * 6) + 1);

        System.out.println();

        int i = 10;
        System.out.println(i);

        double d = i; // primitive widening (automatischer cast)
        System.out.println(d);

        System.out.println((double) i);
        i = 1000;
        System.out.println((byte) i); // byte ist zu klein und wird hier überfüllt
        i = 10_000;
        System.out.println((char) i);
    }
}
