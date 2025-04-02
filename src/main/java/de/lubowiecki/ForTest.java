package de.lubowiecki;


public class ForTest {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        System.out.println();

        int i = 0;
        for (; i < 10; i++) {
            System.out.println(i);
        }

        System.out.println();

        for (int j = 0;;) { // Endlos-Schleife
            System.out.println(++j);
            if(j == 100) break;
        }

        // for(int j = 0;;System.out.println(++j)); // Auch möglich

        // while

        //final boolean run = true; // Compile-Time-Konstante
        final boolean run;
        run = true; // Runtime-Time-Konstante

        while(run) { // Endlosschleife
            System.out.println("ABC");
        }

        System.out.println("...");
    }

}
