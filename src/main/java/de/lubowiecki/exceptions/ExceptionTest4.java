package de.lubowiecki.exceptions;

import java.util.Scanner;

public class ExceptionTest4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("a: ");
        String s1 = scanner.next();

        System.out.print("b: ");
        String s2 = scanner.next();

        try {
            System.out.println(divStringNumbers(s1, s2));
        }
        catch (ArithmeticException e) {
            System.out.println("b darf nicht 0 sein!");
        }
        catch (NumberFormatException e) {
            System.out.println("Einer der eigegebenen Werte ist keine gültige Zahl");
        }
        catch (RuntimeException e) {
            System.out.println("Irgendein Laufzeit-Problem");
        }
        catch (Exception e) {
            System.out.println("Irgendein Problem");
        }

        System.out.println();

        try {
            System.out.println(divStringNumbers(s1, s2));
        }
        catch(RuntimeException e) {
            System.out.println("Probleme mit der Eingabe");
        }

        System.out.println();

        try {
            System.out.println(divStringNumbers(s1, s2));
        }
        catch(ArithmeticException | NumberFormatException | NullPointerException e) {
            System.out.println("Probleme mit der Eingabe");
        }
    }

    // NumberFormatException ist unchecked (RuntimeException)
    // ArithmeticException ist unchecked (RuntimeException)
    // UncheckedException müssen weder behandelt noch deklariert werden
    public static int divStringNumbers(String a, String b) throws NumberFormatException, ArithmeticException {

        int ad = Integer.parseInt(a);
        int bd = Integer.parseInt(b);

        int sum = ad / bd;

        return sum;
    }

}
