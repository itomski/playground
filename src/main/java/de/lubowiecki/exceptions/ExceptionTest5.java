package de.lubowiecki.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest5 {

    public static void main(String[] args) {

        Scanner scanner = null;

        try {
            scanner = new Scanner(System.in);
            System.out.print("Zahl: ");
            double zahl = scanner.nextDouble();
            System.out.println(zahl);
        }
        catch(InputMismatchException e) {
            System.out.println("Falsche Eingabe");
        }
        catch(RuntimeException e) {
            System.out.println("Anderes Problem");
        }
        finally {
            scanner.close();
        }

        System.out.println("Programm beendet");


        System.out.println(machWas());

    }



    public static int machWas() {
        try {
            return 10;
        }
        finally {
            return 20; // Überschreibt den return von 10;
        }
    }

}
