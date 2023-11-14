package org.bandiu.springxmlvariant;

public class Wheel {
    private Tare tare;

    public Wheel(Tare tare) {
        this.tare = tare;
    }

    public Tare getTare() {
        return tare;
    }
    @Override
    public String toString(){

        return "wheel with "+tare.toString();
    }
}
