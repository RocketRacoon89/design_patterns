package main.behavioral.chainOfResponsibility.cargoSorting;

public abstract class Car {
    private int loadCapacity;
    private Car nextCar;

    public Car(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public void setNextCar(Car nextCar) {
        this.nextCar = nextCar;
    }

    public void cargoManager(int v_loadCapacity) {
        if(v_loadCapacity<loadCapacity) {
            depart(v_loadCapacity);
        }
        if(nextCar!=null) {
            nextCar.cargoManager(v_loadCapacity);
        }

    }

    public abstract void depart(int load);
}
