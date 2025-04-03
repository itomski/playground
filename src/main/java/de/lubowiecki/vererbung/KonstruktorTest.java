package de.lubowiecki.vererbung;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KonstruktorTest {

    public static void main(String[] args) {

        Pkw p1 = new Pkw("HH:AB123",4);
        //p1.kennzeichen = "HH:AB123";
        if(p1.addInsassen("Peter")) System.out.println("Eingestiegen");
        if(p1.addInsassen("Bruce")) System.out.println("Eingestiegen");
        if(p1.addInsassen("Carol")) System.out.println("Eingestiegen");
        if(p1.addInsassen("Natasha")) System.out.println("Eingestiegen");


        if(p1.addInsassen("Steve")) System.out.println("Eingestiegen");
        // p1.maxInsassen = 5;
        // p1.setMaxInsassen(5);
        // if(p1.addInsassen("Steve")) System.out.println("Eingestiegen");
        // p1.insassen.add("Steve");

        System.out.println(p1); // Hier wird automatisch toString verwendet

        // p1.getInsassen().add("Steve"); // UnsupportedOperationException

        for(String n : p1.getInsassen()) {
            System.out.println(n);
        }
    }
}

class Fahrzeug {

    // Wert kann sich nach der Zuweisung im Konstruktor nicht mehr ändern
    private final String kennzeichen;

    public Fahrzeug(String kennzeichen) {
        this.kennzeichen = kennzeichen;
    }

    public String getKennzeichen() {
        return kennzeichen;
    }
}

// Pkw IS-A Fahrzeug
class Pkw extends Fahrzeug {

    // Instanz-Konstanten MÜSSEN spätestens im Konstruktor einen Wert bekommen
    private final int MAX_INSASSEN;

    // Pkw HAS-A ArrayList<String>
    private ArrayList<String> insassen = new ArrayList<>();

    public Pkw(String kennzeichen, int maxInsassen) {
        // super(); // Error: Es gibt in der Elternkasse keine parameterlosen Konstruktor!
        super(kennzeichen); // Konstruktor für mit kennzeichen wird aus der Elternklasse verwendet
        this.MAX_INSASSEN = maxInsassen;
    }

    public boolean addInsassen(String name) {
        if(insassen.size() < MAX_INSASSEN)
            return insassen.add(name);

        return false;
    }

    public int getMaxInsassen() {
        return MAX_INSASSEN;
    }

    public List<String> getInsassen() {
        return Collections.unmodifiableList(insassen); // Gibt eine nicht veränderbare Version an den Aufrufer
    }

    public void setInsassen(ArrayList<String> insassen) {
        this.insassen = insassen;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pkw{");
        sb.append("MAX_INSASSEN=").append(MAX_INSASSEN);
        sb.append(", insassen=").append(insassen);
        sb.append(", kennzeichen='").append(getKennzeichen()).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

// Lkw IS-A Fahrzeug
class Lkw extends Fahrzeug {

    public final int MAX_LADUNG;

    // Lkw HAS-A ArrayList<String>
    public ArrayList<String> ladung = new ArrayList<>();

    public Lkw(String kennzeichen, int maxLadnung) {
        super(kennzeichen);
        this.MAX_LADUNG = maxLadnung;
    }
}
