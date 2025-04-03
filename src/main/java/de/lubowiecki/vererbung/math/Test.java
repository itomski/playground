package de.lubowiecki.vererbung.math;

public class Test {

    public static void main(String[] args) {

        // GeoForm g1 = new GeoForm(); // Error: Klasse ist abstrakt. Keine Instanzierung möglich
        Kreis k = new Kreis(10, 20, 100);

        Viereck v = new Viereck(20, 30, 150, 300);

        Quadrat q = new Quadrat(15, 22, 100);



    }

}
