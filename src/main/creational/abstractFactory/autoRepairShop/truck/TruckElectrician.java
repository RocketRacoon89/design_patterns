package main.creational.abstractFactory.autoRepairShop.truck;

import main.creational.abstractFactory.autoRepairShop.Electrician;

public class TruckElectrician implements Electrician {

    @Override
    public void fixElectrics() {
        System.out.println("An electrician repairs the wiring of a truck.");
    }
}
