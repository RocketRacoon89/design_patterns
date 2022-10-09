package main.structural.facade.carLift;

public class CarLift {
    private boolean free;

    public boolean isFree() {
        return free;
    }

    public void startRepair() {
        System.out.println("Repair start.");
        free = true;
    }

    public void finishRepair() {
        System.out.println("Repair finish.");
        free = false;
    }
}
