package de.lubowiecki.exceptions;

public class ExceptionTest2 {

    public static void main(String[] args) {
        System.out.println("main Start");
        try {
            machWas1();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("main Ende");
    }

    public static void machWas1() {
        System.out.println("machWas1 Start");
//        try {
            machWas2();
//        } catch (RuntimeException e) {
//            System.out.println(e.getMessage());
//        }
        System.out.println("machWas1 Ende");
    }

    public static void machWas2() {
        System.out.println("machWas2 Start");
//        try {
            machWas3();
//        }
//        catch(RuntimeException e) {
//            System.out.println(e.getMessage());
//        }
        System.out.println("machWas2 Ende");
    }

    public static int machWas3() {
        System.out.println("machWas3 Start");
//        try {
            throw new RuntimeException("Zahl nicht gefunden!"); // Exception wird geworfen
//        }
//        catch(RuntimeException e) {
//            System.out.println(e.getMessage());
//        }
//        System.out.println("machWas3 Ende");
//
//        return 100;
    }
}
