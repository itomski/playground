package de.lubowiecki;

public class InterfaceTest {

    public static void main(String[] args) {

        Car pc = new Car("VW", "Polo");
        Boat boat = new Boat("Santa Maria");
        Skateboard sk8 = new Skateboard();

        Fahrer f1 = new Fahrer("Peter", sk8);
        f1.starteNeueFahrt(20, 25);
    }
}

interface Movable {

    // Alle Methoden in einem Interface sind automatisch public
    void moveTo(int x, int y);

}

abstract class Vehicle {

    private int x;
    private int y;

    public Vehicle() {
    }

    public Vehicle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}


// Alle Methoden des Interface MÜSSEN implementiert sein
// Durch extends wird konkretes Inventar (Eigenschaften und Methoden) vererbt
// Durch implements verpflichtet sich die Klasse ALLE Methoden den Interface einzubauen
class Car extends Vehicle implements Movable {

    private String brand;
    private String model;

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void moveTo(int x, int y) {
        System.out.println("Pkw fährt an die neue Position.");
        setX(x);
        setY(y);
    }
}

class Boat extends Vehicle implements Movable {

    private String name;

    public Boat(String name) {
        this.name = name;
    }

    public void moveTo(int x, int y) {
        System.out.println("Boat fährt an die neue Position.");
        setX(x);
        setX(y);
    }
}

class Skateboard implements Movable {

    @Override
    public void moveTo(int x, int y) {
        System.out.println("Macht coole Tricks auf dem Skateboard");
    }
}

class Fahrer {

    private final String name;

    private Movable movable;

    public Fahrer(String name, Movable movable) {
        this.name = name;
        this.movable = movable;
    }

    public void setMovable(Movable movable) {
        this.movable = movable;
    }

    public void starteNeueFahrt(int x, int y) {
        movable.moveTo(x, y); // Alle Objekte die Moovable sind haben diese Methode
    }
}