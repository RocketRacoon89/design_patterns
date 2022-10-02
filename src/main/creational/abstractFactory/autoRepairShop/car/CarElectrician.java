package main.creational.abstractFactory.autoRepairShop.car;

import main.creational.abstractFactory.autoRepairShop.Electrician;

public class CarElectrician implements Electrician {
    @Override
    public void fixElectrics() {
        System.out.println("Repairs the electrician's car.");
    }
}
