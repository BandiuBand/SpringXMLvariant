package org.bandiu.springxmlvariant;

public class Engine {
    private int amountOfCyls;

    public Engine(int amountOfCyls) {
        this.amountOfCyls = amountOfCyls;
    }
    @Override
    public String toString(){

        return amountOfCyls+" cylindres engine";
    }
}
