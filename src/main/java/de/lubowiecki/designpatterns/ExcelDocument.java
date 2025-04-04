package de.lubowiecki.designpatterns;

import java.util.ArrayList;
import java.util.List;

public class ExcelDocument implements Printable {

    private List<String> rows = new ArrayList<>();

    public void addRow(String row) {
        rows.add(row);
    }

    @Override
    public void print() {
        System.out.println("Print Excel-Doc:");
        for(String row : rows)
            System.out.println(row);
    }
}
