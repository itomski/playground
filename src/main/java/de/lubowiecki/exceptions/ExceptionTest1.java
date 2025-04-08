package de.lubowiecki.exceptions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ExceptionTest1 {

    public static void main(String[] args) {

        int a = 10;
        int b = 0;
        try {
            System.out.println(a / b); // ArithmeticException
        }
        catch(ArithmeticException e) {
            System.out.println("Unerlaubte Rechnung!");
        }

        System.out.println("\nARRAYS");

        int[] arr = new int[10];

        try {
            System.out.println(arr[10]); // ArrayIndexOutOfBoundsException
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Probleme mit dem Array: Falscher Index");
        }

        System.out.println();

        try {
            String s = null;
            System.out.println(s.toUpperCase()); // NullPointerException

            arr = new int[-10]; // NegativeArraySizeException
        }
        catch(RuntimeException e) {
            System.out.println(e.getMessage());
            System.out.println("Ein anderes Problem...");
        }

        System.out.println();

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/test");
        }
        catch(SQLException e) {
            System.out.println("Probleme mit der Datenbank");
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
            e.printStackTrace();
        }

        System.out.println("ENDE");
    }
}
