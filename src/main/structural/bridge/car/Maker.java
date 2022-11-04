package main.structural.bridge.car;

public abstract class Maker {
    protected Car car;

    public Maker(Car car) {
        this.car = car;
    }

    public abstract void work();
}
