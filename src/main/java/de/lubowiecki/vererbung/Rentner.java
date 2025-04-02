package de.lubowiecki.vererbung;

import java.time.LocalDate;

public class Rentner extends Person {

    private LocalDate rentenStart;

    public LocalDate getRentenStart() {
        return rentenStart;
    }

    public void setRentenStart(LocalDate rentenStart) {
        this.rentenStart = rentenStart;
    }
}
