package main.behavioral.strategy.truck;

public class TruckRunner {
    public static void main(String[] args) {
        Truck truck = new Truck();

        truck.setCondition(new Empty());
        truck.execCondition();

        truck.setCondition(new Loading());
        truck.execCondition();

        truck.setCondition(new Unloading());
        truck.execCondition();
    }
}
