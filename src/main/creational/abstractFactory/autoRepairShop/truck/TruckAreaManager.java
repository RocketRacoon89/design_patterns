package main.creational.abstractFactory.autoRepairShop.truck;

import main.creational.abstractFactory.autoRepairShop.Manager;

public class TruckAreaManager implements Manager {
    @Override
    public void manageTeam() {
        System.out.println("Manages truck repair area");
    }
}
