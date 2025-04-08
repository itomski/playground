package de.lubowiecki.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EingabeMitException {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        int i = inputInt("alter: ");

//        while(true) {
//            try {
//                System.out.print("Eingabe: ");
//                i = scanner.nextInt();
//                break;
//            }
//            catch(InputMismatchException e) {
//                System.out.println("Falsche Eingabe!");
//                scanner.nextLine(); // Buffer wird geleert
//            }
//        }

        System.out.println(i);

    }

    public static int inputInt(String label) {
        while(true) {
            try {
                System.out.print(label);
//                int i = scanner.nextInt();
//                if(i < 0)
//                    throw new WertZuNiedrigException();
//
//                if(i > 100)
//                    throw new WertZuHochException();
//
//                return i;

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

    public static int customNextInt() throws InputMismatchException, WertZuHochException, WertZuNiedrigException  {
        int i = scanner.nextInt();
        if(i < 0)
            throw new WertZuNiedrigException();

        if(i > 100)
            throw new WertZuHochException();

        return i;
    }

}

class WertZuHochException extends RuntimeException {}

class WertZuNiedrigException extends RuntimeException {}
