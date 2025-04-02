package de.lubowiecki.vererbung;

public class Student extends Person {

    private String matrikelNr;

    public Student() {
        // super(); // Zuerst wird der Konstruktor der Elternklasse (Person) aufgerufen
        System.out.println("C: Strudent");
    }

    public String getMatrikelNr() {
        return matrikelNr;
    }

    public void setMatrikelNr(String matrikelNr) {
        this.matrikelNr = matrikelNr;
    }
}
