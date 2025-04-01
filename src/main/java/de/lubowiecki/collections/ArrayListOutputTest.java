package de.lubowiecki.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListOutputTest {

    public static void main(String[] args) {

        // <...> Generics
        ArrayList<String> namen = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("Name: ");
            String input = scanner.nextLine();

            if(input.equalsIgnoreCase("exit")) {
                break;
            }
            else {
                namen.add(input);
            }
        }

        //System.out.println();
        //System.out.println(namen);

//        System.out.println();
//
//        for(int i = 0; i < namen.size(); i++) {
//            System.out.println(namen.get(i));
//        }

        System.out.println();

        for(String n : namen) { // ArrayList kann wie ein Array durchlaufen werden
            System.out.println(n);
        }
    }
}
