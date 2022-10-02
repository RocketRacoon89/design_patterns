package main.creational.abstractFactory.autoRepairShop.car;

import main.creational.abstractFactory.autoRepairShop.Manager;

public class CarAreaManager implements Manager {
    @Override
    public void manageTeam() {
        System.out.println("Manages the car repair area.");
    }
}
