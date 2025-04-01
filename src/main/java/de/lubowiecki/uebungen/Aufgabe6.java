package de.lubowiecki.uebungen;

import de.lubowiecki.uebungen.tasklist.Task;

import java.time.LocalDateTime;

public class Aufgabe6 {

    /*
    Schreibe ein Konsolenprogramm für eine Task-Liste mit max. 10 Aufgaben.
    Jede Aufgabe wird durch ein Objekt der Klasse Aufgabe definiert.

    Über die Konsole soll es möglich sein, neue Aufgaben anzulegen oder vorhandene Aufgaben anzuzeigen
    Für die Liste verwende ein Array von Aufgaben.

    Jede Aufgabe soll durch passende Eigenschaften beschrieben werden.
    Verwende Datenkapselung.
    */

    public static void main(String[] args) {

        Task t1 = new Task();
        t1.setTitle("Kuchen backen");
        t1.setDescription("Kuchen für die Party backen. Glutenfrei!");
        t1.setCreatedAt(LocalDateTime.now());

        System.out.println(t1);
    }
}
