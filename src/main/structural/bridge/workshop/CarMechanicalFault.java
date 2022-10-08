package main.structural.bridge.workshop;

public class CarMechanicalFault extends CarFault{
    public CarMechanicalFault(Worker worker) {
        super(worker);
    }

    @Override
    public void repairCar() {
        System.out.println("(m) Repair Car in progress...");
        worker.repairCar();
    }
}
