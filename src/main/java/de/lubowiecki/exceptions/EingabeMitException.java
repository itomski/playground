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
                int i = scanner.nextInt();
                if(i < 0)
                    throw new RuntimeException();

                return i;
            }
            catch(InputMismatchException e) {
                System.out.println("Falsche Eingabe!");
                scanner.nextLine(); // Buffer wird geleert
            }
            catch(RuntimeException e) {
                System.out.println("Wert zu niendrig!");
            }
        }
    }
}
