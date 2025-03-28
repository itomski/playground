package de.lubowiecki.uebungen.pilzsuche;

import java.util.Random;

public class Spiel {

    private static int[][] spielfeld = new int[10][10];

    private static int anzahlPilze = 10;

    private static int anzahlVersuche = 10;

    private static Random zufallsGenerator = new Random();

    // 0 = leeres feld
    // 1 = ein pilz (noch nicht gefunden)
    // 2 = ein pilz (bereits gefunden)
    // 3 = leeres feld (bereits durchsucht)

    // TODO: Pilze positionieren
    private static void pilzeSetzen() {
        for(int i = 0; i < anzahlPilze; i++) {
            pilzSetzen();
        }
    }

    // Einen Pilz platzieren
    private static void pilzSetzen() {
        int x = zufallsGenerator.nextInt(10);
        int y = zufallsGenerator.nextInt(10);
        if(spielfeld[x][y] == 1) {
            // Wenn ein Pilz an der Position bereits vorhanden ist
            pilzSetzen();
        }
        else {
            spielfeld[x][y] = 1; // Pilz wird an zufällige Position gesetzt
        }
    }

    public static boolean pilzSuchen(int x, int y) {

        if(anzahlVersuche == 0) {
            return false;
        }
        else {
            switch(spielfeld[x][y]) {
                case 0:
                    spielfeld[x][y] = 3; // Pilz nicht gefunden. Leeres Feld auf "durchsucht" setzen
                    System.out.println("Leider kein Pilz gefunden.");
                    anzahlVersuche--;
                    break;

                case 1:
                    spielfeld[x][y] = 2; // Pilz auf "gefunden" setzen
                    System.out.println("Super. Du hast ein Pilz gefunden.");
                    anzahlVersuche--;
                    break;

                case 2:
                    System.out.println("Diesen Pilz hast du bereits gefunden.");
                    break;

                case 3:
                    System.out.println("Diesen Feld hast du bereits durchsucht. Es ist leer");
                    break;
            }
            spielfeldAnzeigen();
            return true;
        }
    }

    public static void spielfeldAnzeigen() {
        System.out.println();
        for(int[] zeile : spielfeld) {
            for(int feld : zeile) {
                if(feld == 1) {
                    feld = 0;
                }
                System.out.print(feld + " ");
            }
            System.out.println();
        }
    }

    public static void spielNeustarten() {
        spielfeld = new int[10][10];
        anzahlVersuche = 10;
        pilzeSetzen();
    }
}
