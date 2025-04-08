package de.lubowiecki.exceptions;

public class CheckedExceptionTest6 {

    public static void main(String[] args) {
        System.out.println("main Start");
        try {
            machWas1(); // Exception sollten spätestens in der main-Methode behandelt werden
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("main Ende");
    }

    public static void machWas1() throws Exception {
        System.out.println("machWas1 Start");
        // behandeln oder deklarieren
        machWas2();
        System.out.println("machWas1 Ende");
    }

    public static void machWas2() throws Exception {
        System.out.println("machWas2 Start");
        // behandeln oder deklarieren
        machWas3();
        System.out.println("machWas2 Ende");
    }

    public static void machWas3() throws Exception {
        System.out.println("machWas3 Start");

        int zahl = 0;
        if(zahl < 10)
            throw new Exception("Zahl nicht gefunden!"); // Exception ist eine Checked-Exception

        System.out.println("machWas3 Ende");
    }
}