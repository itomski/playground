package de.lubowiecki.spiel1;

import de.lubowiecki.uebungen.dice.DiceCup;

import java.util.Scanner;

public class Ratespiel {

    private static final String KEYS = "\n*******************************" +
                                        "\n\t a : Ratespiel " +
                                        "\n\t b : Prilzsuche " +
                                        "\n\t c : ..." +
                                        "\n\t h : Hilfe" +
                                        "\n\t q : Programm Verlassen" +
                                        "\n*******************************";

    // Klassenvariable = Ist in allen Methoden dieser Klasse sichtbar
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean exit = false;

        System.out.println(KEYS);

        // app = Label
        app: while(true) {

            System.out.print("\nWas willst du tun? ");

            switch(scanner.next().toLowerCase().charAt(0)) {
                case 'a':
                    starteRatespiel();
                    break;

                case 'b':
                    System.out.println("... B");
                    break;

                case 'c':
                    System.out.println("... C");
                    break;

                case 'h':
                    System.out.println(KEYS);
                    break;

                case 'q':
                    System.out.println("Programm wird verlassen.");
                    break app; // Bricht die Kontrollstruktur mit dem Lbel app ab

                default:
                    System.out.println("Falsche Auswahl.");
            }
        }
    }

    public static void starteRatespiel() {

        clearConsol();
        System.out.println("\n\nRatespiel!");

        int gesucht = DiceCup.roll(); // Zufallszahl

        System.out.println("Es wurde eine Zahl zwischen 1 und 6 gefunden. \nDu hast jetzt 3 Versuche um sie zu finden");

        for (int i = 0; i < 3; i++) {
            System.out.print("Versuch Nummer " + (i + 1) + ": ");
            if(scanner.nextInt() == gesucht) {
                System.out.println("Gefunden!");
                break;
            }
            else {
                System.out.println("Leider kein Treffer!");
            }
        }

        System.out.println("Spiel ist beendet. \nDie gesuchte Zahl war: " + gesucht);
    }

    private static void clearConsol() {
        // TODO: Consolenfenster leeren
        try {
            String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                Runtime.getRuntime().exec("cls");
            } else {
                Runtime.getRuntime().exec("clear");
            }
        }
        catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

}
