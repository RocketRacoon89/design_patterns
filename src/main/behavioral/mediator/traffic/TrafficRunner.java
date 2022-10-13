package main.behavioral.mediator.traffic;

import java.util.ArrayList;
import java.util.List;

public class TrafficRunner {
    public static void main(String[] args) {
        TrafficLight trafficLight = new RealTrafficLight();

        Car car1 = new RealCar("Ford", trafficLight);
        Car car2 = new RealCar("Honda", trafficLight);
        Car car3 = new RealCar("Opel", trafficLight);
        Car car4 = new RealCar("Toyota", trafficLight);

        List<Car> carsList = new ArrayList<>();
        carsList.add(car1);
        carsList.add(car2);
        carsList.add(car3);
        carsList.add(car4);

        trafficLight.setCars(carsList);

        trafficLight.changeLight(ColorLight.GREEN);

        trafficLight.changeLight(ColorLight.RED);
    }
}
