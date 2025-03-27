package de.lubowiecki;

import java.util.Scanner;

public class InputTest3 {

    public static void main(String[] args) {

//        // for weiß vor dem Start, wie oft es durchlaufen wird
//        for(int i = 0; i < 10; i++) {
//            System.out.println("Hallo");
//        }
//        System.out.println();

        Scanner scanner = new Scanner(System.in);

        boolean exit = false;

        // while läuft so oft durch, bis die Bedingung false ist
        while(!exit) { // ! dreht das Ergebnis um
            System.out.print("Eingabe: ");
            String input = scanner.next();

            if(input.equalsIgnoreCase("info")) {
                System.out.println("Hier sind die Infos...");
            }
            else if(input.equalsIgnoreCase("help")) {
                System.out.println("Hier kommt die Hilfe.");
            }
            else if(input.equalsIgnoreCase("exit")) {
                System.out.println("Programm wird verlassen.");
                exit = true;
            }
            else {
                System.out.println("Falsche Eingabe.");
            }
        }
    }
}
