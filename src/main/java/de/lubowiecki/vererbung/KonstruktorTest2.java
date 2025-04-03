package de.lubowiecki.vererbung;

public class KonstruktorTest2 {

    public static void main(String[] args) {

        C c = new C();
        c.machWas();

        System.out.println();

        B b = new B();
        b.machWas();

        System.out.println();

        A a = new A();
        a.machWas();

        System.out.println();

        A a2 = new A(); // A IS-A A
        a2 = new B(); // B IS-A A
        a2 = new C(); // C IS-A A

        // a2 hat als Referenztyp A
        // Instanzmethoden werden auf dem Objekt auf dem Heap ausgeführt (Hier ist es C)
        a2.machWas();
        // Variable ist vom Typ A. Nur aufrufe von Methoden möglich, die auch in A deklariert sind
        // a2.machWasAnderes(); // Error

    }
}

class A {

    public A() {
        // wird kein besonderer Konstruktor der Elternklasse aufgerufen, muss diese einen parameterlosen haben
        //super();
        System.out.println("A");
    }

    public A(int... i) {
        //super();
        System.out.println("A: " + i);
    }

    // public Methoden werden vererbt
    public void machWas() {
        System.out.println("machWas aus A");
    }
}

class B extends A {

    public B() {
        super();
        System.out.println("B");
    }

    // Geerbte Methode wird ersetzt
    @Override
    public void machWas() {
        System.out.println("machWas aus B");
    }
}

// Wenn kein extends vorhanden, erbt die Klasse von der Klasse Object
class C extends B {

    public C() {
        //super();
        System.out.println("C");
    }

    // Geerbte Methode wird ersetzt
    @Override
    public void machWas() {
        System.out.println("machWas aus C");
        // wenn nichts vor der Methode steht, wird automatisch this verwendet
        // ist die Methode in dieser Klasse nicht definiert,
        // bewegt sich der Interpreter automatisch zu der Elternklasse
        // machWas();
        super.machWas(); // Aufruf der Methode direkt aus der Elternklasse
    }

    public void machWasAnderes() {
        System.out.println("machWasAnderes aus C");
    }
}
