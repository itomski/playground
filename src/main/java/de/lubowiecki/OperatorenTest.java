package de.lubowiecki;

public class OperatorenTest {

    public static void main(String[] args) {

        byte a = 10;
        byte b = 20;
        // byte sum = a + b; // Error: byte und short werden zum rechnen zu int angehoben
        int sum = a + b; // Ok

        a += 10; // a = (byte)(a + 10);

        a = 127;
        a += 10;
        System.out.println(a);

        a++; // a = (byte)(a + 1);
        a--; // a = (byte)(a - 1);

        int erg = 10 + 3 * 2;

        System.out.println();

        int i = 65; // 01000001
        int j = 12; // 00001100
                    // 00000000
        System.out.println(i & j); // Bit UND

        i = 65; // 01000001
        j = 12; // 00001100
                // 01001101
        System.out.println(i | j); // Bit ODER

        i = 65; // 01000001
                // 00010000
        System.out.println(i >> 2); // Bit SHIFT

        String s1; // Variable ist deklariert aber nicht initialisiert. Kann nicht verwendet werden
        String s2 = null; // Variable ist deklariert und mit null;
        // s2 = "abcD";


        // System.out.println(s1.toUpperCase()); // Error: Lokale Variable MUSS vor der Verwendung initialisiert werden
        // System.out.println(s2.toUpperCase()); // NullPointerException

//        if(s2 != null & s2.length() > 0) // NullPointerException
//            System.out.println(s2.toUpperCase());

        if(s2 != null && s2.length() > 0) // Besser!
            System.out.println(s2.toUpperCase());

        erg = 'a' + 'b'; // Keine Verkettung. a und b werden zu int konvertiert
        System.out.println(erg);

        double erg2 = 10 + 2 + 7.5;

    }
}
