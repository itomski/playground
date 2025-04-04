package de.lubowiecki;

import java.util.Locale;
import java.util.Scanner;

public class ScannerTest {

    public static void main(String[] args) {

        // Locale.setDefault(Locale.US); // Sprache und Land wird auf USA gesetzt

        Scanner scanner = new Scanner(System.in);

        System.out.print("Preis: ");
        double preis = scanner.nextDouble(); // Lokalisierung wird benutzt
        System.out.println(preis);
        System.out.printf("%.2f \n", preis); // Lokalisierung wird benutzt

        System.out.print("Preis: ");
        // bei next und nextLine wird eine Lokalisierung nicht verwendet
        preis = Double.parseDouble(scanner.next()); // parseDouble benötigt die US-Schreibweise

    }
}
