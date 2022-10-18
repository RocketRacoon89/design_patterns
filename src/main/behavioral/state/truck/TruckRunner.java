package main.behavioral.state.truck;

public class TruckRunner {
    public static void main(String[] args) {
        Condition condition = new Empty();
        Truck truck = new Truck();

        truck.setCondition(condition);

        for(int i=0; i<12; i++) {
            truck.justDoIt();
            truck.changeCondition();
        }
    }
}
