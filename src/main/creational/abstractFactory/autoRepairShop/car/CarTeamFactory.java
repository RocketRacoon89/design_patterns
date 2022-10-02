package main.creational.abstractFactory.autoRepairShop.car;

import main.creational.abstractFactory.autoRepairShop.Electrician;
import main.creational.abstractFactory.autoRepairShop.Manager;
import main.creational.abstractFactory.autoRepairShop.Mechanic;
import main.creational.abstractFactory.autoRepairShop.TeamFactory;

public class CarTeamFactory implements TeamFactory {
    @Override
    public Electrician getElectrician() {
        return new CarElectrician();
    }

    @Override
    public Mechanic getMechanic() {
        return new CarMechanic();
    }

    @Override
    public Manager getManager() {
        return new CarAreaManager();
    }
}
