package de.lubowiecki;

import java.util.Scanner;

public class InputTest2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Eingabe: ");

        // trim schneidet Leerzeichen und Tabs an beiden Enden der Zeichenkette ab
        // String in = scanner.next().trim().toLowerCase();
        String in = scanner.next();

        if(in.equalsIgnoreCase("moin")) {
            System.out.println("Moin Moin!");
        }
        else {
            System.out.println("Ich verstehe dich nicht!");
        }

        scanner.close();
    }
}
