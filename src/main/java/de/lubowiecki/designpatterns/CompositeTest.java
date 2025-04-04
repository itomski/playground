package de.lubowiecki.designpatterns;

public class CompositeTest {

    public static void main(String[] args) {

        WordDocument word = new WordDocument();
        word.append("Das ist das Haus \n");
        word.append("von Nikigraus");


        ExcelDocument excel = new ExcelDocument();
        excel.addRow("Peter");
        excel.addRow("Bruce");
        excel.addRow("Natasha");
        excel.addRow("Carol");

        PowerPointDocument powerPoint = new PowerPointDocument();
        powerPoint.addSlide("Herzlich Willkommen");
        powerPoint.addSlide("Die Agenda für den heutigen Tag");
        powerPoint.addSlide("Ende");

//        word.print();
//        System.out.println();
//
//        excel.print();
//        System.out.println();
//
//        powerPoint.print();
//        System.out.println();

//        Printable doc = word;
//        doc.print();
//
//        doc = excel;
//        doc.print();
//
//        doc = powerPoint;
//        doc.print();

        WordDocument word2 = new WordDocument();
        word2.append("Bla bla bla bla");

        // Methode mit Var-Arg
        //printAll(excel, word, powerPoint, word2);

        PrintGruppe gruppe1 = new PrintGruppe();
        gruppe1.add(word);

        PrintGruppe gruppe2 = new PrintGruppe();
        gruppe2.add(word2, excel, powerPoint, gruppe1);

        PDFPrinter pdfPrinter = new PDFPrinter();
        pdfPrinter.print(gruppe2); // Die Gruppe verhält sich wie ein einziges Printable-Objekt

        // String ist immutable und die Klasse kann nicht beerbt werden, da sie final ist
        // String

    }

    public static void printAll(Printable... docs) {
        for(Printable p : docs) {
            p.print();
            System.out.println();
        }
    }
}
