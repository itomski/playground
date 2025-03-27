package de.lubowiecki;


import java.util.Scanner;

public class ArrayTest2 {

    // args = Parameter, die beim Programmstart übergeben wurden
    public static void main(String[] args) {

        String s = "Hallo Welt";
        System.out.println(s.length()); // String ist keine Array. Hat aber eine length-Methode

        Scanner scanner = new Scanner(System.in);
//        scanner.close();
//        scanner = new Scanner(System.in);

        // Konstante
        final int ANZAHL = 100;

        String[] namen = new String[ANZAHL];

        // .length = die Anzahl Positionen in dem Array
        for (int i = 0; i < namen.length; i++) {
            System.out.print("Name No." + i + ": ");
            namen[i] = scanner.nextLine();
        }

        System.out.println();

        System.out.println("Das sind die Namen! ");

        for(String name : namen) {
            System.out.println(name);
        }
    }
}
