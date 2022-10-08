package main.structural.bridge.workshop;

public class Electician implements Worker{
    @Override
    public void repairCar() {
        System.out.println("Electrician repair car");
    }
}
