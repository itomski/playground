package de.lubowiecki.uebungen.pilzsuche;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Spiel.spielNeustarten();
        Spiel.spielfeldAnzeigen();

        Scanner scanner = new Scanner(System.in);

        int x = 0;
        int y = 0;
        do {
            System.out.print("x: ");
            x = scanner.nextInt(); // TODO: Validieren
            System.out.print("y: ");
            y = scanner.nextInt(); // TODO: Validieren

            if(x > 9 || y > 9) {
                System.out.println("Falscheingabe. Werte müssen zwischen 0 und 9 liegen");
                // TODO: Eingabe noch mal einfordern
            }
        }
        while(Spiel.pilzSuchen(x, y));

        System.out.println("Spiel ist beendet.");

    }
}
