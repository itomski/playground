package de.lubowiecki.designpatterns;

public class WordDocument implements Printable {

    private String content = "";

    public void append(String content) {
        this.content += content;
    }

    public void print() {
        System.out.println("Print Word-Doc: " + content);
    }
}
