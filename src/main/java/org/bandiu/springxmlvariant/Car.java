package org.bandiu.springxmlvariant;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private double consumption = 4.6;
    private Engine engine;
    private List<Wheel> wheels = new ArrayList<>();

    public Car(double consumption, Engine engine, List<Wheel> wheels) {
        this.consumption = consumption;
        this.engine = engine;
        this.wheels = wheels;
    }

    public double getConsumption() {
        return consumption;
    }

    public Engine getEngine() {
        return engine;
    }

    public List<Wheel> getWheels() {
        return wheels;
    }
    @Override
    public String toString(){
        StringBuilder stringBuilder =  new StringBuilder();
        stringBuilder.append("Car with ").append(engine.toString()).append(" consumption is ").append(consumption).append("\n").append("and wheels:\n");
        for (Wheel whell:wheels) {
            stringBuilder.append(whell.toString()).append("\n");
        }
        return stringBuilder.toString();
    }
}
