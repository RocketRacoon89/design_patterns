package main.creational.abstractFactory.autoRepairShop.truck;

import main.creational.abstractFactory.autoRepairShop.Mechanic;

public class TruckMechanic implements Mechanic {
    @Override
    public void fixEngine() {
        System.out.println("Mechanic repair truck engine.");
    }
}
