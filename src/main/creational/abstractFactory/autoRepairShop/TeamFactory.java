package main.creational.abstractFactory.autoRepairShop;

public interface TeamFactory {
    Electrician getElectrician();
    Mechanic getMechanic();
    Manager getManager();
}
