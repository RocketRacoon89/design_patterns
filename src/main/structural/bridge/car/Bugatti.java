package main.structural.bridge.car;

public class Bugatti extends Maker{
    public Bugatti(Car car) {
        super(car);
    }

    @Override
    public void work() {
        car.info();
    }
}
