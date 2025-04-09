package de.lubowiecki.io;

import java.io.*;
import java.nio.file.FileSystemNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class SerializeTest {

    public static void main(String[] args) {

        final String FILE = System.getProperty("user.home") + "/kunden.ser";

//        List<Kunde> kunden = new ArrayList<>();
//        kunden.add(new Kunde("Peter", "Parker"));
//        kunden.add(new Kunde("Carol", "Danvers"));
//        kunden.add(new Kunde("Scott", "Lang"));

        // Schreiben
        // try-with-resources
//        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(FILE))) {
//           out.writeObject(kunden);
//        }
//        catch (IOException e) {
//            //System.out.println(e.getMessage());
//            e.printStackTrace();
//        }

        // Lesen
        // try-with-resources
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(FILE))) {
            List<Kunde> eingelesen = (List<Kunde>) in.readObject();
            System.out.println(eingelesen);
        }
        catch (IOException e) {
            System.out.println("Problem beim Zugriff auf die Datei");
        }
        catch (ClassNotFoundException e) {
            System.out.println("Problem beim Deserialisieren der Daten");
        }
    }
}
