package de.lubowiecki.designpatterns;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintGruppe implements Printable {

    // Der generische Typ kann auch ein Interface sein
    private List<Printable> elements = new ArrayList<>();

    public  void add(Printable... element) {
        // Arrays.asList(element) baut aus dem Array eine Liste
        elements.addAll(Arrays.asList(element)); // Elemente der Liste werden alle zusammen in elemens hinzugefügt
    }

    @Override
    public void print() {
        // Der Aufruf der print-Methode wird an die Elemente in der Liste delegiert
        for(Printable p : elements) {
            p.print();
        }
    }
}
