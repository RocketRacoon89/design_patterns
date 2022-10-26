package main.creational.abstractFactory.autoRepairShop;

import main.creational.abstractFactory.autoRepairShop.car.CarTeamFactory;
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


        System.out.println("===============================================================");

        TeamFactory teamFactory1 = new CarTeamFactory();
        Electrician electrician1 = teamFactory1.getElectrician();
        Mechanic mechanic1 = teamFactory1.getMechanic();
        Manager manager1 = teamFactory1.getManager();

        electrician1.fixElectrics();
        mechanic1.fixEngine();
        manager1.manageTeam();
    }
}
