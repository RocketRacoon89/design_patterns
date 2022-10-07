package main.structural.adapter.drivingCar;

public class AdapterJavaToCar extends Wheel implements Car {
    @Override
    public void forward() {
        drive();
    }

    @Override
    public void back() {
        reverse();
    }

    @Override
    public void left() {
        turnLeft();
    }

    @Override
    public void right() {
        turnRight();
    }
}
