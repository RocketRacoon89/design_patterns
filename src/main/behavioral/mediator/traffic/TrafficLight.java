package main.behavioral.mediator.traffic;

import java.util.List;

public interface TrafficLight {
    public void changeLight(ColorLight color);
    public void echoStop(String model);
    public void echoStart(String model);
    public void setCars(List<Car> cars);
}
