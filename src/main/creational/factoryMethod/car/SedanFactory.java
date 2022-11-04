package main.creational.factoryMethod.car;

public class SedanFactory implements CarFactory{
    @Override
    public Car createCar() {
        return new Sedan();
    }
}
