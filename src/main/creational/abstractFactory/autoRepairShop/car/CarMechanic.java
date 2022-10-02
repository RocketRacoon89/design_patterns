package main.creational.abstractFactory.autoRepairShop.car;

import main.creational.abstractFactory.autoRepairShop.Mechanic;

public class CarMechanic implements Mechanic {
    @Override
    public void fixEngine() {
        System.out.println("Repairs engine of the car.");
    }
}
