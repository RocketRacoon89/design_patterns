package main.creational.factoryMethod.car;

public class TruckFactory implements CarFactory{
    @Override
    public Car createCar() {
        return new Truck();
    }
}
