package main.structural.facade.carLift;

public class Mechanic {
    public void doJob(CarLift carLift) {
        if(carLift.isFree()) {
            System.out.println("Mechanic starts work.");
        } else {
            System.out.println("Mechanic drinks coffee.");
        }
    }
}
