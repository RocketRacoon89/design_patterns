package main.behavioral.mediator.traffic;

import java.util.ArrayList;
import java.util.List;

public class RealTrafficLight implements TrafficLight{

    public List<Car> cars = new ArrayList<>();

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public void echoStop(String model) {
        System.out.println(model+" stopped.");
    }

    public void echoStart(String model) {
        System.out.println(model+" started.");
    }

    @Override
    public void changeLight(ColorLight color) {
        if(color.equals(ColorLight.GREEN)) {
            System.out.println("Green is on. Cars beginning moved.");
            for(Car car:cars) {
                car.drive();
            }
        }
        if(color.equals(ColorLight.RED)) {
            System.out.println("Red is on. Cars stopped.");
            for(Car car:cars) {
                car.stop();
            }
        }
    }
}
