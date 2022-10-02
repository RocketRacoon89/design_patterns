package main.creational.abstractFactory.autoRepairShop.truck;

import main.creational.abstractFactory.autoRepairShop.Electrician;
import main.creational.abstractFactory.autoRepairShop.Manager;
import main.creational.abstractFactory.autoRepairShop.Mechanic;
import main.creational.abstractFactory.autoRepairShop.TeamFactory;

public class TruckTeamFactory implements TeamFactory {
    @Override
    public Electrician getElectrician() {
        return new TruckElectrician();
    }

    @Override
    public Mechanic getMechanic() {
        return new TruckMechanic();
    }

    @Override
    public Manager getManager() {
        return new TruckAreaManager();
    }
}
