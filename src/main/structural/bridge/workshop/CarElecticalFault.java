package main.structural.bridge.workshop;

public class CarElecticalFault extends CarFault{
    public CarElecticalFault(Worker worker) {
        super(worker);
    }

    @Override
    public void repairCar() {
        System.out.println("(e)Repair Car in progress...");
        worker.repairCar();
    }
}
