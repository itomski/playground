package de.lubowiecki.uebungen.tasklist;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class App {

    private static final ArrayList<Task> tasks = new ArrayList<>();

    private static final Scanner scanner = new Scanner(System.in);

    // Texte , die sich nicht verändern sollten hier als static final definiert werden
    private static final String KEYS = "\n**********************************" +
                                        "\n\t e: Task erfassen "+
                                        "\n\t a: Tasks anzeigen " +
                                        "\n\t q: Programm verlassen " +
                                        "\n**********************************\n";

    public static void main(String[] args) {

        app: while(true) {
            System.out.println(KEYS);
            System.out.print("Auswahl: ");

            // Bei Verwendung von -> wird kein break mehr benötigt
            switch(scanner.nextLine().toLowerCase()) {
                case "e" -> einfuegen();
                case "a" -> anzeigen();
                case "q" -> { break app; }
                default -> System.out.println("Falsche Eingabe");
            }
        }

        System.out.println("Programm ist beendet.");
    }

    private static void einfuegen() {
        // Task-Objekt wird erzeugt und befüllt
        Task t = new Task();
        System.out.print("Titel: ");
        t.setTitle(scanner.nextLine());
        System.out.print("Beschreibung: ");
        t.setDescription(scanner.nextLine());
        t.setCreatedAt(LocalDateTime.now());

        tasks.add(t); // Task-Objekt wird in der Liste abgelegt
        System.out.println("Gespeichert!");
    }

    private static void anzeigen() {
        for(Task t : tasks) { // Inhalt der Liste wird ausgegeben
            System.out.println(t);
        }
    }

    private static void loeschen() {

    }
}
