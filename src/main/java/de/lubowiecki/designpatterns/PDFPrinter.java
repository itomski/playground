package de.lubowiecki.designpatterns;

public class PDFPrinter {

    public void print(Printable printable) {
        System.out.println("Als PDF:");
        printable.print();
    }
}
