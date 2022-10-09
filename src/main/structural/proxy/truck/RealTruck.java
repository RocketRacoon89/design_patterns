package main.structural.proxy.truck;

public class RealTruck implements processTruck {
    public RealTruck() {
        checkTruck();
        loadTruck();
    }

    public void loadTruck() {
        System.out.println("Truck is loading");
    }

    public void checkTruck() {
        System.out.println("Checking conditions of truck.");
    }

    @Override
    public void run() {
        System.out.println("Truck go.");
    }
}

