package main.structural.bridge.workshop;

public class Mechanic implements Worker{
    @Override
    public void repairCar() {
        System.out.println("Mechanic repair car");
    }
}
