package de.lubowiecki.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public final class CLIInputUtility {

    private static Scanner scanner = new Scanner(System.in);

    private CLIInputUtility() {
    }

    public static int inputInt(String label) {
        while(true) {
            try {
                System.out.print(label);
                return customNextInt();
            }
            catch(InputMismatchException e) {
                System.out.println("Falsche Eingabe!");
                scanner.nextLine(); // Buffer wird geleert
            }
            catch(WertZuNiedrigException e) {
                System.out.println("Wert zu niendrig!");
            }
            catch(WertZuHochException e) {
                System.out.println("Wert zu hoch!");
            }
        }
    }

    private static int customNextInt() throws InputMismatchException, WertZuHochException, WertZuNiedrigException  {
        int i = scanner.nextInt();
        if(i < 0)
            throw new CLIInputUtility.WertZuNiedrigException();

        if(i > 100)
            throw new CLIInputUtility.WertZuHochException();

        return i;
    }

    // Innere Klassen
    static class WertZuHochException extends RuntimeException {}

    static class WertZuNiedrigException extends RuntimeException {}
}


