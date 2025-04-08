package de.lubowiecki.exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CheckedExceptionTest3 {

    public static void main(String[] args) {

        String inhalt = readFromFile("data.txt");
        System.out.println("Inhalt: " + inhalt);

        System.out.println();

        try {
            inhalt = readFromFile2("data.txt");
            System.out.println("Inhalt: " + inhalt);
        }
        catch (IOException e) {
            System.out.println("Fehler beim Lesen aus der Datei");
        }

    }

    public static String readFromFile(String name) {
        Path path = Paths.get(name);
        try {
            BufferedReader in = Files.newBufferedReader(path);
            return in.readLine();
        }
        catch(IOException e) {
            System.out.println("Lesen nicht möglich");
        }
        return "";
    }

    // throws IOException:
    // Entbindet die Methode davon sich selbst um die Exception zu kümmern
    // Verpflichtet den Aufrufer der Methode sich um die Exception zu kümmern
    public static String readFromFile2(String name) throws IOException {
        Path path = Paths.get(name);
        BufferedReader in = Files.newBufferedReader(path);
        return in.readLine();
    }
}
