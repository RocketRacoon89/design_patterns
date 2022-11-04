package main.creational.factoryMethod.car;

public class PickupFactory implements CarFactory{
    @Override
    public Car createCar() {
        return new PickupTruck();
    }
}
