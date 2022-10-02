package main.creational.abstractFactory.autoRepairShop;

import main.creational.abstractFactory.autoRepairShop.truck.TruckTeamFactory;

public class VolvoTruck {
    public static void main(String[] args) {
        TeamFactory teamFactory = new TruckTeamFactory();
        Electrician electrician = teamFactory.getElectrician();
        Mechanic mechanic = teamFactory.getMechanic();
        Manager manager = teamFactory.getManager();

        electrician.fixElectrics();
        mechanic.fixEngine();
        manager.manageTeam();
    }
}
