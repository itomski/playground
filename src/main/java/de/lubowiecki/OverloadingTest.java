package de.lubowiecki;

import java.util.Arrays;

public class OverloadingTest {

    public static void main(String[] args) {

        machWas(11); // ist eine Methode mit passenden Typ nicht verfügbar: primitive widening
        machWas(22.5);
        machWas(22.5, 10.3);

        StringBuilder sb = new StringBuilder();
        sb.append(10);
        sb.append("..."); // Methode ist mehrmals überladen

        machWas(1,7,22,30,18,-2,15);
        machWas(18,-2,15);
        machWas();

    }

//    private static void machWas(int v) {
//        System.out.println("machWas: int");
//    }

    // Beim Überladen, werden die verschiedenen Versionen der Methode durch die Parameterliste unterschieden
    private static void machWas(double v) {
        System.out.println("machWas: double");
    }

    // 2 Pflichtparameter
    public static void machWas(double v1, double v2) {
        System.out.println("machWas: double, double");
    }

    // ... = VarArgs = Anzahl der Parameter ist frei wählbar (0...*)
    public static void machWas(int... zahlen) {
        // Bei einem VarArg sind die Parameter als Array verfügbar
        System.out.println("machWas: VarArgs");
        // Arrays.toString konvertiert ein Array in ein String
        System.out.println(Arrays.toString(zahlen));
    }

}
