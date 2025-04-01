package de.lubowiecki;

public class StringBuilderTest {

    public static void main(String[] args) {

        String s = "Hallo"; // Nicht veränderbar
        s = s + " Welt";

        for(int i = 0; i < 1000; i++) {
            s += i;
        }

        System.out.println(s);

        System.out.println();

        StringBuilder sb = new StringBuilder("Hallo"); // Veränderbar
        sb.append(" Welt");

        for(int i = 0; i < 1000; i++) {
            sb.append(i);
        }

        String inhalt = sb.toString(); // StringBuiloder gibt seinen Inhalt als einen String zurück

        String name = "Peter";
        System.out.println("Hallo " + name);
        name = "Bruce";
        System.out.println("Hallo " + name);
        name = "Carol";
        System.out.println("Hallo " + name);

        System.out.println();

        String[] namen = {"Peter", "Bruce", "Carol"};
        StringBuilder sb2 = new StringBuilder();
        for(String n : namen) {
            sb2.append("Hallo ").append(name).append("\n");
        }
        System.out.println(sb2); // println, print etc. (Ausgaben auf der Konsole) verwendet automatisch toString
    }
}
