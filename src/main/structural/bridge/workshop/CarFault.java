package main.structural.bridge.workshop;

public abstract class CarFault {
    protected Worker worker;

    public CarFault(Worker worker) {
        this.worker = worker;
    }

    public abstract void repairCar();
}
