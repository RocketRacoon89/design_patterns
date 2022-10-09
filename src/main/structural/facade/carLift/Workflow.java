package main.structural.facade.carLift;

public class Workflow {
    Mechanic mechanic = new Mechanic();
    CarLift carLift = new CarLift();
    Repair repair = new Repair();

    public void repair() {
        repair.repairStart();
        carLift.startRepair();
        mechanic.doJob(carLift);
    }
}
