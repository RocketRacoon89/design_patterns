package main.structural.adapter.drivingCar;

public class CarRunner {
    public static void main(String[] args) {
        Car car = new AdapterJavaToCar();

        car.forward();
        car.left();
        car.right();
        car.back();
    }
}
