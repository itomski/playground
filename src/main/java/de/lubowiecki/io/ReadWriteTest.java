package de.lubowiecki.io;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadWriteTest {

    // IO
    // Ablage im Projekt
    //public static final String FILE = "data.txt";

    // Ablage im Benutzerordner
    public static final String FILE = System.getProperty("user.home") + "/data.txt";

    public static void main(String[] args) {

        //System.out.println(System.getProperties());
        System.out.println(System.getProperty("user.home"));

        System.out.println();

        // IO, NIO
        // Schreiben
//        try {
//            writeToFile2("Das ist das Haus von Nikigraus");
//        }
//        catch (IOException e) {
//            System.out.println("Fehler beim Schreiben.");
//        }

        // Lesen
        try {
            String content = readFromFileNIO();
            System.out.println(content);
        }
        catch (IOException e) {
            e.printStackTrace();
        }


    }

    // Vor Java 1.7
    private static void writeToFile1(String content) throws IOException {
        FileWriter fw = null;
        try {
            fw = new FileWriter(FILE, true);
            fw.append(content);
            fw.append("\n");
        }
        finally {
            if(fw != null)
                fw.close();
        }
    }

    // Ab Java 1.7 (besser)
    private static void writeToFile2(String content) throws IOException {
        // FileWriter out = new FileWriter(FILE, true) // Schreibt Zeichen für Zeichen
        // BufferedWriter // Schreibt ganze Sammlungen von Zeichen
        try(BufferedWriter out = new BufferedWriter(new FileWriter(FILE, true))) {
            out.append(content);
            out.append("\n");
            out.flush(); // Sndet Daten aus dem Puffer an die Datei, auch wenn der Puffer noch nicht voll ist
            // ruft automatisch und immer ein close() am ende des try
        }
    }

    // IO
    private static String readFromFile() throws IOException {
        try(BufferedReader in = new BufferedReader(new FileReader(FILE))) {
            StringBuilder sb = new StringBuilder();
            String line = null;
            // Abfrage Zeile für Zeile
            while((line = in.readLine()) != null) {
                sb.append(line).append("\n");
            }
            return sb.toString();
            // ruft automatisch und immer ein close() am ende des try
        }
    }

    // NIO
    private static String readFromFileNIO() throws IOException {
        Path pfad = Paths.get(FILE); // String wird zu Path
        return Files.readString(pfad); // Abfrage des kompletten Inhalts
    }

}
