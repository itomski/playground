package de.lubowiecki;

public class SwitchTest {

    public static void main(String[] args) {

        // Ganzzahlen, außer long
        // String und Enums sind auch erlaubt

        // Enums werden nicht mit new instanziert
        Wochentag auswahl = Wochentag.SO;

        // -> produziert automatich ein break
        switch(auswahl) {
            case MO -> System.out.println("Montag");
            case DI -> System.out.println("Dienstag");
            case MI -> System.out.println("Mittwoch");
            case DO -> System.out.println("Donnerstag");
            case FR -> System.out.println("Freitag");
            default -> System.out.println("Wochenende");
        }

        System.out.println(auswahl);

        Farbe f = Farbe.ROT;
        System.out.println(f.getRgb());


        // Wert hinter -> wird in output geschrieben
        String output = switch(auswahl) {
            case MO -> "Montag";
            case DI -> "Dienstag";
            case MI -> "Mittwoch";
            case DO -> "Donnerstag";
            case FR -> "Freitag";
            default -> "Wochenende";
        };

        System.out.println();

        String eingabe = "A";

        final String a = "A"; // Compile-Time-Konstanten

        final String b;
        b = "B"; // Runtime-Time-Konstanten

        switch(eingabe) {
            case a: // Falls Variablen für Cases verwendet werden, müssen es Compile-Time-Konstanten sein
                System.out.println("Text 1");
                //break;

            case "B":
                System.out.println("Text 2");
                break;

            case "C":
                System.out.println("Text 3");
                break;
        }

        System.out.println(a + "...");
        System.out.println(b + "...");

    }
}

// Vorgegebene Auswahlmöglichkeiten
enum Wochentag {

    MO, DI, MI, DO, FR, SA, SO; // Auswahlmöglichkeiten

}

// In einer eigenen Datei deklariert
//enum Farbe {
//
//    BLAU("#0000ff"), ROT("#ff0000"), GRUEN("#00ff00"), SCHWARZ("#000000");
//
//    private String rgb;
//
//    Farbe(String rgb) {
//        this.rgb = rgb;
//    }
//
//    public String getRgb() {
//        return rgb;
//    }
//}