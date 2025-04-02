package de.lubowiecki.uebungen.dice;

public class DiceCupTest2 {

    public static void main(String[] args) {

        final DiceCupNext W6 = new DiceCupNext(); // automatisch 6-seitig
        final DiceCupNext W10 = new DiceCupNext(10);
        final DiceCupNext W100 = new DiceCupNext(100);

        System.out.println(W6.roll());
        System.out.println(W6.roll());
        System.out.println(W6.roll());

        System.out.println();

        System.out.println(W10.roll());
        System.out.println(W10.roll());
        System.out.println(W10.roll());

        System.out.println();

        System.out.println(W100.roll());
        System.out.println(W100.roll());
        System.out.println(W100.roll());
    }
}
