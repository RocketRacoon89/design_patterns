package main.structural.bridge.car;

public class Volvo extends Maker {
    public Volvo(Car car) {
        super(car);
    }

    @Override
    public void work() {
        car.info();
    }
}
