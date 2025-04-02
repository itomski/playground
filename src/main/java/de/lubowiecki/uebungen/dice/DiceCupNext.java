package de.lubowiecki.uebungen.dice;

import java.util.Random;

public class DiceCupNext {

    private final int FACES;

    private final Random rand = new Random();

    public DiceCupNext() {
        FACES = 6;
    }

    public DiceCupNext(int faces) {
        this.FACES = faces;
    }

    public int roll() {
        return rand.nextInt(FACES) + 1;
    }
}
