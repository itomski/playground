package de.lubowiecki.pruefung;

public class EinfuehrungTest {

    public static void main(String[] args) {

        // Namenskonventionen

        // Klassennamen als Dateinamen
        // Mehrere Klassen pro Datei möglich, aber nicht schön
        // Nur eine davon darf public sein - diese gibt den Dateinamen vor

        // Was ist ein JRE / JVM / JDK / JIT
        // JRE: Java Runtime Enviroment - Wird zum Ausführen gebraucht
        // JVM: Java Virtual Machine - Teil von JRE
        // JDK: Java Development Kit - Wird für die Entwicklung benutzt
            // Enthält den Compiler - Kompiliert den Sourcecode in ByteCode
        // JIT: Just In Time Compiler - Kompiliert den ByteCode in Maschinensprache

        // Packages
        // Nur max. eine Package-Anweisung pro Klasse möglich
        // Klassen im gleichen Package müssen nicht importiert werden
        // Klassen aus dem Package java.lang brauchen auch nicht importiert zu werden

        // Features von Java
        // Platformunabhängig
        // Objektorientiert / Prozedural
        // Ähnlich zu C / C++
        // Garbage Collector

        // Eine Klasse ist ein Bauplan und ein Datentyp / Referenztyp
        int i = 10;
        String s = "Moin";
        // Instanz / Objekt ist ein Vertreter einer Klasse (wird meistens mit new erzeugt)

        // Stack und Heap
        // Methoden-Aufrufe und primitive Lokale Variablen liegen auf dem Stack
        // Objekte liegen auf dem Heap

    }

}
