package de.lubowiecki;


import java.util.Scanner;

public class InputTest {

    public static void main(String[] args) {

        // System.out - Output-Stream
        System.out.println("Text");

        // System.err - Output-Stream für Fehler
        System.err.println("Error!");

        //System.in - Input-Stream

        Scanner scanner = new Scanner(System.in);

        // Eingabe einlesen
        // String input = scanner.next(); // Liest Text bis zum ersten Leerzeichen ein
        System.out.print("Eingabe: ");
        String input = scanner.nextLine(); // Liest die komplette Zeile ein
        System.out.println(input); // Eingabe ausgeben

        // Ist einer der Operanden ein String, dann führt + IMMER zu einer Verkettung
        System.out.println(input + 2);

        System.out.print("Zahl: ");
        int zahl = scanner.nextInt(); // Liest eine Ganzzahl ein
        scanner.nextLine(); // fix. Leert den Eingabe Buffer
        System.out.println(zahl); // Eingabe ausgeben
        System.out.println(zahl + 2);

        scanner.close();

        // Seit Java 1.7 try-with-resources
        try(Scanner scanner2 = new Scanner(System.in);) {


            // scanner wird am ende des Blocks automatisch geschlossen
        }
    }
}
