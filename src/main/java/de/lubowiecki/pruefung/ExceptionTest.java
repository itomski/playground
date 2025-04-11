package de.lubowiecki.pruefung;

public class ExceptionTest {

    public static void main(String[] args) {

        // Unterschied Checked und Unchecked Exception (RuntimeException)
        // Reihenfolge bei Catch
        /* Bedeutung von Exceptions:
                ArrayIndexOutOfBoundsException
                NullPointerException
                NumberFormatException
                ArithmeticException
         */

        // ArrayIndexOutOfBoundsException
        // Zugriff auf einen Index eines Arrrays, den es nicht gibt

        // Mit einem catch auf Exception können ALLE Arten von Exception gefangen werden
        // Mit einem catch auf RuntimeException können NUR Unchecked Exceptions gefangen werden


        // NullPointerException
        // Wenn über eine NULL-Referenz auf eine Eigenschaft oder eine Methode zugegriffen wird
        try {
            String s = null;
            System.out.println(s.isEmpty()); // NullPointerException
        }
        catch (NullPointerException e) {
            System.out.println("NULL");
        }
        catch(RuntimeException e) {
            e.printStackTrace();
        }
        catch(Exception e) {
            System.out.println("REST");
        }

        // Bei mehreren catch-Blöcken werden die zu fangenden Exceptions von Kind nach Elternklasse geordnet

        // NumberFormatException
        // Text soll zu Zahl geparst werden, hat aber nicht das richtige Format

        // ArithmeticException
        // Division durch 0 (Nur bei Ganzzahlen möglich)

        double a = 10.0;
        double b = 0.0;
        double erg = a / b;
        // Fließkommazahlen produzieren bei Teilen durch 0 (bzw. 0.0) ein Infinite

        if(Double.isInfinite(erg)) {
            System.out.println("Du hast durch 0 geteilt! Das geht nicht!");
        }
        else {
            System.out.println(erg);
        }
    }
}
