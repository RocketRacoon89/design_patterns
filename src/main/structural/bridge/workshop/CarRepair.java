package main.structural.bridge.workshop;

public class CarRepair {
    public static void main(String[] args) {
        CarFault[] carFaults = {
                new CarElecticalFault(new Mechanic()),
                new CarMechanicalFault(new Electician())
        };

        for(CarFault carFault:carFaults) {
            carFault.repairCar();
        }
    }
}
