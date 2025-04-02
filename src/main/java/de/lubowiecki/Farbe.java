package de.lubowiecki;

public enum Farbe {

    BLAU("#0000ff"), ROT("#ff0000"), GRUEN("#00ff00"), SCHWARZ("#000000");

    private String rgb;

    Farbe(String rgb) {
        this.rgb = rgb;
    }

    public String getRgb() {
        return rgb;
    }
}
