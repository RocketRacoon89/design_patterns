package main.behavioral.templateMethod.truck;

public class TruckRunner {
    public static void main(String[] args) {
        TruckTemplate truck = new TruckLoading();
        truck.showAction();

        System.out.println("==================");

        TruckTemplate truck1 = new TruckUnloading();
        truck1.showAction();
    }
}
