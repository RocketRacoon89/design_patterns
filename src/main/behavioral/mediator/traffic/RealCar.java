package main.behavioral.mediator.traffic;

public class RealCar implements Car{
    String model;
    TrafficLight trafficLight;

    public RealCar(String model, TrafficLight trafficLight) {
        this.model = model;
        this.trafficLight = trafficLight;
    }

    @Override
    public void drive() {
        trafficLight.echoStart(model);
    }

    @Override
    public void stop() {
        trafficLight.echoStop(model);
    }
}
