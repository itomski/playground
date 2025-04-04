package de.lubowiecki.designpatterns;

import java.util.ArrayList;
import java.util.List;

public class PowerPointDocument implements Printable, Presentable {

    private List<String> slides = new ArrayList<>();

    public void addSlide(String slide) {
        slides.add(slide);
    }

    @Override
    public void print() {
        System.out.println("Print PowerPoint-Doc:");
        for (int i = 0; i < slides.size(); i++) {
            System.out.println((i + 1) + ": " + slides.get(i));
        }
    }

    @Override
    public void show() {
        System.out.println("Show PowerPoint-Doc:");
        for (int i = 0; i < slides.size(); i++) {
            System.out.println((i + 1) + ": " + slides.get(i));
        }
    }
}
